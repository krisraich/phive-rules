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
package com.helger.phive.peppol.legacy;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.io.resource.ClassPathResource;
import com.helger.commons.io.resource.IReadableResource;
import com.helger.diver.api.coord.DVRCoordinate;
import com.helger.phive.api.executorset.IValidationExecutorSetRegistry;
import com.helger.phive.api.executorset.ValidationExecutorSet;
import com.helger.phive.rules.api.PhiveRulesHelper;
import com.helger.phive.rules.api.PhiveRulesUBLHelper;
import com.helger.phive.xml.source.IValidationSourceXML;
import com.helger.phive.xml.xsd.ValidationExecutorXSD;
import com.helger.ubl21.UBL21Marshaller;
import com.helger.xml.namespace.MapBasedNamespaceContext;

/**
 * Peppol Australia/New Zealand (AUNZ) validation configuration
 *
 * @author Philip Helger
 */
@Immutable
@Deprecated
public final class PeppolLegacyValidationAUNZ
{
  @Nonnull
  private static ClassLoader _getCL ()
  {
    return PeppolLegacyValidationAUNZ.class.getClassLoader ();
  }

  private static final String BASE_PATH = "external/schematron/peppol-aunz/";

  // 1.0.0
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_100 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                  "invoice",
                                                                                                                  "1.0.0");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_100 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                               "invoice-self-billing",
                                                                                                                               "1.0.0");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_100 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                      "creditnote",
                                                                                                                      "1.0.0");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_100 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                                   "creditnote-self-billing",
                                                                                                                                   "1.0.0");

  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_100 = new ClassPathResource (BASE_PATH +
                                                                                                            "1.0.0/xslt/AUNZ-PEPPOL-SB-validation.xslt",
                                                                                                            _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_100 = new ClassPathResource (BASE_PATH +
                                                                                               "1.0.0/xslt/AUNZ-PEPPOL-validation.xslt",
                                                                                               _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_UBL_100 = new ClassPathResource (BASE_PATH +
                                                                                            "1.0.0/xslt/AUNZ-UBL-validation.xslt",
                                                                                            _getCL ());

  // 1.0.1
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_101 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                  "invoice",
                                                                                                                  "1.0.1");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_101 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                               "invoice-self-billing",
                                                                                                                               "1.0.1");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_101 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                      "creditnote",
                                                                                                                      "1.0.1");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_101 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                                   "creditnote-self-billing",
                                                                                                                                   "1.0.1");

  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_101 = new ClassPathResource (BASE_PATH +
                                                                                                            "1.0.1/xslt/AUNZ-PEPPOL-SB-validation.xslt",
                                                                                                            _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_101 = new ClassPathResource (BASE_PATH +
                                                                                               "1.0.1/xslt/AUNZ-PEPPOL-validation.xslt",
                                                                                               _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_UBL_101 = new ClassPathResource (BASE_PATH +
                                                                                            "1.0.1/xslt/AUNZ-UBL-validation.xslt",
                                                                                            _getCL ());

  // 1.0.2
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_102 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                  "invoice",
                                                                                                                  "1.0.2");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_102 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                               "invoice-self-billing",
                                                                                                                               "1.0.2");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_102 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                      "creditnote",
                                                                                                                      "1.0.2");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_102 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                                   "creditnote-self-billing",
                                                                                                                                   "1.0.2");

  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_102 = new ClassPathResource (BASE_PATH +
                                                                                                            "1.0.2/xslt/AUNZ-PEPPOL-SB-validation.xslt",
                                                                                                            _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_102 = new ClassPathResource (BASE_PATH +
                                                                                               "1.0.2/xslt/AUNZ-PEPPOL-validation.xslt",
                                                                                               _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_UBL_102 = new ClassPathResource (BASE_PATH +
                                                                                            "1.0.2/xslt/AUNZ-UBL-validation.xslt",
                                                                                            _getCL ());

  // 1.0.3
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_103 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                  "invoice",
                                                                                                                  "1.0.3");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_103 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                               "invoice-self-billing",
                                                                                                                               "1.0.3");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_103 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                      "creditnote",
                                                                                                                      "1.0.3");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_103 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                                   "creditnote-self-billing",
                                                                                                                                   "1.0.3");

  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_103 = new ClassPathResource (BASE_PATH +
                                                                                                            "1.0.3/xslt/AUNZ-PEPPOL-SB-validation.xslt",
                                                                                                            _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_103 = new ClassPathResource (BASE_PATH +
                                                                                               "1.0.3/xslt/AUNZ-PEPPOL-validation.xslt",
                                                                                               _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_UBL_103 = new ClassPathResource (BASE_PATH +
                                                                                            "1.0.3/xslt/AUNZ-UBL-validation.xslt",
                                                                                            _getCL ());

  // 1.0.4
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_104 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                  "invoice",
                                                                                                                  "1.0.4");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_104 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                               "invoice-self-billing",
                                                                                                                               "1.0.4");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_104 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                      "creditnote",
                                                                                                                      "1.0.4");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_104 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                                   "creditnote-self-billing",
                                                                                                                                   "1.0.4");

  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_104 = new ClassPathResource (BASE_PATH +
                                                                                                            "1.0.4/xslt/AUNZ-PEPPOL-SB-validation.xslt",
                                                                                                            _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_104 = new ClassPathResource (BASE_PATH +
                                                                                               "1.0.4/xslt/AUNZ-PEPPOL-validation.xslt",
                                                                                               _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_UBL_104 = new ClassPathResource (BASE_PATH +
                                                                                            "1.0.4/xslt/AUNZ-UBL-validation.xslt",
                                                                                            _getCL ());

  // 1.0.5
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_105 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                  "invoice",
                                                                                                                  "1.0.5");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_105 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                               "invoice-self-billing",
                                                                                                                               "1.0.5");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_105 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                      "creditnote",
                                                                                                                      "1.0.5");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_105 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                                   "creditnote-self-billing",
                                                                                                                                   "1.0.5");

  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_105 = new ClassPathResource (BASE_PATH +
                                                                                                            "1.0.5/xslt/AUNZ-PEPPOL-SB-validation.xslt",
                                                                                                            _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_105 = new ClassPathResource (BASE_PATH +
                                                                                               "1.0.5/xslt/AUNZ-PEPPOL-validation.xslt",
                                                                                               _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_UBL_105 = new ClassPathResource (BASE_PATH +
                                                                                            "1.0.5/xslt/AUNZ-UBL-validation.xslt",
                                                                                            _getCL ());

  // 1.0.6
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_106 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                  "invoice",
                                                                                                                  "1.0.6");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_106 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                               "invoice-self-billing",
                                                                                                                               "1.0.6");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_106 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                      "creditnote",
                                                                                                                      "1.0.6");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_106 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                                   "creditnote-self-billing",
                                                                                                                                   "1.0.6");

  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_106 = new ClassPathResource (BASE_PATH +
                                                                                                            "1.0.6/xslt/AUNZ-PEPPOL-SB-validation.xslt",
                                                                                                            _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_106 = new ClassPathResource (BASE_PATH +
                                                                                               "1.0.6/xslt/AUNZ-PEPPOL-validation.xslt",
                                                                                               _getCL ());
  private static final IReadableResource BIS3_BILLING_AUNZ_UBL_106 = new ClassPathResource (BASE_PATH +
                                                                                            "1.0.6/xslt/AUNZ-UBL-validation.xslt",
                                                                                            _getCL ());

  // 1.0.7
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_107 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                  "invoice",
                                                                                                                  "1.0.7");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_107 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                               "invoice-self-billing",
                                                                                                                               "1.0.7");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_107 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                      "creditnote",
                                                                                                                      "1.0.7");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_107 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                                   "creditnote-self-billing",
                                                                                                                                   "1.0.7");

  // 1.0.8
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_108 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                  "invoice",
                                                                                                                  "1.0.8");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_108 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                               "invoice-self-billing",
                                                                                                                               "1.0.8");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_108 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                      "creditnote",
                                                                                                                      "1.0.8");
  public static final DVRCoordinate VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_108 = PhiveRulesHelper.createCoordinate ("eu.peppol.bis3.aunz.ubl",
                                                                                                                                   "creditnote-self-billing",
                                                                                                                                   "1.0.8");

  private PeppolLegacyValidationAUNZ ()
  {}

  public static void init (@Nonnull final IValidationExecutorSetRegistry <IValidationSourceXML> aRegistry)
  {
    ValueEnforcer.notNull (aRegistry, "Registry");

    final MapBasedNamespaceContext aNSCtxInvoice = PhiveRulesUBLHelper.createUBL21NSContext (UBL21Marshaller.invoice ()
                                                                                                            .getRootElementNamespaceURI ());
    final MapBasedNamespaceContext aNSCtxCreditNote = PhiveRulesUBLHelper.createUBL21NSContext (UBL21Marshaller.creditNote ()
                                                                                                               .getRootElementNamespaceURI ());

    final boolean bDeprecated = true;

    // 1.0.0
    final String sVersion100 = VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_100.getVersionString ();
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_100,
                                                                           "A-NZ Peppol BIS3 Invoice (UBL) " +
                                                                                                                     sVersion100,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_100,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_100,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_100,
                                                                           "A-NZ Peppol BIS3 Credit Note (UBL) " +
                                                                                                                         sVersion100,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_100,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_100,
                                                                                                        aNSCtxCreditNote)));

    // Self-billing
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_100,
                                                                           "A-NZ Peppol BIS3 Invoice Self-Billing (UBL) " +
                                                                                                                                  sVersion100,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_100,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_100,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_100,
                                                                           "A-NZ Peppol BIS3 Credit Note Self-Billing (UBL) " +
                                                                                                                                      sVersion100,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_100,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_100,
                                                                                                        aNSCtxCreditNote)));

    // 1.0.1
    final String sVersion101 = VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_101.getVersionString ();
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_101,
                                                                           "A-NZ Peppol BIS3 Invoice (UBL) " +
                                                                                                                     sVersion101,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_101,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_101,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_101,
                                                                           "A-NZ Peppol BIS3 Credit Note (UBL) " +
                                                                                                                         sVersion101,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_101,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_101,
                                                                                                        aNSCtxCreditNote)));

    // Self-billing
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_101,
                                                                           "A-NZ Peppol BIS3 Invoice Self-Billing (UBL) " +
                                                                                                                                  sVersion101,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_101,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_101,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_101,
                                                                           "A-NZ Peppol BIS3 Credit Note Self-Billing (UBL) " +
                                                                                                                                      sVersion101,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_101,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_101,
                                                                                                        aNSCtxCreditNote)));

    // 1.0.2
    final String sVersion102 = VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_102.getVersionString ();
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_102,
                                                                           "A-NZ Peppol BIS3 Invoice (UBL) " +
                                                                                                                     sVersion102,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_102,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_102,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_102,
                                                                           "A-NZ Peppol BIS3 Credit Note (UBL) " +
                                                                                                                         sVersion102,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_102,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_102,
                                                                                                        aNSCtxCreditNote)));

    // Self-billing
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_102,
                                                                           "A-NZ Peppol BIS3 Invoice Self-Billing (UBL) " +
                                                                                                                                  sVersion102,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_102,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_102,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_102,
                                                                           "A-NZ Peppol BIS3 Credit Note Self-Billing (UBL) " +
                                                                                                                                      sVersion102,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_102,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_102,
                                                                                                        aNSCtxCreditNote)));

    // 1.0.3
    final String sVersion103 = VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_103.getVersionString ();
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_103,
                                                                           "A-NZ Peppol BIS3 Invoice (UBL) " +
                                                                                                                     sVersion103,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_103,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_103,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_103,
                                                                           "A-NZ Peppol BIS3 Credit Note (UBL) " +
                                                                                                                         sVersion103,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_103,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_103,
                                                                                                        aNSCtxCreditNote)));

    // Self-billing
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_103,
                                                                           "A-NZ Peppol BIS3 Invoice Self-Billing (UBL) " +
                                                                                                                                  sVersion103,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_103,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_103,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_103,
                                                                           "A-NZ Peppol BIS3 Credit Note Self-Billing (UBL) " +
                                                                                                                                      sVersion103,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_103,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_103,
                                                                                                        aNSCtxCreditNote)));

    // 1.0.4
    final String sVersion104 = VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_104.getVersionString ();
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_104,
                                                                           "A-NZ Peppol BIS3 Invoice (UBL) " +
                                                                                                                     sVersion104,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_104,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_104,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_104,
                                                                           "A-NZ Peppol BIS3 Credit Note (UBL) " +
                                                                                                                         sVersion104,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_104,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_104,
                                                                                                        aNSCtxCreditNote)));

    // Self-billing
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_104,
                                                                           "A-NZ Peppol BIS3 Invoice Self-Billing (UBL) " +
                                                                                                                                  sVersion104,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_104,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_104,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_104,
                                                                           "A-NZ Peppol BIS3 Credit Note Self-Billing (UBL) " +
                                                                                                                                      sVersion104,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_104,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_104,
                                                                                                        aNSCtxCreditNote)));

    // 1.0.5
    final String sVersion105 = VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_105.getVersionString ();
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_105,
                                                                           "A-NZ Peppol BIS3 Invoice (UBL) " +
                                                                                                                     sVersion105,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_105,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_105,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_105,
                                                                           "A-NZ Peppol BIS3 Credit Note (UBL) " +
                                                                                                                         sVersion105,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_105,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_105,
                                                                                                        aNSCtxCreditNote)));

    // Self-billing
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_105,
                                                                           "A-NZ Peppol BIS3 Invoice Self-Billing (UBL) " +
                                                                                                                                  sVersion105,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_105,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_105,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_105,
                                                                           "A-NZ Peppol BIS3 Credit Note Self-Billing (UBL) " +
                                                                                                                                      sVersion105,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_105,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_105,
                                                                                                        aNSCtxCreditNote)));

    // 1.0.6
    final String sVersion106 = VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_106.getVersionString ();
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_106,
                                                                           "A-NZ Peppol BIS3 Invoice (UBL) " +
                                                                                                                     sVersion106,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_106,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_106,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_106,
                                                                           "A-NZ Peppol BIS3 Credit Note (UBL) " +
                                                                                                                         sVersion106,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_106,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_106,
                                                                                                        aNSCtxCreditNote)));

    // Self-billing
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_106,
                                                                           "A-NZ Peppol BIS3 Invoice Self-Billing (UBL) " +
                                                                                                                                  sVersion106,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_106,
                                                                                                        aNSCtxInvoice),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_106,
                                                                                                        aNSCtxInvoice)));
    aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_106,
                                                                           "A-NZ Peppol BIS3 Credit Note Self-Billing (UBL) " +
                                                                                                                                      sVersion106,
                                                                           PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                           ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_106,
                                                                                                        aNSCtxCreditNote),
                                                                           PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_106,
                                                                                                        aNSCtxCreditNote)));

    // 1.0.7
    {
      final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_107 = new ClassPathResource (BASE_PATH +
                                                                                                 "1.0.7/xslt/AUNZ-PEPPOL-SB-validation.xslt",
                                                                                                 _getCL ());
      final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_107 = new ClassPathResource (BASE_PATH +
                                                                                    "1.0.7/xslt/AUNZ-PEPPOL-validation.xslt",
                                                                                    _getCL ());
      final IReadableResource BIS3_BILLING_AUNZ_UBL_107 = new ClassPathResource (BASE_PATH +
                                                                                 "1.0.7/xslt/AUNZ-UBL-validation.xslt",
                                                                                 _getCL ());

      final String sVersion107 = VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_107.getVersionString ();
      aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_107,
                                                                             "A-NZ Peppol BIS3 Invoice (UBL) " +
                                                                                                                       sVersion107,
                                                                             PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                             ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_107,
                                                                                                          aNSCtxInvoice),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_107,
                                                                                                          aNSCtxInvoice)));
      aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_107,
                                                                             "A-NZ Peppol BIS3 Credit Note (UBL) " +
                                                                                                                           sVersion107,
                                                                             PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                             ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_107,
                                                                                                          aNSCtxCreditNote),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_107,
                                                                                                          aNSCtxCreditNote)));

      // Self-billing
      aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_107,
                                                                             "A-NZ Peppol BIS3 Invoice Self-Billing (UBL) " +
                                                                                                                                    sVersion107,
                                                                             PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                             ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_107,
                                                                                                          aNSCtxInvoice),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_107,
                                                                                                          aNSCtxInvoice)));
      aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_107,
                                                                             "A-NZ Peppol BIS3 Credit Note Self-Billing (UBL) " +
                                                                                                                                        sVersion107,
                                                                             PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                             ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_107,
                                                                                                          aNSCtxCreditNote),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_107,
                                                                                                          aNSCtxCreditNote)));
    }

    // 1.0.8
    {
      final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_108 = new ClassPathResource (BASE_PATH +
                                                                                                 "1.0.8/xslt/AUNZ-PEPPOL-SB-validation.xslt",
                                                                                                 _getCL ());
      final IReadableResource BIS3_BILLING_AUNZ_PEPPOL_108 = new ClassPathResource (BASE_PATH +
                                                                                    "1.0.8/xslt/AUNZ-PEPPOL-validation.xslt",
                                                                                    _getCL ());
      final IReadableResource BIS3_BILLING_AUNZ_UBL_108 = new ClassPathResource (BASE_PATH +
                                                                                 "1.0.8/xslt/AUNZ-UBL-validation.xslt",
                                                                                 _getCL ());

      final String sVersion108 = VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_108.getVersionString ();
      aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_108,
                                                                             "A-NZ Peppol BIS3 Invoice (UBL) " +
                                                                                                                       sVersion108,
                                                                             PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                             ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_108,
                                                                                                          aNSCtxInvoice),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_108,
                                                                                                          aNSCtxInvoice)));
      aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_108,
                                                                             "A-NZ Peppol BIS3 Credit Note (UBL) " +
                                                                                                                           sVersion108,
                                                                             PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                             ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_108,
                                                                                                          aNSCtxCreditNote),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_108,
                                                                                                          aNSCtxCreditNote)));

      // Self-billing
      aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_INVOICE_SELF_BILLING_108,
                                                                             "A-NZ Peppol BIS3 Invoice Self-Billing (UBL) " +
                                                                                                                                    sVersion108,
                                                                             PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                             ValidationExecutorXSD.create (UBL21Marshaller.getAllInvoiceXSDs ()),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_108,
                                                                                                          aNSCtxInvoice),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_108,
                                                                                                          aNSCtxInvoice)));
      aRegistry.registerValidationExecutorSet (ValidationExecutorSet.create (VID_OPENPEPPOL_BIS3_AUNZ_UBL_CREDIT_NOTE_SELF_BILLING_108,
                                                                             "A-NZ Peppol BIS3 Credit Note Self-Billing (UBL) " +
                                                                                                                                        sVersion108,
                                                                             PhiveRulesHelper.createSimpleStatus (bDeprecated),
                                                                             ValidationExecutorXSD.create (UBL21Marshaller.getAllCreditNoteXSDs ()),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_PEPPOL_SELF_BILLING_108,
                                                                                                          aNSCtxCreditNote),
                                                                             PhiveRulesHelper.createXSLT (BIS3_BILLING_AUNZ_UBL_108,
                                                                                                          aNSCtxCreditNote)));
    }
  }
}
