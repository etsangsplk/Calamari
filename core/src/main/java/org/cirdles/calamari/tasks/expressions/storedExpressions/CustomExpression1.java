/*
 * Copyright 2006-2016 CIRDLES.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cirdles.calamari.tasks.expressions.storedExpressions;

import org.cirdles.calamari.shrimp.IsotopeNames;
import org.cirdles.calamari.shrimp.RawRatioNamesSHRIMP;
import org.cirdles.calamari.tasks.expressions.ExpressionTree;
import org.cirdles.calamari.tasks.expressions.ExpressionTreeInterface;

/**
 *
 * @author James F. Bowring <bowring at gmail.com>
 */
public class CustomExpression1 extends ExpressionTree {

    /**
     * Squid Excel format is ln(["254/238"]) has EqNum = 1 
     */
    public CustomExpression1() {
        super("Ln254/238", 0.0);

        ratiosOfInterest.add(RawRatioNamesSHRIMP.r254_238w);

        ExpressionTreeInterface species254 = new ShrimpSpeciesNode(IsotopeNames.UO254);
        ExpressionTreeInterface species238 = new ShrimpSpeciesNode(IsotopeNames.U238);

        ExpressionTreeInterface ratio = new ExpressionTree("254/238", 0.0, species254, species238, divide);
        
        leftET = ratio;
        rightET = null;
        operation = log;
    }

}