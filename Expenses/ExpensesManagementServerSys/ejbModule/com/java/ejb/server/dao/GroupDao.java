package com.java.ejb.server.dao;

import java.sql.SQLException;
import com.java.ejb.server.model.Group_s;

public interface GroupDao {
    String createGroup(Group_s group) throws ClassNotFoundException, SQLException;
}