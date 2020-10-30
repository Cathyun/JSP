package Jdbc0610;

public class CRUDMian {

	public static void main(String[] args) {
		
		//DB정보 저장 확인(count)
		DBCon conn = new DBCon();
		conn.connect();
		
		//INSERT확인
//		CRUDTest crud = new CRUDTest();
//		crud.insert();
		
		//저장한 정보 select확인
		NAVER cr = new NAVER();
		//cr.insert();
		cr.select();
		//cr.update();
		//cr.delete();
		
	}

}
