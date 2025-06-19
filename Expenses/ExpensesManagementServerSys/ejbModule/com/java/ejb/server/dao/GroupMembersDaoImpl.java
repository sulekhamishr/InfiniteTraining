package com.java.ejb.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.java.ejb.server.model.GroupMembers;
import com.java.util.ConnectionHelper;

public class GroupMembersDaoImpl implements GroupMembersDao {
    @Override
    public String addGroupMembers(GroupMembers members) throws ClassNotFoundException, SQLException {
        Connection conn = ConnectionHelper.getConnection();
        PreparedStatement ps = conn.prepareStatement(
            "INSERT INTO groupMembers (groupId, usersId, joinedAt, amountCollected) VALUES (?, ?, ?, ?)"
        );
        ps.setInt(1, members.getGroupId());
        ps.setInt(2, members.getUsersId());
        ps.setDate(3, members.getJoinedAt());
        ps.setDouble(4, members.getAmountCollected());

        int result = ps.executeUpdate();
        return result > 0 ? "success" : "failure";
    }
}