package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.dto.Students;
import com.dto.Users;
import com.sun.xml.internal.ws.client.Stub;

public class DBManager {
	
	private Connection connection;
	
	public DBManager(){
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/group_ladies_db", "root", "");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void addStudent(Students st){
		
		try{
			
			PreparedStatement statement = connection.prepareStatement(" INSERT INTO students (id, name, surname, gpa, group_name, ent) VALUES (NULL, ?, ?, ?, ?, ?) ");
			statement.setString(1, st.getName());
			statement.setString(2, st.getSurname());
			statement.setDouble(3, st.getGpa());
			statement.setString(4, st.getGroupName());
			statement.setInt(5, st.getEnt());
			statement.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void saveStudent(Students st){
		
		try{
			
			PreparedStatement statement = connection.prepareStatement(""
					+ " UPDATE students "
					+ " SET name = ?, surname = ?, gpa = ?, group_name = ?, ent = ? "
					+ " WHERE id = ? ");
			statement.setString(1, st.getName());
			statement.setString(2, st.getSurname());
			statement.setDouble(3, st.getGpa());
			statement.setString(4, st.getGroupName());
			statement.setInt(5, st.getEnt());
			statement.setLong(6, st.getId());
			statement.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void deleteStudent(Long id){
		
		try{
			
			PreparedStatement statement = connection.prepareStatement(""
					+ " DELETE FROM students WHERE id = ? ");
			statement.setLong(1, id);
			statement.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Students> getStudents(){
		
		ArrayList<Students> students = new ArrayList<Students>();
		
		try{
			
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM students");
			ResultSet result = statement.executeQuery();
			
			while(result.next()){
				
				Long id = result.getLong("id");
				String name = result.getString("name");
				String surname = result.getString("surname");
				double gpa = result.getDouble("gpa");
				int ent = result.getInt("ent");
				String groupName = result.getString("group_name");
				
				students.add(new Students(id, name, surname, gpa, ent, groupName));
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return students;
		
	}

	public Students getStudent(Long id){
		
		Students student = null;
		
		try{
			
			PreparedStatement statement = connection.prepareStatement(" SELECT * FROM students WHERE id = ? LIMIT 1 ");
			statement.setLong(1, id);
			ResultSet result = statement.executeQuery();
			
			if(result.next()){
				
				String name = result.getString("name");
				String surname = result.getString("surname");
				double gpa = result.getDouble("gpa");
				int ent = result.getInt("ent");
				String groupName = result.getString("group_name");
				
				student = new Students(id, name, surname, gpa, ent, groupName);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return student;
		
	}
	
	public Users getUser(String email, String password){
		
		Users user = null;
		
		try{
			
			PreparedStatement st = connection.prepareStatement("SELECT * FROM users WHERE email = ? AND password = ? ");
			st.setString(1, email);
			st.setString(2, password);
			
			ResultSet res = st.executeQuery();
			
			if(res.next()){
				
				Long id = res.getLong("id");
				String fullName = res.getString("full_name");
				
				user = new Users(id, email, password, fullName);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
}
