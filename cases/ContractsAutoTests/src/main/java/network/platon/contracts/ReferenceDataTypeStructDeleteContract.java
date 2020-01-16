package network.platon.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.7.5.0.
 */
public class ReferenceDataTypeStructDeleteContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506005600081905550600a600160020181905550600180600301600060018152602001908152602001600020819055506002600160030160006002815260200190815260200160002081905550600360016000016000018190555060018060000160010160006001815260200190815260200160002060006101000a81548160ff02191690831515021790555060018060000160010160006002815260200190815260200160002060006101000a81548160ff02191690831515021790555060016000808201600080820160009055505060028201600090555050600080905561019f806100ff6000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c806311977c5c1461005c5780631268893e1461007a5780635ff76c8a1461009857806379e44a38146100b6578063d587919c146100d4575b600080fd5b6100646100f6565b6040518082815260200191505060405180910390f35b6100826100ff565b6040518082815260200191505060405180910390f35b6100a061011e565b6040518082815260200191505060405180910390f35b6100be61012e565b6040518082815260200191505060405180910390f35b6100dc61013b565b604051808215151515815260200191505060405180910390f35b60008054905090565b6000600160030160006001815260200190815260200160002054905090565b6000600160000160000154905090565b6000600160020154905090565b6000600160000160010160006001815260200190815260200160002060009054906101000a900460ff1690509056fea265627a7a7231582063f75b7eca143b7825e7f7e8a7bad542b41bfb1dc4ab8397e7814c77377476e464736f6c634300050d0032";

    public static final String FUNC_GETNESTEDMAPPING = "getNestedMapping";

    public static final String FUNC_GETNESTEDVALUE = "getNestedValue";

    public static final String FUNC_GETTODELETEINT = "getToDeleteInt";

    public static final String FUNC_GETTOPMAPPING = "getTopMapping";

    public static final String FUNC_GETTOPVALUE = "getTopValue";

    @Deprecated
    protected ReferenceDataTypeStructDeleteContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ReferenceDataTypeStructDeleteContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ReferenceDataTypeStructDeleteContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ReferenceDataTypeStructDeleteContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ReferenceDataTypeStructDeleteContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructDeleteContract.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<ReferenceDataTypeStructDeleteContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructDeleteContract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ReferenceDataTypeStructDeleteContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ReferenceDataTypeStructDeleteContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ReferenceDataTypeStructDeleteContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ReferenceDataTypeStructDeleteContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public RemoteCall<Boolean> getNestedMapping() {
        final Function function = new Function(FUNC_GETNESTEDMAPPING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<BigInteger> getNestedValue() {
        final Function function = new Function(FUNC_GETNESTEDVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getToDeleteInt() {
        final Function function = new Function(FUNC_GETTODELETEINT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getTopMapping() {
        final Function function = new Function(FUNC_GETTOPMAPPING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getTopValue() {
        final Function function = new Function(FUNC_GETTOPVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static ReferenceDataTypeStructDeleteContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ReferenceDataTypeStructDeleteContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ReferenceDataTypeStructDeleteContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ReferenceDataTypeStructDeleteContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ReferenceDataTypeStructDeleteContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructDeleteContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeStructDeleteContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructDeleteContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}