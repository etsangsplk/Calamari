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
package org.cirdles.calamari.shrimp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author James F. Bowring &lt;bowring at gmail.com&gt;
 */
public class IsotopeRatioModelSHRIMP {

    private RawRatioNamesSHRIMP rawRatioName;
    private IsotopeNames numerator;
    private IsotopeNames denominator;
    private List<Double> ratEqTime;
    private List<Double> ratEqVal;
    private List<Double> ratEqErr;
    private double ratioVal;
    private double ratioFractErr;
    private int minIndex;

    public IsotopeRatioModelSHRIMP(RawRatioNamesSHRIMP rawRatioName, IsotopeNames numerator, IsotopeNames denominator) {
        this.rawRatioName = rawRatioName;
        this.numerator = numerator;
        this.denominator = denominator;
        this.ratEqTime = new ArrayList<>();
        this.ratEqVal = new ArrayList<>();
        this.ratEqErr = new ArrayList<>();
        this.ratioVal = 0;
        this.ratioFractErr = 0;
        this.minIndex = -2;
    }

    public boolean numeratorAtomicRatioLessThanDenominator() {
        return (numerator.getAtomicMass() < denominator.getAtomicMass());
    }

    public String prettyPrintSimpleName() {
        return Integer.toString(numerator.getAtomicMass()) + "/" + Integer.toString(denominator.getAtomicMass());
    }

    /**
     * @return the rawRatioName
     */
    public RawRatioNamesSHRIMP getRawRatioName() {
        return rawRatioName;
    }

    /**
     * @param rawRatioName the rawRatioName to set
     */
    public void setRawRatioName(RawRatioNamesSHRIMP rawRatioName) {
        this.rawRatioName = rawRatioName;
    }

    /**
     * @return the numerator
     */
    public IsotopeNames getNumerator() {
        return numerator;
    }

    /**
     * @param numerator the numerator to set
     */
    public void setNumerator(IsotopeNames numerator) {
        this.numerator = numerator;
    }

    /**
     * @return the denominator
     */
    public IsotopeNames getDenominator() {
        return denominator;
    }

    /**
     * @param denominator the denominator to set
     */
    public void setDenominator(IsotopeNames denominator) {
        this.denominator = denominator;
    }

    /**
     * @return the ratEqTime
     */
    public List<Double> getRatEqTime() {
        return ratEqTime;
    }

    /**
     * @param ratEqTime the ratEqTime to set
     */
    public void setRatEqTime(List<Double> ratEqTime) {
        this.ratEqTime = ratEqTime;
    }

    /**
     * @return the ratEqVal
     */
    public List<Double> getRatEqVal() {
        return ratEqVal;
    }

    /**
     * @param ratEqVal the ratEqVal to set
     */
    public void setRatEqVal(List<Double> ratEqVal) {
        this.ratEqVal = ratEqVal;
    }

    /**
     * @return the ratEqErr
     */
    public List<Double> getRatEqErr() {
        return ratEqErr;
    }

    /**
     * @param ratEqErr the ratEqErr to set
     */
    public void setRatEqErr(List<Double> ratEqErr) {
        this.ratEqErr = ratEqErr;
    }
    
    /**
     * @return the ratioVal
     */
    public double getRatioVal() {
        return ratioVal;
    }

    /**
     * @param ratioVal the ratioVal to set
     */
    public void setRatioVal(double ratioVal) {
        this.ratioVal = ratioVal;
    }

    /**
     * @return the ratioFractErr
     */
    public double getRatioFractErr() {
        return ratioFractErr;
    }

    /**
     * @param ratioFractErr the ratioFractErr to set
     */
    public void setRatioFractErr(double ratioFractErr) {
        this.ratioFractErr = ratioFractErr;
    }

    /**
     * @return the minIndex
     */
    public int getMinIndex() {
        return minIndex;
    }

    /**
     * @param minIndex the minIndex to set
     */
    public void setMinIndex(int minIndex) {
        this.minIndex = minIndex;
    }

}