/**
 * Copyright 2012-2014 eBay Software Foundation, All Rights Reserved.
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
package com.ebay.myriad.scheduler.event;

import org.apache.mesos.Protos;
import org.apache.mesos.SchedulerDriver;

public class RegisteredEvent {
    private SchedulerDriver driver;
    private Protos.FrameworkID frameworkId;
    private Protos.MasterInfo masterInfo;

    public SchedulerDriver getDriver() {
        return driver;
    }

    public void setDriver(SchedulerDriver driver) {
        this.driver = driver;
    }

    public Protos.FrameworkID getFrameworkId() {
        return frameworkId;
    }

    public void setFrameworkId(Protos.FrameworkID frameworkId) {
        this.frameworkId = frameworkId;
    }

    public Protos.MasterInfo getMasterInfo() {
        return masterInfo;
    }

    public void setMasterInfo(Protos.MasterInfo masterInfo) {
        this.masterInfo = masterInfo;
    }

}
