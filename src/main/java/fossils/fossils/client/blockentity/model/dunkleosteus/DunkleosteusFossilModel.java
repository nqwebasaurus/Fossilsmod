package fossils.fossils.client.blockentity.model.dunkleosteus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DunkleosteusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Head;
	private final ModelPart Headslope;
	private final ModelPart Throat;
	private final ModelPart Throatslope;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperjawslope2;
	private final ModelPart Upperfrontshears;
	private final ModelPart Leftuppershears;
	private final ModelPart Rightuppershears;
	private final ModelPart Rightuppershears2;
	private final ModelPart Upperjawslope1;
	private final ModelPart Leftcheekslope;
	private final ModelPart Rightcheekslope;
	private final ModelPart Rightcheekslope3;
	private final ModelPart Rightcheekslope2;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawback2;
	private final ModelPart Lowerjawmiddle2;
	private final ModelPart Lowerjawfront2;

	public DunkleosteusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Head = this.root.getChild("Head");
		this.Headslope = this.Head.getChild("Headslope");
		this.Throat = this.Head.getChild("Throat");
		this.Throatslope = this.Throat.getChild("Throatslope");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawfront = this.Upperjawback.getChild("Upperjawfront");
		this.Upperjawslope2 = this.Upperjawfront.getChild("Upperjawslope2");
		this.Upperfrontshears = this.Upperjawfront.getChild("Upperfrontshears");
		this.Leftuppershears = this.Upperjawfront.getChild("Leftuppershears");
		this.Rightuppershears = this.Upperjawfront.getChild("Rightuppershears");
		this.Rightuppershears2 = this.Upperjawfront.getChild("Rightuppershears2");
		this.Upperjawslope1 = this.Upperjawback.getChild("Upperjawslope1");
		this.Leftcheekslope = this.Upperjawback.getChild("Leftcheekslope");
		this.Rightcheekslope = this.Upperjawback.getChild("Rightcheekslope");
		this.Rightcheekslope3 = this.Upperjawback.getChild("Rightcheekslope3");
		this.Rightcheekslope2 = this.Upperjawback.getChild("Rightcheekslope2");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmiddle = this.Lowerjawback.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Lowerjawback2 = this.Head.getChild("Lowerjawback2");
		this.Lowerjawmiddle2 = this.Lowerjawback2.getChild("Lowerjawmiddle2");
		this.Lowerjawfront2 = this.Lowerjawmiddle2.getChild("Lowerjawfront2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -10.6F, 9.0F));

		PartDefinition Head = root.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -9.0F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(66, 24).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.967F, -1.7373F, 0.2351F, -0.3399F, -0.4091F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(50, 60).mirror().addBox(-0.95F, 0.0F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.3635F, -1.4131F, -1.8754F, 0.0777F, 1.4486F, -0.8118F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(61, 57).mirror().addBox(-0.95F, 0.0F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3635F, -1.4131F, -1.8754F, 0.0192F, 1.0561F, -0.8722F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(17, 63).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3794F, -2.2264F, -2.0189F, 0.1677F, 0.711F, -0.5949F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(55, 48).mirror().addBox(-1.0F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.6227F, 0.244F, -2.8869F, 0.0357F, -0.0126F, -1.356F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(63, 15).mirror().addBox(-0.325F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5312F, -0.2426F, -2.4809F, 0.0405F, -0.4922F, -1.3747F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(63, 12).mirror().addBox(-1.0F, 0.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-4.3373F, 1.1985F, -3.0572F, 0.0487F, 0.746F, -1.3225F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(55, 45).mirror().addBox(-2.0F, 0.0F, -0.175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9115F, -0.6283F, -3.7793F, 0.04F, 0.4671F, -1.3375F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(7, 54).mirror().addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.8428F, -0.8127F, -3.7829F, 0.1366F, -1.0573F, -0.8575F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-2.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3794F, -2.2264F, -2.0189F, 0.1275F, 0.1063F, -0.6913F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(48, 43).mirror().addBox(0.0F, -0.0194F, 0.1122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.4421F, -1.6462F, -5.9196F, 0.2814F, -0.3685F, -0.4657F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(9, 34).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.736F, -3.1181F, 0.156F, 0.0565F, -0.3447F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(7, 50).mirror().addBox(0.0F, -0.0194F, 0.0122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4421F, -1.6462F, -5.9196F, 0.374F, -0.7827F, -0.632F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(41, 49).mirror().addBox(-1.0F, -0.0194F, -1.1378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.295F, -4.9009F, 0.2632F, 0.0944F, -0.3366F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(63, 12).addBox(0.0F, 0.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(4.3373F, 1.1985F, -3.0572F, 0.0487F, -0.746F, 1.3225F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(55, 48).addBox(-1.0F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.6227F, 0.244F, -2.8869F, 0.0357F, 0.0126F, 1.356F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(63, 15).addBox(-0.675F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5312F, -0.2426F, -2.4809F, 0.0405F, 0.4922F, 1.3747F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(55, 45).addBox(0.0F, 0.0F, -0.175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9115F, -0.6283F, -3.7793F, 0.04F, -0.4671F, 1.3375F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(50, 60).addBox(-0.05F, 0.0F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.3635F, -1.4131F, -1.8754F, 0.0777F, -1.4486F, 0.8118F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(61, 57).addBox(-0.05F, 0.0F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3635F, -1.4131F, -1.8754F, 0.0192F, -1.0561F, 0.8722F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(17, 63).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.3794F, -2.2264F, -2.0189F, 0.1677F, -0.711F, 0.5949F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3794F, -2.2264F, -2.0189F, 0.1275F, -0.1063F, 0.6913F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(9, 34).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.736F, -3.1181F, 0.156F, -0.0565F, 0.3447F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(66, 24).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.967F, -1.7373F, 0.2351F, 0.3399F, 0.4091F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(24, 62).addBox(-4.5F, 0.0103F, -0.5325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(23, 48).addBox(-4.5F, 0.0103F, -1.9325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.9F, -2.2F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(48, 43).addBox(-1.0F, -0.0194F, 0.1122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4421F, -1.6462F, -5.9196F, 0.2814F, 0.3685F, 0.4657F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(7, 54).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.8428F, -0.8127F, -3.7829F, 0.1366F, 1.0573F, 0.8575F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(7, 50).addBox(-1.0F, -0.0194F, 0.0122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4421F, -1.6462F, -5.9196F, 0.374F, 0.7827F, 0.632F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(41, 49).addBox(0.0F, -0.0194F, -1.1378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -2.295F, -4.9009F, 0.2632F, -0.0944F, 0.3366F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(48, 47).addBox(-3.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.0F, -2.0F, -6.0F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Headslope = Head.addOrReplaceChild("Headslope", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -0.4691F, 1.7324F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1F, 6.0F, 0.2759F, 0.0F, 0.0F));

		PartDefinition Headslope_r1 = Headslope.addOrReplaceChild("Headslope_r1", CubeListBuilder.create().texOffs(44, 55).mirror().addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4755F, 8.1339F, -11.6706F, 1.1698F, -0.4588F, -2.8557F));

		PartDefinition Headslope_r2 = Headslope.addOrReplaceChild("Headslope_r2", CubeListBuilder.create().texOffs(42, 23).mirror().addBox(-1.4134F, -0.8288F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5059F, 8.2647F, -12.0273F, 1.2006F, -0.2565F, -2.9431F));

		PartDefinition Headslope_r3 = Headslope.addOrReplaceChild("Headslope_r3", CubeListBuilder.create().texOffs(39, 16).mirror().addBox(-1.225F, -0.0934F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5059F, 8.2647F, -12.0273F, 1.0972F, -0.6963F, -2.7236F));

		PartDefinition Headslope_r4 = Headslope.addOrReplaceChild("Headslope_r4", CubeListBuilder.create().texOffs(45, 31).mirror().addBox(-1.775F, 0.1F, -0.475F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7243F, 7.3381F, -9.6964F, 1.2223F, -1.006F, -2.7482F));

		PartDefinition Headslope_r5 = Headslope.addOrReplaceChild("Headslope_r5", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-0.35F, -0.5F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(0, 66).mirror().addBox(-0.35F, -0.5F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1851F, 7.7211F, -12.699F, 0.9182F, -1.3373F, -2.4148F));

		PartDefinition Headslope_r6 = Headslope.addOrReplaceChild("Headslope_r6", CubeListBuilder.create().texOffs(65, 63).mirror().addBox(-0.35F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.1851F, 7.7211F, -12.699F, 0.3289F, -0.9655F, -1.7836F));

		PartDefinition Headslope_r7 = Headslope.addOrReplaceChild("Headslope_r7", CubeListBuilder.create().texOffs(55, 42).mirror().addBox(-1.5F, -0.5F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5411F, 7.537F, -10.7389F, 1.2793F, -1.3777F, -2.784F));

		PartDefinition Headslope_r8 = Headslope.addOrReplaceChild("Headslope_r8", CubeListBuilder.create().texOffs(55, 51).mirror().addBox(-1.775F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.7243F, 7.3381F, -9.6964F, 0.7882F, -1.3086F, -2.2807F));

		PartDefinition Headslope_r9 = Headslope.addOrReplaceChild("Headslope_r9", CubeListBuilder.create().texOffs(38, 62).mirror().addBox(-0.375F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.7124F, 7.8526F, -9.9271F, 2.4002F, -1.2951F, 2.3539F));

		PartDefinition Headslope_r10 = Headslope.addOrReplaceChild("Headslope_r10", CubeListBuilder.create().texOffs(64, 35).mirror().addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.8446F, 7.0306F, -8.954F, 0.3766F, -1.0475F, -1.84F));

		PartDefinition Headslope_r11 = Headslope.addOrReplaceChild("Headslope_r11", CubeListBuilder.create().texOffs(62, 9).mirror().addBox(-0.2F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8229F, 7.5617F, -9.2424F, 1.504F, -1.3855F, -3.0128F));

		PartDefinition Headslope_r12 = Headslope.addOrReplaceChild("Headslope_r12", CubeListBuilder.create().texOffs(54, 30).mirror().addBox(0.175F, -0.5F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.9022F, 7.6929F, -8.8621F, 0.5391F, -1.2046F, -2.0193F));

		PartDefinition Headslope_r13 = Headslope.addOrReplaceChild("Headslope_r13", CubeListBuilder.create().texOffs(40, 27).mirror().addBox(-0.725F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2188F, 6.7909F, -7.4228F, 0.3509F, -1.0067F, -1.81F));

		PartDefinition Headslope_r14 = Headslope.addOrReplaceChild("Headslope_r14", CubeListBuilder.create().texOffs(18, 40).mirror().addBox(-1.125F, -0.45F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0166F, 5.6423F, -7.6408F, 0.1916F, -0.324F, -1.5574F));

		PartDefinition Headslope_r15 = Headslope.addOrReplaceChild("Headslope_r15", CubeListBuilder.create().texOffs(55, 8).mirror().addBox(0.0F, -0.5F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4598F, 4.4633F, -9.1965F, 0.4677F, -1.086F, -1.6596F));

		PartDefinition Headslope_r16 = Headslope.addOrReplaceChild("Headslope_r16", CubeListBuilder.create().texOffs(61, 29).mirror().addBox(0.0F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.0916F, 3.5824F, -9.4939F, 0.6487F, -1.1883F, -1.86F));

		PartDefinition Headslope_r17 = Headslope.addOrReplaceChild("Headslope_r17", CubeListBuilder.create().texOffs(20, 28).mirror().addBox(-0.6F, -0.4F, -0.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0278F, 4.7316F, -6.9847F, 0.2027F, -0.8192F, -1.5197F));

		PartDefinition Headslope_r18 = Headslope.addOrReplaceChild("Headslope_r18", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-3.0072F, 0.0169F, -2.0821F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0319F, 5.6065F, -3.5051F, 0.2255F, -1.029F, -1.6666F));

		PartDefinition Headslope_r19 = Headslope.addOrReplaceChild("Headslope_r19", CubeListBuilder.create().texOffs(20, 32).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1034F, 3.1524F, -8.8543F, 0.4046F, -1.0235F, -1.6366F));

		PartDefinition Headslope_r20 = Headslope.addOrReplaceChild("Headslope_r20", CubeListBuilder.create().texOffs(32, 6).mirror().addBox(-0.2F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0039F, 2.87F, -8.8736F, 2.6195F, -1.1016F, 2.3687F));

		PartDefinition Headslope_r21 = Headslope.addOrReplaceChild("Headslope_r21", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.375F, -0.5F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.9261F, 1.8674F, -7.8144F, 2.8038F, -0.8224F, 2.1465F));

		PartDefinition Headslope_r22 = Headslope.addOrReplaceChild("Headslope_r22", CubeListBuilder.create().texOffs(61, 60).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.0779F, 2.3427F, -7.8461F, 0.6903F, -1.2088F, -1.9046F));

		PartDefinition Headslope_r23 = Headslope.addOrReplaceChild("Headslope_r23", CubeListBuilder.create().texOffs(11, 24).mirror().addBox(-1.6072F, -0.6831F, 1.0179F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3422F, 2.5375F, -4.1271F, 0.1558F, -0.8882F, -1.4088F));

		PartDefinition Headslope_r24 = Headslope.addOrReplaceChild("Headslope_r24", CubeListBuilder.create().texOffs(9, 38).mirror().addBox(-0.776F, -0.5F, -0.5454F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2874F, 2.4705F, -7.1634F, 0.2397F, -0.3181F, -1.3233F));

		PartDefinition Headslope_r25 = Headslope.addOrReplaceChild("Headslope_r25", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-2.2006F, -0.8794F, -1.7499F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3422F, 2.5375F, -4.1271F, 0.0651F, -0.3912F, -1.3834F));

		PartDefinition Headslope_r26 = Headslope.addOrReplaceChild("Headslope_r26", CubeListBuilder.create().texOffs(27, 39).mirror().addBox(-0.9048F, -1.1831F, -3.2859F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3422F, 2.5375F, -4.1271F, 0.1836F, -0.6535F, -1.0553F));

		PartDefinition Headslope_r27 = Headslope.addOrReplaceChild("Headslope_r27", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-0.4455F, -0.8099F, -1.7499F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3422F, 2.5375F, -4.1271F, -0.062F, -0.3917F, -1.0527F));

		PartDefinition Headslope_r28 = Headslope.addOrReplaceChild("Headslope_r28", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(1.2473F, -0.6292F, 1.093F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3422F, 2.5375F, -4.1271F, -0.0449F, -0.9146F, -0.9876F));

		PartDefinition Headslope_r29 = Headslope.addOrReplaceChild("Headslope_r29", CubeListBuilder.create().texOffs(36, 37).mirror().addBox(-2.0884F, -0.0778F, -0.5643F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7304F, 0.3791F, 0.2511F, -0.1282F, -0.5608F, -0.7269F));

		PartDefinition Headslope_r30 = Headslope.addOrReplaceChild("Headslope_r30", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-0.9065F, -0.0778F, -0.5875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7304F, 0.3791F, 0.2511F, -0.1089F, -0.084F, -0.7862F));

		PartDefinition Headslope_r31 = Headslope.addOrReplaceChild("Headslope_r31", CubeListBuilder.create().texOffs(61, 26).mirror().addBox(-1.2631F, -0.1322F, 1.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(28, 54).mirror().addBox(-1.2631F, -0.1322F, -0.5542F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.5869F, -0.2749F, -3.6291F, -0.0435F, -0.5478F, -0.6745F));

		PartDefinition Headslope_r32 = Headslope.addOrReplaceChild("Headslope_r32", CubeListBuilder.create().texOffs(39, 12).mirror().addBox(-1.9517F, -0.0555F, -0.5955F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7465F, -0.04F, -1.6757F, -0.1668F, -0.139F, -0.6945F));

		PartDefinition Headslope_r33 = Headslope.addOrReplaceChild("Headslope_r33", CubeListBuilder.create().texOffs(52, 38).mirror().addBox(-1.0629F, -0.2394F, -0.5466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9369F, -0.3135F, -5.4327F, 0.1467F, -0.3243F, -0.6682F));

		PartDefinition Headslope_r34 = Headslope.addOrReplaceChild("Headslope_r34", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-1.2022F, -0.2394F, -0.5117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.491F, -0.7655F, -4.6602F, 0.1667F, -0.5829F, -0.7135F));

		PartDefinition Headslope_r35 = Headslope.addOrReplaceChild("Headslope_r35", CubeListBuilder.create().texOffs(64, 32).mirror().addBox(-1.3467F, -0.2394F, -0.4272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.491F, -0.7655F, -4.6602F, 0.22F, -0.8828F, -0.7922F));

		PartDefinition Headslope_r36 = Headslope.addOrReplaceChild("Headslope_r36", CubeListBuilder.create().texOffs(41, 45).mirror().addBox(-0.9515F, -0.1322F, -0.5833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5869F, -0.2749F, -3.6291F, -0.0375F, -0.1379F, -0.692F));

		PartDefinition Headslope_r37 = Headslope.addOrReplaceChild("Headslope_r37", CubeListBuilder.create().texOffs(45, 39).mirror().addBox(-0.2996F, -0.6408F, -2.4832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.2906F, 0.315F, -1.7545F, -0.0826F, -0.1168F, -0.3407F));

		PartDefinition Headslope_r38 = Headslope.addOrReplaceChild("Headslope_r38", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-3.6639F, -0.0903F, -1.6273F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7523F, 0.7325F, 2.6488F, 0.0258F, -0.9031F, -0.6559F));

		PartDefinition Headslope_r39 = Headslope.addOrReplaceChild("Headslope_r39", CubeListBuilder.create().texOffs(52, 34).mirror().addBox(-0.1482F, -0.6101F, -0.5875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3699F, 0.7745F, 0.1904F, -0.1341F, -0.0303F, -0.3524F));

		PartDefinition Headslope_r40 = Headslope.addOrReplaceChild("Headslope_r40", CubeListBuilder.create().texOffs(21, 52).mirror().addBox(-0.2736F, -0.5687F, -0.5955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2906F, 0.315F, -1.7545F, -0.2039F, -0.0741F, -0.3495F));

		PartDefinition Headslope_r41 = Headslope.addOrReplaceChild("Headslope_r41", CubeListBuilder.create().texOffs(22, 24).mirror().addBox(-2.8807F, -0.1878F, -1.5671F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2692F, 3.2982F, 0.0F, -0.2182F, -0.3491F));

		PartDefinition Headslope_r42 = Headslope.addOrReplaceChild("Headslope_r42", CubeListBuilder.create().texOffs(37, 19).mirror().addBox(-1.9663F, -0.0927F, -0.5918F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6013F, 0.5022F, -0.1642F, -0.0594F, -0.3442F));

		PartDefinition Headslope_r43 = Headslope.addOrReplaceChild("Headslope_r43", CubeListBuilder.create().texOffs(39, 8).mirror().addBox(-1.9751F, -0.0683F, -0.5956F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0257F, -1.4076F, -0.2054F, -0.0741F, -0.3414F));

		PartDefinition Headslope_r44 = Headslope.addOrReplaceChild("Headslope_r44", CubeListBuilder.create().texOffs(39, 4).mirror().addBox(-2.313F, -0.1408F, -0.4921F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0076F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2F, -3.4F, -0.1057F, -0.6817F, -0.2836F));

		PartDefinition Headslope_r45 = Headslope.addOrReplaceChild("Headslope_r45", CubeListBuilder.create().texOffs(36, 41).mirror().addBox(-1.9488F, -0.1408F, -0.581F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2F, -3.4F, -0.082F, -0.0298F, -0.3478F));

		PartDefinition Headslope_r46 = Headslope.addOrReplaceChild("Headslope_r46", CubeListBuilder.create().texOffs(20, 32).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1034F, 3.1524F, -8.8543F, 0.4046F, 1.0235F, 1.6366F));

		PartDefinition Headslope_r47 = Headslope.addOrReplaceChild("Headslope_r47", CubeListBuilder.create().texOffs(55, 8).addBox(-2.0F, -0.5F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4598F, 4.4633F, -9.1965F, 0.4677F, 1.086F, 1.6596F));

		PartDefinition Headslope_r48 = Headslope.addOrReplaceChild("Headslope_r48", CubeListBuilder.create().texOffs(61, 29).addBox(-1.0F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.0916F, 3.5824F, -9.4939F, 0.6487F, 1.1883F, 1.86F));

		PartDefinition Headslope_r49 = Headslope.addOrReplaceChild("Headslope_r49", CubeListBuilder.create().texOffs(32, 6).addBox(-1.8F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0039F, 2.87F, -8.8736F, 2.6195F, 1.1016F, -2.3687F));

		PartDefinition Headslope_r50 = Headslope.addOrReplaceChild("Headslope_r50", CubeListBuilder.create().texOffs(62, 0).addBox(-0.625F, -0.5F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.9261F, 1.8674F, -7.8144F, 2.8038F, 0.8224F, -2.1465F));

		PartDefinition Headslope_r51 = Headslope.addOrReplaceChild("Headslope_r51", CubeListBuilder.create().texOffs(61, 60).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.0779F, 2.3427F, -7.8461F, 0.6903F, 1.2088F, 1.9046F));

		PartDefinition Headslope_r52 = Headslope.addOrReplaceChild("Headslope_r52", CubeListBuilder.create().texOffs(9, 38).addBox(-1.224F, -0.5F, -0.5454F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2874F, 2.4705F, -7.1634F, 0.2397F, 0.3181F, 1.3233F));

		PartDefinition Headslope_r53 = Headslope.addOrReplaceChild("Headslope_r53", CubeListBuilder.create().texOffs(27, 39).addBox(-1.0952F, -1.1831F, -3.2859F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3422F, 2.5375F, -4.1271F, 0.1836F, 0.6535F, 1.0553F));

		PartDefinition Headslope_r54 = Headslope.addOrReplaceChild("Headslope_r54", CubeListBuilder.create().texOffs(18, 40).addBox(-0.875F, -0.45F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0166F, 5.6423F, -7.6408F, 0.1916F, 0.324F, 1.5574F));

		PartDefinition Headslope_r55 = Headslope.addOrReplaceChild("Headslope_r55", CubeListBuilder.create().texOffs(20, 28).addBox(-2.4F, -0.4F, -0.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0278F, 4.7316F, -6.9847F, 0.2027F, 0.8192F, 1.5197F));

		PartDefinition Headslope_r56 = Headslope.addOrReplaceChild("Headslope_r56", CubeListBuilder.create().texOffs(0, 20).addBox(0.2006F, -0.8794F, -1.7499F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3422F, 2.5375F, -4.1271F, 0.0651F, 0.3912F, 1.3834F));

		PartDefinition Headslope_r57 = Headslope.addOrReplaceChild("Headslope_r57", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5545F, -0.8099F, -1.7499F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3422F, 2.5375F, -4.1271F, -0.062F, 0.3917F, 1.0527F));

		PartDefinition Headslope_r58 = Headslope.addOrReplaceChild("Headslope_r58", CubeListBuilder.create().texOffs(64, 35).addBox(-0.4F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.8446F, 7.0306F, -8.954F, 0.3766F, 1.0475F, 1.84F));

		PartDefinition Headslope_r59 = Headslope.addOrReplaceChild("Headslope_r59", CubeListBuilder.create().texOffs(44, 55).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4755F, 8.1339F, -11.6706F, 1.1698F, 0.4588F, 2.8557F));

		PartDefinition Headslope_r60 = Headslope.addOrReplaceChild("Headslope_r60", CubeListBuilder.create().texOffs(42, 23).addBox(-1.5866F, -0.8288F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5059F, 8.2647F, -12.0273F, 1.2006F, 0.2565F, 2.9431F));

		PartDefinition Headslope_r61 = Headslope.addOrReplaceChild("Headslope_r61", CubeListBuilder.create().texOffs(39, 16).addBox(-1.775F, -0.0934F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.5059F, 8.2647F, -12.0273F, 1.0972F, 0.6963F, 2.7236F));

		PartDefinition Headslope_r62 = Headslope.addOrReplaceChild("Headslope_r62", CubeListBuilder.create().texOffs(45, 31).addBox(-1.225F, 0.1F, -0.475F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7243F, 7.3381F, -9.6964F, 1.2223F, 1.006F, 2.7482F));

		PartDefinition Headslope_r63 = Headslope.addOrReplaceChild("Headslope_r63", CubeListBuilder.create().texOffs(55, 51).addBox(-0.225F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.7243F, 7.3381F, -9.6964F, 0.7882F, 1.3086F, 2.2807F));

		PartDefinition Headslope_r64 = Headslope.addOrReplaceChild("Headslope_r64", CubeListBuilder.create().texOffs(15, 66).addBox(-0.65F, -0.5F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(0, 66).addBox(-0.65F, -0.5F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1851F, 7.7211F, -12.699F, 0.9182F, 1.3373F, 2.4148F));

		PartDefinition Headslope_r65 = Headslope.addOrReplaceChild("Headslope_r65", CubeListBuilder.create().texOffs(65, 63).addBox(-0.65F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.1851F, 7.7211F, -12.699F, 0.3289F, 0.9655F, 1.7836F));

		PartDefinition Headslope_r66 = Headslope.addOrReplaceChild("Headslope_r66", CubeListBuilder.create().texOffs(55, 42).addBox(-0.5F, -0.5F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5411F, 7.537F, -10.7389F, 1.2793F, 1.3777F, 2.784F));

		PartDefinition Headslope_r67 = Headslope.addOrReplaceChild("Headslope_r67", CubeListBuilder.create().texOffs(38, 62).addBox(-0.625F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.7124F, 7.8526F, -9.9271F, 2.4002F, 1.2951F, -2.3539F));

		PartDefinition Headslope_r68 = Headslope.addOrReplaceChild("Headslope_r68", CubeListBuilder.create().texOffs(62, 9).addBox(-0.8F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8229F, 7.5617F, -9.2424F, 1.504F, 1.3855F, 3.0128F));

		PartDefinition Headslope_r69 = Headslope.addOrReplaceChild("Headslope_r69", CubeListBuilder.create().texOffs(54, 30).addBox(-1.175F, -0.5F, -1.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.9022F, 7.6929F, -8.8621F, 0.5391F, 1.2046F, 2.0193F));

		PartDefinition Headslope_r70 = Headslope.addOrReplaceChild("Headslope_r70", CubeListBuilder.create().texOffs(40, 27).addBox(-1.275F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2188F, 6.7909F, -7.4228F, 0.3509F, 1.0067F, 1.81F));

		PartDefinition Headslope_r71 = Headslope.addOrReplaceChild("Headslope_r71", CubeListBuilder.create().texOffs(0, 29).addBox(0.0072F, 0.0169F, -2.0821F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0319F, 5.6065F, -3.5051F, 0.2255F, 1.029F, 1.6666F));

		PartDefinition Headslope_r72 = Headslope.addOrReplaceChild("Headslope_r72", CubeListBuilder.create().texOffs(11, 24).addBox(-1.3928F, -0.6831F, 1.0179F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3422F, 2.5375F, -4.1271F, 0.1558F, 0.8882F, 1.4088F));

		PartDefinition Headslope_r73 = Headslope.addOrReplaceChild("Headslope_r73", CubeListBuilder.create().texOffs(0, 25).addBox(-4.2473F, -0.6292F, 1.093F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3422F, 2.5375F, -4.1271F, -0.0449F, 0.9146F, 0.9876F));

		PartDefinition Headslope_r74 = Headslope.addOrReplaceChild("Headslope_r74", CubeListBuilder.create().texOffs(19, 0).addBox(-0.3361F, -0.0903F, -1.6273F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7523F, 0.7325F, 2.6488F, 0.0258F, 0.9031F, 0.6559F));

		PartDefinition Headslope_r75 = Headslope.addOrReplaceChild("Headslope_r75", CubeListBuilder.create().texOffs(22, 24).addBox(-0.1193F, -0.1878F, -1.5671F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2692F, 3.2982F, 0.0F, 0.2182F, 0.3491F));

		PartDefinition Headslope_r76 = Headslope.addOrReplaceChild("Headslope_r76", CubeListBuilder.create().texOffs(37, 19).addBox(-0.0337F, -0.0927F, -0.5918F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6013F, 0.5022F, -0.1642F, 0.0594F, 0.3442F));

		PartDefinition Headslope_r77 = Headslope.addOrReplaceChild("Headslope_r77", CubeListBuilder.create().texOffs(53, 16).addBox(-0.5F, -2.5F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.0F, -0.0735F, -0.4991F, -2.042F, 0.0F, 0.0F));

		PartDefinition Headslope_r78 = Headslope.addOrReplaceChild("Headslope_r78", CubeListBuilder.create().texOffs(12, 61).addBox(-0.5F, -0.225F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, 1.3918F, 0.0949F, -2.4347F, 0.0F, 0.0F));

		PartDefinition Headslope_r79 = Headslope.addOrReplaceChild("Headslope_r79", CubeListBuilder.create().texOffs(34, 45).addBox(-0.5F, 0.0F, -1.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.3767F, 1.8356F, -2.2166F, 0.0F, 0.0F));

		PartDefinition Headslope_r80 = Headslope.addOrReplaceChild("Headslope_r80", CubeListBuilder.create().texOffs(14, 57).addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.8501F, 3.2805F, -1.6493F, 0.0F, 0.0F));

		PartDefinition Headslope_r81 = Headslope.addOrReplaceChild("Headslope_r81", CubeListBuilder.create().texOffs(56, 26).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, 2.3366F, 2.8788F, -1.9111F, 0.0F, 0.0F));

		PartDefinition Headslope_r82 = Headslope.addOrReplaceChild("Headslope_r82", CubeListBuilder.create().texOffs(35, 57).addBox(-0.5F, -1.05F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.0F, 1.9368F, 2.9306F, -1.8239F, 0.0F, 0.0F));

		PartDefinition Headslope_r83 = Headslope.addOrReplaceChild("Headslope_r83", CubeListBuilder.create().texOffs(28, 58).addBox(-0.5F, -0.425F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, 3.607F, 5.1806F, -2.0857F, 0.0F, 0.0F));

		PartDefinition Headslope_r84 = Headslope.addOrReplaceChild("Headslope_r84", CubeListBuilder.create().texOffs(56, 54).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 2.7052F, 5.8223F, -1.8675F, 0.0F, 0.0F));

		PartDefinition Headslope_r85 = Headslope.addOrReplaceChild("Headslope_r85", CubeListBuilder.create().texOffs(48, 16).addBox(-0.5F, -0.325F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5699F, 5.3839F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Headslope_r86 = Headslope.addOrReplaceChild("Headslope_r86", CubeListBuilder.create().texOffs(65, 21).addBox(-0.5F, -0.65F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.4103F, 4.9876F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Headslope_r87 = Headslope.addOrReplaceChild("Headslope_r87", CubeListBuilder.create().texOffs(30, 9).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.141F)), PartPose.offsetAndRotation(0.0F, 1.9542F, 4.0092F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Headslope_r88 = Headslope.addOrReplaceChild("Headslope_r88", CubeListBuilder.create().texOffs(11, 28).addBox(-0.5F, -1.5F, -3.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 1.8038F, 3.5323F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Headslope_r89 = Headslope.addOrReplaceChild("Headslope_r89", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8782F, 3.702F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Headslope_r90 = Headslope.addOrReplaceChild("Headslope_r90", CubeListBuilder.create().texOffs(36, 33).addBox(-1.0F, -1.0986F, -0.5918F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.3835F, 0.3285F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Headslope_r91 = Headslope.addOrReplaceChild("Headslope_r91", CubeListBuilder.create().texOffs(39, 8).addBox(-0.0249F, -0.0683F, -0.5956F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0257F, -1.4076F, -0.2054F, 0.0741F, 0.3414F));

		PartDefinition Headslope_r92 = Headslope.addOrReplaceChild("Headslope_r92", CubeListBuilder.create().texOffs(18, 36).addBox(-1.0F, -0.0727F, -0.5956F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0257F, -1.4076F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Headslope_r93 = Headslope.addOrReplaceChild("Headslope_r93", CubeListBuilder.create().texOffs(36, 37).addBox(0.0884F, -0.0778F, -0.5643F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7304F, 0.3791F, 0.2511F, -0.1282F, 0.5608F, 0.7269F));

		PartDefinition Headslope_r94 = Headslope.addOrReplaceChild("Headslope_r94", CubeListBuilder.create().texOffs(14, 53).addBox(-0.0935F, -0.0778F, -0.5875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.7304F, 0.3791F, 0.2511F, -0.1089F, 0.084F, 0.7862F));

		PartDefinition Headslope_r95 = Headslope.addOrReplaceChild("Headslope_r95", CubeListBuilder.create().texOffs(52, 34).addBox(-0.8518F, -0.6101F, -0.5875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3699F, 0.7745F, 0.1904F, -0.1341F, 0.0303F, 0.3524F));

		PartDefinition Headslope_r96 = Headslope.addOrReplaceChild("Headslope_r96", CubeListBuilder.create().texOffs(39, 12).addBox(-0.0483F, -0.0555F, -0.5955F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7465F, -0.04F, -1.6757F, -0.1668F, 0.139F, 0.6945F));

		PartDefinition Headslope_r97 = Headslope.addOrReplaceChild("Headslope_r97", CubeListBuilder.create().texOffs(21, 52).addBox(-0.7264F, -0.5687F, -0.5955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2906F, 0.315F, -1.7545F, -0.2039F, 0.0741F, 0.3495F));

		PartDefinition Headslope_r98 = Headslope.addOrReplaceChild("Headslope_r98", CubeListBuilder.create().texOffs(45, 39).addBox(-0.7004F, -0.6408F, -2.4832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.2906F, 0.315F, -1.7545F, -0.0826F, 0.1168F, 0.3407F));

		PartDefinition Headslope_r99 = Headslope.addOrReplaceChild("Headslope_r99", CubeListBuilder.create().texOffs(41, 45).addBox(-0.0485F, -0.1322F, -0.5833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5869F, -0.2749F, -3.6291F, -0.0375F, 0.1379F, 0.692F));

		PartDefinition Headslope_r100 = Headslope.addOrReplaceChild("Headslope_r100", CubeListBuilder.create().texOffs(61, 26).addBox(0.2631F, -0.1322F, 1.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(28, 54).addBox(0.2631F, -0.1322F, -0.5542F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.5869F, -0.2749F, -3.6291F, -0.0435F, 0.5478F, 0.6745F));

		PartDefinition Headslope_r101 = Headslope.addOrReplaceChild("Headslope_r101", CubeListBuilder.create().texOffs(55, 0).addBox(0.2022F, -0.2394F, -0.5117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.491F, -0.7655F, -4.6602F, 0.1667F, 0.5829F, 0.7135F));

		PartDefinition Headslope_r102 = Headslope.addOrReplaceChild("Headslope_r102", CubeListBuilder.create().texOffs(52, 38).addBox(0.0629F, -0.2394F, -0.5466F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9369F, -0.3135F, -5.4327F, 0.1467F, 0.3243F, 0.6682F));

		PartDefinition Headslope_r103 = Headslope.addOrReplaceChild("Headslope_r103", CubeListBuilder.create().texOffs(64, 32).addBox(0.3467F, -0.2394F, -0.4272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.491F, -0.7655F, -4.6602F, 0.22F, 0.8828F, 0.7922F));

		PartDefinition Headslope_r104 = Headslope.addOrReplaceChild("Headslope_r104", CubeListBuilder.create().texOffs(39, 4).addBox(0.313F, -0.1408F, -0.4921F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0076F)), PartPose.offsetAndRotation(1.0F, -1.2F, -3.4F, -0.1057F, 0.6817F, 0.2836F));

		PartDefinition Headslope_r105 = Headslope.addOrReplaceChild("Headslope_r105", CubeListBuilder.create().texOffs(36, 41).addBox(-0.0512F, -0.1408F, -0.581F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2F, -3.4F, -0.082F, 0.0298F, 0.3478F));

		PartDefinition Headslope_r106 = Headslope.addOrReplaceChild("Headslope_r106", CubeListBuilder.create().texOffs(7, 42).addBox(-1.0F, -0.1498F, -0.581F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.2F, -3.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Throat = Head.addOrReplaceChild("Throat", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5F, 0.0F));

		PartDefinition Throatslope = Throat.addOrReplaceChild("Throatslope", CubeListBuilder.create().texOffs(15, 16).addBox(-3.0F, -0.5273F, -3.1192F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.1482F, 0.981F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Throatslope_r1 = Throatslope.addOrReplaceChild("Throatslope_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-2.5F, -1.1F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0113F, 2.8906F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Throatslope_r2 = Throatslope.addOrReplaceChild("Throatslope_r2", CubeListBuilder.create().texOffs(15, 9).addBox(-2.5F, -1.1F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.41F, 4.8505F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Throatslope_r3 = Throatslope.addOrReplaceChild("Throatslope_r3", CubeListBuilder.create().texOffs(26, 19).addBox(-1.0F, -1.1F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -0.8938F, 6.7911F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Throatslope_r4 = Throatslope.addOrReplaceChild("Throatslope_r4", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(0.0F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8161F, 9.302F, 0.4532F, 0.7323F, 0.3147F));

		PartDefinition Throatslope_r5 = Throatslope.addOrReplaceChild("Throatslope_r5", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(0.0F, -0.1F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2071F, -2.5859F, 8.6335F, 0.3631F, 0.4111F, 0.1507F));

		PartDefinition Throatslope_r6 = Throatslope.addOrReplaceChild("Throatslope_r6", CubeListBuilder.create().texOffs(15, 19).mirror().addBox(-1.15F, -0.5F, -2.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.3551F, 6.1608F, 0.248F, 0.1693F, 0.0426F));

		PartDefinition Throatslope_r7 = Throatslope.addOrReplaceChild("Throatslope_r7", CubeListBuilder.create().texOffs(19, 13).mirror().addBox(-2.7409F, -0.5F, -0.9751F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8663F, -0.319F, -4.9835F, -0.2284F, 0.298F, -0.0681F));

		PartDefinition Throatslope_r8 = Throatslope.addOrReplaceChild("Throatslope_r8", CubeListBuilder.create().texOffs(62, 42).mirror().addBox(0.3F, -1.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -0.0689F, -4.6738F, -0.081F, -0.4317F, 0.6029F));

		PartDefinition Throatslope_r9 = Throatslope.addOrReplaceChild("Throatslope_r9", CubeListBuilder.create().texOffs(64, 38).mirror().addBox(0.1F, -1.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -0.0689F, -4.6738F, -0.0737F, 0.0468F, 0.5655F));

		PartDefinition Throatslope_r10 = Throatslope.addOrReplaceChild("Throatslope_r10", CubeListBuilder.create().texOffs(46, 19).mirror().addBox(-0.7673F, -0.5F, -0.8391F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1463F, -0.0273F, -3.605F, 0.0F, 0.5672F, 0.0F));

		PartDefinition Throatslope_r11 = Throatslope.addOrReplaceChild("Throatslope_r11", CubeListBuilder.create().texOffs(30, 14).mirror().addBox(-0.425F, -1.0F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7263F, 0.4727F, -2.2285F, 0.0698F, 0.2618F, 0.0F));

		PartDefinition Throatslope_r12 = Throatslope.addOrReplaceChild("Throatslope_r12", CubeListBuilder.create().texOffs(15, 19).addBox(-0.85F, -0.5F, -2.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -1.3551F, 6.1608F, 0.248F, -0.1693F, -0.0426F));

		PartDefinition Throatslope_r13 = Throatslope.addOrReplaceChild("Throatslope_r13", CubeListBuilder.create().texOffs(39, 0).addBox(-2.0F, -0.1F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2071F, -2.5859F, 8.6335F, 0.3631F, -0.4111F, -0.1507F));

		PartDefinition Throatslope_r14 = Throatslope.addOrReplaceChild("Throatslope_r14", CubeListBuilder.create().texOffs(5, 65).addBox(-1.0F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8161F, 9.302F, 0.4532F, -0.7323F, -0.3147F));

		PartDefinition Throatslope_r15 = Throatslope.addOrReplaceChild("Throatslope_r15", CubeListBuilder.create().texOffs(31, 28).addBox(0.0F, -0.1F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -2.8161F, 9.302F, 0.3316F, 0.0F, 0.0F));

		PartDefinition Throatslope_r16 = Throatslope.addOrReplaceChild("Throatslope_r16", CubeListBuilder.create().texOffs(19, 13).addBox(-0.2591F, -0.5F, -0.9751F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8663F, -0.319F, -4.9835F, -0.2284F, -0.298F, 0.0681F));

		PartDefinition Throatslope_r17 = Throatslope.addOrReplaceChild("Throatslope_r17", CubeListBuilder.create().texOffs(55, 11).addBox(-1.8663F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-4.8663F, -0.5F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, -0.319F, -4.9835F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Throatslope_r18 = Throatslope.addOrReplaceChild("Throatslope_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3663F, -1.0F, 0.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, 0.4727F, -2.1192F, 0.096F, 0.0F, 0.0F));

		PartDefinition Throatslope_r19 = Throatslope.addOrReplaceChild("Throatslope_r19", CubeListBuilder.create().texOffs(30, 14).addBox(-0.575F, -1.0F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7263F, 0.4727F, -2.2285F, 0.0698F, -0.2618F, 0.0F));

		PartDefinition Throatslope_r20 = Throatslope.addOrReplaceChild("Throatslope_r20", CubeListBuilder.create().texOffs(46, 19).addBox(-0.2327F, -0.5F, -0.8391F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1463F, -0.0273F, -3.605F, 0.0F, -0.5672F, 0.0F));

		PartDefinition Throatslope_r21 = Throatslope.addOrReplaceChild("Throatslope_r21", CubeListBuilder.create().texOffs(62, 42).addBox(-1.3F, -1.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -0.0689F, -4.6738F, -0.081F, 0.4317F, -0.6029F));

		PartDefinition Throatslope_r22 = Throatslope.addOrReplaceChild("Throatslope_r22", CubeListBuilder.create().texOffs(64, 38).addBox(-1.1F, -1.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.0F, -0.0689F, -4.6738F, -0.0737F, -0.0468F, -0.5655F));

		PartDefinition Throatslope_r23 = Throatslope.addOrReplaceChild("Throatslope_r23", CubeListBuilder.create().texOffs(15, 6).addBox(-4.3663F, -1.0F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8663F, 0.3856F, -4.1154F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offset(0.0F, -1.7F, -6.0F));

		PartDefinition Upperjawback_r1 = Upperjawback.addOrReplaceChild("Upperjawback_r1", CubeListBuilder.create().texOffs(48, 63).mirror().addBox(-0.4F, -0.7F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(43, 62).mirror().addBox(-0.175F, -0.7F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 63).mirror().addBox(0.05F, -0.7F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 2.0F, -2.4F, -0.0311F, -0.3844F, 0.4757F));

		PartDefinition Upperjawback_r2 = Upperjawback.addOrReplaceChild("Upperjawback_r2", CubeListBuilder.create().texOffs(48, 63).addBox(-1.05F, -0.7F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 63).addBox(-0.6F, -0.7F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(43, 62).addBox(-0.825F, -0.7F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 2.0F, -2.4F, -0.0311F, 0.3844F, -0.4757F));

		PartDefinition Upperjawfront = Upperjawback.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -2.0F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(63, 66).mirror().addBox(-0.5378F, -0.7114F, 0.197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(20, 68).mirror().addBox(-0.5378F, -0.7114F, -0.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.828F, -0.2365F, -1.2515F, 0.1244F, -0.593F, 0.0593F));

		PartDefinition Upperjawfront_r2 = Upperjawfront.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(67, 41).mirror().addBox(-0.1664F, -0.5788F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(27, 67).mirror().addBox(-0.7664F, -0.3788F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(10, 67).mirror().addBox(-0.1664F, -1.1788F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(67, 6).mirror().addBox(-0.7664F, -0.9787F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.7134F, 0.3823F, -2.3724F, 0.0873F, 0.2618F, 0.0F));

		PartDefinition Upperjawfront_r3 = Upperjawfront.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(19, 59).mirror().addBox(-0.5688F, -0.4624F, -0.5651F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7134F, 0.3823F, -2.3724F, 0.1102F, 0.2532F, 0.0898F));

		PartDefinition Upperjawfront_r4 = Upperjawfront.addOrReplaceChild("Upperjawfront_r4", CubeListBuilder.create().texOffs(67, 9).mirror().addBox(-1.0536F, 0.3108F, -0.5651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.7134F, 0.3823F, -2.3724F, -0.0098F, 0.2755F, -0.3619F));

		PartDefinition Upperjawfront_r5 = Upperjawfront.addOrReplaceChild("Upperjawfront_r5", CubeListBuilder.create().texOffs(67, 47).mirror().addBox(-0.9084F, 0.0466F, -0.5651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7134F, 0.3823F, -2.3724F, 0.0516F, 0.2709F, -0.1354F));

		PartDefinition Upperjawfront_r6 = Upperjawfront.addOrReplaceChild("Upperjawfront_r6", CubeListBuilder.create().texOffs(67, 44).mirror().addBox(-0.2879F, -0.4313F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.7134F, 0.3823F, -2.3724F, 0.0026F, 0.2756F, -0.3166F));

		PartDefinition Upperjawfront_r7 = Upperjawfront.addOrReplaceChild("Upperjawfront_r7", CubeListBuilder.create().texOffs(67, 3).mirror().addBox(-0.1664F, -1.4161F, -0.7641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false)
				.texOffs(67, 0).mirror().addBox(-0.7664F, -1.4161F, -0.7641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7134F, 0.3823F, -2.3724F, -0.2618F, 0.2618F, 0.0F));

		PartDefinition Upperjawfront_r8 = Upperjawfront.addOrReplaceChild("Upperjawfront_r8", CubeListBuilder.create().texOffs(56, 58).mirror().addBox(-0.4829F, -0.6113F, 0.3322F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(59, 34).mirror().addBox(-0.4829F, -0.6113F, -0.1928F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.828F, -0.2365F, -1.2515F, 0.3432F, -0.6976F, 0.0642F));

		PartDefinition Upperjawfront_r9 = Upperjawfront.addOrReplaceChild("Upperjawfront_r9", CubeListBuilder.create().texOffs(66, 60).mirror().addBox(-0.4829F, -0.5925F, -0.9973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(58, 66).mirror().addBox(-0.4829F, -0.0925F, -0.9973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.828F, -0.2365F, -1.2515F, 0.0726F, -0.6976F, 0.0642F));

		PartDefinition Upperjawfront_r10 = Upperjawfront.addOrReplaceChild("Upperjawfront_r10", CubeListBuilder.create().texOffs(59, 38).mirror().addBox(-0.4829F, -0.8353F, -0.7112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 59).mirror().addBox(-0.4829F, -0.8353F, -0.1112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.828F, -0.2365F, -1.2515F, -0.2764F, -0.6976F, 0.0642F));

		PartDefinition Upperjawfront_r11 = Upperjawfront.addOrReplaceChild("Upperjawfront_r11", CubeListBuilder.create().texOffs(68, 15).mirror().addBox(-0.5452F, -0.7113F, -0.8759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.828F, -0.2365F, -1.2515F, -0.6521F, -0.7448F, 0.0541F));

		PartDefinition Upperjawfront_r12 = Upperjawfront.addOrReplaceChild("Upperjawfront_r12", CubeListBuilder.create().texOffs(44, 66).mirror().addBox(-0.0174F, -0.7048F, -0.0733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -1.3083F, -2.1996F, -0.7092F, -1.2461F, 0.7272F));

		PartDefinition Upperjawfront_r13 = Upperjawfront.addOrReplaceChild("Upperjawfront_r13", CubeListBuilder.create().texOffs(66, 57).mirror().addBox(-1.2072F, -1.064F, 1.266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -1.3083F, -2.1996F, -0.3901F, -0.4536F, 0.0547F));

		PartDefinition Upperjawfront_r14 = Upperjawfront.addOrReplaceChild("Upperjawfront_r14", CubeListBuilder.create().texOffs(66, 27).mirror().addBox(-0.3164F, -0.7048F, 0.8604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -1.3083F, -2.1996F, -0.3602F, -0.9404F, 0.3397F));

		PartDefinition Upperjawfront_r15 = Upperjawfront.addOrReplaceChild("Upperjawfront_r15", CubeListBuilder.create().texOffs(59, 38).addBox(-0.5171F, -0.8353F, -0.7112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 59).addBox(-0.5171F, -0.8353F, -0.1112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.828F, -0.2365F, -1.2515F, -0.2764F, 0.6976F, -0.0642F));

		PartDefinition Upperjawfront_r16 = Upperjawfront.addOrReplaceChild("Upperjawfront_r16", CubeListBuilder.create().texOffs(66, 60).addBox(-0.5171F, -0.5925F, -0.9973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(58, 66).addBox(-0.5171F, -0.0925F, -0.9973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.828F, -0.2365F, -1.2515F, 0.0726F, 0.6976F, -0.0642F));

		PartDefinition Upperjawfront_r17 = Upperjawfront.addOrReplaceChild("Upperjawfront_r17", CubeListBuilder.create().texOffs(19, 59).addBox(-0.4312F, -0.4624F, -0.5651F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7134F, 0.3823F, -2.3724F, 0.1102F, -0.2532F, -0.0898F));

		PartDefinition Upperjawfront_r18 = Upperjawfront.addOrReplaceChild("Upperjawfront_r18", CubeListBuilder.create().texOffs(67, 9).addBox(0.0536F, 0.3108F, -0.5651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.7134F, 0.3823F, -2.3724F, -0.0098F, -0.2755F, 0.3619F));

		PartDefinition Upperjawfront_r19 = Upperjawfront.addOrReplaceChild("Upperjawfront_r19", CubeListBuilder.create().texOffs(67, 47).addBox(-0.0916F, 0.0466F, -0.5651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7134F, 0.3823F, -2.3724F, 0.0516F, -0.2709F, 0.1354F));

		PartDefinition Upperjawfront_r20 = Upperjawfront.addOrReplaceChild("Upperjawfront_r20", CubeListBuilder.create().texOffs(27, 67).addBox(-0.2336F, -0.3788F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(67, 6).addBox(-0.2336F, -0.9787F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(67, 41).addBox(-0.8336F, -0.5788F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 67).addBox(-0.8336F, -1.1788F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7134F, 0.3823F, -2.3724F, 0.0873F, -0.2618F, 0.0F));

		PartDefinition Upperjawfront_r21 = Upperjawfront.addOrReplaceChild("Upperjawfront_r21", CubeListBuilder.create().texOffs(67, 44).addBox(-0.7121F, -0.4313F, -0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.7134F, 0.3823F, -2.3724F, 0.0026F, -0.2756F, 0.3166F));

		PartDefinition Upperjawfront_r22 = Upperjawfront.addOrReplaceChild("Upperjawfront_r22", CubeListBuilder.create().texOffs(67, 3).addBox(-0.8336F, -1.4161F, -0.7641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F))
				.texOffs(67, 0).addBox(-0.2336F, -1.4161F, -0.7641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7134F, 0.3823F, -2.3724F, -0.2618F, -0.2618F, 0.0F));

		PartDefinition Upperjawfront_r23 = Upperjawfront.addOrReplaceChild("Upperjawfront_r23", CubeListBuilder.create().texOffs(56, 58).addBox(-0.5171F, -0.6113F, 0.3322F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(59, 34).addBox(-0.5171F, -0.6113F, -0.1928F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.828F, -0.2365F, -1.2515F, 0.3432F, 0.6976F, -0.0642F));

		PartDefinition Upperjawfront_r24 = Upperjawfront.addOrReplaceChild("Upperjawfront_r24", CubeListBuilder.create().texOffs(63, 66).addBox(-0.4622F, -0.7114F, 0.197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(20, 68).addBox(-0.4622F, -0.7114F, -0.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.828F, -0.2365F, -1.2515F, 0.1244F, 0.593F, -0.0593F));

		PartDefinition Upperjawfront_r25 = Upperjawfront.addOrReplaceChild("Upperjawfront_r25", CubeListBuilder.create().texOffs(68, 15).addBox(-0.4548F, -0.7113F, -0.8759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.828F, -0.2365F, -1.2515F, -0.6521F, 0.7448F, -0.0541F));

		PartDefinition Upperjawfront_r26 = Upperjawfront.addOrReplaceChild("Upperjawfront_r26", CubeListBuilder.create().texOffs(66, 57).addBox(0.2072F, -1.064F, 1.266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.025F, -1.3083F, -2.1996F, -0.3901F, 0.4536F, -0.0547F));

		PartDefinition Upperjawfront_r27 = Upperjawfront.addOrReplaceChild("Upperjawfront_r27", CubeListBuilder.create().texOffs(44, 66).addBox(-0.9826F, -0.7048F, -0.0733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.025F, -1.3083F, -2.1996F, -0.7092F, 1.2461F, -0.7272F));

		PartDefinition Upperjawfront_r28 = Upperjawfront.addOrReplaceChild("Upperjawfront_r28", CubeListBuilder.create().texOffs(66, 27).addBox(-0.6836F, -0.7048F, 0.8604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.025F, -1.3083F, -2.1996F, -0.3602F, 0.9404F, -0.3397F));

		PartDefinition Upperjawslope2 = Upperjawfront.addOrReplaceChild("Upperjawslope2", CubeListBuilder.create().texOffs(21, 56).addBox(-1.0F, 0.3F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.95F, -0.6F, 0.7055F, 0.0F, 0.0F));

		PartDefinition Upperjawslope8_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope8_r1", CubeListBuilder.create().texOffs(29, 64).mirror().addBox(-0.55F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(10, 64).mirror().addBox(-0.55F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.307F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9758F, -3.2422F, 0.6713F, -0.2068F, -0.1617F));

		PartDefinition Upperjawslope6_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r1", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3696F, 0.4519F, -1.0193F, -0.1594F, -0.1106F, -0.4197F));

		PartDefinition Upperjawslope5_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r1", CubeListBuilder.create().texOffs(63, 18).mirror().addBox(-0.9F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3F, -1.5F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Upperjawslope6_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope6_r2", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.3F, -0.425F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6824F, 1.0852F, -1.941F, 0.1733F, 0.8403F, -0.1821F));

		PartDefinition Upperjawslope5_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r2", CubeListBuilder.create().texOffs(55, 62).mirror().addBox(-1.0469F, 0.2162F, -0.0201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -3.0F, 0.2232F, 0.3025F, -0.1558F));

		PartDefinition Upperjawslope4_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope4_r1", CubeListBuilder.create().texOffs(22, 65).mirror().addBox(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 1.0298F, -1.5F, 0.0F, -0.1745F, -0.3927F));

		PartDefinition Upperjawslope5_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r3", CubeListBuilder.create().texOffs(49, 26).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3F, -1.0F, -0.117F, -0.0483F, -0.3899F));

		PartDefinition Upperjawslope5_r4 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r4", CubeListBuilder.create().texOffs(0, 51).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3696F, 0.4519F, -1.0193F, -0.1594F, 0.1106F, 0.4197F));

		PartDefinition Upperjawslope4_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope4_r2", CubeListBuilder.create().texOffs(49, 26).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -1.0F, -0.117F, 0.0483F, 0.3899F));

		PartDefinition Upperjawslope3_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope3_r1", CubeListBuilder.create().texOffs(33, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.0F, -0.1265F, 0.0F, 0.0F));

		PartDefinition Upperjawslope7_r1 = Upperjawslope2.addOrReplaceChild("Upperjawslope7_r1", CubeListBuilder.create().texOffs(29, 64).addBox(-0.45F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(10, 64).addBox(-0.45F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.307F)), PartPose.offsetAndRotation(0.0F, 0.9758F, -3.2422F, 0.6713F, 0.2068F, 0.1617F));

		PartDefinition Upperjawslope5_r5 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r5", CubeListBuilder.create().texOffs(60, 63).addBox(-0.5F, -0.2832F, -0.9881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(62, 51).addBox(-0.5F, -0.2832F, -0.6881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.5067F, -2.9869F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Upperjawslope5_r6 = Upperjawslope2.addOrReplaceChild("Upperjawslope5_r6", CubeListBuilder.create().texOffs(0, 63).addBox(-0.7F, -0.425F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6824F, 1.0852F, -1.941F, 0.1733F, -0.8403F, 0.1821F));

		PartDefinition Upperjawslope4_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope4_r3", CubeListBuilder.create().texOffs(55, 62).addBox(0.0468F, 0.2162F, -0.0201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -3.0F, 0.2232F, -0.3025F, 0.1558F));

		PartDefinition Upperjawslope3_r2 = Upperjawslope2.addOrReplaceChild("Upperjawslope3_r2", CubeListBuilder.create().texOffs(62, 48).addBox(-0.5F, -0.4832F, -0.8881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Upperjawslope4_r4 = Upperjawslope2.addOrReplaceChild("Upperjawslope4_r4", CubeListBuilder.create().texOffs(63, 18).addBox(-0.1F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -1.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition Upperjawslope3_r3 = Upperjawslope2.addOrReplaceChild("Upperjawslope3_r3", CubeListBuilder.create().texOffs(22, 65).addBox(-0.375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4554F, 1.0298F, -1.5F, 0.0F, 0.1745F, 0.3927F));

		PartDefinition Upperfrontshears = Upperjawfront.addOrReplaceChild("Upperfrontshears", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -2.7F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Leftuppershears = Upperjawfront.addOrReplaceChild("Leftuppershears", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, -0.5F, -1.2F, 0.1274F, -0.1485F, 0.0F));

		PartDefinition Rightuppershears = Upperjawfront.addOrReplaceChild("Rightuppershears", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, -0.5F, -1.2F, 0.1274F, 0.1485F, 0.0F));

		PartDefinition Rightuppershears2 = Upperjawfront.addOrReplaceChild("Rightuppershears2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, -0.5F, -1.2F, 0.1274F, -0.1485F, 0.0F));

		PartDefinition Upperjawslope1 = Upperjawback.addOrReplaceChild("Upperjawslope1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.4138F, 0.0F, 0.0F));

		PartDefinition Upperjawslope7_r2 = Upperjawslope1.addOrReplaceChild("Upperjawslope7_r2", CubeListBuilder.create().texOffs(48, 51).mirror().addBox(-0.575F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7406F, 1.4408F, -0.1778F, -0.0939F, -0.1508F, -0.3325F));

		PartDefinition Upperjawslope6_r3 = Upperjawslope1.addOrReplaceChild("Upperjawslope6_r3", CubeListBuilder.create().texOffs(30, 50).mirror().addBox(-1.55F, 0.0705F, -0.9392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 62).mirror().addBox(-0.975F, 0.0705F, -0.8642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3939F, -0.2498F, -0.0606F, -0.2377F, -0.3241F));

		PartDefinition Upperjawslope6_r4 = Upperjawslope1.addOrReplaceChild("Upperjawslope6_r4", CubeListBuilder.create().texOffs(48, 51).addBox(-0.425F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7406F, 1.4408F, -0.1778F, -0.0939F, 0.1508F, 0.3325F));

		PartDefinition Upperjawslope5_r7 = Upperjawslope1.addOrReplaceChild("Upperjawslope5_r7", CubeListBuilder.create().texOffs(30, 50).addBox(0.55F, 0.0705F, -0.9392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(5, 62).addBox(-0.025F, 0.0705F, -0.8642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, 0.3939F, -0.2498F, -0.0606F, 0.2377F, 0.3241F));

		PartDefinition Upperjawslope3_r4 = Upperjawslope1.addOrReplaceChild("Upperjawslope3_r4", CubeListBuilder.create().texOffs(62, 6).addBox(-0.5F, 0.0705F, -1.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.15F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Leftcheekslope = Upperjawback.addOrReplaceChild("Leftcheekslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.0F, -1.9F, 0.7006F, -0.0424F, -0.0848F));

		PartDefinition Rightcheekslope = Upperjawback.addOrReplaceChild("Rightcheekslope", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2398F, 3.1729F, -2.629F, 0.6786F, 0.214F, -0.0691F));

		PartDefinition Rightcheekslope_r1 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r1", CubeListBuilder.create().texOffs(29, 33).addBox(-1.4919F, -0.9016F, -1.2763F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5655F, 0.5975F, 1.3047F, 0.1091F, 0.0F, -0.1309F));

		PartDefinition Rightcheekslope_r2 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r2", CubeListBuilder.create().texOffs(14, 49).addBox(-1.4919F, -0.2381F, -1.2084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3846F, 0.2745F, 1.6799F, 1.2551F, -0.0319F, -0.1528F));

		PartDefinition Rightcheekslope_r3 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r3", CubeListBuilder.create().texOffs(37, 53).addBox(-1.4919F, -0.5186F, -1.6042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3713F, 0.4184F, 2.7807F, 0.8187F, -0.0319F, -0.1528F));

		PartDefinition Rightcheekslope_r4 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r4", CubeListBuilder.create().texOffs(62, 45).addBox(-1.4919F, -0.6518F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4913F, 1.3033F, 3.2837F, 0.5133F, -0.0319F, -0.1528F));

		PartDefinition Rightcheekslope_r5 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r5", CubeListBuilder.create().texOffs(16, 44).addBox(-1.4919F, -0.4335F, -0.9662F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.564F, 1.6756F, 2.8089F, -0.0976F, -0.0319F, -0.1528F));

		PartDefinition Rightcheekslope_r6 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r6", CubeListBuilder.create().texOffs(51, 55).addBox(-1.0233F, 1.2692F, 3.0875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(27, 43).addBox(-1.0733F, 0.6192F, 1.1375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2568F, 1.9701F, 0.6F, -0.0112F, 0.0379F, -0.0306F));

		PartDefinition Rightcheekslope_r7 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r7", CubeListBuilder.create().texOffs(34, 65).addBox(-0.5F, -0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4911F, 1.5982F, 4.312F, 0.1569F, 0.0354F, -0.2053F));

		PartDefinition Rightcheekslope_r8 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r8", CubeListBuilder.create().texOffs(40, 58).addBox(-0.65F, -0.7F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.1678F, 2.4422F, 4.1518F, -0.0613F, 0.0354F, -0.2053F));

		PartDefinition Rightcheekslope_r9 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r9", CubeListBuilder.create().texOffs(58, 18).addBox(-1.0733F, 2.2678F, 2.4044F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2568F, 1.9701F, 0.6F, -0.1203F, 0.0379F, -0.0306F));

		PartDefinition Rightcheekslope_r10 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r10", CubeListBuilder.create().texOffs(45, 58).addBox(-1.0733F, 1.9103F, 2.2127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2568F, 1.9701F, 0.6F, -0.2512F, 0.0379F, -0.0306F));

		PartDefinition Rightcheekslope_r11 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r11", CubeListBuilder.create().texOffs(58, 14).addBox(-1.0733F, -0.0615F, 3.0181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2568F, 1.9701F, 0.6F, -0.8621F, 0.0379F, -0.0306F));

		PartDefinition Rightcheekslope_r12 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r12", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0067F, -0.1083F, 1.1777F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2568F, 1.9701F, 0.6F, -0.5579F, 0.0698F, -0.0087F));

		PartDefinition Rightcheekslope_r13 = Rightcheekslope.addOrReplaceChild("Rightcheekslope_r13", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0067F, 0.0661F, -0.4319F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2568F, 1.9701F, 0.6F, -0.0343F, 0.0698F, -0.0087F));

		PartDefinition Rightcheekslope3 = Upperjawback.addOrReplaceChild("Rightcheekslope3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2398F, 3.1729F, -2.629F, 0.6786F, -0.214F, 0.0691F));

		PartDefinition Leftcheekslope_r1 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r1", CubeListBuilder.create().texOffs(29, 33).mirror().addBox(0.4919F, -0.9016F, -1.2763F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5655F, 0.5975F, 1.3047F, 0.1091F, 0.0F, 0.1309F));

		PartDefinition Leftcheekslope_r2 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r2", CubeListBuilder.create().texOffs(14, 49).mirror().addBox(0.4919F, -0.2381F, -1.2084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3846F, 0.2745F, 1.6799F, 1.2551F, 0.0319F, 0.1528F));

		PartDefinition Leftcheekslope_r3 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r3", CubeListBuilder.create().texOffs(37, 53).mirror().addBox(0.4919F, -0.5186F, -1.6042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3713F, 0.4184F, 2.7807F, 0.8187F, 0.0319F, 0.1528F));

		PartDefinition Leftcheekslope_r4 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r4", CubeListBuilder.create().texOffs(62, 45).mirror().addBox(0.4919F, -0.6518F, -0.492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4913F, 1.3033F, 3.2837F, 0.5133F, 0.0319F, 0.1528F));

		PartDefinition Leftcheekslope_r5 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r5", CubeListBuilder.create().texOffs(16, 44).mirror().addBox(0.4919F, -0.4335F, -0.9662F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.564F, 1.6756F, 2.8089F, -0.0976F, 0.0319F, 0.1528F));

		PartDefinition Leftcheekslope_r6 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r6", CubeListBuilder.create().texOffs(51, 55).mirror().addBox(0.0233F, 1.2692F, 3.0875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(27, 43).mirror().addBox(0.0733F, 0.6192F, 1.1375F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.9701F, 0.6F, -0.0112F, -0.0379F, 0.0306F));

		PartDefinition Leftcheekslope_r7 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r7", CubeListBuilder.create().texOffs(34, 65).mirror().addBox(-0.5F, -0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4911F, 1.5982F, 4.312F, 0.1569F, -0.0354F, 0.2053F));

		PartDefinition Leftcheekslope_r8 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r8", CubeListBuilder.create().texOffs(40, 58).mirror().addBox(-0.35F, -0.7F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.1678F, 2.4422F, 4.1518F, -0.0613F, -0.0354F, 0.2053F));

		PartDefinition Leftcheekslope_r9 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r9", CubeListBuilder.create().texOffs(58, 18).mirror().addBox(0.0733F, 2.2678F, 2.4044F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.9701F, 0.6F, -0.1203F, -0.0379F, 0.0306F));

		PartDefinition Leftcheekslope_r10 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r10", CubeListBuilder.create().texOffs(45, 58).mirror().addBox(0.0733F, 1.9103F, 2.2127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.9701F, 0.6F, -0.2512F, -0.0379F, 0.0306F));

		PartDefinition Leftcheekslope_r11 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r11", CubeListBuilder.create().texOffs(58, 14).mirror().addBox(0.0733F, -0.0615F, 3.0181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.9701F, 0.6F, -0.8621F, -0.0379F, 0.0306F));

		PartDefinition Leftcheekslope_r12 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r12", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(0.0067F, -0.1083F, 1.1777F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.9701F, 0.6F, -0.5579F, -0.0698F, 0.0087F));

		PartDefinition Leftcheekslope_r13 = Rightcheekslope3.addOrReplaceChild("Leftcheekslope_r13", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(0.0067F, 0.0661F, -0.4319F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2568F, 1.9701F, 0.6F, -0.0343F, -0.0698F, 0.0087F));

		PartDefinition Rightcheekslope2 = Upperjawback.addOrReplaceChild("Rightcheekslope2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.0F, -1.9F, 0.7006F, -0.0424F, -0.0848F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9821F, 4.7726F, -4.7007F, 0.1641F, 0.1722F, 0.0284F));

		PartDefinition Lowerjawback_r1 = Lowerjawback.addOrReplaceChild("Lowerjawback_r1", CubeListBuilder.create().texOffs(48, 4).addBox(-0.0379F, 1.7384F, 1.5375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-0.0379F, 2.5384F, 1.5375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0078F, 0.1464F, -3.9252F, 0.696F, 0.1361F, -0.0314F));

		PartDefinition Lowerjawback_r2 = Lowerjawback.addOrReplaceChild("Lowerjawback_r2", CubeListBuilder.create().texOffs(48, 8).addBox(-0.0379F, 2.4163F, 2.0103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0078F, 0.1464F, -3.9252F, 0.9142F, 0.1361F, -0.0314F));

		PartDefinition Lowerjawback_r3 = Lowerjawback.addOrReplaceChild("Lowerjawback_r3", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5985F, 5.8761F, 0.588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0078F, -0.0607F, -5.8166F, 1.3922F, 0.1871F, -0.0434F));

		PartDefinition Lowerjawmiddle = Lowerjawback.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0078F, 2.1093F, -0.8245F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r1 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r1", CubeListBuilder.create().texOffs(55, 4).addBox(-0.0359F, -0.0348F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.9629F, -3.1008F, -0.0452F, 0.1378F, -0.0226F));

		PartDefinition Lowerjawmiddle_r2 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r2", CubeListBuilder.create().texOffs(53, 22).addBox(-0.0359F, 0.4654F, 0.0377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0F, -1.9629F, -3.1008F, -0.3506F, 0.1378F, -0.0226F));

		PartDefinition Lowerjawmiddle_r3 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r3", CubeListBuilder.create().texOffs(45, 34).addBox(-0.0359F, 0.2763F, 1.0387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0F, -1.9629F, -3.1008F, 0.173F, 0.1378F, -0.0226F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.7F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(7, 58).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.6644F, -0.1391F, 0.2138F, -2.8738F, 0.2672F, -0.0429F));

		PartDefinition Lowerjawfront_r2 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(33, 61).addBox(-0.5F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.6383F, -0.1144F, 0.1149F, -2.363F, 0.2788F, -0.0853F));

		PartDefinition Lowerjawfront_r3 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r3", CubeListBuilder.create().texOffs(48, 12).addBox(-0.55F, -0.675F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3309F, -0.0309F, -1.2096F, -2.961F, 0.2672F, -0.0429F));

		PartDefinition Lowerjawfront_r4 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r4", CubeListBuilder.create().texOffs(7, 46).addBox(-0.55F, -0.45F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.3309F, -0.0309F, -1.2096F, 2.8858F, 0.2672F, -0.0429F));

		PartDefinition Lowerjawfront_r5 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r5", CubeListBuilder.create().texOffs(68, 12).addBox(-0.5F, -0.2F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0786F, 0.0334F, -1.7074F, 2.6451F, 0.4777F, -0.1046F));

		PartDefinition Lowerjawfront_r6 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r6", CubeListBuilder.create().texOffs(5, 68).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(2.0786F, 0.0334F, -1.7074F, 1.9469F, 0.4777F, -0.1046F));

		PartDefinition Lowerjawfront_r7 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r7", CubeListBuilder.create().texOffs(68, 18).addBox(-0.55F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9271F, 0.1369F, -2.128F, 1.5979F, 0.4777F, -0.1046F));

		PartDefinition Lowerjawfront_r8 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r8", CubeListBuilder.create().texOffs(32, 68).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.6969F, 0.5448F, -2.3938F, 1.0942F, 0.8595F, -0.2049F));

		PartDefinition Lowerjawfront_r9 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r9", CubeListBuilder.create().texOffs(60, 22).addBox(-0.5F, -0.35F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3323F, -0.4852F, -2.5209F, 0.2651F, 0.8595F, -0.2049F));

		PartDefinition Lowerjawfront_r10 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r10", CubeListBuilder.create().texOffs(49, 68).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.3358F, 0.0077F, -2.6043F, -0.0839F, 0.8595F, -0.2049F));

		PartDefinition Lowerjawfront_r11 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r11", CubeListBuilder.create().texOffs(37, 68).addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2656F, -0.4865F, -2.577F, -0.1802F, 0.849F, -0.2182F));

		PartDefinition Lowerjawfront_r12 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r12", CubeListBuilder.create().texOffs(67, 50).addBox(-0.8758F, -0.0456F, -0.8962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.062F, 0.0143F, -2.4098F, 0.0695F, 0.8832F, -0.0047F));

		PartDefinition Lowerjawfront_r13 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r13", CubeListBuilder.create().texOffs(66, 54).addBox(-0.8508F, -0.1456F, -1.1212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6256F, -0.0056F, -1.4601F, 0.0834F, 0.5358F, -0.0496F));

		PartDefinition Lowerjawfront_r14 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r14", CubeListBuilder.create().texOffs(61, 54).addBox(-0.3985F, 0.0078F, 0.8045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.1699F, -2.2921F, -0.0739F, 0.1871F, -0.0434F));

		PartDefinition Lowerjawfront_r15 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r15", CubeListBuilder.create().texOffs(53, 65).addBox(-0.625F, -0.775F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6594F, 0.8324F, -2.4682F, -0.7864F, 0.6591F, -0.1992F));

		PartDefinition Lowerjawfront_r16 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r16", CubeListBuilder.create().texOffs(39, 65).addBox(-0.8508F, 0.5738F, -0.673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6256F, -0.0056F, -1.4601F, -0.222F, 0.5358F, -0.0496F));

		PartDefinition Lowerjawfront_r17 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r17", CubeListBuilder.create().texOffs(62, 3).addBox(-0.3985F, 0.9153F, 0.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0F, -0.1699F, -2.2921F, 0.1879F, 0.1871F, -0.0434F));

		PartDefinition Lowerjawback2 = Head.addOrReplaceChild("Lowerjawback2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9821F, 4.7726F, -4.7007F, 0.1641F, -0.1722F, -0.0284F));

		PartDefinition Lowerjawback_r4 = Lowerjawback2.addOrReplaceChild("Lowerjawback_r4", CubeListBuilder.create().texOffs(48, 4).mirror().addBox(-0.9621F, 1.7384F, 1.5375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 0).mirror().addBox(-0.9621F, 2.5384F, 1.5375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.0078F, 0.1464F, -3.9252F, 0.696F, -0.1361F, 0.0314F));

		PartDefinition Lowerjawback_r5 = Lowerjawback2.addOrReplaceChild("Lowerjawback_r5", CubeListBuilder.create().texOffs(48, 8).mirror().addBox(-0.9621F, 2.4163F, 2.0103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.0078F, 0.1464F, -3.9252F, 0.9142F, -0.1361F, 0.0314F));

		PartDefinition Lowerjawback_r6 = Lowerjawback2.addOrReplaceChild("Lowerjawback_r6", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.4015F, 5.8761F, 0.588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0078F, -0.0607F, -5.8166F, 1.3922F, -0.1871F, 0.0434F));

		PartDefinition Lowerjawmiddle2 = Lowerjawback2.addOrReplaceChild("Lowerjawmiddle2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0078F, 2.1093F, -0.8245F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r4 = Lowerjawmiddle2.addOrReplaceChild("Lowerjawmiddle_r4", CubeListBuilder.create().texOffs(55, 4).mirror().addBox(-0.9641F, -0.0348F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.9629F, -3.1008F, -0.0452F, -0.1378F, 0.0226F));

		PartDefinition Lowerjawmiddle_r5 = Lowerjawmiddle2.addOrReplaceChild("Lowerjawmiddle_r5", CubeListBuilder.create().texOffs(53, 22).mirror().addBox(-0.9641F, 0.4654F, 0.0377F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.9629F, -3.1008F, -0.3506F, -0.1378F, 0.0226F));

		PartDefinition Lowerjawmiddle_r6 = Lowerjawmiddle2.addOrReplaceChild("Lowerjawmiddle_r6", CubeListBuilder.create().texOffs(45, 34).mirror().addBox(-0.9641F, 0.2763F, 1.0387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.9629F, -3.1008F, 0.173F, -0.1378F, 0.0226F));

		PartDefinition Lowerjawfront2 = Lowerjawmiddle2.addOrReplaceChild("Lowerjawfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.7F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r18 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r18", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.6644F, -0.1391F, 0.2138F, -2.8738F, -0.2672F, 0.0429F));

		PartDefinition Lowerjawfront_r19 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r19", CubeListBuilder.create().texOffs(33, 61).mirror().addBox(-0.5F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.6383F, -0.1144F, 0.1149F, -2.363F, -0.2788F, 0.0853F));

		PartDefinition Lowerjawfront_r20 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r20", CubeListBuilder.create().texOffs(48, 12).mirror().addBox(-0.45F, -0.675F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3309F, -0.0309F, -1.2096F, -2.961F, -0.2672F, 0.0429F));

		PartDefinition Lowerjawfront_r21 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r21", CubeListBuilder.create().texOffs(7, 46).mirror().addBox(-0.45F, -0.45F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.3309F, -0.0309F, -1.2096F, 2.8858F, -0.2672F, 0.0429F));

		PartDefinition Lowerjawfront_r22 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r22", CubeListBuilder.create().texOffs(68, 12).mirror().addBox(-0.5F, -0.2F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0786F, 0.0334F, -1.7074F, 2.6451F, -0.4777F, 0.1046F));

		PartDefinition Lowerjawfront_r23 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r23", CubeListBuilder.create().texOffs(5, 68).mirror().addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-2.0786F, 0.0334F, -1.7074F, 1.9469F, -0.4777F, 0.1046F));

		PartDefinition Lowerjawfront_r24 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r24", CubeListBuilder.create().texOffs(68, 18).mirror().addBox(-0.45F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9271F, 0.1369F, -2.128F, 1.5979F, -0.4777F, 0.1046F));

		PartDefinition Lowerjawfront_r25 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r25", CubeListBuilder.create().texOffs(32, 68).mirror().addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.6969F, 0.5448F, -2.3938F, 1.0942F, -0.8595F, 0.2049F));

		PartDefinition Lowerjawfront_r26 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r26", CubeListBuilder.create().texOffs(60, 22).mirror().addBox(-0.5F, -0.35F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3323F, -0.4852F, -2.5209F, 0.2651F, -0.8595F, 0.2049F));

		PartDefinition Lowerjawfront_r27 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r27", CubeListBuilder.create().texOffs(49, 68).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.3358F, 0.0077F, -2.6043F, -0.0839F, -0.8595F, 0.2049F));

		PartDefinition Lowerjawfront_r28 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r28", CubeListBuilder.create().texOffs(37, 68).mirror().addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2656F, -0.4865F, -2.577F, -0.1802F, -0.849F, 0.2182F));

		PartDefinition Lowerjawfront_r29 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r29", CubeListBuilder.create().texOffs(67, 50).mirror().addBox(-0.1242F, -0.0456F, -0.8962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.062F, 0.0143F, -2.4098F, 0.0695F, -0.8832F, 0.0047F));

		PartDefinition Lowerjawfront_r30 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r30", CubeListBuilder.create().texOffs(66, 54).mirror().addBox(-0.1492F, -0.1456F, -1.1212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6256F, -0.0056F, -1.4601F, 0.0834F, -0.5358F, 0.0496F));

		PartDefinition Lowerjawfront_r31 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r31", CubeListBuilder.create().texOffs(61, 54).mirror().addBox(-0.6015F, 0.0078F, 0.8045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.1699F, -2.2921F, -0.0739F, -0.1871F, 0.0434F));

		PartDefinition Lowerjawfront_r32 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r32", CubeListBuilder.create().texOffs(53, 65).mirror().addBox(-0.375F, -0.775F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6594F, 0.8324F, -2.4682F, -0.7864F, -0.6591F, 0.1992F));

		PartDefinition Lowerjawfront_r33 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r33", CubeListBuilder.create().texOffs(39, 65).mirror().addBox(-0.1492F, 0.5738F, -0.673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6256F, -0.0056F, -1.4601F, -0.222F, -0.5358F, 0.0496F));

		PartDefinition Lowerjawfront_r34 = Lowerjawfront2.addOrReplaceChild("Lowerjawfront_r34", CubeListBuilder.create().texOffs(62, 3).mirror().addBox(-0.6015F, 0.9153F, 0.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.1699F, -2.2921F, 0.1879F, -0.1871F, 0.0434F));

		return LayerDefinition.create(meshdefinition, 73, 73);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}