/*
 *
 * Copyright (C) 2020-2022 Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huaweicloud.samples;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("cse.v2.test")
public class ConsumerConfigurationProperties {
  private String foo;

  private String bar;

  private String priority;

  private String common;


  public String getFoo() {
    return foo;
  }

  public void setFoo(String foo) {
    this.foo = foo;
  }

  public String getBar() {
    return bar;
  }

  public void setBar(String bar) {
    this.bar = bar;
  }

  public String getPriority() {
    return priority;
  }

  public String getCommon() {
    return common;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public void setCommon(String common) {
    this.common = common;
  }
}
