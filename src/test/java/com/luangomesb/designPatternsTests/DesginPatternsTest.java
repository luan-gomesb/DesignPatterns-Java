package com.luangomesb.designPatternsTests;

import com.luangomesb.designPatterns.ProgrammingForInterfaces;
import com.luangomesb.designPatterns.delegationExample.Printer;
import com.luangomesb.designPatternsTests.Factories.FactoriesExample.XboxFactory;
import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Playstation;
import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Videogame;
import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Xbox;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class DesginPatternsTest {

    @Test
    public void ProgrammingFormInterfaces() {
        ProgrammingForInterfaces.run();
    }

    @Test
    public void delegationPrinciple() {
        Printer printer = new Printer();
        printer.print();
    }

    @Test
    void testFactory() {
        Videogame xbox = new XboxFactory().getConsole();
        assertInstanceOf(Xbox.class, xbox);
    }
}
