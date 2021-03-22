package edu.isu.cs.cs2263;

import javafx.application.Application;

public class Relation implements RelationVisitor {
    @Override
    public String visit(User user) {
        return user.getName() + " -- relationship -- " + user.getName();
    }
}
