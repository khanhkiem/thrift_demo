/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import org.apache.thrift.TException;
import tutorial.MultiplicationService;

public class MultiplicationHandler implements MultiplicationService.Iface {

	@Override
	 public int multiply(int n1, int n2) throws TException {
	    System.out.println("Multiply(" + n1 + "," + n2 + ")");
	    return n1 * n2;
	 }
}
