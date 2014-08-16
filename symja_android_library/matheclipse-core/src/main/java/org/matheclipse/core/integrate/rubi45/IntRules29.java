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
public class IntRules29 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(PolynomialQuotient(u,Plus(a,Times(b,Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1))),x),And(And(And(FreeQ(List(a,b,p),x),PolynomialQ(u,x)),PositiveIntegerQ(pn)),ZeroQ(PolynomialRemainder(u,Plus(a,Times(b,Power(x,pn))),x))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),p_)),x_Symbol),
    Condition(Plus(Times(Coefficient(u,x,Plus(pn,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Times(b,pn,Plus(p,C1)),CN1)),Int(Times(ExpandToSum(Plus(u,Times(CN1,Coefficient(u,x,Plus(pn,Times(CN1,C1))),Power(x,Plus(pn,Times(CN1,C1))))),x),Power(Plus(a,Times(b,Power(x,pn))),p)),x)),And(And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),PositiveIntegerQ(pn,p)),NonzeroQ(Coefficient(u,x,Plus(pn,Times(CN1,C1))))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(u,Power(Plus(a,Times(b,Power(x,pn))),p)),x),x),And(And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),PositiveIntegerQ(pn,p)),ZeroQ(Coefficient(u,x,Plus(pn,Times(CN1,C1))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(x_,pb_DEFAULT)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Times(Power(pb,C3),Power(b,CN1),Int(Power(Plus(Sqr(pa),Times(CN1,pa,pb,x),Times(Sqr(pb),Sqr(x))),CN1),x)),And(FreeQ(List(a,b,pa,pb),x),ZeroQ(Plus(Times(a,Power(pb,C3)),Times(CN1,b,Power(pa,C3))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(x_,pb_DEFAULT)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(a,Power(b,CN1)),C3))),Set(s,Denominator(Rt(Times(a,Power(b,CN1)),C3)))),Plus(Times(CN1,r,Plus(Times(pb,r),Times(CN1,pa,s)),Power(Times(C3,a,s),CN1),Int(Power(Plus(r,Times(s,x)),CN1),x)),Times(r,Power(Times(C3,a,s),CN1),Int(Times(Plus(Times(r,Plus(Times(pb,r),Times(C2,pa,s))),Times(s,Plus(Times(pb,r),Times(CN1,pa,s)),x)),Power(Plus(Sqr(r),Times(CN1,r,s,x),Times(Sqr(s),Sqr(x))),CN1)),x)))),And(And(FreeQ(List(a,b,pa,pb),x),NonzeroQ(Plus(Times(a,Power(pb,C3)),Times(CN1,b,Power(pa,C3))))),PosQ(Times(a,Power(b,CN1)))))),
ISetDelayed(Int(Times(Plus(pa_,Times(x_,pb_DEFAULT)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,CN1)),C3))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,CN1)),C3)))),Plus(Times(r,Plus(Times(pb,r),Times(pa,s)),Power(Times(C3,a,s),CN1),Int(Power(Plus(r,Times(CN1,s,x)),CN1),x)),Times(CN1,r,Power(Times(C3,a,s),CN1),Int(Times(Plus(Times(r,Plus(Times(pb,r),Times(CN1,C2,pa,s))),Times(CN1,s,Plus(Times(pb,r),Times(pa,s)),x)),Power(Plus(Sqr(r),Times(r,s,x),Times(Sqr(s),Sqr(x))),CN1)),x)))),And(And(FreeQ(List(a,b,pa,pb),x),NonzeroQ(Plus(Times(a,Power(pb,C3)),Times(CN1,b,Power(pa,C3))))),NegQ(Times(a,Power(b,CN1)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT),Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Plus(Times(pc,Power(q,C3),Power(a,CN1),Int(Power(Plus(q,x),CN1),x)),Times(Sqr(q),Plus(pa,Times(CN1,pc,Sqr(q))),Power(a,CN1),Int(Power(Plus(Sqr(q),Times(CN1,q,x),Sqr(x)),CN1),x))),And(ZeroQ(Plus(pa,Times(CN1,pb,q),Times(CN1,C2,pc,Sqr(q)))),NonzeroQ(Plus(pa,Times(CN1,pc,Sqr(q))))))),And(FreeQ(List(a,b,pa,pb,pc),x),PosQ(Times(a,Power(b,CN1)))))),
ISetDelayed(Int(Times(x_,Plus(pb_,Times(x_,pc_DEFAULT)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Plus(Times(pc,Power(q,C3),Power(a,CN1),Int(Power(Plus(q,x),CN1),x)),Times(CN1,pc,Power(q,C4),Power(a,CN1),Int(Power(Plus(Sqr(q),Times(CN1,q,x),Sqr(x)),CN1),x))),ZeroQ(Plus(pb,Times(C2,pc,q))))),And(FreeQ(List(a,b,pb,pc),x),PosQ(Times(a,Power(b,CN1)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Plus(Times(pc,Power(q,C3),Power(a,CN1),Int(Power(Plus(q,x),CN1),x)),Times(pc,Power(q,C4),Power(a,CN1),Int(Power(Plus(Sqr(q),Times(CN1,q,x),Sqr(x)),CN1),x))),ZeroQ(Plus(pa,Times(CN1,C2,pc,Sqr(q)))))),And(FreeQ(List(a,b,pa,pc),x),PosQ(Times(a,Power(b,CN1)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT),Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Plus(Times(pc,Power(q,C3),Power(a,CN1),Int(Power(Plus(q,Times(CN1,x)),CN1),x)),Times(Sqr(q),Plus(pa,Times(CN1,pc,Sqr(q))),Power(a,CN1),Int(Power(Plus(Sqr(q),Times(q,x),Sqr(x)),CN1),x))),And(ZeroQ(Plus(pa,Times(pb,q),Times(CN1,C2,pc,Sqr(q)))),NonzeroQ(Plus(pa,Times(CN1,pc,Sqr(q))))))),And(FreeQ(List(a,b,pa,pb,pc),x),NegQ(Times(a,Power(b,CN1)))))),
ISetDelayed(Int(Times(x_,Plus(pb_,Times(x_,pc_DEFAULT)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Plus(Times(pc,Power(q,C3),Power(a,CN1),Int(Power(Plus(q,Times(CN1,x)),CN1),x)),Times(CN1,pc,Power(q,C4),Power(a,CN1),Int(Power(Plus(Sqr(q),Times(q,x),Sqr(x)),CN1),x))),ZeroQ(Plus(pb,Times(CN1,C2,pc,q))))),And(FreeQ(List(a,b,pb,pc),x),NegQ(Times(a,Power(b,CN1)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Plus(Times(pc,Power(q,C3),Power(a,CN1),Int(Power(Plus(q,Times(CN1,x)),CN1),x)),Times(pc,Power(q,C4),Power(a,CN1),Int(Power(Plus(Sqr(q),Times(q,x),Sqr(x)),CN1),x))),ZeroQ(Plus(pa,Times(CN1,C2,pc,Sqr(q)))))),And(FreeQ(List(a,b,pa,pc),x),NegQ(Times(a,Power(b,CN1)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT),Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Plus(Int(Times(Plus(pa,Times(pb,x)),Power(Plus(a,Times(b,Power(x,C3))),CN1)),x),Times(pc,Int(Times(Sqr(x),Power(Plus(a,Times(b,Power(x,C3))),CN1)),x))),And(FreeQ(List(a,b,pa,pb,pc),x),Or(ZeroQ(Plus(Times(a,Power(pb,C3)),Times(CN1,b,Power(pa,C3)))),Not(RationalQ(Times(a,Power(b,CN1)))))))),
ISetDelayed(Int(Times(x_,Plus(pb_,Times(x_,pc_DEFAULT)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Plus(Times(pb,Int(Times(x,Power(Plus(a,Times(b,Power(x,C3))),CN1)),x)),Times(pc,Int(Times(Sqr(x),Power(Plus(a,Times(b,Power(x,C3))),CN1)),x))),And(FreeQ(List(a,b,pb,pc),x),Not(RationalQ(Times(a,Power(b,CN1))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Plus(Times(pa,Int(Power(Plus(a,Times(b,Power(x,C3))),CN1),x)),Times(pc,Int(Times(Sqr(x),Power(Plus(a,Times(b,Power(x,C3))),CN1)),x))),And(FreeQ(List(a,b,pa,pc),x),Not(RationalQ(a,b,pa,pc))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT),Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Times(Sqr(q),Power(a,CN1),Int(Times(Plus(pa,Times(pc,q,x)),Power(Plus(Sqr(q),Times(CN1,q,x),Sqr(x)),CN1)),x)),ZeroQ(Plus(pa,Times(CN1,pb,q),Times(pc,Sqr(q)))))),And(And(And(FreeQ(List(a,b,pa,pb,pc),x),NonzeroQ(Plus(Times(a,Power(pb,C3)),Times(CN1,b,Power(pa,C3))))),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(Plus(Times(x_,pb_),Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Times(pb,Sqr(q),Power(a,CN1),Int(Times(x,Power(Plus(Sqr(q),Times(CN1,q,x),Sqr(x)),CN1)),x)),ZeroQ(Plus(Times(CN1,pb),Times(pc,q))))),And(And(FreeQ(List(a,b,pb,pc),x),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Times(Sqr(q),Power(a,CN1),Int(Times(Plus(pa,Times(pc,q,x)),Power(Plus(Sqr(q),Times(CN1,q,x),Sqr(x)),CN1)),x)),ZeroQ(Plus(pa,Times(pc,Sqr(q)))))),And(And(FreeQ(List(a,b,pa,pc),x),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT),Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Plus(Times(q,Plus(pa,Times(CN1,pb,q),Times(pc,Sqr(q))),Power(Times(C3,a),CN1),Int(Power(Plus(q,x),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(q,Plus(Times(C2,pa),Times(pb,q),Times(CN1,pc,Sqr(q)))),Times(CN1,Plus(pa,Times(CN1,pb,q),Times(CN1,C2,pc,Sqr(q))),x)),Power(Plus(Sqr(q),Times(CN1,q,x),Sqr(x)),CN1)),x))),NonzeroQ(Plus(pa,Times(CN1,pb,q),Times(pc,Sqr(q)))))),And(And(And(FreeQ(List(a,b,pa,pb,pc),x),NonzeroQ(Plus(Times(a,Power(pb,C3)),Times(CN1,b,Power(pa,C3))))),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(x_,Plus(pb_,Times(x_,pc_DEFAULT)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Plus(Times(CN1,q,Plus(Times(pb,q),Times(CN1,pc,Sqr(q))),Power(Times(C3,a),CN1),Int(Power(Plus(q,x),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(q,Plus(Times(pb,q),Times(CN1,pc,Sqr(q)))),Times(Plus(Times(pb,q),Times(C2,pc,Sqr(q))),x)),Power(Plus(Sqr(q),Times(CN1,q,x),Sqr(x)),CN1)),x))),NonzeroQ(Plus(Times(pb,q),Times(CN1,pc,Sqr(q)))))),And(And(FreeQ(List(a,b,pb,pc),x),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Plus(Times(q,Plus(pa,Times(pc,Sqr(q))),Power(Times(C3,a),CN1),Int(Power(Plus(q,x),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(q,Plus(Times(C2,pa),Times(CN1,pc,Sqr(q)))),Times(CN1,Plus(pa,Times(CN1,C2,pc,Sqr(q))),x)),Power(Plus(Sqr(q),Times(CN1,q,x),Sqr(x)),CN1)),x))),NonzeroQ(Plus(pa,Times(pc,Sqr(q)))))),And(And(FreeQ(List(a,b,pa,pc),x),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT),Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Times(q,Power(a,CN1),Int(Times(Plus(Times(pa,q),Times(Plus(pa,Times(pb,q)),x)),Power(Plus(Sqr(q),Times(q,x),Sqr(x)),CN1)),x)),ZeroQ(Plus(pa,Times(pb,q),Times(pc,Sqr(q)))))),And(And(And(FreeQ(List(a,b,pa,pb,pc),x),NonzeroQ(Plus(Times(a,Power(pb,C3)),Times(CN1,b,Power(pa,C3))))),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(x_,Plus(pb_,Times(x_,pc_DEFAULT)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Times(pb,Sqr(q),Power(a,CN1),Int(Times(x,Power(Plus(Sqr(q),Times(q,x),Sqr(x)),CN1)),x)),ZeroQ(Plus(Times(pb,q),Times(pc,Sqr(q)))))),And(And(FreeQ(List(a,b,pb,pc),x),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Times(pa,q,Power(a,CN1),Int(Times(Plus(q,x),Power(Plus(Sqr(q),Times(q,x),Sqr(x)),CN1)),x)),ZeroQ(Plus(pa,Times(pc,Sqr(q)))))),And(And(FreeQ(List(a,b,pa,pc),x),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(x_,pb_DEFAULT),Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Plus(Times(q,Plus(pa,Times(pb,q),Times(pc,Sqr(q))),Power(Times(C3,a),CN1),Int(Power(Plus(q,Times(CN1,x)),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(q,Plus(Times(C2,pa),Times(CN1,pb,q),Times(CN1,pc,Sqr(q)))),Times(Plus(pa,Times(pb,q),Times(CN1,C2,pc,Sqr(q))),x)),Power(Plus(Sqr(q),Times(q,x),Sqr(x)),CN1)),x))),NonzeroQ(Plus(pa,Times(pb,q),Times(pc,Sqr(q)))))),And(And(And(FreeQ(List(a,b,pa,pb,pc),x),NonzeroQ(Plus(Times(a,Power(pb,C3)),Times(CN1,b,Power(pa,C3))))),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(x_,Plus(pb_,Times(x_,pc_DEFAULT)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Plus(Times(q,Plus(Times(pb,q),Times(pc,Sqr(q))),Power(Times(C3,a),CN1),Int(Power(Plus(q,Times(CN1,x)),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(CN1,q,Plus(Times(pb,q),Times(pc,Sqr(q)))),Times(Plus(Times(pb,q),Times(CN1,C2,pc,Sqr(q))),x)),Power(Plus(Sqr(q),Times(q,x),Sqr(x)),CN1)),x))),NonzeroQ(Plus(Times(pb,q),Times(pc,Sqr(q)))))),And(And(FreeQ(List(a,b,pb,pc),x),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pc_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Plus(Times(q,Plus(pa,Times(pc,Sqr(q))),Power(Times(C3,a),CN1),Int(Power(Plus(q,Times(CN1,x)),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(q,Plus(Times(C2,pa),Times(CN1,pc,Sqr(q)))),Times(Plus(pa,Times(CN1,C2,pc,Sqr(q))),x)),Power(Plus(Sqr(q),Times(q,x),Sqr(x)),CN1)),x))),NonzeroQ(Plus(pa,Times(pc,Sqr(q)))))),And(And(FreeQ(List(a,b,pa,pc),x),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,Power(x_,m_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pa,Int(Power(Plus(a,Times(b,Power(x,pn))),p),x)),Times(pb,Int(Times(Power(x,Plus(pn,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,pn))),p)),x))),And(FreeQ(List(a,b,pa,pb,m,pn,p),x),ZeroQ(Plus(m,Times(CN1,pn),C1))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),p_)),x_Symbol),
    Condition(Plus(Times(Coefficient(u,x,Plus(pn,Times(CN1,C1))),Int(Times(Power(x,Plus(pn,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,pn))),p)),x)),Int(Times(ExpandToSum(Plus(u,Times(CN1,Coefficient(u,x,Plus(pn,Times(CN1,C1))),Power(x,Plus(pn,Times(CN1,C1))))),x),Power(Plus(a,Times(b,Power(x,pn))),p)),x)),And(And(And(FreeQ(List(a,b,p),x),PolynomialQ(u,x)),PositiveIntegerQ(pn)),Equal(Exponent(u,x),Plus(pn,Times(CN1,C1)))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),p_)),x_Symbol),
    Condition(Plus(Times(x,Sum(Times(Coefficient(u,x,k),Power(x,k),Power(Plus(Times(pn,p),k,C1),CN1)),List(k,C0,Plus(pn,Times(CN1,C2)))),Power(Plus(a,Times(b,Power(x,pn))),p)),Times(a,pn,p,Int(Times(Sum(Times(Coefficient(u,x,k),Power(x,k),Power(Plus(Times(pn,p),k,C1),CN1)),List(k,C0,Plus(pn,Times(CN1,C2)))),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),PositiveIntegerQ(pn)),Less(Less(C0,Exponent(u,x)),Plus(pn,Times(CN1,C1)))),RationalQ(p)),Greater(p,C0)))),
ISetDelayed(Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),CN1)),x_Symbol),
    Condition(Module(List(Set(v,Sum(Times(Power(x,pi),Plus(Coefficient(u,x,pi),Times(Coefficient(u,x,Plus(Times(C1D2,pn),pi)),Power(x,Times(C1D2,pn)))),Power(Plus(a,Times(b,Power(x,pn))),CN1)),List(pi,C0,Plus(Times(C1D2,pn),Times(CN1,C1)))))),Condition(Int(v,x),SumQ(v))),And(And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),PositiveIntegerQ(Times(C1D2,pn))),Less(Exponent(u,x),Plus(pn,Times(CN1,C1)))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(u,Power(Plus(a,Times(b,Power(x,pn))),CN1)),x),x),And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,x,u,Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Times(a,pn,Plus(p,C1)),CN1)),Times(Power(Times(a,pn,Plus(p,C1)),CN1),Int(Times(Sum(Times(Plus(Times(pn,Plus(p,C1)),k,C1),Coefficient(u,x,k),Power(x,k)),List(k,C0,Plus(pn,Times(CN1,C2)))),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1))),x))),And(And(And(And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),PositiveIntegerQ(pn)),Less(Less(C0,Exponent(u,x)),Plus(pn,Times(CN1,C1)))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(u_,Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),p_)),x_Symbol),
    Condition(Plus(Times(u,Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1)),Power(Times(b,pn,Plus(p,C1)),CN1)),Times(CN1,Power(Times(b,pn,Plus(p,C1)),CN1),Int(Times(Sum(Times(k,Coefficient(u,x,k),Power(x,Plus(k,Times(CN1,C1)))),List(k,C1,Exponent(u,x))),Power(Plus(a,Times(b,Power(x,pn))),Plus(p,C1))),x))),And(And(And(And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),ZeroQ(Plus(m,Times(CN1,Plus(pn,Times(CN1,C1)))))),PositiveIntegerQ(pn)),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(u_,Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),p_)),x_Symbol),
    Condition(Module(List(Set(v,Sum(Times(Power(x,Plus(m,pi)),Plus(Coefficient(u,x,pi),Times(Coefficient(u,x,Plus(Times(C1D2,pn),pi)),Power(x,Times(C1D2,pn)))),Power(Plus(a,Times(b,Power(x,pn))),p)),List(pi,C0,Plus(Times(C1D2,pn),Times(CN1,C1)))))),Condition(Int(v,x),SumQ(v))),And(And(And(And(FreeQ(List(a,b,m),x),PolynomialQ(u,x)),EvenQ(pn)),NegativeIntegerQ(p)),Less(Less(C0,Exponent(u,x)),pn)))),
ISetDelayed(Int(Times(u_,Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),u,Power(Plus(a,Times(b,Power(x,pn))),p)),x),x),And(And(And(FreeQ(List(a,b,m),x),PolynomialQ(u,x)),PositiveIntegerQ(pn)),IntegersQ(m,p)))),
ISetDelayed(Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_,Times(x_,pd_DEFAULT)),pn_))),p_)),x_Symbol),
    Condition(Module(List(Set(k,Denominator(pn))),Times(k,Power(pd,CN1),Subst(Int(SimplifyIntegrand(Times(Power(x,Plus(k,Times(CN1,C1))),Power(ReplaceAll(u,Rule(x,Plus(Times(Power(x,k),Power(pd,CN1)),Times(CN1,c,Power(pd,CN1))))),m),Power(Plus(a,Times(b,Power(x,Times(k,pn)))),p)),x),x),x,Power(Plus(c,Times(pd,x)),Power(k,CN1))))),And(And(And(FreeQ(List(a,b,c,pd,p),x),PolynomialQ(u,x)),IntegerQ(m)),RationalQ(pn))))
  );
}
