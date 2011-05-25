/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.android.apps.mytracks;

/**
 * Interface that allows to set a progress dialog message and progress value
 * in percent.
 *
 * @author Leif Hendrik Wilden
 */
public interface ProgressIndicator {

  public void setProgressMessage(int resId);
  public void clearProgressMessage();

  public void setProgressValue(int percent);

}