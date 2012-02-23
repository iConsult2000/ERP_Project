package com.ic2k.erp.ejb.controllers;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.ic2k.erp.ejb.domain.User;

@Name("userList")
public class UserList extends EntityQuery<User>
{
    public UserList()
    {
        setEjbql("select user from User user");
    }
}
