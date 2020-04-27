package network.platon.contracts.wasm;

import com.platon.rlp.datatypes.Uint32;
import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.WasmFunctionEncoder;
import org.web3j.abi.datatypes.WasmFunction;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.WasmContract;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the org.web3j.codegen.WasmFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with platon-web3j version 0.9.1.2-SNAPSHOT.
 */
public class ReferenceDataTypeArrayFuncContract extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001570f60027f7f0060017f0060017f017f60037f7f7f0060000060037f7f7f017f60027f7f017f60027f7e0060047f7f7f7f017f60047f7f7f7f0060077f7f7f7f7f7f7f0060037f7e7f006000017f60017e017f60017f017e02a9010703656e760c706c61746f6e5f70616e6963000403656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000c03656e7610706c61746f6e5f6765745f696e707574000103656e760d706c61746f6e5f72657475726e000003656e7617706c61746f6e5f6765745f73746174655f6c656e677468000603656e7610706c61746f6e5f6765745f7374617465000803656e7610706c61746f6e5f7365745f73746174650009035e5d04050604020102020504040603030200030a000102040101050202020209000302010202050300000200000100010000030300070d0b0608000300010103000405000e01020207010001010100000107020000010000000001020008010405017001050505030100020615037f0141a08b040b7f0041a08b040b7f00419f0b0b075406066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300070b5f5f686561705f6261736503010a5f5f646174615f656e6403020f5f5f66756e63735f6f6e5f65786974001c06696e766f6b650046090a010041010b041e0c43420aec675d1800100a41a40a101b1a4101101d41b00a101b1a4104101d0ba20a010d7f2002410f6a210f410020026b21072002410e6a210a410120026b210e2002410d6a210d410220026b210c0340200020056a2103200120056a220441037145200220054672450440200320042d00003a0000200f417f6a210f200741016a2107200a417f6a210a200e41016a210e200d417f6a210d200c41016a210c200541016a21050c010b0b200220056b210602400240024002402003410371220b044020064120490d03200b4101460d01200b4102460d02200b4103470d032003200120056a280200220a3a0000200041016a210b200220056b417f6a210c200521030340200c4113494504402003200b6a2208200120036a220941046a2802002206411874200a41087672360200200841046a200941086a2802002204411874200641087672360200200841086a2009410c6a28020022064118742004410876723602002008410c6a200941106a280200220a411874200641087672360200200341106a2103200c41706a210c0c010b0b2002417f6a2007416d2007416d4b1b200f6a4170716b20056b2106200120036a41016a2104200020036a41016a21030c030b2006210403402004411049450440200020056a2203200120056a2202290200370200200341086a200241086a290200370200200541106a2105200441706a21040c010b0b027f2006410871450440200120056a2104200020056a0c010b200020056a2202200120056a2201290200370200200141086a2104200241086a0b21052006410471044020052004280200360200200441046a2104200541046a21050b20064102710440200520042f00003b0000200441026a2104200541026a21050b2006410171450d03200520042d00003a000020000f0b2003200120056a2206280200220a3a0000200341016a200641016a2f00003b0000200041036a210b200220056b417d6a210720052103034020074111494504402003200b6a2208200120036a220941046a2802002206410874200a41187672360200200841046a200941086a2802002204410874200641187672360200200841086a2009410c6a28020022064108742004411876723602002008410c6a200941106a280200220a410874200641187672360200200341106a2103200741706a21070c010b0b2002417d6a200c416f200c416f4b1b200d6a4170716b20056b2106200120036a41036a2104200020036a41036a21030c010b2003200120056a2206280200220d3a0000200341016a200641016a2d00003a0000200041026a210b200220056b417e6a210720052103034020074112494504402003200b6a2208200120036a220941046a2802002206411074200d41107672360200200841046a200941086a2802002204411074200641107672360200200841086a2009410c6a28020022064110742004411076723602002008410c6a200941106a280200220d411074200641107672360200200341106a2103200741706a21070c010b0b2002417e6a200e416e200e416e4b1b200a6a4170716b20056b2106200120036a41026a2104200020036a41026a21030b20064110710440200320042d00003a00002003200428000136000120032004290005370005200320042f000d3b000d200320042d000f3a000f200441106a2104200341106a21030b2006410871044020032004290000370000200441086a2104200341086a21030b2006410471044020032004280000360000200441046a2104200341046a21030b20064102710440200320042f00003b0000200441026a2104200341026a21030b2006410171450d00200320042d00003a00000b20000be10201027f02402001450d00200041003a0000200020016a2202417f6a41003a000020014103490d00200041003a0002200041003a00012002417d6a41003a00002002417e6a41003a000020014107490d00200041003a00032002417c6a41003a000020014109490d002000410020006b41037122036a220241003602002002200120036b417c7122036a2201417c6a410036020020034109490d002002410036020820024100360204200141786a4100360200200141746a410036020020034119490d002002410036021820024100360214200241003602102002410036020c200141706a41003602002001416c6a4100360200200141686a4100360200200141646a41003602002003200241047141187222036b2101200220036a2102034020014120490d0120024200370300200241186a4200370300200241106a4200370300200241086a4200370300200241206a2102200141606a21010c000b000b20000b3501017f230041106b220041a08b0436020c418408200028020c41076a41787122003602004180082000360200418c083f003602000b9f0101047f230041106b220224002002200036020c027f02400240024020000440418c08200041086a22014110762200418c082802006a2203360200418408200141840828020022016a41076a4178712204360200200341107420044d0d0120000d020c030b41000c030b418c08200341016a360200200041016a21000b200040000d0010000b20012002410c6a410410081a200141086a0b200241106a24000b0300010b2f01027f2000410120001b2100034002402000100b22010d004190082802002202450d0020021104000c010b0b20010b7801027f20002101024003402001410371044020012d0000450d02200141016a21010c010b0b2001417c6a21010340200141046a22012802002202417f73200241fffdfb776a7141808182847871450d000b0340200241ff0171450d01200141016a2d00002102200141016a21010c000b000b200120006b0bc10301067f024020002001460d00027f02400240200120006b20026b410020024101746b4b044020002001734103712103200020014f0d012003450d0220000c030b20002001200210080f0b024020030d002001417f6a21030340200020026a220441037104402002450d052004417f6a200220036a2d00003a00002002417f6a21020c010b0b2000417c6a21032001417c6a2104034020024104490d01200220036a200220046a2802003602002002417c6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200241046a21062002417f73210503400240200120046a2107200020046a2208410371450d0020022004460d03200820072d00003a00002006417f6a2106200541016a2105200441016a21040c010b0b200220046b21014100210303402001410449450440200320086a200320076a280200360200200341046a21032001417c6a21010c010b0b200320076a210120022005417c2005417c4b1b20066a417c716b20046b2102200320086a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b20000b0a0041940841013602000b0a0041940841003602000b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204101320000b6401027f2002417049044002402002410a4d0440200020024101743a0000200041016a21030c010b200241106a4170712204100d21032000200236020420002004410172360200200020033602080b2003200120021014200220036a41003a00000f0b000b13002002047f20002001200210080520000b1a0b150020002d0000410171044020002802081a0b20000b3401017f2000200147044020002001280208200141016a20012d0000220041017122021b2001280204200041017620021b10170b0bab0101037f410a2103027f0240027f024020002d00002205410171220404402000280200417e71417f6a21030b2003200249044020040d0120054101760c020b20040d02200041016a0c030b20002802040b210420002003200220036b200420042002200110180f0b20002802080b220421032002047f200320012002100f0520030b1a200220046a41003a000020002d0000410171450440200020024101743a00000f0b200020023602040bb70101027f416e20016b20024f0440027f200041016a20002d0000410171450d001a20002802080b2108027f416f200141e6ffffff074b0d001a410b20014101742207200120026a220220022007491b2202410b490d001a200241106a4170710b2207100d21022005044020022006200510140b200320046b220322060440200220056a200420086a200610140b200020023602082000200320056a220136020420002007410172360200200120026a41003a00000f0b000b0c00200020012001100e10170b2301017f03402001410c46450440200020016a4100360200200141046a21010c010b0b0b190020004200370200200041086a41003602002000101a20000b7601037f101041980828020021000340200004400340419c08419c082802002201417f6a22023602002001410148450440200020024102746a22004184016a280200200041046a2802001011110100101041980828020021000c010b0b419c084120360200419808200028020022003602000c010b0b0b940101027f1010419808280200220145044041980841a00836020041a00821010b0240419c0828020022024120460440418402100b22010440200141840210091a0b2001450d0120014198082802003602004198082001360200419c084100360200410021020b419c08200241016a360200200120024102746a22014184016a4100360200200141046a200036020010110f0b10110b080041a40a10151a0b780020004200370210200042ffffffff0f3702082000200129020037020002402002410871450d002000102020012802044f0d002002410471450440200042003702000c010b10000b024002402002411071450d002000102020012802044d0d0020024104710d01200042003702000b20000f0b100020000b290002402000280204044020002802002c0000417f4c0d0141010f0b41000f0b20001021200010226a0b240002402000280204450d0020002802002c0000417f4c0d0041000f0b2000102741016a0b8a0301047f0240024020002802040440200010284101210220002802002c00002201417f4c0d010c020b41000f0b200141ff0171220241b7014d0440200241807f6a0f0b02400240200141ff0171220141bf014d04400240200041046a22042802002201200241c97e6a22034d047f100020042802000520010b4102490d0020002802002d00010d0010000b200341054f044010000b20002802002d000145044010000b410021024100210103402001200346450440200028020020016a41016a2d00002002410874722102200141016a21010c010b0b200241384f0d010c020b200141f7014d0440200241c07e6a0f0b0240200041046a22042802002201200241897e6a22034d047f100020042802000520010b4102490d0020002802002d00010d0010000b200341054f044010000b20002802002d000145044010000b410021024100210103402001200346450440200028020020016a41016a2d00002002410874722102200141016a21010c010b0b20024138490d010b200241ff7d490d010b100020020f0b20020b3902017f017e230041306b2201240020012000290200220237031020012002370308200141186a200141086a4114101f1020200141306a24000b5e01027f2000027f027f2001280200220504404100200220036a200128020422014b2001200249720d011a410020012003490d021a200220056a2104200120026b20032003417f461b0c020b41000b210441000b360204200020043602000b2101017f20011022220220012802044b044010000b2000200120011021200210240b900302097f017e230041406a220324002001280208220520024b0440200341386a20011025200320032903383703182001200341186a102336020c200341306a20011025410021052001027f410020032802302206450d001a410020032802342208200128020c2207490d001a200820072007417f461b210420060b360210200141146a2004360200200141086a41003602000b200141106a2109200141146a21072001410c6a2106200141086a210803400240200520024f0d002007280200450d00200341306a2001102541002105027f2003280230220a044041002003280234220b20062802002204490d011a200b20046b21052004200a6a0c010b41000b210420072005360200200920043602002003200536022c2003200436022820032003290328370310200341306a20094100200341106a1023102420092003290330220c37020020062006280200200c422088a76a3602002008200828020041016a22053602000c010b0b20032009290200220c3703202003200c3703082000200341086a4114101f1a200341406b24000b4101017f02402000280204450d0020002802002d0000220041bf014d0440200041b801490d01200041c97e6a0f0b200041f801490d00200041897e6a21010b20010b4401017f200028020445044010000b0240200028020022012d0000418101470d00200041046a28020041014d047f100020002802000520010b2c00014100480d0010000b0b9f0101037f02402000280204044020001028200028020022022c000022014100480d0120014100470f0b41000f0b027f4101200141807f460d001a200141ff0171220341b7014d0440200041046a28020041014d047f100020002802000520020b2d00014100470f0b4100200341bf014b0d001a200041046a280200200141ff017141ca7e6a22014d047f100020002802000520020b20016a2d00004100470b0baf0102057f017e230041206b2201240002402000280204450d0020002802002d000041c001490d00200141186a20001025200128021c210003402000450d012001200129031822063703102001200637030841002100200141086a10232102027f2001280218220404404100200128021c22052002490d011a200520026b2100200220046a0c010b41000b21022001200036021c20012002360218200341016a21030c000b000b200141206a240020030b1f01017f200020012802002203200320012802046a102c20002002102d20000b2c002000200220016b2202102e200028020020002802046a2001200210081a2000200028020420026a3602040b9e0201077f02402001450d002000410c6a2107200041106a2105200041046a21060340200528020022022007280200460d01200241786a28020020014904401000200528020021020b200241786a2203200328020020016b220136020020010d01200520033602002000410120062802002002417c6a28020022016b2202102f220341016a20024138491b2204200628020022086a10302004200120002802006a22046a2004200820016b100f1a0240200241374d0440200028020020016a200241406a3a00000c010b200341f7016a220441ff014d0440200028020020016a20043a00002000280200200120036a6a210103402002450d02200120023a0000200241087621022001417f6a21010c000b000b10000b410121010c000b000b0b1b00200028020420016a220120002802084b04402000200110310b0b1e01017f03402000044020004108762100200141016a21010c010b0b20010b0f00200020011031200020013602040b3901017f200028020820014904402001100b22022000280200200028020410081a20002802001a200041086a2001360200200020023602000b0b2e01017f230041106b220124002001410a360200200120002802043602042000410c6a20011033200141106a24000b3701017f20002802042202200028020849044020022001290200370200200041046a2200200028020041086a3602000f0b2000200110350b1501017f200028020022010440200020013602040b0b7201027f230041206b22032400200341086a2000200028020420002802006b41037541016a103d200028020420002802006b410375200041086a103e220228020820012902003702002002200228020841086a36020820002002103f20022002280204104120022802001a200341206a24000b250020004101102e200028020020002802046a20013a00002000200028020441016a3602040b2a01017f20022001102f22026a22034180024e044010000b2000200341ff0171103620002001200210380b3d002000200028020420026a1030200028020020002802046a417f6a2100034020010440200020013a0000200141087621012000417f6a21000c010b0b0b930101037f230041106b2202240020012802002103024002400240024020012802042201410146044020032c000022044100480d012000200441ff017110360c040b200141374b0d010b200020014180017341ff017110360c010b2000200141b70110370b2002200136020c2002200336020820022002290308370300200020024100102b1a0b20004101102d200241106a24000b830101037f02400240200150450440200142ff00560d0120002001a741ff017110360c020b200041800110360c010b02402001103b220241374d0440200020024180017341ff017110360c010b2002102f220341b7016a22044180024f044010000b2000200441ff0171103620002002200310380b200020012002103c0b20004101102d0b3202017f017e034020002002845045044020024238862000420888842100200141016a2101200242088821020c010b0b20010b5101017e2000200028020420026a1030200028020020002802046a417f6a21000340200120038450450440200020013c0000200342388620014208888421012000417f6a2100200342088821030c010b0b0b40002001418080808002490440200028020820002802006b220041037541feffffff004d047f20012000410275220020002001491b0541ffffffff010b0f0b000b6401017f2000410036020c200041106a200336020020010440027f20014180808080024904402001410374100d0c010b000b21040b200020043602002000200420024103746a22023602082000410c6a200420014103746a3602002000200236020420000b6701017f20002802002000280204200141046a1040200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b270020022002280200200120006b22016b2202360200200141014e044020022000200110081a0b0b2c01017f20002802082102200041086a2100034020012002464504402000200241786a22023602000c010b0b0b080041b00a10151a0b390020004180016a41bc0a10192000418c016a41be0a101920004198016a41c00a1019200041a4016a41c20a1019200041b0016a41c40a10190b220020022802002202410a490440200020012002410c6c6a4180016a10121a0f0b000b2f01017f20004180016a2102410021000340200041f80046450440200020026a200110162000410c6a21000c010b0b0b890602057f017e23004180036b22002400100710012201100b22021002200041f8006a200041286a200220011047220341001026200041f8006a102802400240200041f8006a1029450d00200028027c450d0020002802782d000041c001490d010b10000b200041d8006a200041f8006a1048200028025c220141094f044010000b200028025821020340200104402001417f6a210120023100002005420886842105200241016a21020c010b0b024002402005500d0041c60a10492005510440200041003602242000410236022020002000290320370308200041086a104a0c020b41cb0a104920055104402000410036021c2000410336021820002000290318370310200041106a104a0c020b41dc0a10492005510440200041f8006a104b200041406b104c2101200041f0006a4100360200200041e8006a4200370300200041e0006a420037030020004200370358200041d8006a4200104d20002802582103200041d8006a410472104e20012003104f20014200103a200128020c200141106a28020047044010000b2001280200200128020410032001105010510c020b41ec0a10492005510440200041f8006a200341011026200041f8006a102802400240200041f8006a1029450d00200028027c450d0020002802782d000041c001490d010b10000b200041d8006a200041f8006a1048200028025c220141054f044010000b41002103200028025821020340200104402001417f6a210120022d00002003410874722103200241016a21020c010b0b200041f8006a104b20002003360240200041d8006a200041f8006a200041406b1044200041d8006a1052200041d8006a10151a10510c020b41ff0a10492005510440200041f8006a104b200041d8006a200041f8016a101222021052200210151a10510c020b41920b10492005520d00200041f0026a101b2101200041f8006a200341011026200041f8006a20011053200041f8006a104b200041f8006a200041d8006a200041406b200110122203101222041045200410151a200310151a1051200110151a0c010b10000b20004180036a24000b3401017f230041106b220324002003200236020c200320013602082003200329030837030020002003411c101f200341106a24000be60101047f200110222204200128020422024b04401000200141046a28020021020b200128020021052000027f024002400240027f0240200204404100210120052c00002203417f4c0d012005450d030c040b41000c010b200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a210120050d010b410021030c010b410021032002200149200120046a20024b720d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b5301047f23004180026b22012400200141086a200028020422034101756a210220002802002100200141086a104b20022003410171047f200228020020006a2802000520000b110100105120014180026a24000b940301087f230041f0006b22012400200041f80010092203105a2003428aa4bedd86c3aeee5837037820034180016a105a200141306a104c220520032903781056200528020c200541106a28020047044010000b0240200528020022062005280204220710042200044020014100360228200142003703202000417f4c0d01200141286a2000100d20001009220420006a2208360200200120083602242001200436022020062007200420001005417f4704400240200141086a2001280220220241016a20012802242002417f736a10472204280204044020042802002d000041bf014b0d010b10000b2004102a410a47044010000b20034180016a21064100210203402002410a470440200141e0006a101b2107200141c8006a200420021026200141c8006a2007105320062007105b200710151a2006410c6a2106200241016a21020c010b0b200021020b200141206a10340b20051050024020020d00410021020340200241f800460d01200220036a22004180016a200010162002410c6a21020c000b000b200141f0006a240020030f0b000b29002000410036020820004200370200200041001054200041146a41003602002000420037020c20000b7502027f017e4101210320014280015a0440034020012004845045044020044238862001420888842101200241016a2102200442088821040c010b0b200241384f047f2002102f20026a0520020b41016a21030b200041186a2802000440200041046a105721000b2000200028020020036a3602000ba90201067f230041106b22042400200028020422012000280210220341087641fcffff07716a2102027f200120002802084704402002280200200341ff07714102746a0c010b41000b2101200441086a20001058200428020c2103034020012003470440200141046a220120022802006b418020470d0120022802042101200241046a21020c010b0b20004100360214200041046a22022802002101200041086a210503402005280200220620016b410275220341034f044020012802001a2002200228020041046a22013602000c010b0b0240200041106a027f2003410147044020034102470d024180080c010b4180040b3602000b03402001200647044020012802001a200141046a21010c010b0b2000200041046a280200105920002802001a200441106a24000b1300200028020820014904402000200110540b0b1c01017f200028020c22010440200041106a20013602000b200010550bce04010a7f230041e0006b22012400200141186a104c2105200141c8006a22024100360200200141406b22044200370300200141386a2206420037030020014200370330200141306a2000290378104d20012802302103200141306a410472104e20052003104f200520002903781056200528020c200541106a28020047044010000b2005280204210720052802002001104c210320024100360200200442003703002006420037030020014200370330200141306a4100105c41800121020340200241f801470440200141306a200141d0006a200020026a10122204105d200410151a2002410c6a21020c010b0b200141306a4101105c20012802302106200141306a410472104e4101100d220241fe013a0000200120023602502001200241016a220436025820012004360254200328020c200341106a280200470440100020012802542104200128025021020b200420026b2204200328020422096a220a20032802084b047f2003200a1054200341046a2802000520090b20032802006a2002200410081a200341046a2202200228020020046a3602002003200128025420066a20012802506b104f2003103241800121020340200241f8014704402003200141306a200020026a10122204105e200410151a2002410c6a21020c010b0b02402003410c6a2204280200200341106a220628020047044010002003280200210220042802002006280200460d0110000c010b200328020021020b20072002200341046a2802001006200141d0006a1034200310502005105020004180016a105f2000105f200141e0006a24000bac0101037f230041e0006b22012400200141186a104c2102200141d8006a4100360200200141d0006a4200370300200141c8006a420037030020014200370340200141406b200141306a200010122203105d200310151a20012802402103200141406b410472104e20022003104f2002200141086a200010122200105e200010151a200228020c200241106a28020047044010000b20022802002002280204100320021050200141e0006a24000bae0201057f230041206b22022400024002400240024002402000280204450d0020002802002d000041c0014f0d00200241186a20001048200010222103200228021822000440200228021c220420034f0d020b41002100200241106a410036020020024200370308410021030c020b200241086a101b1a0c030b200241106a410036020020024200370308200420032003417f461b22034170490440200020036a21052003410a4d0d01200341106a4170712206100d21042002200336020c20022006410172360208200220043602100c020b000b200220034101743a0008200241086a41017221040b034020002005470440200420002d00003a0000200441016a2104200041016a21000c010b0b200441003a00000b2001200241086a105b200241086a10151a200241206a24000b3601017f200028020820014904402001100b200028020020002802041008210220001055200041086a2001360200200020023602000b0b080020002802001a0b080020002001103a0b2e002000280204200028021420002802106a417f6a220041087641fcffff07716a280200200041ff07714102746a0b5101037f20012802042203200128021020012802146a220441087641fcffff07716a21022000027f200320012802084704402002280200200441ff07714102746a0c010b41000b360204200020023602000b2c01017f20002802082102200041086a21000340200120024645044020002002417c6a22023602000c010b0b0b2201027f200041f8006a210103402000101b2000410c6a2100410c6a2001470d000b0b6400024020002d0000410171450440200041003b01000c010b200028020841003a00002000410036020420002d0000410171450d00200041086a2802001a200041003602000b20002001290200370200200041086a200141086a2802003602002001101a0bed0e020b7f027e230041306b22062400200041046a2109024020014101460440200910572802002101200041186a22022002280200417f6a360200200910604180104f04402000410c6a2202280200417c6a2802001a20092002280200417c6a10590b200141384f047f2001102f20016a0520010b41016a2101200041186a280200450d012009105721000c010b0240200910600d00200041146a220128020022024180084f0440200120024180786a360200200041086a2201280200220228020021042001200241046a360200200620043602182009200641186a10610c010b024002400240024002400240024002402000410c6a2802002202200041086a2802006b4102752204200041106a2203280200220520002802046b2201410275490440418020100d210820022005470d01200041086a22042802002202200041046a2802002205460d02200221010c080b20062001410175410120011b2004200310622104418020100d210820042802082201200428020c2205470d0320042802042202200428020022034d0d02200120026b220141027521052002200220036b41027541016a417e6d41027422076a2103200441046a2001047f200320022001100f1a200441046a2802000520020b20076a360200200441086a200320054102746a22013602000c030b2000410c6a22042802002201200041106a2802002205470d04200041086a22072802002202200041046a28020022034d0d03200120026b220141027521052002200220036b41027541016a417e6d41027422076a2103200041086a2001047f200320022001100f1a200041086a2802000520020b20076a3602002000410c6a200320054102746a22013602000c040b2000410c6a22072802002203200041106a220a28020022014f0d042003200120036b41027541016a41026d41027422076a2101200320026b22050440200120056b220120022005100f1a2000410c6a28020021030b200041086a20013602002000410c6a200320076a3602000c050b200641186a200520036b2201410175410120011b22012001410276200441106a28020010622102200441086a2802002105200441046a2802002101034020012005470440200241086a220328020020012802003602002003200328020041046a360200200141046a21010c010b0b2004290200210d200420022902003702002002200d370200200441086a2201290200210d2001200241086a22032902003702002003200d37020020021063200128020021010b20012008360200200441086a2208200828020041046a3602002000410c6a2802002105200441106a210b0340200041086a28020020054704402005417c6a21050240200441046a220728020022022004280200220a470440200221010c010b200828020022032004410c6a28020022014904402003200120036b41027541016a41026d410274220c6a2101200320026b220a04402001200a6b22012002200a100f1a200828020021030b2007200136020020082003200c6a3602000c010b200641186a2001200a6b2201410175410120011b2201200141036a410276200b28020010622008280200210a2007280200210103402001200a470440200641206a220228020020012802003602002002200228020041046a360200200141046a21010c010b0b2004290200210d200420062903183702002008290200210e2008200641206a22012903003702002001200e3703002006200d3703181063200728020021010b2001417c6a200528020036020020072007280200417c6a3602000c010b0b200041046a220128020021022001200428020036020020042002360200200441046a2201280200210220012005360200200041086a20023602002000410c6a2201290200210d2001200441086a22012902003702002001200d370200200410630c040b200641186a200520036b2201410175410120011b22012001410276200041106a106221022000410c6a280200210520072802002101034020012005470440200241086a220328020020012802003602002003200328020041046a360200200141046a21010c010b0b200041046a2201290200210d200120022902003702002002200d3702002000410c6a2201290200210d2001200241086a22032902003702002003200d37020020021063200128020021010b200120083602002004200428020041046a3602000c020b200641186a200120056b2201410175410120011b2201200141036a410276200a1062210220072802002105200041086a2802002101034020012005470440200241086a220328020020012802003602002003200328020041046a360200200141046a21010c010b0b200041046a2201290200210d200120022902003702002002200d3702002000410c6a2201290200210d2001200241086a22012902003702002001200d37020020021063200041086a28020021010b2001417c6a2008360200200420042802002201417c6a22023602002002280200210220042001360200200620023602182009200641186a10610b200641186a20091058200628021c4100360200200041186a2100410121010b2000200028020020016a360200200641306a24000b890101037f410121030240200128020420012d00002202410176200241017122041b2202450d0002400240200241014604402001280208200141016a20041b2c0000417f4a0d030c010b200241374b0d010b200241016a21030c010b2002102f20026a41016a21030b200041186a2802000440200041046a105721000b2000200028020020036a3602000b5201037f230041106b2202240020022001280208200141016a20012d0000220341017122041b36020820022001280204200341017620041b36020c20022002290308370300200020021039200241106a24000b2301027f200041ec006a21010340200110152102200141746a210120002002470d000b0b2801017f200028020820002802046b2201410874417f6a410020011b200028021420002802106a6b0be50202067f017e230041206b22062400024020002802082202200028020c2205470d0020002802042203200028020022044b0440200220036b220241027521052003200320046b41027541016a417e6d41027422076a2104200041046a2002047f200420032002100f1a200041046a2802000520030b20076a360200200041086a200420054102746a22023602000c010b200641086a200520046b2202410175410120021b220220024102762000410c6a10622103200041086a2802002105200041046a280200210203402002200546450440200341086a220428020020022802003602002004200428020041046a360200200241046a21020c010b0b200029020021082000200329020037020020032008370200200041086a220229020021082002200341086a22042902003702002004200837020020031063200228020021020b20022001280200360200200041086a2200200028020041046a360200200641206a24000b6201017f2000410036020c200041106a200336020002402001044020014180808080044f0d012001410274100d21040b200020043602002000200420024102746a22023602082000410c6a200420014102746a3602002000200236020420000f0b000b3801037f2000280208210120002802042102200041086a210303402001200247044020032001417c6a22013602000c010b0b20002802001a0b0b69010041bc0a0b6261006200630064006500696e697400736574496e69744172726179446174650067657441727261794973456d70747900676574417272617956616c7565496e646578006765744172726179466972737456616c756500736574417272617946696c6c";

    public static String BINARY = BINARY_0;

    public static final String FUNC_GETARRAYISEMPTY = "getArrayIsEmpty";

    public static final String FUNC_SETARRAYFILL = "setArrayFill";

    public static final String FUNC_GETARRAYVALUEINDEX = "getArrayValueIndex";

    public static final String FUNC_SETINITARRAYDATE = "setInitArrayDate";

    public static final String FUNC_GETARRAYFIRSTVALUE = "getArrayFirstValue";

    protected ReferenceDataTypeArrayFuncContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ReferenceDataTypeArrayFuncContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Boolean> getArrayIsEmpty() {
        final WasmFunction function = new WasmFunction(FUNC_GETARRAYISEMPTY, Arrays.asList(), Boolean.class);
        return executeRemoteCall(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> setArrayFill(String str) {
        final WasmFunction function = new WasmFunction(FUNC_SETARRAYFILL, Arrays.asList(str), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setArrayFill(String str, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_SETARRAYFILL, Arrays.asList(str), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<ReferenceDataTypeArrayFuncContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeArrayFuncContract.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ReferenceDataTypeArrayFuncContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeArrayFuncContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ReferenceDataTypeArrayFuncContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeArrayFuncContract.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<ReferenceDataTypeArrayFuncContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeArrayFuncContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<String> getArrayValueIndex(Uint32 index) {
        final WasmFunction function = new WasmFunction(FUNC_GETARRAYVALUEINDEX, Arrays.asList(index), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setInitArrayDate() {
        final WasmFunction function = new WasmFunction(FUNC_SETINITARRAYDATE, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setInitArrayDate(BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_SETINITARRAYDATE, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<String> getArrayFirstValue() {
        final WasmFunction function = new WasmFunction(FUNC_GETARRAYFIRSTVALUE, Arrays.asList(), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static ReferenceDataTypeArrayFuncContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeArrayFuncContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeArrayFuncContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeArrayFuncContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
