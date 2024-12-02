package com.alibaba.cloud.ai.service;

import com.alibaba.cloud.ai.model.app.App;
import com.alibaba.cloud.ai.param.CreateAppParam;

import java.util.List;

/**
 * WorkflowDelegate defines the workflow crud operations.
 */
public interface AppDelegate {

	App create(CreateAppParam param);

	App get(String id);

	List<App> list();

	App sync(App app);

	void delete(String id);


}
