package AmazonKinesis.v10_7_0;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class Flowservices

{
	// ---( internal utility methods )---

	final static Flowservices _instance = new Flowservices();

	static Flowservices _newInstance() { return new Flowservices(); }

	static Flowservices _cast(Object o) { return (Flowservices)o; }

	// ---( server methods )---




	public static final void forThreadSleep (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(forThreadSleep)>> ---
		// @sigtype java 3.5
		IData input = IDataFactory.create();
		IDataCursor inputCursor = input.getCursor();
		try {
			Thread.sleep(10000);
			Service.doInvoke("pub.flow", "debugLog", input);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// --- <<IS-END>> ---

                
	}
}

