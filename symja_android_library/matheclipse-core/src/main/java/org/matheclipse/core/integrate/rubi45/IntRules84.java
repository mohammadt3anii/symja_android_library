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
public class IntRules84 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),Times(CN1,Sqr(c),Plus(pn,C1),Power(Times(Sqr(pd),m),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),Times(CN1,Sqr(c),Plus(pn,C1),Power(Times(Sqr(pd),m),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),Times(Sqr(c),Sqr(pd),Plus(pn,Times(CN1,C1)),Power(m,CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),Times(Sqr(c),Sqr(pd),Plus(pn,Times(CN1,C1)),Power(m,CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(Sqr(c),Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(CN1,Sqr(c),Plus(m,Times(CN1,C2)),Power(Times(Sqr(pd),Plus(pn,C1)),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Unequal(m,C2)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Sqr(c),Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(CN1,Sqr(c),Plus(m,Times(CN1,C2)),Power(Times(Sqr(pd),Plus(pn,C1)),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Unequal(m,C2)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Sqr(c),pd,Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),Times(Sqr(c),Sqr(pd),Plus(m,Times(CN1,C2)),Power(Plus(pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Unequal(m,C2)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(Sqr(c),pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),Times(Sqr(c),Sqr(pd),Plus(m,Times(CN1,C2)),Power(Plus(pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Greater(m,C1)),Unequal(m,C2)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),Times(Sqr(c),Plus(m,pn,Times(CN1,C1)),Power(m,CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,pn,Times(CN1,C1)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),Times(Sqr(c),Plus(m,pn,Times(CN1,C1)),Power(m,CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,pn,Times(CN1,C1)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),Times(Sqr(c),Plus(m,Times(CN1,pn),Times(CN1,C1)),Power(m,CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,Times(CN1,pn),Times(CN1,C1)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),Times(Sqr(c),Plus(m,Times(CN1,pn),Times(CN1,C1)),Power(m,CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,Times(CN1,pn),Times(CN1,C1)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(Sqr(c),Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(m,pn,Times(CN1,C1))),CN1)),Times(Sqr(c),Plus(m,Times(CN1,C2)),Power(Plus(m,pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),Unequal(m,C2)),NonzeroQ(Plus(m,pn,Times(CN1,C1)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Sqr(c),Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(m,pn,Times(CN1,C1))),CN1)),Times(Sqr(c),Plus(m,Times(CN1,C2)),Power(Plus(m,pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),Unequal(m,C2)),NonzeroQ(Plus(m,pn,Times(CN1,C1)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(Sqr(c),pd,Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(m,Times(CN1,pn),Times(CN1,C1))),CN1)),Times(Sqr(c),Plus(m,Times(CN1,C2)),Power(Plus(m,Times(CN1,pn),Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),Unequal(m,C2)),NonzeroQ(Plus(m,Times(CN1,pn),Times(CN1,C1)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,Sqr(c),pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(m,Times(CN1,pn),Times(CN1,C1))),CN1)),Times(Sqr(c),Plus(m,Times(CN1,C2)),Power(Plus(m,Times(CN1,pn),Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,Times(CN1,C2))),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Greater(m,C1)),Unequal(m,C2)),NonzeroQ(Plus(m,Times(CN1,pn),Times(CN1,C1)))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Sqr($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Times(pd,Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),And(FreeQ(List(a,b,pd,pn),x),NonzeroQ(Plus(pn,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Sqr($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Times(CN1,pd,Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),And(FreeQ(List(a,b,pd,pn),x),NonzeroQ(Plus(pn,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Sqr($($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Times(CN1,Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),And(FreeQ(List(a,b,pd,pn),x),NonzeroQ(Plus(pn,C1))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Sqr($($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),And(FreeQ(List(a,b,pd,pn),x),NonzeroQ(Plus(pn,C1))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Sqr(c),Plus(pn,Times(CN1,C1))),CN1)),Times(CN1,Sqr(pd),Plus(m,C2),Power(Times(Sqr(c),Plus(pn,Times(CN1,C1))),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Less(m,CN1)),Unequal(m,CN2)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Sqr(c),Plus(pn,Times(CN1,C1))),CN1)),Times(CN1,Sqr(pd),Plus(m,C2),Power(Times(Sqr(c),Plus(pn,Times(CN1,C1))),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Less(m,CN1)),Unequal(m,CN2)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,Sqr(c),pd,Plus(pn,C1)),CN1)),Times(Plus(m,C2),Power(Times(Sqr(c),Sqr(pd),Plus(pn,C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Less(m,CN1)),Unequal(m,CN2)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,Sqr(c),pd,Plus(pn,C1)),CN1)),Times(Plus(m,C2),Power(Times(Sqr(c),Sqr(pd),Plus(pn,C1)),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Less(m,CN1)),Unequal(m,CN2)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),Times(CN1,Sqr(pd),Plus(pn,Times(CN1,C1)),Power(Times(Sqr(c),m),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Less(m,CN1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),Times(CN1,Sqr(pd),Plus(pn,Times(CN1,C1)),Power(Times(Sqr(c),m),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Less(m,CN1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),Times(Plus(pn,C1),Power(Times(Sqr(c),Sqr(pd),m),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Less(m,CN1)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),Times(Plus(pn,C1),Power(Times(Sqr(c),Sqr(pd),m),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(FreeQ(List(a,b,c,pd),x),RationalQ(m,pn)),Less(m,CN1)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Sqr(c),Plus(m,pn,C1)),CN1)),Times(Plus(m,C2),Power(Times(Sqr(c),Plus(m,pn,C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),Unequal(m,CN2)),NonzeroQ(Plus(m,pn,C1))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Sqr(c),Plus(m,pn,C1)),CN1)),Times(Plus(m,C2),Power(Times(Sqr(c),Plus(m,pn,C1)),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),Unequal(m,CN2)),NonzeroQ(Plus(m,pn,C1))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,Sqr(c),pd,Plus(m,Times(CN1,pn),C1)),CN1)),Times(Plus(m,C2),Power(Times(Sqr(c),Plus(m,Times(CN1,pn),C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),Unequal(m,CN2)),NonzeroQ(Plus(m,Times(CN1,pn),C1))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,Sqr(c),pd,Plus(m,Times(CN1,pn),C1)),CN1)),Times(Plus(m,C2),Power(Times(Sqr(c),Plus(m,Times(CN1,pn),C1)),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),Unequal(m,CN2)),NonzeroQ(Plus(m,Times(CN1,pn),C1))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),Times(Plus(m,pn,C1),Power(Times(Sqr(c),m),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,pn,C1))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,m),CN1)),Times(Plus(m,pn,C1),Power(Times(Sqr(c),m),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,pn,C1))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),Times(Plus(m,Times(CN1,pn),C1),Power(Times(Sqr(c),m),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,Times(CN1,pn),C1))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,m),CN1)),Times(Plus(m,Times(CN1,pn),C1),Power(Times(Sqr(c),m),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,Times(CN1,pn),C1))),RationalQ(pn)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),Times(CN1,Sqr(pd),Plus(m,pn,Times(CN1,C1)),Power(Plus(pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,pn,Times(CN1,C1)))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),Times(CN1,Sqr(pd),Plus(m,pn,Times(CN1,C1)),Power(Plus(pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,pn,Times(CN1,C1)))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(m,Times(CN1,pn),C1)),CN1)),Times(Sqr(pd),Plus(pn,Times(CN1,C1)),Power(Plus(m,Times(CN1,pn),C1),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,Times(CN1,pn),C1))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(m,Times(CN1,pn),C1)),CN1)),Times(Sqr(pd),Plus(pn,Times(CN1,C1)),Power(Plus(m,Times(CN1,pn),C1),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,Times(CN1,pn),C1))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(m,pn,Times(CN1,C1))),CN1)),Times(CN1,Sqr(pd),Plus(pn,Times(CN1,C1)),Power(Plus(m,pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,pn,Times(CN1,C1)))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(m,pn,Times(CN1,C1))),CN1)),Times(CN1,Sqr(pd),Plus(pn,Times(CN1,C1)),Power(Plus(m,pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,pn,Times(CN1,C1)))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),Times(Sqr(pd),Plus(m,Times(CN1,pn),C1),Power(Plus(pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,Times(CN1,pn),C1))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pd,Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C1))),Power(Times(b,Plus(pn,Times(CN1,C1))),CN1)),Times(Sqr(pd),Plus(m,Times(CN1,pn),C1),Power(Plus(pn,Times(CN1,C1)),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,Times(CN1,pn),C1))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(m,pn,C1)),CN1)),Times(CN1,Plus(pn,C1),Power(Times(Sqr(pd),Plus(m,pn,C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,pn,C1))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(m,pn,C1)),CN1)),Times(CN1,Plus(pn,C1),Power(Times(Sqr(pd),Plus(m,pn,C1)),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,pn,C1))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(Plus(m,Times(CN1,pn),Times(CN1,C1)),Power(Times(Sqr(pd),Plus(pn,C1)),CN1),Int(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,Times(CN1,pn),Times(CN1,C1)))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(Plus(m,Times(CN1,pn),Times(CN1,C1)),Power(Times(Sqr(pd),Plus(pn,C1)),CN1),Int(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,Times(CN1,pn),Times(CN1,C1)))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(CN1,Plus(m,pn,C1),Power(Times(Sqr(pd),Plus(pn,C1)),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,pn,C1))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(pn,C1)),CN1)),Times(CN1,Plus(m,pn,C1),Power(Times(Sqr(pd),Plus(pn,C1)),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,pn,C1))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(m,Times(CN1,pn),Times(CN1,C1))),CN1)),Times(Plus(pn,C1),Power(Times(Sqr(pd),Plus(m,Times(CN1,pn),Times(CN1,C1))),CN1),Int(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,Times(CN1,pn),Times(CN1,C1)))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C1)),Power(Times(b,pd,Plus(m,Times(CN1,pn),Times(CN1,C1))),CN1)),Times(Plus(pn,C1),Power(Times(Sqr(pd),Plus(m,Times(CN1,pn),Times(CN1,C1))),CN1),Int(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),Plus(pn,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m),x),RationalQ(pn)),Less(pn,CN1)),NonzeroQ(Plus(m,Times(CN1,pn),Times(CN1,C1)))),RationalQ(m)))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn),Power(Cos(Plus(a,Times(b,x))),pn),Power(Power(Sin(Plus(a,Times(b,x))),Plus(m,pn)),CN1),Int(Times(Power(Sin(Plus(a,Times(b,x))),Plus(m,pn)),Power(Power(Cos(Plus(a,Times(b,x))),pn),CN1)),x)),FreeQ(List(a,b,c,pd,m,pn),x))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn),Power(Sin(Plus(a,Times(b,x))),pn),Power(Power(Cos(Plus(a,Times(b,x))),Plus(m,pn)),CN1),Int(Times(Power(Cos(Plus(a,Times(b,x))),Plus(m,pn)),Power(Power(Sin(Plus(a,Times(b,x))),pn),CN1)),x)),FreeQ(List(a,b,c,pd,m,pn),x))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn),Power(Times(Power(Sin(Plus(a,Times(b,x))),Plus(m,Times(CN1,pn))),Power(Cos(Plus(a,Times(b,x))),pn)),CN1),Int(Times(Power(Sin(Plus(a,Times(b,x))),Plus(m,Times(CN1,pn))),Power(Cos(Plus(a,Times(b,x))),pn)),x)),And(FreeQ(List(a,b,c,pd,m,pn),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn),Power(Times(Power(Sin(Plus(a,Times(b,x))),pn),Power(Cos(Plus(a,Times(b,x))),Plus(m,Times(CN1,pn)))),CN1),Int(Times(Power(Sin(Plus(a,Times(b,x))),pn),Power(Cos(Plus(a,Times(b,x))),Plus(m,Times(CN1,pn)))),x)),And(FreeQ(List(a,b,c,pd,m,pn),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn),Power(Csc(Plus(a,Times(b,x))),pn),Power(Power(Sec(Plus(a,Times(b,x))),Plus(m,pn)),CN1),Int(Times(Power(Sec(Plus(a,Times(b,x))),Plus(m,pn)),Power(Power(Csc(Plus(a,Times(b,x))),pn),CN1)),x)),And(FreeQ(List(a,b,c,pd,m,pn),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn),Power(Sec(Plus(a,Times(b,x))),pn),Power(Power(Csc(Plus(a,Times(b,x))),Plus(m,pn)),CN1),Int(Times(Power(Csc(Plus(a,Times(b,x))),Plus(m,pn)),Power(Power(Sec(Plus(a,Times(b,x))),pn),CN1)),x)),And(FreeQ(List(a,b,c,pd,m,pn),x),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Times(pd_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_),Power(Times(c_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(c,Sec(Plus(a,Times(b,x)))),m),Power(Times(pd,Cot(Plus(a,Times(b,x)))),pn),Power(Times(Power(Csc(Plus(a,Times(b,x))),pn),Power(Sec(Plus(a,Times(b,x))),Plus(m,Times(CN1,pn)))),CN1),Int(Times(Power(Csc(Plus(a,Times(b,x))),pn),Power(Sec(Plus(a,Times(b,x))),Plus(m,Times(CN1,pn)))),x)),FreeQ(List(a,b,c,pd,m,pn),x))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(pd_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Times(Power(Times(c,Csc(Plus(a,Times(b,x)))),m),Power(Times(pd,Tan(Plus(a,Times(b,x)))),pn),Power(Times(Power(Csc(Plus(a,Times(b,x))),Plus(m,Times(CN1,pn))),Power(Sec(Plus(a,Times(b,x))),pn)),CN1),Int(Times(Power(Csc(Plus(a,Times(b,x))),Plus(m,Times(CN1,pn))),Power(Sec(Plus(a,Times(b,x))),pn)),x)),FreeQ(List(a,b,c,pd,m,pn),x)))
  );
}
