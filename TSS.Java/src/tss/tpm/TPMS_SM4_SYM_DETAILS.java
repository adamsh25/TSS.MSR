package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>

/**
 *  Custom data structure representing an empty element (i.e. the one with 
 *  no data to marshal) for selector algorithm TPM_ALG_SM4 for the union TPMU_SYM_DETAILS
 */
public class TPMS_SM4_SYM_DETAILS extends TPMS_NULL_UNION
{
    public TPMS_SM4_SYM_DETAILS() {}
    
    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPMS_SM4_SYM_DETAILS");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }
}

//<<<

