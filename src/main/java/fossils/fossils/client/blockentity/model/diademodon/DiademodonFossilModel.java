package fossils.fossils.client.blockentity.model.diademodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DiademodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public DiademodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.Rightupperarm = this.body.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.body.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Rightthigh = this.body.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Leftthigh = this.body.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.9F, 0.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(55, 17).addBox(0.0F, -0.7949F, 4.9217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 14).addBox(0.0F, -0.9949F, 2.9217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 55).addBox(0.0F, -0.9949F, 0.9217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-0.5F, 0.0051F, -0.0783F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 7.5671F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = body.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, 6.3F, -0.1233F, -0.0975F, -0.9103F));

		PartDefinition Bodymiddle_r2 = body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(26, 29).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, 6.3F, -0.1528F, -0.0365F, -0.4772F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(30, 2).mirror().addBox(-2.4396F, -1.3192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 4.3F, -0.0515F, -0.1299F, -1.3493F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(31, 19).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 4.3F, -0.1095F, -0.0867F, -0.8243F));

		PartDefinition Bodymiddle_r5 = body.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(31, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 4.3F, -0.1358F, -0.0325F, -0.3905F));

		PartDefinition Bodymiddle_r6 = body.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(9, 19).mirror().addBox(-3.4396F, -1.3192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 2.3F, -0.0385F, -0.0974F, -1.2809F));

		PartDefinition Bodymiddle_r7 = body.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(16, 33).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 2.3F, -0.0821F, -0.0651F, -0.7565F));

		PartDefinition Bodymiddle_r8 = body.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(7, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 2.3F, -0.1018F, -0.0244F, -0.3216F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(29, 35).mirror().addBox(-0.49F, -0.8594F, -0.103F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 3.0382F, -10.0305F, 1.7541F, 0.0F, 0.2182F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.49F, -2.608F, 2.1236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 3.0382F, -10.0305F, 1.213F, 0.0F, 0.2182F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.49F, -0.7347F, 1.8733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 3.0382F, -10.0305F, 1.8326F, 0.0F, 0.2182F));

		PartDefinition Bodymiddle_r9 = body.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(31, 41).mirror().addBox(-1.0107F, 0.0446F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5382F, -11.5305F, 0.46F, 0.1062F, -0.106F));

		PartDefinition Bodymiddle_r10 = body.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(40, 43).mirror().addBox(-1.9348F, -0.3868F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5382F, -11.5305F, 0.3794F, 0.2865F, -0.5118F));

		PartDefinition Bodymiddle_r11 = body.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(20, 44).mirror().addBox(-2.4822F, -1.3024F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5382F, -11.5305F, 0.1846F, 0.4361F, -1.0498F));

		PartDefinition Bodymiddle_r12 = body.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(5, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, 0.3F, -0.0679F, -0.0163F, -0.2351F));

		PartDefinition Bodymiddle_r13 = body.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(52, 8).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, 0.3F, -0.0547F, -0.0434F, -0.6708F));

		PartDefinition Bodymiddle_r14 = body.addOrReplaceChild("Bodymiddle_r14", CubeListBuilder.create().texOffs(48, 13).mirror().addBox(-4.4396F, -1.3192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, 0.3F, -0.0256F, -0.0649F, -1.1947F));

		PartDefinition Bodymiddle_r15 = body.addOrReplaceChild("Bodymiddle_r15", CubeListBuilder.create().texOffs(52, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -1.7F, 0.017F, 0.0041F, -0.1832F));

		PartDefinition Bodymiddle_r16 = body.addOrReplaceChild("Bodymiddle_r16", CubeListBuilder.create().texOffs(52, 24).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -1.7F, 0.0137F, 0.0109F, -0.6195F));

		PartDefinition Bodymiddle_r17 = body.addOrReplaceChild("Bodymiddle_r17", CubeListBuilder.create().texOffs(42, 9).mirror().addBox(-5.4396F, -1.3192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -1.7F, 0.0064F, 0.0162F, -1.1431F));

		PartDefinition Bodymiddle_r18 = body.addOrReplaceChild("Bodymiddle_r18", CubeListBuilder.create().texOffs(28, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -3.7F, 0.017F, 0.0041F, -0.1832F));

		PartDefinition Bodymiddle_r19 = body.addOrReplaceChild("Bodymiddle_r19", CubeListBuilder.create().texOffs(52, 45).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -3.7F, 0.0137F, 0.0109F, -0.6195F));

		PartDefinition Bodymiddle_r20 = body.addOrReplaceChild("Bodymiddle_r20", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-6.4396F, -1.3192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -3.7F, 0.0064F, 0.0162F, -1.1431F));

		PartDefinition Bodymiddle_r21 = body.addOrReplaceChild("Bodymiddle_r21", CubeListBuilder.create().texOffs(52, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -5.7F, 0.017F, 0.0041F, -0.1483F));

		PartDefinition Bodymiddle_r22 = body.addOrReplaceChild("Bodymiddle_r22", CubeListBuilder.create().texOffs(9, 53).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -5.7F, 0.0137F, 0.0109F, -0.5846F));

		PartDefinition Bodymiddle_r23 = body.addOrReplaceChild("Bodymiddle_r23", CubeListBuilder.create().texOffs(39, 24).mirror().addBox(-6.4396F, -1.3192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -5.7F, 0.0064F, 0.0162F, -1.1082F));

		PartDefinition Bodymiddle_r24 = body.addOrReplaceChild("Bodymiddle_r24", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-1.1341F, 0.5586F, -0.58F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4618F, -9.6305F, 0.2549F, 0.0605F, -0.1406F));

		PartDefinition Bodymiddle_r25 = body.addOrReplaceChild("Bodymiddle_r25", CubeListBuilder.create().texOffs(19, 53).mirror().addBox(-2.2639F, 0.027F, -0.58F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4618F, -9.6305F, 0.2067F, 0.1618F, -0.5679F));

		PartDefinition Bodymiddle_r26 = body.addOrReplaceChild("Bodymiddle_r26", CubeListBuilder.create().texOffs(51, 6).mirror().addBox(-4.9741F, -1.1086F, -0.58F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4618F, -9.6305F, 0.0979F, 0.2432F, -1.0963F));

		PartDefinition Bodymiddle_r27 = body.addOrReplaceChild("Bodymiddle_r27", CubeListBuilder.create().texOffs(46, 11).mirror().addBox(-5.4427F, -1.3179F, -0.5456F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1618F, -7.6305F, 0.058F, 0.1461F, -1.104F));

		PartDefinition Bodymiddle_r28 = body.addOrReplaceChild("Bodymiddle_r28", CubeListBuilder.create().texOffs(53, 33).mirror().addBox(-1.9084F, -0.42F, -0.5456F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1618F, -7.6305F, 0.1233F, 0.0975F, -0.5787F));

		PartDefinition Bodymiddle_r29 = body.addOrReplaceChild("Bodymiddle_r29", CubeListBuilder.create().texOffs(50, 53).mirror().addBox(-1.0008F, 0.0032F, -0.5456F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1618F, -7.6305F, 0.1528F, 0.0365F, -0.1456F));

		PartDefinition Hips_r1 = body.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(50, 20).mirror().addBox(-0.5F, 1.552F, -0.1759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.5651F, 10.0771F, 0.8901F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = body.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(47, 48).mirror().addBox(-0.5F, -0.3369F, 0.0804F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(36, 33).mirror().addBox(-0.5F, -0.5369F, -0.9196F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.5651F, 10.0771F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = body.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.5F, -0.2391F, -4.8457F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.5651F, 13.0771F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = body.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(35, 14).mirror().addBox(-0.5F, -0.9121F, -0.1791F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.1349F, 8.5771F, -0.8901F, 0.0F, 0.0F));

		PartDefinition Hips_r5 = body.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(36, 33).addBox(-1.5F, -0.5369F, -0.9196F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(47, 48).addBox(-0.5F, -0.3369F, 0.0804F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0F, 0.5651F, 10.0771F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Hips_r6 = body.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(35, 14).addBox(-0.5F, -0.9121F, -0.1791F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0F, -0.1349F, 8.5771F, -0.8901F, 0.0F, 0.0F));

		PartDefinition Hips_r7 = body.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.2391F, -4.8457F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.0F, 0.5651F, 13.0771F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Hips_r8 = body.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-0.1F, 0.556F, -0.3485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 2.2255F, 11.0915F, -1.4748F, 0.0F, -0.3142F));

		PartDefinition Hips_r9 = body.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(20, 17).mirror().addBox(-0.1F, 2.2844F, -0.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 2.2255F, 11.0915F, 0.5672F, 0.0F, -0.3142F));

		PartDefinition Hips_r10 = body.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(43, 43).mirror().addBox(-0.1F, 1.5392F, -0.9576F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 2.2255F, 11.0915F, -0.2182F, 0.0F, -0.3142F));

		PartDefinition Hips_r11 = body.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.1F, 0.8211F, -1.7899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 2.2255F, 11.0915F, 1.3352F, 0.0F, -0.3142F));

		PartDefinition Hips_r12 = body.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(25, 41).mirror().addBox(-0.1F, -0.8161F, -0.9955F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 2.2255F, 11.0915F, -1.0036F, 0.0F, -0.3142F));

		PartDefinition Hips_r13 = body.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(52, 0).addBox(-0.9F, 0.556F, -0.3485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1F, 2.2255F, 11.0915F, -1.4748F, 0.0F, 0.3142F));

		PartDefinition Hips_r14 = body.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(25, 41).addBox(-0.9F, -0.8161F, -0.9955F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 2.2255F, 11.0915F, -1.0036F, 0.0F, 0.3142F));

		PartDefinition Hips_r15 = body.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(0, 19).addBox(-0.9F, 0.8211F, -1.7899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1F, 2.2255F, 11.0915F, 1.3352F, 0.0F, 0.3142F));

		PartDefinition Hips_r16 = body.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(20, 17).addBox(-0.9F, 2.2844F, -0.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 2.2255F, 11.0915F, 0.5672F, 0.0F, 0.3142F));

		PartDefinition Hips_r17 = body.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(43, 43).addBox(-0.9F, 1.5392F, -0.9576F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1F, 2.2255F, 11.0915F, -0.2182F, 0.0F, 0.3142F));

		PartDefinition Hips_r18 = body.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(50, 20).addBox(-0.5F, 1.552F, -0.1759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0F, 0.5651F, 10.0771F, 0.8901F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r30 = body.addOrReplaceChild("Bodymiddle_r30", CubeListBuilder.create().texOffs(20, 44).addBox(1.4822F, -1.3024F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5382F, -11.5305F, 0.1846F, -0.4361F, 1.0498F));

		PartDefinition Bodymiddle_r31 = body.addOrReplaceChild("Bodymiddle_r31", CubeListBuilder.create().texOffs(40, 43).addBox(0.9348F, -0.3868F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5382F, -11.5305F, 0.3794F, -0.2865F, 0.5118F));

		PartDefinition Bodymiddle_r32 = body.addOrReplaceChild("Bodymiddle_r32", CubeListBuilder.create().texOffs(31, 41).addBox(0.0107F, 0.0446F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5382F, -11.5305F, 0.46F, -0.1062F, 0.106F));

		PartDefinition Bodymiddle_r33 = body.addOrReplaceChild("Bodymiddle_r33", CubeListBuilder.create().texOffs(51, 6).addBox(1.9741F, -1.1086F, -0.58F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4618F, -9.6305F, 0.0979F, -0.2432F, 1.0963F));

		PartDefinition Bodymiddle_r34 = body.addOrReplaceChild("Bodymiddle_r34", CubeListBuilder.create().texOffs(19, 53).addBox(1.2639F, 0.027F, -0.58F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4618F, -9.6305F, 0.2067F, -0.1618F, 0.5679F));

		PartDefinition Bodymiddle_r35 = body.addOrReplaceChild("Bodymiddle_r35", CubeListBuilder.create().texOffs(14, 53).addBox(0.1341F, 0.5586F, -0.58F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4618F, -9.6305F, 0.2549F, -0.0605F, 0.1406F));

		PartDefinition Bodymiddle_r36 = body.addOrReplaceChild("Bodymiddle_r36", CubeListBuilder.create().texOffs(26, 29).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, 6.3F, -0.1528F, 0.0365F, 0.4772F));

		PartDefinition Bodymiddle_r37 = body.addOrReplaceChild("Bodymiddle_r37", CubeListBuilder.create().texOffs(0, 29).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, 6.3F, -0.1233F, 0.0975F, 0.9103F));

		PartDefinition Bodymiddle_r38 = body.addOrReplaceChild("Bodymiddle_r38", CubeListBuilder.create().texOffs(31, 21).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 4.3F, -0.1358F, 0.0325F, 0.3905F));

		PartDefinition Bodymiddle_r39 = body.addOrReplaceChild("Bodymiddle_r39", CubeListBuilder.create().texOffs(31, 19).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 4.3F, -0.1095F, 0.0867F, 0.8243F));

		PartDefinition Bodymiddle_r40 = body.addOrReplaceChild("Bodymiddle_r40", CubeListBuilder.create().texOffs(30, 2).addBox(1.4396F, -1.3192F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 4.3F, -0.0515F, 0.1299F, 1.3493F));

		PartDefinition Bodymiddle_r41 = body.addOrReplaceChild("Bodymiddle_r41", CubeListBuilder.create().texOffs(7, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 2.3F, -0.1018F, 0.0244F, 0.3216F));

		PartDefinition Bodymiddle_r42 = body.addOrReplaceChild("Bodymiddle_r42", CubeListBuilder.create().texOffs(16, 33).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 2.3F, -0.0821F, 0.0651F, 0.7565F));

		PartDefinition Bodymiddle_r43 = body.addOrReplaceChild("Bodymiddle_r43", CubeListBuilder.create().texOffs(9, 19).addBox(1.4396F, -1.3192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 2.3F, -0.0385F, 0.0974F, 1.2809F));

		PartDefinition Bodymiddle_r44 = body.addOrReplaceChild("Bodymiddle_r44", CubeListBuilder.create().texOffs(48, 13).addBox(1.4396F, -1.3192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, 0.3F, -0.0256F, 0.0649F, 1.1947F));

		PartDefinition Bodymiddle_r45 = body.addOrReplaceChild("Bodymiddle_r45", CubeListBuilder.create().texOffs(52, 8).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, 0.3F, -0.0547F, 0.0434F, 0.6708F));

		PartDefinition Bodymiddle_r46 = body.addOrReplaceChild("Bodymiddle_r46", CubeListBuilder.create().texOffs(5, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, 0.3F, -0.0679F, 0.0163F, 0.2351F));

		PartDefinition Bodymiddle_r47 = body.addOrReplaceChild("Bodymiddle_r47", CubeListBuilder.create().texOffs(42, 9).addBox(1.4396F, -1.3192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -1.7F, 0.0064F, -0.0162F, 1.1431F));

		PartDefinition Bodymiddle_r48 = body.addOrReplaceChild("Bodymiddle_r48", CubeListBuilder.create().texOffs(52, 24).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -1.7F, 0.0137F, -0.0109F, 0.6195F));

		PartDefinition Bodymiddle_r49 = body.addOrReplaceChild("Bodymiddle_r49", CubeListBuilder.create().texOffs(52, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -1.7F, 0.017F, -0.0041F, 0.1832F));

		PartDefinition Bodymiddle_r50 = body.addOrReplaceChild("Bodymiddle_r50", CubeListBuilder.create().texOffs(21, 0).addBox(1.4396F, -1.3192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -3.7F, 0.0064F, -0.0162F, 1.1431F));

		PartDefinition Bodymiddle_r51 = body.addOrReplaceChild("Bodymiddle_r51", CubeListBuilder.create().texOffs(52, 45).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -3.7F, 0.0137F, -0.0109F, 0.6195F));

		PartDefinition Bodymiddle_r52 = body.addOrReplaceChild("Bodymiddle_r52", CubeListBuilder.create().texOffs(28, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -3.7F, 0.017F, -0.0041F, 0.1832F));

		PartDefinition Bodymiddle_r53 = body.addOrReplaceChild("Bodymiddle_r53", CubeListBuilder.create().texOffs(39, 24).addBox(1.4396F, -1.3192F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -5.7F, 0.0064F, -0.0162F, 1.1082F));

		PartDefinition Bodymiddle_r54 = body.addOrReplaceChild("Bodymiddle_r54", CubeListBuilder.create().texOffs(9, 53).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -5.7F, 0.0137F, -0.0109F, 0.5846F));

		PartDefinition Bodymiddle_r55 = body.addOrReplaceChild("Bodymiddle_r55", CubeListBuilder.create().texOffs(52, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -5.7F, 0.017F, -0.0041F, 0.1483F));

		PartDefinition Bodymiddle_r56 = body.addOrReplaceChild("Bodymiddle_r56", CubeListBuilder.create().texOffs(50, 53).addBox(0.0008F, 0.0032F, -0.5456F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1618F, -7.6305F, 0.1528F, -0.0365F, 0.1456F));

		PartDefinition Bodymiddle_r57 = body.addOrReplaceChild("Bodymiddle_r57", CubeListBuilder.create().texOffs(53, 33).addBox(0.9084F, -0.42F, -0.5456F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1618F, -7.6305F, 0.1233F, -0.0975F, 0.5787F));

		PartDefinition Bodymiddle_r58 = body.addOrReplaceChild("Bodymiddle_r58", CubeListBuilder.create().texOffs(46, 11).addBox(1.4427F, -1.3179F, -0.5456F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1618F, -7.6305F, 0.058F, -0.1461F, 1.104F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 53).addBox(0.0F, -1.5228F, -4.9582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 53).addBox(0.0F, -1.7728F, -2.9582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 53).addBox(0.0F, -2.0728F, -0.9582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 28).addBox(-0.5F, -0.4728F, -4.9582F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4618F, -7.1305F, 0.192F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(0, 42).addBox(-0.51F, -0.7347F, 1.8733F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.0382F, -10.0305F, 1.8326F, 0.0F, -0.2182F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(0, 52).addBox(-0.51F, -2.608F, 2.1236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0F, 3.0382F, -10.0305F, 1.213F, 0.0F, -0.2182F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(29, 35).addBox(-0.51F, -0.8594F, -0.103F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.0F, 3.0382F, -10.0305F, 1.7541F, 0.0F, -0.2182F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8368F, 0.3695F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(35, 7).addBox(0.0F, -0.275F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 41).addBox(0.0F, -0.475F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 52).addBox(0.0F, -0.675F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, 0.925F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.8618F, -7.1305F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(42, 13).addBox(0.0F, -0.975F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 43).addBox(0.0F, -0.975F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 49).addBox(0.0F, -0.975F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(-0.5F, 0.025F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9618F, 0.8695F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = body.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(0, 47).addBox(-0.4857F, -0.9655F, -0.5647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(50, 29).addBox(-0.4857F, -0.4655F, 1.4353F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 0).addBox(-0.4857F, -0.9655F, 3.4353F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.49F, 3.4F, -9.4F, -0.6443F, 0.3162F, -0.2982F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0143F, -0.0298F, 4.6356F, 1.1059F, -0.6879F, -0.1544F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(42, 48).addBox(-1.0F, -2.3F, -1.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 47).addBox(0.0F, -2.9F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0592F, 0.1044F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(34, 28).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8559F, 0.1488F, 0.0787F, -0.0637F, -0.0213F));

		PartDefinition Leftupperarm = body.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.5143F, -0.9655F, -0.5647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 29).mirror().addBox(-0.5143F, -0.4655F, 1.4353F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 0).mirror().addBox(-0.5143F, -0.9655F, 3.4353F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.49F, 3.4F, -9.4F, -1.7122F, -0.4925F, 0.5701F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0143F, -0.0298F, 4.6356F, 0.8005F, 0.6879F, 0.1544F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(42, 48).mirror().addBox(0.0F, -2.3F, -1.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 47).mirror().addBox(-1.0F, -2.9F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0592F, 0.1044F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(34, 28).mirror().addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.8559F, 0.1488F, 0.648F, -0.0355F, 0.165F));

		PartDefinition Rightthigh = body.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(9, 45).addBox(0.0F, -0.3462F, -0.4685F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 2.2F, 10.7F, -0.2206F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(30, 0).addBox(-0.3F, -0.8008F, -0.3916F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F))
				.texOffs(31, 21).addBox(-1.3F, -0.8008F, -0.3916F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 5.3538F, -0.0685F, 0.0609F, 0.0F, 0.0F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(24, 12).addBox(-1.5F, -0.5F, -3.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0729F, 4.3327F, 0.9458F, 0.0643F, -0.0354F));

		PartDefinition Leftthigh = body.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(9, 45).mirror().addBox(-1.0F, -0.3462F, -0.4685F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 2.2F, 10.7F, -0.7442F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-0.7F, -0.8008F, -0.3916F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(31, 21).mirror().addBox(0.3F, -0.8008F, -0.3916F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 5.3538F, -0.0685F, -0.7245F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(24, 12).mirror().addBox(-1.5F, -0.5F, -3.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.0729F, 4.3327F, 1.4694F, 0.0637F, 0.2122F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3875F, -12.2136F, 0.2788F, -0.4323F, -0.0691F));

		PartDefinition cube_r6 = neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(50, 55).addBox(0.0F, -0.9556F, -1.8848F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 54).addBox(0.0F, -0.9556F, -5.8848F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 55).addBox(0.0F, -0.9556F, -3.8848F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 16).addBox(-0.5F, -0.1556F, -5.8848F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2703F, 0.2419F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r59 = neck.addOrReplaceChild("Bodymiddle_r59", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-1.0107F, 0.0446F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9493F, -3.3169F, 0.4901F, 0.1241F, -0.8443F));

		PartDefinition Bodymiddle_r60 = neck.addOrReplaceChild("Bodymiddle_r60", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(-1.9348F, -0.3868F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9493F, -3.3169F, 0.4008F, 0.3148F, -1.2473F));

		PartDefinition Bodymiddle_r61 = neck.addOrReplaceChild("Bodymiddle_r61", CubeListBuilder.create().texOffs(0, 23).addBox(0.0107F, 0.0446F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9493F, -3.3169F, 0.4901F, -0.1241F, 0.8443F));

		PartDefinition Bodymiddle_r62 = neck.addOrReplaceChild("Bodymiddle_r62", CubeListBuilder.create().texOffs(20, 20).addBox(0.9348F, -0.3868F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9493F, -3.3169F, 0.4008F, -0.3148F, 1.2473F));

		PartDefinition Bodymiddle_r63 = neck.addOrReplaceChild("Bodymiddle_r63", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-1.0107F, 0.0446F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3493F, -1.3169F, 0.4901F, 0.1241F, -0.5389F));

		PartDefinition Bodymiddle_r64 = neck.addOrReplaceChild("Bodymiddle_r64", CubeListBuilder.create().texOffs(8, 27).mirror().addBox(-1.9348F, -0.3868F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3493F, -1.3169F, 0.4008F, 0.3148F, -0.9418F));

		PartDefinition Bodymiddle_r65 = neck.addOrReplaceChild("Bodymiddle_r65", CubeListBuilder.create().texOffs(0, 27).addBox(0.0107F, 0.0446F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3493F, -1.3169F, 0.4901F, -0.1241F, 0.5389F));

		PartDefinition Bodymiddle_r66 = neck.addOrReplaceChild("Bodymiddle_r66", CubeListBuilder.create().texOffs(8, 27).addBox(0.9348F, -0.3868F, -0.5176F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3493F, -1.3169F, 0.4008F, -0.3148F, 0.9418F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5899F, -4.5946F, -0.2562F, -0.2955F, 0.2874F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 54).addBox(-1.8F, -1.0496F, 0.0837F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(55, 26).addBox(-2.05F, -1.0496F, 0.0837F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 55).addBox(0.45F, -1.0496F, 0.0837F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 1.0968F, -12.2224F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 15).mirror().addBox(-0.35F, -0.8996F, 0.0337F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 15).addBox(1.95F, -0.8996F, 0.0337F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 1.2824F, -9.9909F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(29, 54).mirror().addBox(-0.35F, -5.5996F, -6.9913F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 54).addBox(1.95F, -5.5996F, -6.9913F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 5.6968F, -4.0224F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 26).addBox(-0.5F, -2.1663F, -1.0838F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7166F, -4.5622F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(38, 39).addBox(-1.5F, -1.0008F, 0.0132F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 0).mirror().addBox(-1.2F, -1.8008F, 2.0132F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(11, 0).addBox(-0.8F, -1.8008F, 2.0132F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6946F, -12.4875F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 0).addBox(-1.5F, -0.9924F, 0.0174F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4081F, -6.5312F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(47, 38).addBox(-1.5F, -1.0008F, 0.0132F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.6946F, -12.4875F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(22, 3).addBox(-0.5F, 0.2492F, -1.4368F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(35, 48).addBox(-1.0F, 0.2492F, 3.5632F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.0232F, -5.4562F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(39, 20).addBox(-1.5F, -0.0008F, 0.0132F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.685F, -12.177F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(-3.7282F, -0.337F, -0.144F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8306F, -1.8334F, -1.4096F, -0.4743F, 0.4331F, -0.5877F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(17, 40).mirror().addBox(-2.9205F, -2.3396F, -0.4086F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7172F, 1.3544F, -1.299F, -0.1906F, 0.5077F, -0.2919F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 10).mirror().addBox(-3.1755F, -1.2059F, -0.7535F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.7172F, -0.2456F, -0.399F, 0.1559F, 0.2898F, -2.894F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(14, 44).mirror().addBox(-0.5149F, -2.5568F, 2.5081F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 30).mirror().addBox(-0.5149F, -1.9568F, 2.5081F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.4609F, -0.9654F, -5.8747F, -0.5185F, -0.2188F, -0.0067F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(18, 26).mirror().addBox(0.0221F, -0.7367F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4609F, -0.9654F, -5.8747F, 0.262F, -0.426F, 0.1261F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(42, 4).mirror().addBox(-0.1227F, -0.028F, 0.0105F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4609F, -1.8654F, -5.2747F, -0.0347F, -0.426F, 0.1261F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(34, 43).mirror().addBox(0.0221F, -0.2466F, -0.1417F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.4609F, -0.9654F, -5.8747F, -0.0521F, -0.426F, 0.1261F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(35, 7).mirror().addBox(-0.5149F, -1.1798F, 1.537F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.4609F, -0.9654F, -5.8747F, -0.5359F, -0.2188F, -0.0067F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(14, 49).mirror().addBox(-0.6F, -0.3F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8531F, 1.1886F, -5.4077F, -1.1175F, -1.2033F, 0.4123F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(10, 24).mirror().addBox(-0.0371F, -0.524F, -4.854F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3609F, 0.8346F, -6.1747F, -0.3542F, -0.9167F, 0.1991F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(49, 41).mirror().addBox(-0.7711F, -0.7989F, -1.3842F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(8, 38).mirror().addBox(-0.7461F, -1.4989F, -1.3842F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6106F, -0.3108F, -6.062F, -0.1765F, -1.1364F, 0.149F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(28, 47).mirror().addBox(0.1109F, -0.0428F, -1.8261F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5609F, -1.8654F, -7.1747F, -0.209F, -1.3672F, 0.4536F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(21, 19).mirror().addBox(-0.1F, -0.298F, -0.8635F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.685F, -10.277F, 0.1595F, -0.1724F, -0.0276F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(21, 19).addBox(-1.9F, -0.298F, -0.8635F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9F, -0.685F, -10.277F, 0.1595F, 0.1724F, 0.0276F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(49, 41).addBox(-0.2289F, -0.7989F, -1.3842F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(8, 38).addBox(-0.2539F, -1.4989F, -1.3842F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6106F, -0.3108F, -6.062F, -0.1765F, 1.1364F, -0.149F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(34, 43).addBox(-1.0221F, -0.2466F, -0.1417F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.4609F, -0.9654F, -5.8747F, -0.0521F, 0.426F, -0.1261F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(42, 4).addBox(-0.8773F, -0.028F, 0.0105F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.4609F, -1.8654F, -5.2747F, -0.0347F, 0.426F, -0.1261F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(18, 26).addBox(-1.0221F, -0.7367F, -0.1854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4609F, -0.9654F, -5.8747F, 0.262F, 0.426F, -0.1261F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(14, 44).addBox(-0.4851F, -2.5568F, 2.5081F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(44, 30).addBox(-0.4851F, -1.9568F, 2.5081F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.4609F, -0.9654F, -5.8747F, -0.5185F, 0.2188F, 0.0067F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(10, 10).addBox(0.1755F, -1.2059F, -0.7535F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.7172F, -0.2456F, -0.399F, 0.1559F, -0.2898F, 2.894F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(44, 26).addBox(-0.2718F, -0.337F, -0.144F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8306F, -1.8334F, -1.4096F, -0.4743F, -0.4331F, 0.5877F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(17, 40).addBox(-1.0795F, -2.3396F, -0.4086F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7172F, 1.3544F, -1.299F, -0.1906F, -0.5077F, 0.2919F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(35, 7).addBox(-0.4851F, -1.1798F, 1.537F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.4609F, -0.9654F, -5.8747F, -0.5359F, 0.2188F, 0.0067F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(10, 24).addBox(-0.9629F, -0.524F, -4.854F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3609F, 0.8346F, -6.1747F, -0.3542F, 0.9167F, -0.1991F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(28, 47).addBox(-1.1109F, -0.0428F, -1.8261F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5609F, -1.8654F, -7.1747F, -0.209F, 1.3672F, -0.4536F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(14, 49).addBox(-0.4F, -0.3F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8531F, 1.1886F, -5.4077F, -1.1175F, 1.2033F, -0.4123F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create().texOffs(48, 1).addBox(1.15F, 0.1768F, -8.475F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(48, 1).mirror().addBox(-1.15F, 0.1768F, -8.475F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0009F, -1.8422F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r42 = lowerjaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(26, 26).mirror().addBox(-1.4F, 0.9992F, 0.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(47, 35).addBox(-1.5F, -0.0008F, 0.0132F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(26, 26).addBox(0.4F, 0.9992F, 0.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.1471F, -10.6221F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r43 = lowerjaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(22, 11).mirror().addBox(-1.5F, -0.0083F, -1.3459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(22, 11).addBox(0.5F, -0.0083F, -1.3459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.3291F, -8.584F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r44 = lowerjaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(21, 2).mirror().addBox(-1.5F, 0.113F, -0.6341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(21, 2).addBox(0.5F, 0.113F, -0.6341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.4291F, -8.984F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r45 = lowerjaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(7, 54).mirror().addBox(-0.35F, -0.6746F, -1.7913F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 54).addBox(1.95F, -0.6746F, -1.7913F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 0.1014F, -8.4837F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r46 = lowerjaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-2.5F, -1.9718F, -0.0727F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(0, 34).addBox(3.1F, -1.9718F, -0.0727F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.8F, 2.9204F, -2.5269F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r47 = lowerjaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(42, 13).mirror().addBox(-3.3F, -1.0718F, -0.3727F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(42, 13).addBox(2.3F, -1.0718F, -0.3727F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.9204F, -2.5269F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r48 = lowerjaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-1.6F, 3.4992F, 0.0132F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-0.6F, -0.0008F, 0.0132F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(0, 10).addBox(2.2F, 3.4992F, 0.0132F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 0).addBox(1.2F, -0.0008F, 0.0132F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.8F, 2.4326F, -9.09F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r49 = lowerjaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(54, 41).addBox(-1.0F, -0.5008F, 0.5132F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(24, 35).addBox(-1.5F, -0.0008F, 0.2632F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1291F, -10.784F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.304F, 13.2403F, -0.4152F, -0.3215F, 0.1384F));

		PartDefinition cube_r50 = tail.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(34, 28).addBox(0.5F, -0.1682F, 5.3305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 13).addBox(0.5F, -0.1682F, 3.3305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 31).addBox(0.0F, 0.5318F, 2.3305F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.0507F, -2.4067F, 0.0F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0849F, 4.8216F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r51 = tail2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(10, 55).addBox(1.0F, -0.0738F, 8.7576F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 55).addBox(1.0F, -0.1738F, 6.7576F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 55).addBox(1.0F, -0.2738F, 4.7576F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 33).addBox(0.5F, 0.3262F, 4.7576F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0F, -0.8931F, -4.7329F, 0.0F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1573F, 5.0246F, 0.1392F, -0.346F, -0.0475F));

		PartDefinition cube_r52 = tail3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 19).addBox(0.5F, 1.3214F, 4.7719F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, -1.6972F, -4.8697F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 60, 60);
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