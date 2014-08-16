package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules83 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(b,c,Plus(m,C1)),CN1)),And(FreeQ(List(a,b,c,m),x),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Times(CN1,Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(b,c,Plus(m,C1)),CN1)),And(FreeQ(List(a,b,c,m),x),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Times(pd,Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),And(FreeQ(List(a,b,pd,pn),x),NonzeroQ(Plus(pn,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Times(CN1,pd,Power(Times(pd,Csc(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),And(FreeQ(List(a,b,pd,pn),x),NonzeroQ(Plus(pn,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(m,C1)),CN1)),And(And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(m,pn,C2))),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Times(c,pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C1))),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),And(And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(m,pn,Times(CN1,C2)))),NonzeroQ(Plus(pn,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),pn_)),x_Symbol),
    Condition(Times(Power(b,CN1),Subst(Int(Times(Power(Times(c,x),m),Power(Plus(C1,Times(CN1,Sqr(x))),Times(C1D2,Plus(pn,Times(CN1,C1))))),x),x,Sin(Plus(a,Times(b,x))))),And(And(FreeQ(List(a,b,c,m),x),OddQ(pn)),Not(And(OddQ(m),Less(Less(C0,m),pn)))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Times(CN1,Power(b,CN1),Subst(Int(Times(Power(Times(pd,x),pn),Power(Plus(C1,Times(CN1,Sqr(x))),Times(C1D2,Plus(m,Times(CN1,C1))))),x),x,Cos(Plus(a,Times(b,x))))),And(And(FreeQ(List(a,b,pd,pn),x),OddQ(m)),Not(And(OddQ(pn),And(Less(C0,pn),LessEqual(pn,m))))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),pn_)),x_Symbol),
    Condition(Times(CN1,Power(Times(b,Power(c,Plus(pn,Times(CN1,C1)))),CN1),Subst(Int(Times(Power(Times(c,x),Plus(m,pn,Times(CN1,C1))),Power(Power(Plus(CN1,Sqr(x)),Times(C1D2,Plus(pn,C1))),CN1)),x),x,Csc(Plus(a,Times(b,x))))),And(And(And(FreeQ(List(a,b,c,m),x),OddQ(pn)),Not(And(OddQ(m),Less(Less(C0,m),pn)))),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),pn_)),x_Symbol),
    Condition(Times(Power(Times(b,Power(c,Plus(pn,Times(CN1,C1)))),CN1),Subst(Int(Times(Power(Times(c,x),Plus(m,pn,Times(CN1,C1))),Power(Power(Plus(CN1,Sqr(x)),Times(C1D2,Plus(pn,C1))),CN1)),x),x,Sec(Plus(a,Times(b,x))))),And(And(And(FreeQ(List(a,b,c,m),x),OddQ(pn)),Not(And(OddQ(m),And(Less(C0,m),LessEqual(m,pn))))),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),pn_)),x_Symbol),
    Condition(Times(CN1,Power(c,Plus(pn,C1)),Power(b,CN1),Subst(Int(Times(Power(Times(c,x),Plus(m,Times(CN1,pn),Times(CN1,C1))),Power(Plus(CN1,Sqr(x)),Times(C1D2,Plus(pn,Times(CN1,C1))))),x),x,Csc(Plus(a,Times(b,x))))),And(And(And(FreeQ(List(a,b,c,m),x),OddQ(pn)),Not(And(OddQ(m),Less(Less(C0,m),pn)))),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),pn_)),x_Symbol),
    Condition(Times(Power(c,Plus(pn,C1)),Power(b,CN1),Subst(Int(Times(Power(Times(c,x),Plus(m,Times(CN1,pn),Times(CN1,C1))),Power(Plus(CN1,Sqr(x)),Times(C1D2,Plus(pn,Times(CN1,C1))))),x),x,Sec(Plus(a,Times(b,x))))),And(And(And(FreeQ(List(a,b,c,m),x),OddQ(pn)),Not(And(OddQ(m),And(Less(C0,m),LessEqual(m,pn))))),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),m_DEFAULT),Power($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),pn_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,CN1),Subst(Int(Times(Power(Plus(C1,Sqr(x)),Plus(Times(C1D2,Plus(m,pn)),Times(CN1,C1))),Power(Power(x,m),CN1)),x),x,Tan(Plus(a,Times(b,x))))),And(And(FreeQ(List(a,b),x),IntegersQ(m,pn)),EvenQ(Plus(m,pn))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,c,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C1))),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(Sqr(c),Plus(m,Times(CN1,C1)),Power(Times(Sqr(pd),Plus(pn,C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,c,Plus(m,C1)),CN1)),Times(Sqr(pd),Plus(pn,Times(CN1,C1)),Power(Times(Sqr(c),Plus(m,C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Less(m,CN1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,c,Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C1))),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(m,Times(CN1,C1))),CN1)),Times(Sqr(c),Plus(pn,C1),Power(Times(Sqr(pd),Plus(m,Times(CN1,C1))),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,c,Plus(pn,Times(CN1,C1))),CN1)),Times(Sqr(pd),Plus(m,C1),Power(Times(Sqr(c),Plus(pn,Times(CN1,C1))),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Less(m,CN1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(c,pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C1))),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),Times(CN1,Sqr(c),Sqr(pd),Plus(m,Times(CN1,C1)),Power(Plus(pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,c,pd,Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C1))),Power(Times(pd,Csc(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),Times(CN1,Sqr(c),Sqr(pd),Plus(m,Times(CN1,C1)),Power(Plus(pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Csc(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,c,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C1))),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(m,pn)),CN1)),Times(Sqr(c),Plus(m,Times(CN1,C1)),Power(Plus(m,pn),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cos(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,pn))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,c,Plus(m,pn)),CN1)),Times(Sqr(pd),Plus(pn,Times(CN1,C1)),Power(Plus(m,pn),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,pn))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,c,pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C1))),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(m,Times(CN1,C1))),CN1)),Times(Sqr(c),Plus(m,pn,Times(CN1,C2)),Power(Plus(m,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Sec(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,pn,Times(CN1,C2)))),Not(And(And(EvenQ(m),OddQ(pn)),Greater(pn,C1)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(c,pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C1))),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),Times(Sqr(pd),Plus(m,pn,Times(CN1,C2)),Power(Plus(pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,pn,Times(CN1,C2)))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,c,pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C1))),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(m,Times(CN1,pn))),CN1)),Times(Sqr(c),Plus(m,Times(CN1,C1)),Power(Plus(m,Times(CN1,pn)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Sec(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,Times(CN1,pn)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(c,pd,Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C1))),Power(Times(pd,Csc(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(m,Times(CN1,pn))),CN1)),Times(Sqr(c),Plus(m,Times(CN1,C1)),Power(Plus(m,Times(CN1,pn)),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Csc(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,Times(CN1,pn)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(m,C1)),CN1)),Times(Plus(m,pn,C2),Power(Times(Sqr(c),Plus(m,C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cos(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,pn,C2))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1)),CN1)),Times(Plus(m,pn,C2),Power(Times(Sqr(pd),Plus(pn,C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,pn,C2))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,c,Plus(m,pn)),CN1)),Times(Plus(m,C1),Power(Times(Sqr(c),Plus(m,pn)),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Sec(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,pn))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,c,Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C1))),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(m,pn)),CN1)),Times(Plus(pn,C1),Power(Times(Sqr(pd),Plus(m,pn)),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,pn))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(pd,Sec(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,c,Plus(m,C1)),CN1)),Times(Plus(m,Times(CN1,pn),C2),Power(Times(Sqr(c),Plus(m,C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Sec(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,Times(CN1,pn),C2))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(pd,Csc(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,c,Plus(m,C1)),CN1)),Times(Plus(m,Times(CN1,pn),C2),Power(Times(Sqr(c),Plus(m,C1)),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Csc(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,Times(CN1,pn),C2))),RationalQ(pn)))),
ISetDelayed(Int(Power(Times(Sqrt(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),Sqrt(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),CN1),x_Symbol),
    Condition(Times(CN2,Power(CN1,QQ(3L,4L)),Sec(Plus(a,Times(b,x))),Power(Times(b,c,Rt(Times(pd,Power(c,CN1)),C2),Sqrt(Sqr(Sec(Plus(a,Times(b,x)))))),CN1),EllipticF(ArcSin(Times(Rt(Times(pd,Power(c,CN1)),C2),Power(CN1,C1D4),Sqrt(Times(c,Sin(Plus(a,Times(b,x))))),Power(Times(pd,Cos(Plus(a,Times(b,x)))),CN1D2))),CN1)),FreeQ(List(a,b,c,pd),x))),
ISetDelayed(Int(Times(Sqrt(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),Sqrt(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),QQ(3L,2L)),Power(Times(b,c,Sqrt(Times(pd,Cos(Plus(a,Times(b,x)))))),CN1)),Times(Power(CN1,C1D4),pd,Sec(Plus(a,Times(b,x))),Power(Times(b,Sqrt(Times(pd,Power(c,CN1))),Sqrt(Sqr(Sec(Plus(a,Times(b,x)))))),CN1),EllipticE(ArcSin(Times(Sqrt(Times(pd,Power(c,CN1))),Power(CN1,C1D4),Sqrt(Times(c,Sin(Plus(a,Times(b,x))))),Power(Times(pd,Cos(Plus(a,Times(b,x)))),CN1D2))),CN1)),Times(CN1,Power(CN1,C1D4),pd,Sec(Plus(a,Times(b,x))),Power(Times(b,Sqrt(Times(pd,Power(c,CN1))),Sqrt(Sqr(Sec(Plus(a,Times(b,x)))))),CN1),EllipticF(ArcSin(Times(Sqrt(Times(pd,Power(c,CN1))),Power(CN1,C1D4),Sqrt(Times(c,Sin(Plus(a,Times(b,x))))),Power(Times(pd,Cos(Plus(a,Times(b,x)))),CN1D2))),CN1))),FreeQ(List(a,b,c,pd),x))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Module(List(Set(k,Denominator(m))),Times(k,c,pd,Power(b,CN1),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Times(CN1,C1))),Power(Plus(Sqr(c),Times(Sqr(pd),Power(x,Times(C2,k)))),CN1)),x),x,Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Power(k,CN1)),Power(Power(Times(pd,Cos(Plus(a,Times(b,x)))),Power(k,CN1)),CN1))))),And(And(And(FreeQ(List(a,b,c,pd),x),ZeroQ(Plus(m,pn))),RationalQ(m)),Less(Less(C0,m),C1)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Module(List(Set(k,Denominator(m))),Times(CN1,k,c,pd,Power(b,CN1),Subst(Int(Times(Power(x,Plus(Times(k,Plus(pn,C1)),Times(CN1,C1))),Power(Plus(Sqr(pd),Times(Sqr(c),Power(x,Times(C2,k)))),CN1)),x),x,Times(Power(Times(pd,Cos(Plus(a,Times(b,x)))),Power(k,CN1)),Power(Power(Times(c,Sin(Plus(a,Times(b,x)))),Power(k,CN1)),CN1))))),And(And(And(FreeQ(List(a,b,c,pd),x),ZeroQ(Plus(m,pn))),RationalQ(m)),Less(Less(CN1,m),C0)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Times(CN1,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(pd,Cos(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,c,pd,Plus(pn,C1),Power(Sqr(Sin(Plus(a,Times(b,x)))),Times(C1D2,Plus(m,C1)))),CN1),Hypergeometric2F1(Times(C1D2,CN1,Plus(m,Times(CN1,C1))),Times(C1D2,Plus(pn,C1)),Times(C1D2,Plus(pn,C3)),Sqr(Cos(Plus(a,Times(b,x)))))),And(And(FreeQ(List(a,b,c,pd,m,pn),x),Not(PositiveIntegerQ(Times(C1D2,Plus(m,C1))))),Not(IntegerQ(Times(C1D2,Plus(pn,C1))))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Sec(Plus(a,Times(b,x)))),pn),Power(Power(Tan(Plus(a,Times(b,x))),pn),CN1),Int(Power(Tan(Plus(a,Times(b,x))),pn),x)),And(And(FreeQ(List(a,b,c,pd,m,pn),x),Or(Not(IntegerQ(m)),Not(IntegerQ(pn)))),ZeroQ(Plus(m,pn))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition(Times(Power(Sin(Plus(a,Times(b,x))),m),Power(Cos(Plus(a,Times(b,x))),pn),Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Sec(Plus(a,Times(b,x)))),pn),Int(Power(Times(Power(Sin(Plus(a,Times(b,x))),m),Power(Cos(Plus(a,Times(b,x))),pn)),CN1),x)),And(FreeQ(List(a,b,c,pd,m,pn),x),Or(Not(IntegerQ(m)),Not(IntegerQ(pn)))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(pd,Cos(Plus(a,Times(b,x)))),pn),Power(Times(pd,Sec(Plus(a,Times(b,x)))),pn),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Power(Times(pd,Cos(Plus(a,Times(b,x)))),pn),CN1)),x)),And(FreeQ(List(a,b,c,pd,m,pn),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Times(Power(Times(pd,Sin(Plus(a,Times(b,x)))),pn),Power(Times(pd,Csc(Plus(a,Times(b,x)))),pn),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Power(Times(pd,Sin(Plus(a,Times(b,x)))),pn),CN1)),x)),And(FreeQ(List(a,b,c,pd,m,pn),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Times(CN1,pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(m,pn,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Times(pd,Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(m,pn,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Times(CN1,Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(m,Times(CN1,pn),Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(m,Times(CN1,pn),Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Times(CN1,Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(m,pn,C1))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(m,pn,C1))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Times(CN1,pd,Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(m,Times(CN1,pn),C1))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Times(pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(m,Times(CN1,pn),C1))))),
ISetDelayed(Int(Times(Power($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),m_DEFAULT),Power($($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),pn_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(b,CN1),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr(x))),Times(C1D2,Plus(m,pn,Times(CN1,C1)))),Power(Power(x,pn),CN1)),x),x,Cos(Plus(a,Times(b,x))))),And(FreeQ(List(a,b),x),IntegersQ(m,pn,Times(C1D2,Plus(m,pn,Times(CN1,C1))))))),
ISetDelayed(Int(Times(Power($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),m_DEFAULT),Power($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),pn_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,CN1),Subst(Int(Times(Power(Plus(C1,Times(CN1,Sqr(x))),Times(C1D2,Plus(m,pn,Times(CN1,C1)))),Power(Power(x,pn),CN1)),x),x,Sin(Plus(a,Times(b,x))))),And(FreeQ(List(a,b),x),IntegersQ(m,pn,Times(C1D2,Plus(m,pn,Times(CN1,C1))))))),
ISetDelayed(Int(Times($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,Sin(Plus(a,Times(b,x))),Power(b,CN1)),Int(Sec(Plus(a,Times(b,x))),x)),FreeQ(List(a,b),x))),
ISetDelayed(Int(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(Cos(Plus(a,Times(b,x))),Power(b,CN1)),Int(Csc(Plus(a,Times(b,x))),x)),FreeQ(List(a,b),x))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(b,m),CN1)),FreeQ(List(a,b,c,m),x))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Times(CN1,Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(b,m),CN1)),FreeQ(List(a,b,c,m),x))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT),Sqr($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),And(FreeQ(List(a,b,pd,pn),x),NonzeroQ(Plus(pn,C1))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT),Sqr($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Times(CN1,Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),And(FreeQ(List(a,b,pd,pn),x),NonzeroQ(Plus(pn,C1))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT),Power($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Times(Power(b,CN1),Subst(Int(Times(Power(Times(pd,x),pn),Power(Plus(C1,Sqr(x)),Times(C1D2,Plus(m,Times(CN1,C2))))),x),x,Tan(Plus(a,Times(b,x))))),And(And(FreeQ(List(a,b,pd,pn),x),EvenQ(m)),Not(And(OddQ(pn),Less(Less(C0,pn),Plus(m,Times(CN1,C1)))))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT),Power($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),m_)),x_Symbol),
    Condition(Times(CN1,Power(b,CN1),Subst(Int(Times(Power(Times(pd,x),pn),Power(Plus(C1,Sqr(x)),Times(C1D2,Plus(m,Times(CN1,C2))))),x),x,Cot(Plus(a,Times(b,x))))),And(And(FreeQ(List(a,b,pd,pn),x),EvenQ(m)),Not(And(OddQ(pn),Less(Less(C0,pn),Plus(m,Times(CN1,C1)))))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power($($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),pn_DEFAULT)),x_Symbol),
    Condition(Times(c,Power(b,CN1),Subst(Int(Times(Power(Times(c,x),Plus(m,Times(CN1,C1))),Power(Plus(CN1,Sqr(x)),Times(C1D2,Plus(pn,Times(CN1,C1))))),x),x,Sec(Plus(a,Times(b,x))))),And(And(FreeQ(List(a,b,c,m),x),OddQ(pn)),Not(And(EvenQ(m),And(Less(C0,m),LessEqual(m,Plus(pn,C1)))))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power($($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),pn_DEFAULT)),x_Symbol),
    Condition(Times(CN1,c,Power(b,CN1),Subst(Int(Times(Power(Times(c,x),Plus(m,Times(CN1,C1))),Power(Plus(CN1,Sqr(x)),Times(C1D2,Plus(pn,Times(CN1,C1))))),x),x,Csc(Plus(a,Times(b,x))))),And(And(FreeQ(List(a,b,c,m),x),OddQ(pn)),Not(And(EvenQ(m),And(Less(C0,m),LessEqual(m,Plus(pn,C1))))))))
  );
}
