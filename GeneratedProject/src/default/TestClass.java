public  class TestClass {
	/*@ 
	 
	 @ requires FM.FeatureModel.valid();
	 @ requires rConjunctive1;
	 ensures eConjunctive1;
	 @*/
	 private void  testMethod__wrappee__Conjunctive  (){
		
	}

	/*@ 
	 
	 @ requires FM.FeatureModel.valid();
	 @ 
	requires FM.FeatureModel.conjunctive ==> (rConjunctive1);
	requires FM.FeatureModel.a ==> (rA1);
	ensures FM.FeatureModel.conjunctive ==> (eConjunctive1);
	ensures FM.FeatureModel.a ==> (eA1);
	 @*/
	 private void  testMethod__wrappee__A  (){
		if (!FM.FeatureModel.a) {
			testMethod__wrappee__Conjunctive();
			return;
		}
		
	}

	/*@ 
	 
	 @ requires FM.FeatureModel.valid();
	 @ 
	requires FM.FeatureModel.conjunctive ==> (rConjunctive1);
	requires FM.FeatureModel.a ==> (rA1);
	requires FM.FeatureModel.al_so ==> ((rAl_so1) || (rAl_so2));
	ensures FM.FeatureModel.conjunctive ==> (eConjunctive1);
	ensures FM.FeatureModel.a ==> (eA1);
	ensures FM.FeatureModel.al_so ==> ((\old(rAl_so1)
		 ==> (eAl_so1)) && (\old(rAl_so2)
		 ==> (eAl_so2)));
	 @*/
	 private void  testMethod__wrappee__Al_so  (){
		if (!FM.FeatureModel.al_so) {
			testMethod__wrappee__A();
			return;
		}
		
	}

	/*@ 
	 
	 @ requires FM.FeatureModel.valid();
	 @ 
	requires FM.FeatureModel.conjunctive ==> (rConjunctive1);
	requires FM.FeatureModel.a ==> (rA1);
	requires FM.FeatureModel.al_so ==> ((rAl_so1) || (rAl_so2));
	requires FM.FeatureModel.b ==> (rB1);
	requires FM.FeatureModel.b ==> (rB2);
	ensures FM.FeatureModel.conjunctive ==> (eConjunctive1);
	ensures FM.FeatureModel.a ==> (eA1);
	ensures FM.FeatureModel.al_so ==> ((\old(rAl_so1)
		 ==> (eAl_so1)) && (\old(rAl_so2)
		 ==> (eAl_so2)));
	ensures FM.FeatureModel.b ==> (eB1);
	ensures FM.FeatureModel.b ==> (eB2);
	 @*/
	 private void  testMethod__wrappee__B  (){
		if (!FM.FeatureModel.b) {
			testMethod__wrappee__Al_so();
			return;
		}
		
	}

	/*@ 
	 
	 @ requires FM.FeatureModel.valid();
	 @ 
	requires FM.FeatureModel.conjunctive ==> (rConjunctive1);
	requires FM.FeatureModel.a ==> (rA1);
	requires FM.FeatureModel.al_so ==> ((rAl_so1) || (rAl_so2));
	requires FM.FeatureModel.b ==> (rB1);
	requires FM.FeatureModel.b ==> (rB2);
	requires FM.FeatureModel.c ==> (rC1);
	requires FM.FeatureModel.c ==> (rC2);
	ensures FM.FeatureModel.conjunctive ==> (eConjunctive1);
	ensures FM.FeatureModel.a ==> (eA1);
	ensures FM.FeatureModel.al_so ==> ((\old(rAl_so1)
		 ==> (eAl_so1)) && (\old(rAl_so2)
		 ==> (eAl_so2)));
	ensures FM.FeatureModel.b ==> (eB1);
	ensures FM.FeatureModel.b ==> (eB2);
	ensures FM.FeatureModel.c ==> (eC1);
	 @*/
	void testMethod(){
		if (!FM.FeatureModel.c) {
			testMethod__wrappee__B();
			return;
		}
		
	}


}
