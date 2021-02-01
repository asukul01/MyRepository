package FactoryPattern;

public class GetPlanFactory {

	public Plan getPlan(int option) {
		switch (option) {
		case 1:
			return new CommercialPlan();
		case 2:
			return new InstitutionalPlan();
		case 3:
			return new DomesticPlan();
		}
		return null;
	}

}
