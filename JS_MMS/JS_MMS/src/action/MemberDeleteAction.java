package action;

import java.util.Scanner;

import service.MemberDeletService;
import util.ConsoleUtil;


public class MemberDeleteAction implements Action {

	ConsoleUtil console = new ConsoleUtil();
	
	@Override
	public void excute(Scanner sc) throws Exception {
		int id = console.getId("삭제할", sc);
		MemberDeletService mDS = new MemberDeletService();
		
		boolean ds = mDS.deleteMember(id);
		
		if(ds) {
			console.printDeleteSuccessMessage(id);
		} else {
			console.printDeleteFailMessage(id);
		}
		
		
		
				
		
		
	}

}
