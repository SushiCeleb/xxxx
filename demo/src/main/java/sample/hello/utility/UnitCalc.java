package sample.hello.utility;

import java.util.List;

import org.springframework.stereotype.Component;

import sample.hello.entity.UnitArm;
import sample.hello.entity.UnitLeg;
import sample.hello.entity.UnitRear;
import sample.hello.entity.UnitResult;
import sample.hello.entity.UnitSub;

@Component
public class UnitCalc {
	public static UnitResult calcUnit(UnitArm ua, UnitRear ur, UnitLeg ul ,UnitSub us, UnitResult urst ,List<String> selUnit){
		Integer dAtk=0;
		Integer sAtk=0;
		Integer hAtk=0;
		Integer ability=0;
		Integer dDif=0;
		Integer sDif=0;
		Integer hDif=0;
		Integer fRst=0;
		Integer iRst=0;
		Integer tRst=0;
		Integer wRst=0;
		Integer lRst=0;
		Integer dRst=0;
		Integer hp=0;
		Integer pp=0;

			if(selUnit.contains("arm")){
				dAtk +=ua.getDAtk();
				sAtk +=ua.getSAtk();
				hAtk +=ua.getHAtk();
				ability += ua.getAbility();
				dDif += ua.getDDif();
				sDif += ua.getSDif();
				hDif += ua.getHDif();
				fRst += ua.getFRst();
				iRst += ua.getIRst();
				tRst += ua.getTRst();
				wRst += ua.getWRst();
				lRst += ua.getIRst();
				dRst += ua.getDRst();
				hp += ua.getHp();
				pp += ua.getPp();
			}
			if(selUnit.contains("rear")){
				dAtk +=ur.getDAtk();
				sAtk +=ur.getSAtk();
				hAtk +=ur.getHAtk();
				ability += ur.getAbility();
				dDif += ur.getDDif();
				sDif += ur.getSDif();
				hDif += ur.getHDif();
				fRst += ur.getFRst();
				iRst += ur.getIRst();
				tRst += ur.getTRst();
				wRst += ur.getWRst();
				lRst += ur.getIRst();
				dRst += ur.getDRst();
				hp += ur.getHp();
				pp += ur.getPp();
			}
			if(selUnit.contains("leg")){
				dAtk +=ul.getDAtk();
				sAtk +=ul.getSAtk();
				hAtk +=ul.getHAtk();
				ability += ul.getAbility();
				dDif += ul.getDDif();
				sDif += ul.getSDif();
				hDif += ul.getHDif();
				fRst += ul.getFRst();
				iRst += ul.getIRst();
				tRst += ul.getTRst();
				wRst += ul.getWRst();
				lRst += ul.getIRst();
				dRst += ul.getDRst();
				hp += ul.getHp();
				pp += ul.getPp();
			}
			if(selUnit.contains("sub")){
				dAtk +=us.getDAtk();
				sAtk +=us.getSAtk();
				hAtk +=us.getHAtk();
				ability += us.getAbility();
				dDif += us.getDDif();
				sDif += us.getSDif();
				hDif += us.getHDif();
				fRst += us.getFRst();
				iRst += us.getIRst();
				tRst += us.getTRst();
				wRst += us.getWRst();
				lRst += us.getIRst();
				dRst += us.getDRst();
				hp += us.getHp();
				pp += us.getPp();
			}
			urst.setDAtk(dAtk);
			urst.setSAtk(sAtk);
			urst.setHAtk(hAtk);
			urst.setAbility(ability);
			urst.setDDif(dDif);
			urst.setSDif(sDif);
			urst.setHDif(hDif);
			urst.setFRst(fRst);
			urst.setIRst(iRst);
			urst.setTRst(tRst);
			urst.setWRst(wRst);
			urst.setLRst(lRst);
			urst.setDRst(dRst);
			urst.setHp(hp);
			urst.setPp(pp);

			return urst;

	}
}
