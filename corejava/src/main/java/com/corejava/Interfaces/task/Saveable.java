package com.corejava.Interfaces.task;

import java.util.List;

public interface Saveable {
   List<String> write();
    void read(List<String> savedValues);
}
