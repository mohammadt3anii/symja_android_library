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
public class IntRules33 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Power(pf_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Times(Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Times(b,c,Log(pf)),CN1)),FreeQ(List(pf,a,b,c),x))),
ISetDelayed(Int(Times(Power(pf_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,x)),m),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Times(b,c,Log(pf)),CN1)),Times(CN1,pe,m,Power(Times(b,c,Log(pf)),CN1),Int(Times(Power(Plus(pd,Times(pe,x)),Plus(m,Times(CN1,C1))),Power(pf,Times(c,Plus(a,Times(b,x))))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),IntegerQ(Times(C2,m))),Not(SameQ($s("§$usegamma"),True))),Greater(m,C0)))),
ISetDelayed(Int(Times(Power(pf_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),CN1)),x_Symbol),
    Condition(Times(Power(pe,CN1),Power(pf,Times(c,Plus(a,Times(CN1,b,pd,Power(pe,CN1))))),ExpIntegralEi(Times(b,c,Plus(pd,Times(pe,x)),Log(pf),Power(pe,CN1)))),And(FreeQ(List(pf,a,b,c,pd,pe),x),Not(SameQ($s("§$usegamma"),True))))),
ISetDelayed(Int(Times(Power(pf_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),CN1D2)),x_Symbol),
    Condition(Times(C2,Power(pe,CN1),Subst(Int(Power(pf,Plus(Times(c,Plus(a,Times(CN1,b,pd,Power(pe,CN1)))),Times(b,c,Sqr(x),Power(pe,CN1)))),x),x,Sqrt(Plus(pd,Times(pe,x))))),And(FreeQ(List(pf,a,b,c,pd,pe),x),Not(SameQ($s("§$usegamma"),True))))),
ISetDelayed(Int(Times(Power(pf_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,x)),Plus(m,C1)),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Times(pe,Plus(m,C1)),CN1)),Times(CN1,b,c,Log(pf),Power(Times(pe,Plus(m,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,x)),Plus(m,C1)),Power(pf,Times(c,Plus(a,Times(b,x))))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),IntegerQ(Times(C2,m))),Not(SameQ($s("§$usegamma"),True))),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(pf_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(CN1,pe),m),Power(pf,Times(c,Plus(a,Times(CN1,b,pd,Power(pe,CN1))))),Power(Times(Power(b,Plus(m,C1)),Power(c,Plus(m,C1)),Power(Log(pf),Plus(m,C1))),CN1),Gamma(Plus(m,C1),Times(CN1,b,c,Log(pf),Power(pe,CN1),Plus(pd,Times(pe,x))))),And(FreeQ(List(pf,a,b,c,pd,pe),x),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(pf_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_)),x_Symbol),
    Condition(Times(Power(Times(CN1,pe),Plus(m,Times(CN1,C1D2))),Power(pf,Times(c,Plus(a,Times(CN1,b,pd,Power(pe,CN1))))),Sqrt(Plus(pd,Times(pe,x))),Power(Times(Power(b,Plus(m,C1D2)),Power(c,Plus(m,C1D2)),Power(Log(pf),Plus(m,C1D2)),Sqrt(Times(CN1,b,c,Log(pf),Power(pe,CN1),Plus(pd,Times(pe,x))))),CN1),Gamma(Plus(m,C1),Times(CN1,b,c,Log(pf),Power(pe,CN1),Plus(pd,Times(pe,x))))),And(FreeQ(List(pf,a,b,c,pd,pe),x),PositiveIntegerQ(Plus(m,C1D2))))),
ISetDelayed(Int(Times(Power(pf_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_)),x_Symbol),
    Condition(Times(Power(Times(CN1,pe),Plus(m,C1D2)),Power(pf,Times(c,Plus(a,Times(CN1,b,pd,Power(pe,CN1))))),Sqrt(Times(CN1,b,c,Log(pf),Power(pe,CN1),Plus(pd,Times(pe,x)))),Power(Times(Power(b,Plus(m,QQ(3L,2L))),Power(c,Plus(m,QQ(3L,2L))),Power(Log(pf),Plus(m,QQ(3L,2L))),Sqrt(Plus(pd,Times(pe,x)))),CN1),Gamma(Plus(m,C1),Times(CN1,b,c,Log(pf),Power(pe,CN1),Plus(pd,Times(pe,x))))),And(FreeQ(List(pf,a,b,c,pd,pe),x),NegativeIntegerQ(Plus(m,Times(CN1,C1D2)))))),
ISetDelayed(Int(Times(Power(E,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_)),x_Symbol),
    Condition(Times(Power(E,Times(c,Plus(a,Times(CN1,b,pd,Power(pe,CN1))))),Power(Plus(pd,Times(pe,x)),m),Power(Times(b,c,Power(Times(CN1,b,c,Power(pe,CN1),Plus(pd,Times(pe,x))),m)),CN1),Gamma(Plus(m,C1),Times(CN1,b,c,Power(pe,CN1),Plus(pd,Times(pe,x))))),And(FreeQ(List(a,b,c,pd,pe,m),x),Not(SumSimplerQ(m,C1))))),
ISetDelayed(Int(Times(Power(pf_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_)),x_Symbol),
    Condition(Times(CN1,Power(pf,Times(c,Plus(a,Times(CN1,b,pd,Power(pe,CN1))))),Power(Plus(pd,Times(pe,x)),Plus(m,C1)),Power(Times(pe,Power(Times(CN1,b,c,Log(pf),Plus(pd,Times(pe,x)),Power(pe,CN1)),Plus(m,C1))),CN1),Gamma(Plus(m,C1),Times(CN1,b,c,Log(pf),Plus(pd,Times(pe,x)),Power(pe,CN1)))),FreeQ(List(pf,a,b,c,pd,pe,m),x))),
ISetDelayed(Int(Times(Power(u_,m_DEFAULT),Power(pf_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Int(Times(Power(NormalizePowerOfLinear(u,x),m),Power(pf,Times(c,ExpandToSum(v,x)))),x),And(And(And(And(FreeQ(List(pf,c),x),LinearQ(v,x)),PowerOfLinearQ(u,x)),Not(And(LinearMatchQ(v,x),PowerOfLinearMatchQ(u,x)))),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(u_,m_DEFAULT),Power(pf_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Module(List(Set($s("uu"),NormalizePowerOfLinear(u,x)),z),CompoundExpression(Set(z,If(And(PowerQ($s("uu")),FreeQ(Part($s("uu"),C2),x)),Power(Part($s("uu"),C1),Times(m,Part($s("uu"),C2))),Power($s("uu"),m))),Times(Power($s("uu"),m),Power(z,CN1),Int(Times(z,Power(pf,Times(c,ExpandToSum(v,x)))),x)))),And(And(And(And(FreeQ(List(pf,c,m),x),LinearQ(v,x)),PowerOfLinearQ(u,x)),Not(And(LinearMatchQ(v,x),PowerOfLinearMatchQ(u,x)))),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(u_,Power(pf_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(u,Power(pf,Times(c,ExpandToSum(v,x)))),x),x),And(And(And(FreeQ(List(pf,c),x),PolynomialQ(u,x)),LinearQ(v,x)),SameQ($s("§$usegamma"),True)))),
ISetDelayed(Int(Times(u_,Power(pf_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(pf,Times(c,ExpandToSum(v,x))),u,x),x),And(And(And(FreeQ(List(pf,c),x),PolynomialQ(u,x)),LinearQ(v,x)),Not(SameQ($s("§$usegamma"),True))))),
ISetDelayed(Int(Times(w_,Power(u_,m_DEFAULT),Power(pf_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Times(Coefficient(w,x,C1),Power(u,Plus(m,C1)),Power(pf,Times(c,v)),Power(Times(Coefficient(v,x,C1),c,Coefficient(u,x,C1),Log(pf)),CN1)),And(And(FreeQ(List(pf,c,m),x),LinearQ(List(u,v,w),x)),ZeroQ(Plus(Times(Coefficient(u,x,C1),Coefficient(w,x,C1),Plus(m,C1)),Times(CN1,Coefficient(v,x,C1),c,Plus(Times(Coefficient(u,x,C1),Coefficient(w,x,C0)),Times(CN1,Coefficient(u,x,C0),Coefficient(w,x,C1))),Log(pf))))))),
ISetDelayed(Int(Times(w_,Power(u_,m_DEFAULT),Power(pf_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(w,Power(NormalizePowerOfLinear(u,x),m),Power(pf,Times(c,ExpandToSum(v,x)))),x),x),And(And(And(And(And(FreeQ(List(pf,c),x),PolynomialQ(w,x)),LinearQ(v,x)),PowerOfLinearQ(u,x)),IntegerQ(m)),SameQ($s("§$usegamma"),True)))),
ISetDelayed(Int(Times(w_,Power(u_,m_DEFAULT),Power(pf_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(pf,Times(c,ExpandToSum(v,x))),Times(w,Power(NormalizePowerOfLinear(u,x),m)),x),x),And(And(And(And(And(FreeQ(List(pf,c),x),PolynomialQ(w,x)),LinearQ(v,x)),PowerOfLinearQ(u,x)),IntegerQ(m)),Not(SameQ($s("§$usegamma"),True))))),
ISetDelayed(Int(Times(w_,Power(u_,m_DEFAULT),Power(pf_,Times(c_DEFAULT,v_))),x_Symbol),
    Condition(Module(List(Set($s("uu"),NormalizePowerOfLinear(u,x)),z),CompoundExpression(Set(z,If(And(PowerQ($s("uu")),FreeQ(Part($s("uu"),C2),x)),Power(Part($s("uu"),C1),Times(m,Part($s("uu"),C2))),Power($s("uu"),m))),Times(Power($s("uu"),m),Power(z,CN1),Int(ExpandIntegrand(Times(w,z,Power(pf,Times(c,ExpandToSum(v,x)))),x),x)))),And(And(And(And(FreeQ(List(pf,c,m),x),PolynomialQ(w,x)),LinearQ(v,x)),PowerOfLinearQ(u,x)),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Plus(pe_,Times(h_DEFAULT,Log(Times(x_,pd_DEFAULT)),Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power(pf_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Log(Times(x_,pd_DEFAULT)),pn_DEFAULT)),x_Symbol),
    Condition(Times(pe,x,Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Log(Times(pd,x)),Plus(pn,C1)),Power(Plus(pn,C1),CN1)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g,h,pn),x),ZeroQ(Plus(pe,Times(CN1,f,h,Plus(pn,C1))))),ZeroQ(Plus(Times(g,h,Plus(pn,C1)),Times(CN1,b,c,pe,Log(pf))))),NonzeroQ(Plus(pn,C1))))),
ISetDelayed(Int(Times(Plus(pe_,Times(h_DEFAULT,Log(Times(x_,pd_DEFAULT)),Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(pf_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Log(Times(x_,pd_DEFAULT)),pn_DEFAULT)),x_Symbol),
    Condition(Times(pe,Power(x,Plus(m,C1)),Power(pf,Times(c,Plus(a,Times(b,x)))),Power(Log(Times(pd,x)),Plus(pn,C1)),Power(Plus(pn,C1),CN1)),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g,h,m,pn),x),ZeroQ(Plus(Times(pe,Plus(m,C1)),Times(CN1,f,h,Plus(pn,C1))))),ZeroQ(Plus(Times(g,h,Plus(pn,C1)),Times(CN1,b,c,pe,Log(pf))))),NonzeroQ(Plus(pn,C1))))),
ISetDelayed(Int(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),x_Symbol),
    Condition(Times(Power(pf,Plus(a,Times(b,Plus(c,Times(pd,x))))),Power(Times(b,pd,Log(pf)),CN1)),FreeQ(List(pf,a,b,c,pd),x))),
ISetDelayed(Int(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),x_Symbol),
    Condition(Times(Power(pf,a),Sqrt(Pi),Erfi(Times(Plus(c,Times(pd,x)),Rt(Times(b,Log(pf)),C2))),Power(Times(C2,pd,Rt(Times(b,Log(pf)),C2)),CN1)),And(FreeQ(List(pf,a,b,c,pd),x),PosQ(b)))),
ISetDelayed(Int(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),x_Symbol),
    Condition(Times(Power(pf,a),Sqrt(Pi),Erf(Times(Plus(c,Times(pd,x)),Rt(Times(CN1,b,Log(pf)),C2))),Power(Times(C2,pd,Rt(Times(CN1,b,Log(pf)),C2)),CN1)),And(FreeQ(List(pf,a,b,c,pd),x),NegQ(b)))),
ISetDelayed(Int(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),x_Symbol),
    Condition(Plus(Times(Plus(c,Times(pd,x)),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn)))),Power(pd,CN1)),Times(CN1,b,pn,Log(pf),Int(Times(Power(Plus(c,Times(pd,x)),pn),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn))))),x))),And(And(FreeQ(List(pf,a,b,c,pd),x),IntegerQ(Times(C2,Power(pn,CN1)))),NegativeIntegerQ(pn)))),
ISetDelayed(Int(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),x_Symbol),
    Condition(Module(List(Set(k,Denominator(pn))),Times(k,Power(pd,CN1),Subst(Int(Times(Power(x,Plus(k,Times(CN1,C1))),Power(pf,Plus(a,Times(b,Power(x,Times(k,pn)))))),x),x,Power(Plus(c,Times(pd,x)),Power(k,CN1))))),And(And(FreeQ(List(pf,a,b,c,pd),x),IntegerQ(Times(C2,Power(pn,CN1)))),Not(IntegerQ(pn))))),
ISetDelayed(Int(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),x_Symbol),
    Condition(Times(CN1,Power(pf,a),Plus(c,Times(pd,x)),Gamma(Power(pn,CN1),Times(CN1,b,Power(Plus(c,Times(pd,x)),pn),Log(pf))),Power(Times(pd,pn,Power(Times(CN1,b,Power(Plus(c,Times(pd,x)),pn),Log(pf)),Power(pn,CN1))),CN1)),And(FreeQ(List(pf,a,b,c,pd,pn),x),Not(IntegerQ(Times(C2,Power(pn,CN1))))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(pe,Times(f,x)),pn),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn)))),Power(Times(b,f,pn,Power(Plus(c,Times(pd,x)),pn),Log(pf)),CN1)),And(And(FreeQ(List(pf,a,b,c,pd,pe,f,pn),x),ZeroQ(Plus(m,Times(CN1,Plus(pn,Times(CN1,C1)))))),ZeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Times(Power(pf,a),ExpIntegralEi(Times(b,Power(Plus(c,Times(pd,x)),pn),Log(pf))),Power(Times(f,pn),CN1)),And(FreeQ(List(pf,a,b,c,pd,pe,f,pn),x),ZeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(pd,Plus(m,C1)),CN1),Subst(Int(Power(pf,Plus(a,Times(b,Sqr(x)))),x),x,Power(Plus(c,Times(pd,x)),Plus(m,C1)))),And(FreeQ(List(pf,a,b,c,pd,m,pn),x),ZeroQ(Plus(pn,Times(CN1,C2,Plus(m,C1))))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(pd,x)),Plus(m,Times(CN1,pn),C1)),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn)))),Power(Times(b,pd,pn,Log(pf)),CN1)),Times(CN1,Plus(m,Times(CN1,pn),C1),Power(Times(b,pn,Log(pf)),CN1),Int(Times(Power(Plus(c,Times(pd,x)),Plus(m,Times(CN1,pn))),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn))))),x))),And(And(And(And(And(FreeQ(List(pf,a,b,c,pd),x),RationalQ(m)),IntegerQ(Times(C2,Plus(m,C1),Power(pn,CN1)))),Less(Less(C0,Times(Plus(m,C1),Power(pn,CN1))),C5)),IntegerQ(pn)),Or(Less(Less(C0,pn),Plus(m,C1)),Less(Less(m,pn),C0))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(pd,x)),Plus(m,Times(CN1,pn),C1)),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn)))),Power(Times(b,pd,pn,Log(pf)),CN1)),Times(CN1,Plus(m,Times(CN1,pn),C1),Power(Times(b,pn,Log(pf)),CN1),Int(Times(Power(Plus(c,Times(pd,x)),Simplify(Plus(m,Times(CN1,pn)))),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn))))),x))),And(And(And(And(FreeQ(List(pf,a,b,c,pd,m,pn),x),IntegerQ(Times(C2,Simplify(Times(Plus(m,C1),Power(pn,CN1)))))),Less(Less(C0,Simplify(Times(Plus(m,C1),Power(pn,CN1)))),C5)),Not(RationalQ(m))),SumSimplerQ(m,Times(CN1,pn))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(pd,x)),Plus(m,C1)),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn)))),Power(Times(pd,Plus(m,C1)),CN1)),Times(CN1,b,pn,Log(pf),Power(Plus(m,C1),CN1),Int(Times(Power(Plus(c,Times(pd,x)),Plus(m,pn)),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn))))),x))),And(And(And(And(And(FreeQ(List(pf,a,b,c,pd),x),RationalQ(m)),IntegerQ(Times(C2,Plus(m,C1),Power(pn,CN1)))),Less(Less(CN4,Times(Plus(m,C1),Power(pn,CN1))),C5)),IntegerQ(pn)),Or(And(Greater(pn,C0),Less(m,CN1)),And(Less(C0,Times(CN1,pn)),LessEqual(Times(CN1,pn),Plus(m,C1))))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(pd,x)),Plus(m,C1)),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn)))),Power(Times(pd,Plus(m,C1)),CN1)),Times(CN1,b,pn,Log(pf),Power(Plus(m,C1),CN1),Int(Times(Power(Plus(c,Times(pd,x)),Simplify(Plus(m,pn))),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn))))),x))),And(And(And(And(FreeQ(List(pf,a,b,c,pd,m,pn),x),IntegerQ(Times(C2,Simplify(Times(Plus(m,C1),Power(pn,CN1)))))),Less(Less(CN4,Simplify(Times(Plus(m,C1),Power(pn,CN1)))),C5)),Not(RationalQ(m))),SumSimplerQ(m,pn)))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(k,Denominator(pn))),Times(k,Power(pd,CN1),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Times(CN1,C1))),Power(pf,Plus(a,Times(b,Power(x,Times(k,pn)))))),x),x,Power(Plus(c,Times(pd,x)),Power(k,CN1))))),And(And(And(And(FreeQ(List(pf,a,b,c,pd),x),RationalQ(m,pn)),IntegerQ(Times(C2,Plus(m,C1),Power(pn,CN1)))),Less(Less(C0,Times(Plus(m,C1),Power(pn,CN1))),C5)),Not(IntegerQ(pn))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(pe,Times(f,x)),m),Power(Power(Plus(c,Times(pd,x)),m),CN1),Int(Times(Power(Plus(c,Times(pd,x)),m),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn))))),x)),And(And(And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,m,pn),x),ZeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))),IntegerQ(Times(C2,Simplify(Times(Plus(m,C1),Power(pn,CN1)))))),NonzeroQ(Plus(f,Times(CN1,pd)))),Not(IntegerQ(m))),NonzeroQ(Times(c,pe))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(pf,a),Power(Plus(pe,Times(f,x)),Plus(m,C1)),Power(Times(f,pn,Power(Times(CN1,b,Power(Plus(c,Times(pd,x)),pn),Log(pf)),Times(Plus(m,C1),Power(pn,CN1)))),CN1),Gamma(Times(Plus(m,C1),Power(pn,CN1)),Times(CN1,b,Power(Plus(c,Times(pd,x)),pn),Log(pf)))),And(FreeQ(List(pf,a,b,c,pd,pe,f,m,pn),x),ZeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(f,Power(Plus(pe,Times(f,x)),Plus(m,Times(CN1,C1))),Power(pf,Plus(a,Times(b,Sqr(Plus(c,Times(pd,x)))))),Power(Times(C2,b,Sqr(pd),Log(pf)),CN1)),Times(Plus(Times(pd,pe),Times(CN1,c,f)),Power(pd,CN1),Int(Times(Power(Plus(pe,Times(f,x)),Plus(m,Times(CN1,C1))),Power(pf,Plus(a,Times(b,Sqr(Plus(c,Times(pd,x))))))),x)),Times(CN1,Plus(m,Times(CN1,C1)),Sqr(f),Power(Times(C2,b,Sqr(pd),Log(pf)),CN1),Int(Times(Power(Plus(pe,Times(f,x)),Plus(m,Times(CN1,C2))),Power(pf,Plus(a,Times(b,Sqr(Plus(c,Times(pd,x))))))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f),x),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))),FractionQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(f,Power(Plus(pe,Times(f,x)),Plus(m,C1)),Power(pf,Plus(a,Times(b,Sqr(Plus(c,Times(pd,x)))))),Power(Times(Plus(m,C1),Sqr(f)),CN1)),Times(C2,b,pd,Plus(Times(pd,pe),Times(CN1,c,f)),Log(pf),Power(Times(Sqr(f),Plus(m,C1)),CN1),Int(Times(Power(Plus(pe,Times(f,x)),Plus(m,C1)),Power(pf,Plus(a,Times(b,Sqr(Plus(c,Times(pd,x))))))),x)),Times(CN1,C2,b,Sqr(pd),Log(pf),Power(Times(Sqr(f),Plus(m,C1)),CN1),Int(Times(Power(Plus(pe,Times(f,x)),Plus(m,C2)),Power(pf,Plus(a,Times(b,Sqr(Plus(c,Times(pd,x))))))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f),x),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(pe,Times(f,x)),Plus(m,C1)),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn)))),Power(Times(f,Plus(m,C1)),CN1)),Times(CN1,b,pd,pn,Log(pf),Power(Times(f,Plus(m,C1)),CN1),Int(Times(Power(Plus(pe,Times(f,x)),Plus(m,C1)),Power(Plus(c,Times(pd,x)),Plus(pn,Times(CN1,C1))),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn))))),x))),And(And(And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f),x),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))),IntegerQ(pn)),Greater(pn,C2)),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),CN1)))),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Plus(Times(pd,Power(f,CN1),Int(Times(Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),CN1)))),Power(Plus(c,Times(pd,x)),CN1)),x)),Times(CN1,Plus(Times(pd,pe),Times(CN1,c,f)),Power(f,CN1),Int(Times(Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),CN1)))),Power(Times(Plus(c,Times(pd,x)),Plus(pe,Times(f,x))),CN1)),x))),And(FreeQ(List(pf,a,b,c,pd,pe,f),x),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),CN1)))),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(pe,Times(f,x)),Plus(m,C1)),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),CN1)))),Power(Times(f,Plus(m,C1)),CN1)),Times(b,pd,Log(pf),Power(Times(f,Plus(m,C1)),CN1),Int(Times(Power(Plus(pe,Times(f,x)),Plus(m,C1)),Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),CN1)))),Power(Plus(c,Times(pd,x)),CN2)),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f),x),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))),IntegerQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_)))),Power(Plus(pe_DEFAULT,Times(f_DEFAULT,x_)),CN1)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn)))),Power(Plus(pe,Times(f,x)),CN1)),x),And(FreeQ(List(pf,a,b,c,pd,pe,f,pn),x),NonzeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Power(u_,m_DEFAULT),Power(pf_,v_)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(pf,ExpandToSum(v,x))),x),And(And(And(FreeQ(List(pf,m),x),LinearQ(u,x)),BinomialQ(v,x)),Not(And(LinearMatchQ(u,x),BinomialMatchQ(v,x)))))),
ISetDelayed(Int(Times(u_,Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),pn_))))),x_Symbol),
    Condition(Int(ExpandLinearProduct(Power(pf,Plus(a,Times(b,Power(Plus(c,Times(pd,x)),pn)))),u,c,pd,x),x),And(FreeQ(List(pf,a,b,c,pd,pn),x),PolynomialQ(u,x)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,v_)))),x_Symbol),
    Condition(Int(Times(u,Power(pf,Plus(a,Times(b,NormalizePowerOfLinear(v,x))))),x),And(And(And(FreeQ(List(pf,a,b),x),PolynomialQ(u,x)),PowerOfLinearQ(v,x)),Not(PowerOfLinearMatchQ(v,x))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),CN1)))),Power(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))),CN1)),x_Symbol),
    Condition(Times(CN1,pd,Power(Times(f,Plus(Times(pd,g),Times(CN1,c,h))),CN1),Subst(Int(Times(Power(pf,Plus(a,Times(CN1,b,h,Power(Plus(Times(pd,g),Times(CN1,c,h)),CN1)),Times(pd,b,x,Power(Plus(Times(pd,g),Times(CN1,c,h)),CN1)))),Power(x,CN1)),x),x,Times(Plus(g,Times(h,x)),Power(Plus(c,Times(pd,x)),CN1)))),And(FreeQ(List(pf,a,b,c,pd,pe,f),x),ZeroQ(Plus(Times(pd,pe),Times(CN1,c,f)))))),
ISetDelayed(Int(Times(Power(pf_,Plus(pe_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),CN1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(pf,Plus(pe,Times(f,b,Power(pd,CN1)))),Int(Power(Plus(g,Times(h,x)),m),x)),And(FreeQ(List(pf,a,b,c,pd,pe,f,g,h,m),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,pd)))))),
ISetDelayed(Int(Times(Power(pf_,Plus(pe_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),CN1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(g,Times(h,x)),m),Power(pf,Plus(Times(Plus(Times(pd,pe),Times(b,f)),Power(pd,CN1)),Times(CN1,f,Plus(Times(b,c),Times(CN1,a,pd)),Power(Times(pd,Plus(c,Times(pd,x))),CN1))))),x),And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g,h,m),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),ZeroQ(Plus(Times(pd,g),Times(CN1,c,h)))))),
ISetDelayed(Int(Times(Power(pf_,Plus(pe_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),CN1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Plus(Times(pd,Power(h,CN1),Int(Times(Power(pf,Plus(pe,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(pd,x)),CN1)))),Power(Plus(c,Times(pd,x)),CN1)),x)),Times(CN1,Plus(Times(pd,g),Times(CN1,c,h)),Power(h,CN1),Int(Times(Power(pf,Plus(pe,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(pd,x)),CN1)))),Power(Times(Plus(c,Times(pd,x)),Plus(g,Times(h,x))),CN1)),x))),And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g,h),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(pd,g),Times(CN1,c,h)))))),
ISetDelayed(Int(Times(Power(pf_,Plus(pe_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),CN1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(pf,Plus(pe,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(pd,x)),CN1)))),Power(Times(h,Plus(m,C1)),CN1)),Times(CN1,f,Plus(Times(b,c),Times(CN1,a,pd)),Log(pf),Power(Times(h,Plus(m,C1)),CN1),Int(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(pf,Plus(pe,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(pd,x)),CN1)))),Power(Plus(c,Times(pd,x)),CN2)),x))),And(And(And(And(FreeQ(List(pf,a,b,c,pd,pe,f,g,h),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(pd,g),Times(CN1,c,h)))),IntegerQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(pf_,Plus(pe_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(x_,pd_DEFAULT)),CN1)))),Power(Times(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),Plus(pi_DEFAULT,Times(j_DEFAULT,x_))),CN1)),x_Symbol),
    Condition(Times(CN1,pd,Power(Times(h,Plus(Times(pd,pi),Times(CN1,c,j))),CN1),Subst(Int(Times(Power(pf,Plus(pe,Times(f,Plus(Times(b,pi),Times(CN1,a,j)),Power(Plus(Times(pd,pi),Times(CN1,c,j)),CN1)),Times(CN1,Plus(Times(b,c),Times(CN1,a,pd)),f,x,Power(Plus(Times(pd,pi),Times(CN1,c,j)),CN1)))),Power(x,CN1)),x),x,Times(Plus(pi,Times(j,x)),Power(Plus(c,Times(pd,x)),CN1)))),And(FreeQ(List(pf,a,b,c,pd,pe,f,g,h),x),ZeroQ(Plus(Times(pd,g),Times(CN1,c,h)))))),
ISetDelayed(Int(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),x_Symbol),
    Condition(Times(Power(pf,Plus(a,Times(CN1,Sqr(b),Power(Times(C4,c),CN1)))),Int(Power(pf,Times(Sqr(Plus(b,Times(C2,c,x))),Power(Times(C4,c),CN1))),x)),FreeQ(List(pf,a,b,c),x))),
ISetDelayed(Int(Power(pf_,v_),x_Symbol),
    Condition(Int(Power(pf,ExpandToSum(v,x)),x),And(And(FreeQ(pf,x),QuadraticQ(v,x)),Not(QuadraticMatchQ(v,x))))),
ISetDelayed(Int(Times(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Times(pe,Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(pf)),CN1)),And(FreeQ(List(pf,a,b,c,pd,pe),x),ZeroQ(Plus(Times(b,pe),Times(CN1,C2,c,pd)))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_)),x_Symbol),
    Condition(Plus(Times(pe,Power(Plus(pd,Times(pe,x)),Plus(m,Times(CN1,C1))),Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(pf)),CN1)),Times(CN1,Plus(m,Times(CN1,C1)),Sqr(pe),Power(Times(C2,c,Log(pf)),CN1),Int(Times(Power(Plus(pd,Times(pe,x)),Plus(m,Times(CN1,C2))),Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x))))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),ZeroQ(Plus(Times(b,pe),Times(CN1,C2,c,pd)))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),CN1)),x_Symbol),
    Condition(Times(Power(Times(C2,pe),CN1),Power(pf,Plus(a,Times(CN1,Sqr(b),Power(Times(C4,c),CN1)))),ExpIntegralEi(Times(Sqr(Plus(b,Times(C2,c,x))),Log(pf),Power(Times(C4,c),CN1)))),And(FreeQ(List(pf,a,b,c,pd,pe),x),ZeroQ(Plus(Times(b,pe),Times(CN1,C2,c,pd)))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,x)),Plus(m,C1)),Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(pe,Plus(m,C1)),CN1)),Times(CN1,C2,c,Log(pf),Power(Times(Sqr(pe),Plus(m,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,x)),Plus(m,C2)),Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x))))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),ZeroQ(Plus(Times(b,pe),Times(CN1,C2,c,pd)))),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Times(pe,Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(pf)),CN1)),Times(CN1,Plus(Times(b,pe),Times(CN1,C2,c,pd)),Power(Times(C2,c),CN1),Int(Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x)))),x))),And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(b,pe),Times(CN1,C2,c,pd)))))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_)),x_Symbol),
    Condition(Plus(Times(pe,Power(Plus(pd,Times(pe,x)),Plus(m,Times(CN1,C1))),Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(pf)),CN1)),Times(CN1,Plus(Times(b,pe),Times(CN1,C2,c,pd)),Power(Times(C2,c),CN1),Int(Times(Power(Plus(pd,Times(pe,x)),Plus(m,Times(CN1,C1))),Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x))))),x)),Times(CN1,Plus(m,Times(CN1,C1)),Sqr(pe),Power(Times(C2,c,Log(pf)),CN1),Int(Times(Power(Plus(pd,Times(pe,x)),Plus(m,Times(CN1,C2))),Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x))))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(b,pe),Times(CN1,C2,c,pd)))),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(pf_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(pd_DEFAULT,Times(x_,pe_DEFAULT)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(pd,Times(pe,x)),Plus(m,C1)),Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(pe,Plus(m,C1)),CN1)),Times(CN1,Plus(Times(b,pe),Times(CN1,C2,c,pd)),Log(pf),Power(Times(Sqr(pe),Plus(m,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,x)),Plus(m,C1)),Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x))))),x)),Times(CN1,C2,c,Log(pf),Power(Times(Sqr(pe),Plus(m,C1)),CN1),Int(Times(Power(Plus(pd,Times(pe,x)),Plus(m,C2)),Power(pf,Plus(a,Times(b,x),Times(c,Sqr(x))))),x))),And(And(And(FreeQ(List(pf,a,b,c,pd,pe),x),NonzeroQ(Plus(Times(b,pe),Times(CN1,C2,c,pd)))),RationalQ(m)),Less(m,CN1))))
  );
}
