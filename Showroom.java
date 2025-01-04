package com.test.project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Showroom {

	public void addCar(Car car) {
		String query = "INSERT INTO cars (id, name, model, price) VALUES (?, ?, ?, ?)";

		try {
			Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, car.getId());
			preparedStatement.setString(2, car.getName());
			preparedStatement.setString(3, car.getModel());
			preparedStatement.setDouble(4, car.getPrice());

			int rowsInserted = preparedStatement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("Car added successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void viewCars() {
		String query = "SELECT * FROM cars";

		try (Connection connection = DBConnection.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(query)) {

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String model = resultSet.getString("model");
				double price = resultSet.getDouble("price");

				System.out.println("Car [ID=" + id + ", Name=" + name + ", Model=" + model + ", Price=" + price + "]");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteCar(int id) {
		String query = "DELETE FROM cars WHERE id = ?";

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setInt(1, id);
			int rowsDeleted = preparedStatement.executeUpdate();

			if (rowsDeleted > 0) {
				System.out.println("Car deleted successfully!");
			} else {
				System.out.println("Car with ID " + id + " not found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}