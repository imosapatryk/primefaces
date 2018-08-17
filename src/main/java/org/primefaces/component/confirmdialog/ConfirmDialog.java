/**
 * Copyright 2009-2018 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.component.confirmdialog;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;

@ResourceDependencies({
        @ResourceDependency(library = "primefaces", name = "components.css"),
        @ResourceDependency(library = "primefaces", name = "jquery/jquery.js"),
        @ResourceDependency(library = "primefaces", name = "jquery/jquery-plugins.js"),
        @ResourceDependency(library = "primefaces", name = "core.js"),
        @ResourceDependency(library = "primefaces", name = "components.js")
})
public class ConfirmDialog extends ConfirmDialogBase implements org.primefaces.component.api.Widget, org.primefaces.component.api.RTLAware {


    public static final String COMPONENT_TYPE = "org.primefaces.component.ConfirmDialog";

    public static final String CONTAINER_CLASS = "ui-confirm-dialog ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-hidden-container";
    public static final String BUTTONPANE_CLASS = "ui-dialog-buttonpane ui-dialog-footer ui-widget-content ui-helper-clearfix";
    public static final String SEVERITY_ICON_CLASS = "ui-confirm-dialog-severity";
    public static final String MESSAGE_CLASS = "ui-confirm-dialog-message";

    @Override
    public boolean isRTL() {
        return getDir().equalsIgnoreCase("rtl");
    }
}