/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class StudentsByCourseTableModel extends AbstractTableModel {

    private final List<Student> students;
    private final String[] columns = {
        "RA",
        "Name",
        "Birth year"
    };

    public StudentsByCourseTableModel(Course course) throws Exception {
        DAO dao = new DAO();
        this.students = dao.getEnrollmentList(course);
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = students.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> student.getRa();
            case 1 -> student.getName();
            case 2 -> student.getBirthYear();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
}