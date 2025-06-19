package com.java.ejb.server.dao;

import java.sql.SQLException;
import com.java.ejb.server.model.GroupMembers;

public interface GroupMembersDao {
    String addGroupMembers(GroupMembers members) throws ClassNotFoundException, SQLException;
}