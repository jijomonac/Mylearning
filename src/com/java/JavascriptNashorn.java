/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 *
 * @author hp
 */
public class JavascriptNashorn {
      public static void main(String... args) throws Throwable {
    ScriptEngineManager engineManager = 
new ScriptEngineManager();
    ScriptEngine engine = 
engineManager.getEngineByName("nashorn");
    engine.eval("function sum(a, b) { return a + b; }");
    System.out.println(engine.eval("sum(1, 2);"));
  }

}
