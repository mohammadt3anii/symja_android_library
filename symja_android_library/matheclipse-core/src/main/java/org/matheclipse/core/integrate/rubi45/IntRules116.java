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
public class IntRules116 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),Times(CN1,b,c,pn,Int(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x))),And(And(FreeQ(List(a,b,c),x),RationalQ(pn)),Greater(pn,C0)))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_),x_Symbol),
    Condition(Plus(Times(Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Plus(pn,C1)),CN1)),Times(CN1,c,Power(Times(b,Plus(pn,C1)),CN1),Int(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x))),And(And(FreeQ(List(a,b,c),x),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_),x_Symbol),
    Condition(Times(Power(Times(b,c),CN1),Subst(Int(Times(Power(x,pn),Cosh(Plus(Times(a,Power(b,CN1)),Times(CN1,x,Power(b,CN1))))),x),x,Plus(a,Times(b,ArcSinh(Times(c,x)))))),FreeQ(List(a,b,c,pn),x))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Times(pe,Plus(m,C1)),CN1)),Times(CN1,b,c,pn,Power(Times(pe,Plus(m,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),RationalQ(pn)),Greater(pn,C0)),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Plus(pn,C1)),CN1)),Times(CN1,Power(Times(b,Power(c,Plus(m,C1)),Plus(pn,C1)),CN1),Subst(Int(ExpandTrigReduce(Power(Plus(a,Times(b,x)),Plus(pn,C1)),Times(Power(Sinh(x),Plus(m,Times(CN1,C1))),Plus(m,Times(Plus(m,C1),Sqr(Sinh(x))))),x),x),x,ArcSinh(Times(c,x))))),And(And(And(FreeQ(List(a,b,c),x),RationalQ(pn)),And(LessEqual(CN2,pn),Less(pn,CN1))),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Plus(pn,C1)),CN1)),Times(CN1,m,Power(Times(b,c,Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x)),Times(CN1,c,Plus(m,C1),Power(Times(b,Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x))),And(And(And(FreeQ(List(a,b,c),x),RationalQ(pn)),Less(pn,CN2)),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_),Power(Plus(pd_,Times(x_,pe_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(pd,Times(pe,x)),m),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),x),And(And(And(FreeQ(List(a,b,c,pd,pe),x),RationalQ(pn)),Less(pn,CN1)),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Cosh(x),Power(Plus(Times(c,pd),Times(pe,Sinh(x))),m)),x),x,ArcSinh(Times(c,x)))),And(And(FreeQ(List(a,b,c,pd,pe,pn),x),IntegerQ(m)),Or(Greater(m,C0),PositiveIntegerQ(pn))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(pd,Times(pe,x)),m),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,m,pn),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(pd,Times(pe,x)),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),x),And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),IntegerQ(p)),PositiveIntegerQ(pn)),Or(PositiveIntegerQ(p),NonzeroQ(a))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(pd,Times(pe,x)),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,m,pn,p),x))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),And(And(FreeQ(List(a,b,c,pd,pe,f,g,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_)),x_Symbol),
    Condition(Times(Sqrt(Plus(pd,Times(pe,x))),Sqrt(Plus(f,Times(g,x))),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),CN1D2),Int(Times(Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x)),And(And(FreeQ(List(a,b,c,pd,pe,f,g,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_)),x_Symbol),
    Condition(Times(Sqrt(Plus(Times(pd,f),Times(pe,g,Sqr(x)))),Power(Times(Sqrt(Plus(pd,Times(pe,x))),Sqrt(Plus(f,Times(g,x)))),CN1),Int(Times(Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x)),And(And(FreeQ(List(a,b,c,pd,pe,f,g,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(Plus(pd,Times(pe,x)),p),Power(Plus(f,Times(g,x)),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Times(CN1,b,c,Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x)))),And(FreeQ(List(a,b,c,pd,pe,f,g),x),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),Power(Plus(f_,Times(g_DEFAULT,x_)),p_),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(Plus(pd,Times(pe,x)),p),Power(Plus(f,Times(g,x)),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Times(CN1,b,c,Int(Dist(Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2),u,x),x)))),And(FreeQ(List(a,b,c,pd,pe,f,g),x),NegativeIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(pd,Times(pe,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),x),And(FreeQ(List(a,b,c,pd,pe,f,g,pn),x),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(pd,Times(pe,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,f,g,pn,p),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),Power(Plus(pd_DEFAULT,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Power(Plus(pd,Times(pe,Sqr(x))),p),x)))),Plus(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Times(CN1,b,c,Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x)))),And(FreeQ(List(a,b,c,pd,pe),x),Or(PositiveIntegerQ(p),NegativeIntegerQ(Plus(p,C1D2)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Power(Times(b,c,Sqrt(pd)),CN1),Subst(Int(Power(x,pn),x),x,Plus(a,Times(b,ArcSinh(Times(c,x)))))),And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveQ(pd)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Plus(Times(C2,p),C1),CN1)),Times(CN1,b,c,pn,Sqrt(pd),Power(Plus(Times(C2,p),C1),CN1),Int(Times(x,Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(C2,pd,p,Power(Plus(Times(C2,p),C1),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(pn)),Greater(pn,C0)),Greater(p,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Times(Power(Times(c,pd),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Sech(x)),x),x,ArcSinh(Times(c,x)))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveQ(pd)),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Times(pd,Sqrt(Plus(pd,Times(pe,Sqr(x))))),CN1)),Times(CN1,b,c,pn,Power(pd,CN1D2),Int(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveQ(pd)),RationalQ(pn)),Greater(pn,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,x,Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Times(C2,pd,Plus(p,C1)),CN1)),Times(b,c,pn,Power(Times(C2,Sqrt(pd),Plus(p,C1)),CN1),Int(Times(x,Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(Plus(Times(C2,p),C3),Power(Times(C2,pd,Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(pn)),Greater(pn,C0)),Less(p,CN1)),Unequal(p,QQ(-2L,3L))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1)),Times(CN1,pe,Plus(Times(C2,p),C1),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(x,Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(pn)),Less(pn,CN1)),Unequal(p,CN1D2)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,p),Power(c,CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Cosh(x),Plus(Times(C2,p),C1))),x),x,ArcSinh(Times(c,x)))),And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveIntegerQ(Times(C2,p))),PositiveQ(pd)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,p),Int(Times(Power(Plus(C1,Times(Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x)),And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(p)),Not(PositiveQ(pd))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(Power(pd,Plus(p,Times(CN1,C1D2))),Sqrt(Plus(pd,Times(pe,Sqr(x)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2),Int(Times(Power(Plus(C1,Times(Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x)),And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveIntegerQ(Plus(p,C1D2))),Not(PositiveQ(pd))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(Power(pd,Plus(p,C1D2)),Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2),Int(Times(Power(Plus(C1,Times(Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x)),And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))),Not(PositiveQ(pd))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_DEFAULT,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),x),And(FreeQ(List(a,b,c,pd,pe,pn),x),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_DEFAULT,Times(pe_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(Sqrt(pd),Times(CN1,Sqrt(Times(CN1,pe)),x)),p),Power(Plus(Sqrt(pd),Times(Sqrt(Times(CN1,pe)),x)),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),x),And(And(FreeQ(List(a,b,c,pd,pe,pn),x),NegativeIntegerQ(p)),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_DEFAULT,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,pn,p),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),And(And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_)),x_Symbol),
    Condition(Times(Sqrt(Plus(pd,Times(pe,x))),Sqrt(Plus(f,Times(g,x))),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x)),And(And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_)),x_Symbol),
    Condition(Times(Sqrt(Plus(Times(pd,f),Times(pe,g,Sqr(x)))),Power(Times(Sqrt(Plus(pd,Times(pe,x))),Sqrt(Plus(f,Times(g,x)))),CN1),Int(Times(Power(x,m),Power(Plus(Times(pd,f),Times(pe,g,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x)),And(And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),ZeroQ(Plus(Times(pe,f),Times(pd,g)))),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(pd,Times(pe,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),x),And(FreeQ(List(a,b,c,pd,pe,f,g,m,pn),x),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(pd_,Times(x_,pe_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(pd,Times(pe,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x),FreeQ(List(a,b,c,pd,pe,f,g,m,pn,p),x))),
ISetDelayed(Int(Times(x_,Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),Power(Plus(pd_DEFAULT,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcSinh(Times(c,x)))),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(CN1,b,c,Power(Times(C2,pe,Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x))),And(FreeQ(List(a,b,c,pd,pe,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(Plus(pd_DEFAULT,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Times(CN1,b,c,Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x)))),And(FreeQ(List(a,b,c,pd,pe,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))))))))),
ISetDelayed(Int(Times(x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(CN1,b,pn,Power(Times(C2,c,Sqrt(pd),Plus(p,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(pn)),Greater(pn,C0)),Unequal(p,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Plus(m,C1),CN1)),Times(CN1,b,c,Sqrt(pd),pn,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(CN1,C2,pe,p,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Greater(p,C0)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Plus(m,Times(C2,p),C1),CN1)),Times(CN1,b,c,pn,Sqrt(pd),Power(Plus(m,Times(C2,p),C1),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(C2,pd,p,Power(Plus(m,Times(C2,p),C1),CN1),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Greater(p,C0)),Unequal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Times(pd,Plus(m,C1)),CN1)),Times(CN1,b,c,pn,Power(Times(Sqrt(pd),Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Less(p,C0)),Unequal(m,CN1)),Equal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),Power(x_,m_),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(a,Times(b,ArcSinh(Times(c,x)))),Hypergeometric2F1(C1D2,Times(C1D2,Plus(m,C1)),Times(C1D2,Plus(m,C3)),Times(CN1,Sqr(c),Sqr(x))),Power(Times(Sqrt(pd),Plus(m,C1)),CN1)),Times(CN1,b,c,Power(x,Plus(m,C2)),HypergeometricPFQ(List(C1,Plus(C1,Times(C1D2,m)),Plus(C1,Times(C1D2,m))),List(Plus(QQ(3L,2L),Times(C1D2,m)),Plus(C2,Times(C1D2,m))),Times(CN1,Sqr(c),Sqr(x))),Power(Times(Sqrt(pd),Plus(m,C1),Plus(m,C2)),CN1))),And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveQ(pd)),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Times(Power(Times(Power(c,Plus(m,C1)),pd),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Sinh(x),m),Sech(x)),x),x,ArcSinh(Times(c,x)))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveQ(pd)),PositiveIntegerQ(pn)),IntegerQ(m)),Equal(Sqr(m),C1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Times(pe,Plus(m,Times(C2,p),C1)),CN1)),Times(CN1,b,c,Sqrt(pd),pn,Power(Times(pe,Plus(m,Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(CN1,Plus(m,Times(CN1,C1)),Power(Times(Sqr(c),Plus(m,Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),And(LessEqual(CN1,p),Less(p,C0))),Greater(m,C1)),NonzeroQ(Plus(m,Times(C2,p),C1))))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Times(C2,pe,Plus(p,C1)),CN1)),Times(CN1,b,pn,Power(Times(C2,c,Sqrt(pd),Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(CN1,Plus(m,Times(CN1,C1)),Power(Times(C2,pe,Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Less(p,CN1)),Greater(m,C1)))),
ISetDelayed(Int(Times(ArcSinh(Times(c_DEFAULT,x_)),Power(Times(x_,Sqrt(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(C2,ArcSinh(Times(c,x)),ArcTanh(Plus(Times(c,x),Times(CN1,Sqrt(Plus(C1,Times(Sqr(c),Sqr(x))))))),Power(pd,CN1D2)),Times(PolyLog(C2,Plus(Times(c,x),Times(CN1,Sqrt(Plus(C1,Times(Sqr(c),Sqr(x))))))),Power(pd,CN1D2)),Times(CN1,PolyLog(C2,Plus(Times(CN1,c,x),Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))))),Power(pd,CN1D2))),And(And(FreeQ(List(c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveQ(pd)))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),Power(Times(x_,Sqrt(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(a,Int(Power(Times(x,Sqrt(Plus(pd,Times(pe,Sqr(x))))),CN1),x)),Times(b,Int(Times(ArcSinh(Times(c,x)),Power(Times(x,Sqrt(Plus(pd,Times(pe,Sqr(x))))),CN1)),x))),And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveQ(pd)))),
ISetDelayed(Int(Times(Power(x_,CN1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(Sqr(c),Int(Times(x,Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x)),Times(Power(pd,CN1),Int(Times(Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(x,CN1)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(pn)),Greater(pn,C0)),Less(p,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Times(pd,Plus(m,C1)),CN1)),Times(CN1,b,c,pn,Power(Times(Sqrt(pd),Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,Times(CN1,C1)))),x)),Times(CN1,Sqr(c),Plus(m,Times(C2,p),C3),Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Greater(pn,C0)),Less(p,C0)),Less(m,CN1)),Unequal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1)),Times(CN1,m,Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,m),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveQ(pd)),RationalQ(pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1)),Times(CN1,pd,m,Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Less(pn,CN1)),Equal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1)),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1)),Times(CN1,pd,m,Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1))),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1))),x)),Times(CN1,pe,Plus(m,Times(C2,p),C1),Power(Times(b,c,Sqrt(pd),Plus(pn,C1)),CN1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,Times(CN1,C1D2))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(pn,C1))),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(Times(C2,p))),PositiveQ(pd)),RationalQ(m,pn)),Less(pn,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(Power(pd,CN1),Int(Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x)),Times(CN1,pe,Power(pd,CN1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(pd,Times(pe,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),NegativeIntegerQ(Plus(p,C1D2))),PositiveQ(pd)),NegativeIntegerQ(Times(C1D2,Plus(m,Times(CN1,C1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Power(Times(Power(c,Plus(m,C1)),Sqrt(pd)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Sinh(x),m)),x),x,ArcSinh(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveQ(pd)),IntegerQ(m)),Or(Greater(m,C0),PositiveIntegerQ(pn))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,p),Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),pn),Power(Sinh(x),m),Power(Cosh(x),Plus(Times(C2,p),C1))),x),x,ArcSinh(Times(c,x)))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveIntegerQ(Times(C2,p))),PositiveQ(pd)),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn),Power(Plus(pd,Times(pe,Sqr(x))),CN1D2)),Times(Power(x,m),Power(Plus(pd,Times(pe,Sqr(x))),Plus(p,C1D2))),x),x),And(And(And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveIntegerQ(Plus(p,C1D2))),PositiveQ(pd)),Not(PositiveIntegerQ(Times(C1D2,Plus(m,C1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(pd,p),Int(Times(Power(x,m),Power(Plus(C1,Times(Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x)),And(And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),IntegerQ(p)),Not(PositiveQ(pd))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),pn_DEFAULT),Power(Plus(pd_,Times(pe_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(Power(pd,Plus(p,Times(CN1,C1D2))),Sqrt(Plus(pd,Times(pe,Sqr(x)))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2),Int(Times(Power(x,m),Power(Plus(C1,Times(Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),pn)),x)),And(And(And(FreeQ(List(a,b,c,pd,pe,m,pn),x),ZeroQ(Plus(pe,Times(CN1,Sqr(c),pd)))),PositiveIntegerQ(Plus(p,C1D2))),Not(PositiveQ(pd)))))
  );
}
