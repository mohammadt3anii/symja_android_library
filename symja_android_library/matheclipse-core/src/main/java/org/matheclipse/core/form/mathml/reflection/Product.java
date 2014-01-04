package org.matheclipse.core.form.mathml.reflection;

import org.matheclipse.core.convert.AST2Expr;
import org.matheclipse.core.form.mathml.AbstractConverter;
import org.matheclipse.core.interfaces.IAST;

public class Product extends AbstractConverter {

	public Product() {

	}

	/**
	 * Converts a given function into the corresponding MathML output
	 * 
	 * @param buf
	 *            StringBuffer for MathML output
	 * @param f
	 *            The math function which should be converted to MathML
	 */
	public boolean convert(final StringBuffer buf, final IAST f, final int precedence) {
		if (f.size() >= 3) {
			for (int i = 2; i < f.size(); i++) {
				fFactory.tagStart(buf, "mrow");
				if ((f.get(i) instanceof IAST) && f.get(i).isList()) {
					final IAST list = (IAST) f.get(i);
					fFactory.tagStart(buf, "munderover");
					// &Product; &#x220F;
					fFactory.tag(buf, "mo", "&#x220F;");

					fFactory.tagStart(buf, "mrow");
					if (list.size() > 1) {
						fFactory.convert(buf, list.get(1), 0);
					}
					if (list.size() > 2) {
						fFactory.tag(buf, "mo", "=");
						fFactory.convert(buf, list.get(2), 0);
						fFactory.tagEnd(buf, "mrow");
					}
					if (list.size() > 3) {
						fFactory.convert(buf, list.get(3), 0);
					}
					fFactory.tagEnd(buf, "munderover");
				} else {
					return false;
				}
			}
			fFactory.convert(buf, f.get(1), 0);
			for (int i = 2; i < f.size(); i++) {
				fFactory.tagEnd(buf, "mrow");
			}
			return true;
		}
		return false;
	}

}