/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author vitor
 */
public class DAO {
    
    public boolean exist (User user) throws Exception{
       
        String sql = "SELECT * FROM T_USER WHERE NM_USER = ? AND PW_PASSWORD = ?";
        try (   
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1, user.getName());
                ps.setString(2, user.getPassword());
                try (ResultSet result = ps.executeQuery()){
                    return result.next();
            }
        }
    }
    
    public Course[] getCourses() throws Exception {

        String sql = "SELECT * FROM T_COURSE";

        try (
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement ps =
                conn.prepareStatement(
                    sql,
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
                );
            ResultSet rs = ps.executeQuery()
        ) {
            int totalCourses = rs.last() ? rs.getRow() : 0;
            Course[] courses = new Course[totalCourses];

            rs.beforeFirst();
            int index = 0;

            while (rs.next()) {
                int id = rs.getInt("ID_COURSE");
                String name = rs.getString("NM_COURSE");
                String category = rs.getString("DS_CATEGORY");

                courses[index++] = new Course(id, name, category);
            }
            return courses;
        }
    }
    
    public void insertCourse(Course course) throws Exception {

        String sql = "INSERT INTO T_COURSE(NM_COURSE, DS_CATEGORY) VALUES (?, ?)";

        try (
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)
        ) {
            ps.setString(1, course.getName());
            ps.setString(2, course.getCategory());
            ps.execute();
        }
    }
    
    public void updateCourse(Course course) throws Exception {
        
        String sql = "UPDATE T_COURSE SET NM_COURSE = ?, DS_CATEGORY = ? WHERE ID_COURSE = ?";

        try (
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)
        ) {
            ps.setString(1, course.getName());
            ps.setString(2, course.getCategory());
            ps.setInt(3, course.getId());
            ps.executeUpdate();
        }
    }
    
    public void deleteCourse(Course course) throws Exception {
        
        String sql = "DELETE FROM T_COURSE WHERE ID_COURSE = ?";

        try (
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)
        ) {
            ps.setInt(1, course.getId());
            ps.executeUpdate();
        }
    }
    
    public List<Student> getEnrollmentList(Course course) throws Exception {

        String sql = """
            SELECT 
                s.RA_STUDENT,
                s.NM_STUDENT,
                s.YR_BIRTH
            FROM T_STUDENT s
            INNER JOIN T_STUDENT_COURSE sc 
                ON s.RA_STUDENT = sc.RA_STUDENT
            WHERE sc.ID_COURSE = ?
            """;

        List<Student> students = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, course.getId());

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int ra = rs.getInt("RA_STUDENT");
                    String name = rs.getString("NM_STUDENT");
                    int birthYear = rs.getInt("YR_BIRTH");

                    students.add(new Student(ra, name, birthYear));
                }
            }
        }
        return students;
    }
}

/*

CREATE DATABASE ACADEMIC_SYSTEM;
USE ACADEMIC_SYSTEM;

CREATE TABLE T_USER(
	ID_USER INT PRIMARY KEY AUTO_INCREMENT,
    NM_USER VARCHAR(200),
    PW_PASSWORD VARCHAR(200)
);

INSERT INTO T_USER(NM_USER, PW_PASSWORD)
VALUES('admin','admin');

SELECT * FROM T_USER;

CREATE TABLE T_COURSE(
	ID_COURSE INT PRIMARY KEY AUTO_INCREMENT,
	NM_COURSE VARCHAR (200) NOT NULL, 
    DS_CATEGORY VARCHAR (200) NOT NULL
);

INSERT INTO T_COURSE(NM_COURSE, DS_CATEGORY) 
VALUES ('Computer Science', 'Bachelors Degree');

SELECT * FROM T_COURSE;

CREATE TABLE T_STUDENT (
    RA_STUDENT INT NOT NULL,
    NM_STUDENT VARCHAR(80) NOT NULL,
    YR_BIRTH INT,
    PRIMARY KEY (RA_STUDENT)
);

INSERT INTO T_STUDENT (RA_STUDENT, NM_STUDENT, YR_BIRTH)
VALUES
    (123456, 'Cady Heron', 1986),
    (345678, 'Regina George', 1978),
    (875321, 'Karen Smith', 1985),
    (456789, 'Gretchen Wieners', 1982);


CREATE TABLE T_STUDENT_COURSE (
    ID_COURSE INT NOT NULL,
    RA_STUDENT INT NOT NULL,
    YR_ENROLLMENT INT,
    NR_SEMESTER INT,
    PRIMARY KEY (ID_COURSE, RA_STUDENT),

    INDEX IDX_STUDENT (RA_STUDENT),

    CONSTRAINT FK_STUDENT
        FOREIGN KEY (RA_STUDENT)
        REFERENCES T_STUDENT (RA_STUDENT)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,

    CONSTRAINT FK_COURSE
        FOREIGN KEY (ID_COURSE)
        REFERENCES T_COURSE (ID_COURSE)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION
);
*/