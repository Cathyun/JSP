package service;

import ui.MemberUI;
import vo.Member;

public class MemberSearchService {

	public Member SearchMemberById(String searchValue) {
		Member member = null;

		for (int i = 0; i < MemberUI.memberArray.length; i++) {
			if (MemberUI.memberArray[i].getId() == Integer.parseInt(searchValue))
				
			{
				member = MemberUI.memberArray[i];
				break;
			}
		}
		return member;
	}

	public Member[] SearchMemberByName(String searchValue) {
		Member[] sMArr = null;
		int count = 0;
		Member[] tempArr = new Member[MemberUI.memberArray.length];

		for (int i = 0; i < MemberUI.memberArray.length; i++) {
			if (searchValue.equals(MemberUI.memberArray[i].getName())) {
				sMArr = new Member[count];
				tempArr[count++] = MemberUI.memberArray[i];

			}

		}
		for (int i = 0; i < count; i++) {
			sMArr[i] = tempArr[i];
		}
		return sMArr;
	}

}
