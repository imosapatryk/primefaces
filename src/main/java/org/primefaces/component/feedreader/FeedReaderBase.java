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
package org.primefaces.component.feedreader;

import javax.faces.component.UIComponentBase;


abstract class FeedReaderBase extends UIComponentBase {

    public static final String COMPONENT_FAMILY = "org.primefaces.component";

    public static final String DEFAULT_RENDERER = "org.primefaces.component.FeedReaderRenderer";

    public enum PropertyKeys {

        value,
        var,
        size
    }

    public FeedReaderBase() {
        setRendererType(DEFAULT_RENDERER);
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public java.lang.String getValue() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.value, null);
    }

    public void setValue(java.lang.String _value) {
        getStateHelper().put(PropertyKeys.value, _value);
    }

    public java.lang.String getVar() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.var, null);
    }

    public void setVar(java.lang.String _var) {
        getStateHelper().put(PropertyKeys.var, _var);
    }

    public int getSize() {
        return (java.lang.Integer) getStateHelper().eval(PropertyKeys.size, java.lang.Integer.MAX_VALUE);
    }

    public void setSize(int _size) {
        getStateHelper().put(PropertyKeys.size, _size);
    }

}