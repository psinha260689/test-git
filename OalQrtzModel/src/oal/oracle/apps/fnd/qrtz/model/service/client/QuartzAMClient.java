package oal.oracle.apps.fnd.qrtz.model.service.client;

import oal.oracle.apps.fnd.qrtz.model.service.common.QuartzAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 23 00:56:04 PST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class QuartzAMClient extends ApplicationModuleImpl implements QuartzAM {
    /**
     * This is the default constructor (do not remove).
     */
    public QuartzAMClient() {
    }

    public Number getScheduleNumber() {
        Object _ret =
            this.riInvokeExportedMethod(this,"getScheduleNumber",null,null);
        return (Number)_ret;
    }
}
