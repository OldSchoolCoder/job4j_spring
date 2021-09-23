package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartUITest {

    private Context context;
    private StartUI startUI;

    @Before
    public void setUp() throws Exception {
        this.context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);
        this.startUI = context.get(StartUI.class);
    }

    @Test
    public void addTest() {
        try {
            startUI.add("Ivan ivanov");
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void printTest() {
        try {
            startUI.print();
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}