/*
 * Copyright 2007-2107 the original author or authors.
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
package net.ymate.platform.core.plugin;

/**
 * 插件扩展能力支持接口定义
 *
 * @author 刘镇 (suninformation@163.com) on 15/3/19 下午8:27
 * @version 1.0
 */
public interface IPluginExtend<T> {

    /**
     * @param context 插件环境上下文对象
     * @return 返回封装后的插件扩展对象
     */
    public T getExtendObject(IPluginContext context);
}
