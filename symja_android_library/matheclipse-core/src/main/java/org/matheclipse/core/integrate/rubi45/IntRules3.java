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
public class IntRules3 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_DEFAULT),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p),Plus(pa,Times(pb,x))),x),x),And(And(And(And(FreeQ(List(a,b,c,pd,pe,f,pa,pb,m),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(b,pe),Times(CN1,a,f)))),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))),Or(IntegersQ(m,pn,p),PositiveIntegerQ(pn,p))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(pb,c),Times(CN1,pa,pd)),Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(pd,x)),Plus(pn,C1)),Power(Plus(pe,Times(f,x)),Plus(p,C1)),Power(Times(pd,Plus(pn,C1),Plus(Times(pd,pe),Times(CN1,c,f))),CN1)),Times(Power(Times(pd,Plus(pn,C1),Plus(Times(pd,pe),Times(CN1,c,f))),CN1),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,Times(CN1,C1))),Power(Plus(c,Times(pd,x)),Plus(pn,C1)),Power(Plus(pe,Times(f,x)),p),Simp(Plus(Times(a,pd,Plus(Times(pb,pe),Times(CN1,pa,f)),Plus(pn,C1)),Times(Plus(Times(pb,c),Times(CN1,pa,pd)),Plus(Times(b,pe,m),Times(a,f,Plus(p,C1)))),Times(b,Plus(Times(pd,Plus(Times(pb,pe),Times(CN1,pa,f)),Plus(pn,C1)),Times(f,Plus(Times(pb,c),Times(CN1,pa,pd)),Plus(m,p,C1))),x)),x)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,f,pa,pb,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(b,pe),Times(CN1,a,f)))),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))),RationalQ(m,pn)),Greater(m,C0)),Less(pn,CN1)),Not(And(Equal(m,C1),SimplerQ(Plus(pa,Times(pb,x)),Plus(a,Times(b,x)))))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Plus(Times(pb,Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(pd,x)),Plus(pn,C1)),Power(Plus(pe,Times(f,x)),Plus(p,C1)),Power(Times(pd,f,Plus(m,pn,p,C2)),CN1)),Times(Power(Times(pd,f,Plus(m,pn,p,C2)),CN1),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,Times(CN1,C1))),Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p),Simp(Plus(Times(a,pa,pd,f,Plus(m,pn,p,C2)),Times(CN1,pb,Plus(Times(b,c,pe,m),Times(a,Plus(Times(pd,pe,Plus(pn,C1)),Times(c,f,Plus(p,C1)))))),Times(Plus(Times(pa,b,pd,f,Plus(m,pn,p,C2)),Times(pb,Plus(Times(a,pd,f,m),Times(CN1,b,Plus(Times(pd,pe,Plus(m,pn,C1)),Times(c,f,Plus(m,p,C1))))))),x)),x)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,f,pa,pb,pn,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(b,pe),Times(CN1,a,f)))),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))),RationalQ(m)),Greater(m,C0)),NonzeroQ(Plus(m,pn,p,C2))),Not(And(Equal(m,C1),SimplerQ(Plus(pa,Times(pb,x)),Plus(a,Times(b,x)))))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_DEFAULT),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Plus(Times(pa,b),Times(CN1,a,pb)),Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(pd,x)),Plus(pn,C1)),Power(Plus(pe,Times(f,x)),Plus(p,C1)),Power(Times(Plus(m,C1),Plus(Times(b,c),Times(CN1,a,pd)),Plus(Times(b,pe),Times(CN1,a,f))),CN1)),Times(Power(Times(Plus(m,C1),Plus(Times(b,c),Times(CN1,a,pd)),Plus(Times(b,pe),Times(CN1,a,f))),CN1),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p),Simp(Plus(Times(Plus(Times(b,pb,c,pe),Times(pa,Plus(Times(a,pd,f),Times(CN1,b,Plus(Times(pd,pe),Times(c,f)))))),Plus(m,C1)),Times(CN1,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(Times(pd,pe,Plus(pn,C1)),Times(c,f,Plus(p,C1)))),Times(CN1,pd,f,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,pn,p,C3),x)),x)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,f,pa,pb,pn,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(b,pe),Times(CN1,a,f)))),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT)),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),p_),Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))),CN1)),x_Symbol),
    Condition(Plus(Times(Plus(Times(pa,b),Times(CN1,a,pb)),Power(Plus(Times(b,c),Times(CN1,a,pd)),CN1),Int(Times(Power(Plus(pe,Times(f,x)),p),Power(Plus(a,Times(b,x)),CN1)),x)),Times(Plus(Times(pb,c),Times(CN1,pa,pd)),Power(Plus(Times(b,c),Times(CN1,a,pd)),CN1),Int(Times(Power(Plus(pe,Times(f,x)),p),Power(Plus(c,Times(pd,x)),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(b,pe),Times(CN1,a,f)))),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Plus(Times(pb,Power(b,CN1),Int(Times(Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p)),x)),Times(Plus(Times(pa,b),Times(CN1,a,pb)),Power(b,CN1),Int(Times(Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p),Power(Plus(a,Times(b,x)),CN1)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe,f,pa,pb,pn,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(b,pe),Times(CN1,a,f)))),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),CN1D2),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Plus(Times(pb,Power(pd,CN1),Int(Times(Sqrt(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,x)),m),Power(Plus(pe,Times(f,x)),p)),x)),Times(CN1,Plus(Times(pb,c),Times(CN1,pa,pd)),Power(pd,CN1),Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(pe,Times(f,x)),p),Power(Plus(c,Times(pd,x)),CN1D2)),x))),And(And(And(FreeQ(List(a,b,c,pd,pe,f,pa,pb,m,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(b,pe),Times(CN1,a,f)))),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_DEFAULT),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Plus(Times(Plus(Times(pa,b),Times(CN1,a,pb)),Power(b,CN1),Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p)),x)),Times(pb,Power(b,CN1),Int(Times(Power(Plus(a,Times(b,x)),Plus(m,C1)),Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,f,pa,pb,m,pn,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(b,pe),Times(CN1,a,f)))),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))),Or(SumSimplerQ(m,C1),And(Not(SumSimplerQ(pn,C1)),Not(SumSimplerQ(p,C1))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),q_),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p),Power(Plus(g,Times(h,x)),q)),x),x),And(FreeQ(List(a,b,c,pd,pe,f,g,h,m,pn),x),IntegersQ(p,q)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_DEFAULT),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),q_DEFAULT),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p),Power(Plus(g,Times(h,x)),q)),x),FreeQ(List(a,b,c,pd,pe,f,g,h,m,pn,p,q),x))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,u_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(v_,pd_DEFAULT)),pn_DEFAULT),Power(Plus(g_DEFAULT,Times(h_DEFAULT,z_)),q_DEFAULT),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,w_)),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p),Power(Plus(g,Times(h,x)),q)),x),x,u)),And(And(And(And(And(FreeQ(List(a,b,c,pd,pe,f,g,h,m,pn,p,q),x),LinearQ(u,x)),NonzeroQ(Plus(u,Times(CN1,x)))),ZeroQ(Plus(u,Times(CN1,v)))),ZeroQ(Plus(u,Times(CN1,w)))),ZeroQ(Plus(u,Times(CN1,z)))))),
ISetDelayed(Int(Times(Power(u_,m_DEFAULT),Power(v_,pn_DEFAULT),Power(w_,p_DEFAULT),Power(z_,q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(ExpandToSum(v,x),pn),Power(ExpandToSum(w,x),p),Power(ExpandToSum(z,x),q)),x),And(And(FreeQ(List(m,pn,p,q),x),LinearQ(List(u,v,w,z),x)),Not(LinearMatchQ(List(u,v,w,z),x)))))
  );
}
