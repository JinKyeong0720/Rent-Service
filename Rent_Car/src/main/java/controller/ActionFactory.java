package controller;

import controller.action.Action;
import controller.action.RegistAction;

public class ActionFactory {
	private ActionFactory() {}
	private static ActionFactory instance = new ActionFactory();
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		if(command.equals("regist"))
			action = new RegistAction();
//		else if() 
			
		
		
		return action;
	}
}
