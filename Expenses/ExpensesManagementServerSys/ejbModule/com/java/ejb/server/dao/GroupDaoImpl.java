package com.java.ejb.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.java.ejb.server.model.Group_s;
import com.java.util.ConnectionHelper;

public class GroupDaoImpl implements GroupDao {

	@Override
	public String createGroup(Group_s group) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		    Connection conn = ConnectionHelper.getConnection();

		    PreparedStatement ps = conn.prepareStatement(
		        "INSERT INTO group_s (groupName, createdAt, createdBy, initialAmount) VALUES (?, ?, ?, ?)"
		    );
		    ps.setString(1, group.getGroupName());
		    ps.setDate(2, group.getCreatedAt());
		    ps.setString(3, group.getCreatedBy());
		    ps.setDouble(4, group.getInitialAmount());

		    int rowsInserted = ps.executeUpdate();
		    conn.close();

		    return rowsInserted > 0 ? "Group Created Successfully" : "Group Creation Failed";
		}


        }

  