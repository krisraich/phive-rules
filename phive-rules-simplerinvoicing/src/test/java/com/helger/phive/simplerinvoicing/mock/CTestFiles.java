/*
 * Copyright (C) 2014-2024 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.phive.simplerinvoicing.mock;

import static org.junit.Assert.assertTrue;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.impl.CommonsArrayList;
import com.helger.commons.collection.impl.CommonsHashSet;
import com.helger.commons.collection.impl.ICommonsList;
import com.helger.commons.io.resource.ClassPathResource;
import com.helger.commons.io.resource.IReadableResource;
import com.helger.diver.api.coord.DVRCoordinate;
import com.helger.phive.api.executorset.ValidationExecutorSetRegistry;
import com.helger.phive.api.mock.PhiveTestFile;
import com.helger.phive.simplerinvoicing.SimplerInvoicingValidation;
import com.helger.phive.xml.source.IValidationSourceXML;

@Immutable
@SuppressWarnings ("deprecation")
public final class CTestFiles
{
  public static final ValidationExecutorSetRegistry <IValidationSourceXML> VES_REGISTRY = new ValidationExecutorSetRegistry <> ();
  static
  {
    SimplerInvoicingValidation.initSimplerInvoicing (VES_REGISTRY);
  }

  private CTestFiles ()
  {}

  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsList <PhiveTestFile> getAllTestFiles ()
  {
    final ICommonsList <PhiveTestFile> ret = new CommonsArrayList <> ();
    for (final DVRCoordinate aVESID : new DVRCoordinate [] { SimplerInvoicingValidation.VID_SI_INVOICE_V10,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V11,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V12,
                                                             SimplerInvoicingValidation.VID_SI_ORDER_V12,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V123,
                                                             SimplerInvoicingValidation.VID_SI_ORDER_V123,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V124,
                                                             SimplerInvoicingValidation.VID_SI_ORDER_V124,

                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V20,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V20,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V201,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V201,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V202,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V202,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V203,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V203,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V2031,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2031,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V2032,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2032,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V2033,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2033,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V2034,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2034,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V2035,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2035,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V2036,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2036,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V2037,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2037,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V2038,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2038,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_V2039,
                                                             SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2039,

                                                             SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V10,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V101,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V102,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V103,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V104,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V105,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V106,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V107,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V108,
                                                             SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V109,

                                                             SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V103,
                                                             SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1031,
                                                             SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1032,
                                                             SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1033,
                                                             SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1034,
                                                             SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1035,
                                                             SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1036,
                                                             SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1037,
                                                             SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1038 })
    {
      for (final IReadableResource aRes : getAllMatchingGoodTestFiles (aVESID))
      {
        assertTrue ("Not existing test file: " + aRes.getPath (), aRes.exists ());
        ret.add (PhiveTestFile.createGoodCase (aRes, aVESID));
      }
      for (final IReadableResource aRes : getAllMatchingErrorTestFiles (aVESID))
      {
        assertTrue ("Not existing test file: " + aRes.getPath (), aRes.exists ());
        // We don't check the exact errors
        ret.add (new PhiveTestFile (aRes, aVESID, new CommonsHashSet <> ("bla")));
      }
    }

    return ret;
  }

  private static final String PREFIX = "/external/test-files/simplerinvoicing/";
  private static final String NLCIUS_CII_103 = PREFIX + "NLCIUS-CII-1.0.3/";
  private static final String PATH_10 = PREFIX + "SI-UBL-1.0/";
  private static final String PATH_11 = PREFIX + "SI-UBL-1.1/";
  private static final String PATH_12 = PREFIX + "SI-UBL-1.2/";
  private static final String PATH_200 = PREFIX + "SI-UBL-2.0/";
  private static final String PATH_202 = PREFIX + "SI-UBL-2.0.2/";
  private static final String PATH_203 = PREFIX + "SI-UBL-2.0.3/";
  private static final String PATH_2032 = PREFIX + "SI-UBL-2.0.3.2/";
  private static final String PATH_GACCOUNT_10 = PREFIX + "si-ubl-2.0-ext-gaccount-1.0/";

  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsList <? extends IReadableResource> getAllMatchingGoodTestFiles (@Nonnull final DVRCoordinate aVESID)
  {
    ValueEnforcer.notNull (aVESID, "VESID");

    final ICommonsList <IReadableResource> ret = new CommonsArrayList <> ();
    if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V10))
    {
      for (final String s : new String [] { "SI-UBL-1.0-ok-minimal.xml",
                                            "SI-UBL-1.0-ok-reference.xml",
                                            "SI-UBL-1.0-ok.xml" })
        ret.add (new ClassPathResource (PATH_10 + s));
    }
    else
      if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V11))
      {
        for (final String s : new String [] { "SI-UBL-1.1-ok-BII2-T10-R034.xml",
                                              "SI-UBL-1.1-ok-BII2-T10-R035.xml",
                                              "SI-UBL-1.1-ok-BII2-T10-R037.xml",
                                              "SI-UBL-1.1-ok-BII2-T10-R045.xml",
                                              "SI-UBL-1.1-ok-BII2-T10-R046.xml",
                                              "SI-UBL-1.1-ok-EUGEN-T10-R026.xml",
                                              "SI-UBL-1.1-ok-EUGEN-T10-R030.xml",
                                              "SI-UBL-1.1-ok-EUGEN-T10-R035.xml",
                                              "SI-UBL-1.1-ok-EUGEN-T10-R036.xml",
                                              "SI-UBL-1.1-ok-EUGEN-T10-R037.xml",
                                              "SI-UBL-1.1-ok-EUGEN-T10-R038.xml",
                                              "SI-UBL-1.1-ok-extension.xml",
                                              "SI-UBL-1.1-ok-full-multiple-currencies.xml",
                                              "SI-UBL-1.1-ok-full-single-currency.xml",
                                              "SI-UBL-1.1-ok-full-tax-currency.xml",
                                              "SI-UBL-1.1-ok-full-tax-subcategory.xml",
                                              "SI-UBL-1.1-ok-full.xml",
                                              "SI-UBL-1.1-ok-minimal-corrective.xml",
                                              "SI-UBL-1.1-ok-minimal.xml",
                                              "SI-UBL-1.1-ok-reference.xml",
                                              "SI-UBL-1.1-ok-rounding-vat-1.xml",
                                              "SI-UBL-1.1-ok-single-item.xml",
                                              "SI-UBL-1.1-ok-taxes-ae.xml",
                                              "SI-UBL-1.1-ok-taxes.xml" })
          ret.add (new ClassPathResource (PATH_11 + s));
      }
      else
        if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V12) ||
            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V123) ||
            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V124))
        {
          for (final String s : new String [] { "SI-UBL-INV-1.2-ok-BII2-T10-R034.xml",
                                                "SI-UBL-INV-1.2-ok-BII2-T10-R035.xml",
                                                "SI-UBL-INV-1.2-ok-BII2-T10-R037.xml",
                                                "SI-UBL-INV-1.2-ok-BII2-T10-R045.xml",
                                                "SI-UBL-INV-1.2-ok-BII2-T10-R046.xml",
                                                "SI-UBL-INV-1.2-ok-EUGEN-T10-R026.xml",
                                                "SI-UBL-INV-1.2-ok-EUGEN-T10-R030.xml",
                                                "SI-UBL-INV-1.2-ok-EUGEN-T10-R035.xml",
                                                "SI-UBL-INV-1.2-ok-EUGEN-T10-R036.xml",
                                                "SI-UBL-INV-1.2-ok-EUGEN-T10-R037.xml",
                                                "SI-UBL-INV-1.2-ok-EUGEN-T10-R038.xml",
                                                "SI-UBL-INV-1.2-ok-extension.xml",
                                                "SI-UBL-INV-1.2-ok-full-multiple-currencies.xml",
                                                "SI-UBL-INV-1.2-ok-full-single-currency.xml",
                                                "SI-UBL-INV-1.2-ok-full-tax-currency.xml",
                                                "SI-UBL-INV-1.2-ok-full-tax-subcategory.xml",
                                                "SI-UBL-INV-1.2-ok-full.xml",
                                                "SI-UBL-INV-1.2-ok-minimal-corrective.xml",
                                                "SI-UBL-INV-1.2-ok-minimal.xml",
                                                "SI-UBL-INV-1.2-ok-reference.xml",
                                                "SI-UBL-INV-1.2-ok-rounding-vat-1.xml",
                                                "SI-UBL-INV-1.2-ok-si-extension-1.xml",
                                                "SI-UBL-INV-1.2-ok-si-extension-2.xml",
                                                "SI-UBL-INV-1.2-ok-si-extension-3.xml",
                                                "SI-UBL-INV-1.2-ok-si-extension.xml",
                                                "SI-UBL-INV-1.2-ok-single-item.xml",
                                                "SI-UBL-INV-1.2-ok-taxes-ae.xml" })
            ret.add (new ClassPathResource (PATH_12 + s));
        }
        else
          if (aVESID.equals (SimplerInvoicingValidation.VID_SI_ORDER_V12) ||
              aVESID.equals (SimplerInvoicingValidation.VID_SI_ORDER_V123) ||
              aVESID.equals (SimplerInvoicingValidation.VID_SI_ORDER_V124))
          {
            for (final String s : new String [] { "SI-UBL-PO-1.2-ok-minimal.xml" })
              ret.add (new ClassPathResource (PATH_12 + s));
          }
          else
            if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V20))
            {
              final String sPath = PATH_200;
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-10_ok_both_nl.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-10_ok_customer_not_nl.xml"));
              if (false)
                ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-10_ok_customer_no_companyid.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-10_ok_supplier_not_nl.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-11_ok_negative_payment.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-11_ok_no_payment.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-12_ok.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-1_ok_supplier_not_nl.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-1_ok_supplier_oin.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-2_ok_supplier_not_nl.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-31_ok_notsepa.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-3_ok_not_nl.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-4_ok_customer_not_nl.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-4_ok_supplier_not_nl.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-5_ok.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-5_ok_supplier_not_nl.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-5_ok_taxpart_not_nl.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-7_ok_384.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-7_ok_389.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-9_ok.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_additionaldocumentreference.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_allowance.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_allowance_line.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_base.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_charge.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_charge_line.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_full.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_quantities_linevalues_wrong.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_quantities.xml"));
              ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_unitcode.xml"));
            }
            else
              if (aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V20))
              {
                final String sPath = PATH_200;
                ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-8_ok_381.xml"));
              }
              else
                if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V201) ||
                    aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V202))
                {
                  final String sPath = PATH_202;
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-10_ok_both_nl.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-10_ok_customer_not_nl.xml"));
                  if (false)
                    ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-10_ok_customer_no_companyid.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-10_ok_supplier_not_nl.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-11_ok_negative_payment.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-11_ok_no_payment.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-12_ok.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-1_ok_supplier_not_nl.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-1_ok_supplier_oin.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-2_ok_supplier_not_nl.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-31_ok_notsepa.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-3_ok_not_nl.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-4_ok_customer_not_nl.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-4_ok_supplier_not_nl.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-5_ok.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-5_ok_supplier_not_nl.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-5_ok_taxpart_not_nl.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-7_ok_384.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-7_ok_389.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-9_ok.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_additionaldocumentreference.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_allowance.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_allowance_line.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_base.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_charge.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_charge_line.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_full.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_quantities_linevalues_wrong.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_quantities.xml"));
                  ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_ok_unitcode.xml"));
                }
                else
                  if (aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V201) ||
                      aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V202))
                  {
                    final String sPath = PATH_202;
                    ret.add (new ClassPathResource (sPath + "SI-UBL-2.0_BR-NL-8_ok_381.xml"));
                  }
                  else
                    if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V203) ||
                        aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2031))
                    {
                      for (final String s : new String [] { "SI-UBL-2.0_BR-NL-10_ok_both_nl.xml",
                                                            "SI-UBL-2.0_BR-NL-10_ok_customer_not_nl.xml",
                                                            "SI-UBL-2.0_BR-NL-10_ok_customer_not_nl_no_companyid.xml",
                                                            "SI-UBL-2.0_BR-NL-10_ok_supplier_not_nl.xml",
                                                            "SI-UBL-2.0_BR-NL-11_ok_negative_payment.xml",
                                                            "SI-UBL-2.0_BR-NL-11_ok_no_payment.xml",
                                                            "SI-UBL-2.0_BR-NL-12_ok.xml",
                                                            "SI-UBL-2.0_BR-NL-13_ok.xml",
                                                            "SI-UBL-2.0_BR-NL-19_warning_tax_currency.xml",
                                                            "SI-UBL-2.0_BR-NL-1_ok_supplier_not_nl.xml",
                                                            "SI-UBL-2.0_BR-NL-1_ok_supplier_oin.xml",
                                                            "SI-UBL-2.0_BR-NL-20_warning_taxpointdate.xml",
                                                            "SI-UBL-2.0_BR-NL-21_warning_descriptioncode.xml",
                                                            "SI-UBL-2.0_BR-NL-24_warning_ref_issuedate.xml",
                                                            "SI-UBL-2.0_BR-NL-25_warning_companyid_novat.xml",
                                                            "SI-UBL-2.0_BR-NL-26_warning_legalform.xml",
                                                            "SI-UBL-2.0_BR-NL-27_warning_addressline_customer.xml",
                                                            "SI-UBL-2.0_BR-NL-27_warning_addressline_delivery.xml",
                                                            "SI-UBL-2.0_BR-NL-27_warning_addressline_representative.xml",
                                                            "SI-UBL-2.0_BR-NL-27_warning_addressline_seller.xml",
                                                            "SI-UBL-2.0_BR-NL-28_warning_countrysub_customer.xml",
                                                            "SI-UBL-2.0_BR-NL-28_warning_countrysub_delivery.xml",
                                                            "SI-UBL-2.0_BR-NL-28_warning_countrysub_representative.xml",
                                                            "SI-UBL-2.0_BR-NL-28_warning_countrysub_seller.xml",
                                                            "SI-UBL-2.0_BR-NL-29_warning_paymentmeansname.xml",
                                                            "SI-UBL-2.0_BR-NL-2_ok_supplier_not_nl.xml",
                                                            "SI-UBL-2.0_BR-NL-30_warning_financialaccount.xml",
                                                            "SI-UBL-2.0_BR-NL-31_ok_notsepa.xml",
                                                            "SI-UBL-2.0_BR-NL-31_warning_branchid.xml",
                                                            "SI-UBL-2.0_BR-NL-32_warning_linereasoncode.xml",
                                                            "SI-UBL-2.0_BR-NL-32_warning_reasoncode.xml",
                                                            "SI-UBL-2.0_BR-NL-33_warning_taxcurrency.xml",
                                                            "SI-UBL-2.0_BR-NL-34_warning_reasoncode.xml",
                                                            "SI-UBL-2.0_BR-NL-34_warning_reasoncode_line.xml",
                                                            "SI-UBL-2.0_BR-NL-35_warning_taxexemptionreason.xml",
                                                            "SI-UBL-2.0_BR-NL-3_ok_not_nl.xml",
                                                            "SI-UBL-2.0_BR-NL-4_ok_customer_not_nl.xml",
                                                            "SI-UBL-2.0_BR-NL-4_ok_supplier_not_nl.xml",
                                                            "SI-UBL-2.0_BR-NL-5_ok.xml",
                                                            "SI-UBL-2.0_BR-NL-5_ok_supplier_not_nl.xml",
                                                            "SI-UBL-2.0_BR-NL-5_ok_taxpart_not_nl.xml",
                                                            "SI-UBL-2.0_BR-NL-7_ok_384.xml",
                                                            "SI-UBL-2.0_BR-NL-7_ok_389.xml",
                                                            "SI-UBL-2.0_BR-NL-9_ok.xml",
                                                            "SI-UBL-2.0_ok_additionaldocumentreference.xml",
                                                            "SI-UBL-2.0_ok_allowance.xml",
                                                            "SI-UBL-2.0_ok_allowance_line.xml",
                                                            "SI-UBL-2.0_ok_base.xml",
                                                            "SI-UBL-2.0_ok_charge.xml",
                                                            "SI-UBL-2.0_ok_charge_line.xml",
                                                            "SI-UBL-2.0_ok_full.xml",
                                                            "SI-UBL-2.0_ok_full_negative_zero.xml",
                                                            "SI-UBL-2.0_ok_minimal.xml",
                                                            "SI-UBL-2.0_ok_negative.xml",
                                                            "SI-UBL-2.0_ok_quantities.xml",
                                                            "SI-UBL-2.0_ok_quantities_linevalues_wrong.xml",
                                                            "SI-UBL-2.0_ok_tax_category_O.xml",
                                                            "SI-UBL-2.0_ok_unitcode.xml",
                                                            "SI-UBL-2.0_UBL-CR-561_warning.xml",
                                                            "SI-UBL-2.0_UBL-SR-09_warning_multiple_legalentity_registrationname.xml",
                                                            "SI-UBL-2.0_UBL-SR-11_warning_multiple_legalentity_companyid.xml",
                                                            "SI-UBL-2.0_UBL-SR-15_warning_multiple_legalentity_registrationname.xml",
                                                            "SI-UBL-2.0_UBL-SR-17_warning_multiple_legalentity_companyid.xml",
                                                            "SI-UBL-2.0_warning_empty_elements.xml" })
                        ret.add (new ClassPathResource (PATH_203 + s));
                    }
                    else
                      if (aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V203) ||
                          aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2031))
                      {
                        for (final String s : new String [] { "SI-UBL-2.0_BR-NL-8_ok_381.xml" })
                          ret.add (new ClassPathResource (PATH_203 + s));
                      }
                      else
                        if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2032) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2033) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2034) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2035) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2036) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2037) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2038) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2039))
                        {
                          for (final String s : new String [] { "SI-UBL-2.0_BR-NL-10_ok_both_nl.xml",
                                                                "SI-UBL-2.0_BR-NL-10_ok_customer_not_nl.xml",
                                                                "SI-UBL-2.0_BR-NL-10_ok_customer_not_nl_no_companyid.xml",
                                                                "SI-UBL-2.0_BR-NL-10_ok_supplier_not_nl.xml",
                                                                "SI-UBL-2.0_BR-NL-11_ok_negative_payment.xml",
                                                                "SI-UBL-2.0_BR-NL-11_ok_no_payment.xml",
                                                                "SI-UBL-2.0_BR-NL-12_ok.xml",
                                                                "SI-UBL-2.0_BR-NL-13_ok.xml",
                                                                "SI-UBL-2.0_BR-NL-19_warning_tax_currency.xml",
                                                                "SI-UBL-2.0_BR-NL-1_ok_supplier_not_nl.xml",
                                                                "SI-UBL-2.0_BR-NL-1_ok_supplier_oin.xml",
                                                                "SI-UBL-2.0_BR-NL-20_warning_taxpointdate.xml",
                                                                "SI-UBL-2.0_BR-NL-21_warning_descriptioncode.xml",
                                                                "SI-UBL-2.0_BR-NL-24_warning_ref_issuedate.xml",
                                                                "SI-UBL-2.0_BR-NL-25_warning_companyid_novat.xml",
                                                                "SI-UBL-2.0_BR-NL-26_warning_legalform.xml",
                                                                "SI-UBL-2.0_BR-NL-27_warning_addressline_customer.xml",
                                                                "SI-UBL-2.0_BR-NL-27_warning_addressline_delivery.xml",
                                                                "SI-UBL-2.0_BR-NL-27_warning_addressline_representative.xml",
                                                                "SI-UBL-2.0_BR-NL-27_warning_addressline_seller.xml",
                                                                "SI-UBL-2.0_BR-NL-28_warning_countrysub_customer.xml",
                                                                "SI-UBL-2.0_BR-NL-28_warning_countrysub_delivery.xml",
                                                                "SI-UBL-2.0_BR-NL-28_warning_countrysub_representative.xml",
                                                                "SI-UBL-2.0_BR-NL-28_warning_countrysub_seller.xml",
                                                                "SI-UBL-2.0_BR-NL-29_warning_paymentmeansname.xml",
                                                                "SI-UBL-2.0_BR-NL-2_ok_supplier_not_nl.xml",
                                                                "SI-UBL-2.0_BR-NL-30_warning_financialaccount.xml",
                                                                "SI-UBL-2.0_BR-NL-31_ok_notsepa.xml",
                                                                "SI-UBL-2.0_BR-NL-31_warning_branchid.xml",
                                                                "SI-UBL-2.0_BR-NL-32_warning_linereasoncode.xml",
                                                                "SI-UBL-2.0_BR-NL-32_warning_reasoncode.xml",
                                                                "SI-UBL-2.0_BR-NL-33_warning_taxcurrency.xml",
                                                                "SI-UBL-2.0_BR-NL-34_warning_reasoncode.xml",
                                                                "SI-UBL-2.0_BR-NL-34_warning_reasoncode_line.xml",
                                                                "SI-UBL-2.0_BR-NL-35_warning_taxexemptionreason.xml",
                                                                "SI-UBL-2.0_BR-NL-3_ok_not_nl.xml",
                                                                "SI-UBL-2.0_BR-NL-4_ok_customer_not_nl.xml",
                                                                "SI-UBL-2.0_BR-NL-4_ok_supplier_not_nl.xml",
                                                                "SI-UBL-2.0_BR-NL-5_ok.xml",
                                                                "SI-UBL-2.0_BR-NL-5_ok_supplier_not_nl.xml",
                                                                "SI-UBL-2.0_BR-NL-5_ok_taxpart_not_nl.xml",
                                                                "SI-UBL-2.0_BR-NL-7_ok_384.xml",
                                                                "SI-UBL-2.0_BR-NL-7_ok_389.xml",
                                                                "SI-UBL-2.0_BR-NL-9_ok.xml",
                                                                "SI-UBL-2.0_ok_additionaldocumentreference.xml",
                                                                "SI-UBL-2.0_ok_allowance.xml",
                                                                "SI-UBL-2.0_ok_allowance_line.xml",
                                                                "SI-UBL-2.0_ok_base.xml",
                                                                "SI-UBL-2.0_ok_charge.xml",
                                                                "SI-UBL-2.0_ok_charge_line.xml",
                                                                "SI-UBL-2.0_ok_full.xml",
                                                                "SI-UBL-2.0_ok_full_negative_zero.xml",
                                                                "SI-UBL-2.0_ok_minimal.xml",
                                                                "SI-UBL-2.0_ok_negative.xml",
                                                                "SI-UBL-2.0_ok_quantities.xml",
                                                                "SI-UBL-2.0_ok_quantities_linevalues_wrong.xml",
                                                                "SI-UBL-2.0_ok_tax_category_O.xml",
                                                                "SI-UBL-2.0_ok_unitcode.xml",
                                                                "SI-UBL-2.0_UBL-CR-561_warning.xml",
                                                                "SI-UBL-2.0_warning_empty_elements.xml" })
                            ret.add (new ClassPathResource (PATH_2032 + s));
                        }
                        else
                          if (aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2032) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2033) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2034) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2035) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2036) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2037) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2038) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2039))
                          {
                            for (final String s : new String [] { "SI-UBL-2.0_BR-NL-8_ok_381.xml" })
                              ret.add (new ClassPathResource (PATH_2032 + s));
                          }
                          else
                            if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V10) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V101) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V102) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V103) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V104) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V105) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V106) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V107) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V108) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V109))
                            {
                              for (final String s : new String [] { "si-ubl-2.0-ext-gaccount_ok_sample.xml" })
                                ret.add (new ClassPathResource (PATH_GACCOUNT_10 + s));
                            }
                            else
                              if (aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V103) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1031) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1032) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1033) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1034) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1035) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1036) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1037) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1038))
                              {
                                for (final String s : new String [] { "NLCIUS-CII_ok_example.xml" })
                                  ret.add (new ClassPathResource (NLCIUS_CII_103 + s));
                              }
                              else
                                throw new IllegalArgumentException ("Invalid VESID: " + aVESID);
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsList <? extends IReadableResource> getAllMatchingErrorTestFiles (@Nonnull final DVRCoordinate aVESID)
  {
    ValueEnforcer.notNull (aVESID, "VESID");

    final ICommonsList <IReadableResource> ret = new CommonsArrayList <> ();
    if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V10))
    {
      for (final String s : new String [] {})
        ret.add (new ClassPathResource (PATH_10 + s));
    }
    else
      if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V11))
      {
        for (final String s : new String [] {})
          ret.add (new ClassPathResource (PATH_11 + s));
      }
      else
        if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V12) ||
            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V123) ||
            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V124))
        {
          for (final String s : new String [] { "SI-UBL-INV-1.2-error-BII2-T10-R001.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R002.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R003.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R004.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R005.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R006.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R008.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R010.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R011.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R012.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R013.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R014.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R015.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R017.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R018.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R019.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R020.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R021.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R023.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R024.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R025.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R026.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R027.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R028.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R029.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R030.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R031.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R032.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R033.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R039.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R040.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R041.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R042.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R043.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R044.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R047.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R048.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R049.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R050.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R051.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R052.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R053.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R054.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R055.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R056.xml",
                                                "SI-UBL-INV-1.2-error-BII2-T10-R058.xml",
                                                // "SI-UBL-INV-1.2-error-classifiedtaxcat-no-id.xml",
                                                "SI-UBL-INV-1.2-error-CL-T10-R001.xml",
                                                "SI-UBL-INV-1.2-error-CL-T10-R002.xml",
                                                // "SI-UBL-INV-1.2-error-CL-T10-R003.xml",
                                                "SI-UBL-INV-1.2-error-CL-T10-R004.xml",
                                                "SI-UBL-INV-1.2-error-CL-T10-R006.xml",
                                                "SI-UBL-INV-1.2-error-CL-T10-R007.xml",
                                                // "SI-UBL-INV-1.2-error-CL-T10-R008.xml",
                                                // "SI-UBL-INV-1.2-error-CL-T10-R010.xml",
                                                "SI-UBL-INV-1.2-error-CODE-R002.xml",
                                                "SI-UBL-INV-1.2-error-CODE-R003.xml",
                                                // "SI-UBL-INV-1.2-error-CODE-R004.xml",
                                                "SI-UBL-INV-1.2-error-complex-vat.xml",
                                                // "SI-UBL-INV-1.2-error-corrective-billingreference.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R008.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R012.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R023.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R024.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R025.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R027.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R028.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R029.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R031.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R032.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R033.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R034.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R042.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R043.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R044.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R045.xml",
                                                "SI-UBL-INV-1.2-error-EUGEN-T10-R046.xml",
                                                "SI-UBL-INV-1.2-error-OP-T10-R001.xml",
                                                // "SI-UBL-INV-1.2-error-OP-T10-R002.xml",
                                                // "SI-UBL-INV-1.2-error-OP-T10-R003.xml",
                                                // "SI-UBL-INV-1.2-error-OP-T10-R004.xml",
                                                // "SI-UBL-INV-1.2-error-OP-T10-R006.xml",
                                                // "SI-UBL-INV-1.2-error-OP-T10-R008.xml",
                                                "SI-UBL-INV-1.2-error-OP-T10-R009.xml",
                                                "SI-UBL-INV-1.2-error-OP-T10-R010.xml",
                                                "SI-UBL-INV-1.2-error-OP-T10-R011.xml",
                                                "SI-UBL-INV-1.2-error-rounding-vat-1.xml",
                                                "SI-UBL-INV-1.2-error-rounding-vat-2.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R000.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R001.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R002.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R003.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R004.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R005.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R006.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R007.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R008.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R009.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R010.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R011.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R012.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R013.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R014.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R015.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R016.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R017.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R018.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R019.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R020.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R021.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R022.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R023.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R024.xml",
                                                // "SI-UBL-INV-1.2-error-SI-INV-R025.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R026.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R027.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R028.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R029.xml",
                                                "SI-UBL-INV-1.2-error-SI-INV-R453.xml",
                                                "SI-UBL-INV-1.2-error-tax-currency.xml" })
            ret.add (new ClassPathResource (PATH_12 + s));
        }
        else
          if (aVESID.equals (SimplerInvoicingValidation.VID_SI_ORDER_V12) ||
              aVESID.equals (SimplerInvoicingValidation.VID_SI_ORDER_V123) ||
              aVESID.equals (SimplerInvoicingValidation.VID_SI_ORDER_V124))
          {
            for (final String s : new String [] { "SI-UBL-PO-1.2-error-BII2-T01-R001.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R002.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R003.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R004.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R006.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R007.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R009.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R010.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R011.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R012.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R013.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R014.xml",
                                                  // "SI-UBL-PO-1.2-error-BII2-T01-R015.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R016.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R017.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R019.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R020.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R021-1.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R021-2.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R021.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R022-1.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R022-2.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R030.xml",
                                                  "SI-UBL-PO-1.2-error-BII2-T01-R031.xml",
                                                  "SI-UBL-PO-1.2-error-SI-V12-PO-R001.xml",
                // "SI-UBL-PO-1.2-error-SI-V12-PO-R200.xml"
            })
              ret.add (new ClassPathResource (PATH_12 + s));
          }
          else
            if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V20))
            {
              for (final String s : new String [] { "SI-UBL-2.0_BR-NL-10_ok_customer_no_companyid.xml" })
                ret.add (new ClassPathResource (PATH_200 + s));
            }
            else
              if (aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V20))
              {
                for (final String s : new String [] {})
                  ret.add (new ClassPathResource (PATH_200 + s));
              }
              else
                if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V201) ||
                    aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V202))
                {
                  for (final String s : new String [] {})
                    ret.add (new ClassPathResource (PATH_202 + s));
                }
                else
                  if (aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V201) ||
                      aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V202))
                  {
                    for (final String s : new String [] {})
                      ret.add (new ClassPathResource (PATH_202 + s));
                  }
                  else
                    if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V203) ||
                        aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2031))
                    {
                      for (final String s : new String [] {})
                        ret.add (new ClassPathResource (PATH_203 + s));
                    }
                    else
                      if (aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V203) ||
                          aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2031))
                      {
                        for (final String s : new String [] {})
                          ret.add (new ClassPathResource (PATH_203 + s));
                      }
                      else
                        if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2032) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2033) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2034) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2035) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2036) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2037) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2038) ||
                            aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_V2039))
                        {
                          for (final String s : new String [] { "SI-UBL-2.0_UBL-SR-09_error_multiple_legalentity_registrationname.xml",
                                                                "SI-UBL-2.0_UBL-SR-11_error_multiple_legalentity_companyid.xml",
                                                                "SI-UBL-2.0_UBL-SR-15_error_multiple_legalentity_registrationname.xml",
                                                                "SI-UBL-2.0_UBL-SR-17_error_multiple_legalentity_companyid.xml" })
                            ret.add (new ClassPathResource (PATH_2032 + s));
                        }
                        else
                          if (aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2032) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2033) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2034) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2035) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2036) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2037) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2038) ||
                              aVESID.equals (SimplerInvoicingValidation.VID_SI_CREDIT_NOTE_V2039))
                          {
                            for (final String s : new String [] {})
                              ret.add (new ClassPathResource (PATH_2032 + s));
                          }
                          else
                            if (aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V10) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V101) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V102) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V103) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V104) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V105) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V106) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V107) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V108) ||
                                aVESID.equals (SimplerInvoicingValidation.VID_SI_INVOICE_20_GACCOUNT_V109))
                            {
                              for (final String s : new String [] {})
                                ret.add (new ClassPathResource (PATH_GACCOUNT_10 + s));
                            }
                            else
                              if (aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V103) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1031) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1032) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1033) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1034) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1035) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1036) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1037) ||
                                  aVESID.equals (SimplerInvoicingValidation.VID_SI_NLCIUS_CII_V1038))
                              {
                                for (final String s : new String [] { "NLCIUS-CII_error_BR-NL-10.xml" })
                                  ret.add (new ClassPathResource (NLCIUS_CII_103 + s));
                              }
                              else
                                throw new IllegalArgumentException ("Invalid VESID: " + aVESID);
    return ret;
  }
}
