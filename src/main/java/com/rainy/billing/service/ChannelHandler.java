package com.rainy.billing.service;

import com.rainy.billing.model.service.ChanRequest;
/**
 * Title: <br>
 * Description: <br>
 * Project:  billing <br>
 * Company: com.rainy <br>
 * Copyright: 2011 www.rainy.com Inc. All rights reserved.<br>
 *
 * @2011-12-1
 * @author rainy
 * @version 1.0
 */
public interface ChannelHandler {
	
	String handle(ChanRequest chanRequest);

}
