/**
 * Sencha GXT 1.0.0-SNAPSHOT - Sencha for GWT
 * Copyright (c) 2006-2018, Sencha Inc.
 *
 * licensing@sencha.com
 * http://www.sencha.com/products/gxt/license/
 *
 * ================================================================================
 * Commercial License
 * ================================================================================
 * This version of Sencha GXT is licensed commercially and is the appropriate
 * option for the vast majority of use cases.
 *
 * Please see the Sencha GXT Licensing page at:
 * http://www.sencha.com/products/gxt/license/
 *
 * For clarification or additional options, please contact:
 * licensing@sencha.com
 * ================================================================================
 *
 *
 *
 *
 *
 *
 *
 *
 * ================================================================================
 * Disclaimer
 * ================================================================================
 * THIS SOFTWARE IS DISTRIBUTED "AS-IS" WITHOUT ANY WARRANTIES, CONDITIONS AND
 * REPRESENTATIONS WHETHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES AND CONDITIONS OF MERCHANTABILITY, MERCHANTABLE QUALITY,
 * FITNESS FOR A PARTICULAR PURPOSE, DURABILITY, NON-INFRINGEMENT, PERFORMANCE AND
 * THOSE ARISING BY STATUTE OR FROM CUSTOM OR USAGE OF TRADE OR COURSE OF DEALING.
 * ================================================================================
 */
package com.sencha.gxt.desktopapp.client;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;

/**
 * Provides a login view capable of gathering login parameters from a user. The
 * view uses the GWT Editor / Driver framework so that presenter does not need
 * to know too many details of the view's implementation and the view does not
 * need to know too many details about the models structure.
 * 
 * See <a
 * href='http://code.google.com/webtoolkit/doc/latest/DevGuideUiEditors.html'>
 * GWT Editors and Drivers</a> for more information.
 */
public interface LoginView {

  /**
   * Provides access to the GWT Editor / Driver framework so that the presenter
   * can copy data to and from the view without knowing too many details of the
   * view or the view knowing too many details of the model.
   * 
   * @return an editor driver capable of copying model data to / from the view
   */
  SimpleBeanEditorDriver<LoginModel, Editor<? super LoginModel>> getLoginModelDriver();

  /**
   * Hides the view.
   */
  void hide();

  /**
   * Informs the user that the parameters the user entered would result in the
   * creation of a duplicate user name.
   */
  void onDuplicateUserName();

  /**
   * Informs the user that the parameters the user entered are invalid due to a
   * non-existing user name or a non-matching password.
   */
  void onInvalidUserNameOrPassword();

  /**
   * Informs the user that the Editor / Driver framework reported that there are
   * field validation errors.
   */
  void onValidationError();

  /**
   * Shows the view.
   */
  void show();

}
