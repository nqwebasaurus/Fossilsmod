package fossils.fossils.client.blockentity.model.riojasuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RiojasuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hip;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public RiojasuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hip = this.fossil.getChild("hip");
		this.leftLeg = this.hip.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hip.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body = this.hip.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hip.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.7F, 1.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-0.2F, -0.6754F, -1.4415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.8955F, 0.526F, -1.1868F, 0.5411F, 0.0F));

		PartDefinition cube_r2 = hip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 46).mirror().addBox(-0.5F, -0.9406F, -1.8601F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(25, 46).addBox(3.5F, -0.9406F, -1.8601F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.0F, 1.3057F, 0.263F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.2F, 2.3353F, -0.6626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.0943F, -1.137F, -0.3682F, -0.2068F, -0.3961F));

		PartDefinition cube_r4 = hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 53).mirror().addBox(-0.2F, -0.7094F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.0943F, -1.137F, -0.9092F, -0.2068F, -0.3961F));

		PartDefinition cube_r5 = hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 14).mirror().addBox(-0.2F, -0.2457F, -0.5274F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, -0.0943F, -1.137F, -0.4205F, -0.2068F, -0.3961F));

		PartDefinition cube_r6 = hip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 29).mirror().addBox(-0.2F, -0.3563F, -0.2722F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.8955F, 0.526F, -0.3403F, 0.5411F, 0.0F));

		PartDefinition cube_r7 = hip.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 40).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 40).addBox(3.5F, -0.7F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0943F, 0.263F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hip.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 37).mirror().addBox(0.0F, -0.3F, 0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(34, 37).addBox(4.0F, -0.3F, 0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F))
				.texOffs(27, 17).addBox(2.5F, -1.5F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(2.0F, -1.6F, -0.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F))
				.texOffs(23, 10).addBox(2.0F, -0.2F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -1.5F, -1.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hip.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 30).mirror().addBox(0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 30).addBox(2.5F, -0.2F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0943F, 0.263F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hip.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 50).addBox(-0.8F, 2.3353F, -0.6626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(2.2F, -0.0943F, -1.137F, -0.3682F, 0.2068F, 0.3961F));

		PartDefinition cube_r11 = hip.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 0).addBox(-0.8F, -0.6754F, -1.4415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(2.3F, 0.8955F, 0.526F, -1.1868F, -0.5411F, 0.0F));

		PartDefinition cube_r12 = hip.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 29).addBox(-0.8F, -0.3563F, -0.2722F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3F, 0.8955F, 0.526F, -0.3403F, -0.5411F, 0.0F));

		PartDefinition cube_r13 = hip.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(38, 53).addBox(-0.8F, -0.7094F, -0.5393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(2.2F, -0.0943F, -1.137F, -0.9092F, 0.2068F, 0.3961F));

		PartDefinition cube_r14 = hip.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(9, 14).addBox(-0.8F, -0.2457F, -0.5274F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, -0.0943F, -1.137F, -0.4205F, 0.2068F, 0.3961F));

		PartDefinition cube_r15 = hip.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -1.0344F, -0.0776F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, 1.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftLeg = hip.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.0943F, 0.063F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(34, 51).addBox(0.0F, -0.0668F, -0.1185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 4.2F, -0.5F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(49, 44).addBox(0.0F, 0.0567F, -0.0194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3F, -0.8F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(14, 47).addBox(0.0F, -0.8F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.2F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(51, 28).addBox(-1.0F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(51, 11).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-1.0F, 1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.0F, 0.3F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(5, 50).addBox(0.0F, -1.8358F, -0.1507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.3F, -0.6F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(26, 35).addBox(-1.0F, -0.2F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7152F, 0.0765F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(34, 15).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.3F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightLeg = hip.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -0.0943F, 0.063F, -0.9638F, 0.0857F, -0.0467F));

		PartDefinition cube_r21 = rightLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(34, 51).mirror().addBox(-1.0F, -0.0668F, -0.1185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2F, -0.5F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r22 = rightLeg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(49, 44).mirror().addBox(-1.0F, 0.0567F, -0.0194F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3F, -0.8F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r23 = rightLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(14, 47).mirror().addBox(-1.0F, -0.8F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, -0.2F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(51, 28).mirror().addBox(0.0F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(51, 11).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 13).mirror().addBox(0.0F, 1.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.0F, 0.3F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(5, 50).mirror().addBox(-1.0F, -1.8358F, -0.1507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, -0.6F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-1.0F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(26, 35).mirror().addBox(-1.0F, -0.2F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.7152F, 0.0765F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(34, 15).mirror().addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, -2.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -1.7F, -0.0873F, 0.0435F, -0.0038F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.911F, -0.0029F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(31, 9).addBox(-0.5F, -1.9796F, -0.2032F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, -2.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -2.1F, -4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 15).addBox(-1.0F, -0.7F, -5.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.3F, -0.3F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 26).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -0.305F, 0.2027F, 0.1706F, -0.9471F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(5, 54).mirror().addBox(-2.5829F, -1.1494F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -0.305F, 0.1157F, 0.238F, -1.3695F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(10, 54).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -0.305F, 0.2586F, 0.0952F, -0.5312F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(47, 9).mirror().addBox(-3.5829F, -1.1494F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -2.305F, 0.1434F, 0.3211F, -1.2746F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(30, 54).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -2.305F, 0.2624F, 0.2354F, -0.8477F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(54, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -2.305F, 0.3387F, 0.131F, -0.4349F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(40, 37).mirror().addBox(-4.5829F, -1.1494F, -0.4787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -4.305F, 0.1548F, 0.3543F, -1.1835F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(43, 54).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -4.305F, 0.2868F, 0.2611F, -0.7545F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3096F, -4.305F, 0.371F, 0.1451F, -0.3432F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(54, 26).addBox(0.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -0.305F, 0.2027F, -0.1706F, 0.9471F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(10, 54).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -0.305F, 0.2586F, -0.0952F, 0.5312F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(5, 54).addBox(1.5829F, -1.1494F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -0.305F, 0.1157F, -0.238F, 1.3695F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(54, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -2.305F, 0.3387F, -0.131F, 0.4349F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(30, 54).addBox(0.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -2.305F, 0.2624F, -0.2354F, 0.8477F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(47, 9).addBox(1.5829F, -1.1494F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -2.305F, 0.1434F, -0.3211F, 1.2746F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(40, 37).addBox(1.5829F, -1.1494F, -0.4787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -4.305F, 0.1548F, -0.3543F, 1.1835F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(43, 54).addBox(0.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -4.305F, 0.2868F, -0.2611F, 0.7545F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3096F, -4.305F, 0.371F, -0.1451F, 0.3432F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -1.0F, -2.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3778F, -3.5911F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(37, 26).addBox(-1.0F, -0.1043F, 2.8928F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(37, 0).addBox(-1.5F, -0.1043F, -0.1072F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.6F, -6.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -5.8F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(0.0F, -0.7644F, -1.9503F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.1316F, -4.9486F, 0.9686F, -0.3776F, -0.4923F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(43, 51).mirror().addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 51).addBox(4.5F, 0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.1165F, -2.2417F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(38, 6).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(38, 6).addBox(4.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.5F, 2.0316F, -3.8486F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -0.7644F, -1.9503F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.1316F, -4.9486F, 0.9686F, 0.3776F, 0.4923F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(35, 54).addBox(0.0F, -1.8053F, 3.8267F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 13).addBox(0.0F, -1.8053F, 1.8267F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 55).addBox(0.0F, -1.8053F, -0.1733F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -4.7F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(53, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1096F, -0.505F, 0.3872F, 0.152F, -0.3233F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1096F, -0.505F, 0.2991F, 0.2739F, -0.7338F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-4.5829F, -1.1494F, -0.4787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1096F, -0.505F, 0.1607F, 0.3709F, -1.164F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(16, 25).mirror().addBox(-4.5829F, -1.1494F, -0.4787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.505F, 0.1849F, 0.4371F, -1.1195F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(53, 39).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.505F, 0.3492F, 0.3246F, -0.6841F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(53, 8).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4096F, -2.505F, 0.4522F, 0.1796F, -0.2777F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(25, 31).mirror().addBox(-3.5829F, -1.1494F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8096F, -4.505F, 0.2383F, 0.5686F, -1.2159F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8096F, -4.505F, 0.4551F, 0.4236F, -0.7675F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(35, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8096F, -4.505F, 0.5843F, 0.2323F, -0.3728F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(25, 31).addBox(1.5829F, -1.1494F, -0.4787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8096F, -4.505F, 0.2383F, -0.5686F, 1.2159F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(52, 0).addBox(0.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8096F, -4.505F, 0.4551F, -0.4236F, 0.7675F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(35, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8096F, -4.505F, 0.5843F, -0.2323F, 0.3728F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(16, 25).addBox(1.5829F, -1.1494F, -0.4787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.505F, 0.1849F, -0.4371F, 1.1195F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(53, 39).addBox(0.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.505F, 0.3492F, -0.3246F, 0.6841F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(53, 8).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4096F, -2.505F, 0.4522F, -0.1796F, 0.2777F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(53, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1096F, -0.505F, 0.3872F, -0.152F, 0.3233F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 54).addBox(0.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1096F, -0.505F, 0.2991F, -0.2739F, 0.7338F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(30, 0).addBox(1.5829F, -1.1494F, -0.4787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1096F, -0.505F, 0.1607F, -0.3709F, 1.164F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 7).addBox(-2.5F, -1.0195F, -4.0797F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3F, 0.4F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(11, 37).addBox(-1.5F, -0.1473F, -0.0108F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(37, 20).addBox(-1.0F, -0.1473F, 1.9892F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -5.2F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(19, 18).addBox(-0.5F, -0.5F, -5.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.5496F, -0.0742F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 3.9316F, -4.6486F, -0.436F, 0.1183F, -0.3146F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(22, 7).addBox(-0.1864F, -0.0404F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 15).addBox(-1.2864F, -0.0404F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2F, 4.4F, -0.5922F, -0.5523F, 0.2859F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(36, 32).addBox(-1.1F, -0.1F, -2.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7F, 0.5F, 2.4958F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-0.5F, -0.5496F, -0.0742F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.9316F, -4.6486F, -0.2248F, -0.3029F, 0.2692F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(22, 7).mirror().addBox(-0.8136F, -0.0404F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 15).mirror().addBox(0.2864F, -0.0404F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, 4.4F, -0.4877F, 0.4938F, 0.009F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(36, 32).mirror().addBox(-0.9F, -0.1F, -2.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7F, 0.5F, 2.4086F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -4.8F, -0.1242F, -0.1244F, 0.0589F));

		PartDefinition cube_r75 = neck2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(17, 55).addBox(0.0F, -2.0F, -1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 55).addBox(0.0F, -1.8F, -3.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 31).addBox(-0.5F, -0.5F, -3.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.7F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r76 = neck2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(42, 15).mirror().addBox(-2.5829F, -1.1494F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -1.705F, 0.0514F, 0.9149F, -1.5309F));

		PartDefinition cube_r77 = neck2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(25, 40).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -1.705F, 0.5227F, 0.7912F, -0.9148F));

		PartDefinition cube_r78 = neck2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(38, 11).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2096F, -1.705F, 0.7994F, 0.547F, -0.4764F));

		PartDefinition cube_r79 = neck2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(20, 37).mirror().addBox(-1.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5096F, -3.705F, 0.3436F, 0.9329F, -1.1497F));

		PartDefinition cube_r80 = neck2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(7, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5096F, -3.705F, 0.7549F, 0.7266F, -0.6014F));

		PartDefinition cube_r81 = neck2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(20, 37).addBox(0.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5096F, -3.705F, 0.3436F, -0.9329F, 1.1497F));

		PartDefinition cube_r82 = neck2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(7, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5096F, -3.705F, 0.7549F, -0.7266F, 0.6014F));

		PartDefinition cube_r83 = neck2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(42, 15).addBox(1.5829F, -1.1494F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -1.705F, 0.0514F, -0.9149F, 1.5309F));

		PartDefinition cube_r84 = neck2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(25, 40).addBox(0.9135F, -0.4062F, -0.4787F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -1.705F, 0.5227F, -0.7912F, 0.9148F));

		PartDefinition cube_r85 = neck2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(38, 11).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2096F, -1.705F, 0.7994F, -0.547F, 0.4764F));

		PartDefinition cube_r86 = neck2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(19, 0).addBox(-1.5F, 0.017F, -0.2371F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -4.0F, 0.2356F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(19, 39).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(56, 28).addBox(0.0F, -1.4F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.9F, 0.0381F, -0.1271F, -0.0918F));

		PartDefinition cube_r87 = neck.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(29, 23).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.2F, -1.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.6F, 0.011F, -0.4618F, -0.2149F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(15, 52).mirror().addBox(-1.1F, -0.2194F, -0.179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 17).mirror().addBox(-1.1F, 0.3806F, -0.179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6882F, -0.551F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(52, 41).mirror().addBox(-0.52F, -1.4122F, -0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(29, 51).mirror().addBox(-0.52F, -0.8122F, -0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.5032F, -5.2543F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(48, 52).mirror().addBox(-0.52F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.6032F, -4.9543F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-0.52F, 0.2382F, -0.7714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(52, 36).mirror().addBox(-0.52F, -0.2618F, -0.7714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.1032F, -4.0543F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(8, 23).mirror().addBox(-0.42F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.5918F, -2.5654F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(10, 51).mirror().addBox(-0.92F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.3314F, -2.1712F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(51, 2).mirror().addBox(-0.92F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(24, 50).mirror().addBox(-0.92F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.6302F, -2.1973F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(6, 40).mirror().addBox(-1.02F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 14).mirror().addBox(-0.91F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.32F, 0.3401F, -2.0716F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(53, 5).mirror().addBox(-0.83F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.6029F, -0.937F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(50, 23).mirror().addBox(-0.83F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2044F, -0.9022F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(29, 56).mirror().addBox(0.1F, 0.5002F, 0.1322F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.5118F, -5.451F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(50, 55).mirror().addBox(-1.2F, 1.3626F, -0.4936F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 53).mirror().addBox(-1.0F, 3.6626F, -0.9936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 48).mirror().addBox(-1.3F, 1.6626F, -0.9936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3F, 1.9118F, -0.151F, -1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(29, 56).addBox(-0.1F, 0.5002F, 0.1322F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 15).addBox(-1.0F, 0.0002F, -0.0678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.5118F, -5.451F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-1.0F, -0.9723F, 0.0212F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3F, 2.8118F, -4.151F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, -0.9723F, 0.0212F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 2.8118F, -4.151F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(25, 53).addBox(-1.0F, 0.0178F, -0.0001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 2.5118F, -5.651F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(53, 31).addBox(-1.0F, 0.0059F, -0.0605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8118F, -4.951F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(19, 48).addBox(-1.0F, -0.0114F, -0.0053F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.0882F, -2.651F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(41, 40).addBox(-1.0F, -0.0217F, -0.0312F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.7882F, -1.951F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(18, 44).addBox(-1.0F, 0.3806F, 0.0279F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(15, 52).addBox(0.1F, -0.2194F, -0.179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 17).addBox(0.1F, 0.3806F, -0.179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(32, 48).addBox(-1.0F, -1.0194F, 0.0279F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 29).addBox(-1.0F, -0.0194F, 0.0279F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6882F, -0.551F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(50, 55).addBox(1.2F, 1.3626F, -0.4936F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 48).addBox(0.3F, 1.6626F, -0.9936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(20, 53).addBox(0.0F, 3.6626F, -0.9936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.9118F, -0.151F, -1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(9, 42).addBox(-1.0F, -0.0374F, -1.9936F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.9118F, -0.151F, -1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(45, 19).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2118F, 0.249F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(24, 50).addBox(-0.08F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(51, 2).addBox(-0.08F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.2F, 0.6302F, -2.1973F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(52, 20).addBox(-0.48F, 0.2382F, -0.7714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(52, 36).addBox(-0.48F, -0.2618F, -0.7714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.4F, 2.1032F, -4.0543F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(52, 41).addBox(-0.48F, -1.4122F, -0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 51).addBox(-0.48F, -0.8122F, -0.2456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4F, 2.5032F, -5.2543F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(48, 52).addBox(-0.48F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.4F, 2.6032F, -4.9543F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(8, 23).addBox(-0.58F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 1.5918F, -2.5654F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(6, 40).addBox(0.02F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 14).addBox(-0.09F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.32F, 0.3401F, -2.0716F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(10, 51).addBox(-0.08F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.2F, 0.3314F, -2.1712F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(53, 5).addBox(-0.17F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2F, 0.6029F, -0.937F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 23).addBox(-0.17F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2F, 0.2044F, -0.9022F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(42, 45).addBox(-1.0F, -0.9F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.5F, 0.6545F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(33, 44).addBox(-1.0F, -0.0281F, -1.7268F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.9F, 1.5F, 1.1157F, 0.0F, 0.0F));

		PartDefinition cube_r121 = jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(42, 11).addBox(-1.0F, 0.0344F, 0.0341F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5526F, -3.0192F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r122 = jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(48, 38).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 0.6317F, -1.7248F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r123 = jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(53, 50).mirror().addBox(-0.5F, -0.2133F, -0.1903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false), PartPose.offsetAndRotation(-0.73F, -0.1683F, -2.7248F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(39, 48).mirror().addBox(-0.89F, -0.318F, 0.0335F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 48).addBox(0.89F, -0.318F, 0.0335F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(43, 25).addBox(-1.0F, -0.018F, 0.0335F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.5526F, -5.0192F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(53, 47).mirror().addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 56).mirror().addBox(-0.77F, -1.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 56).addBox(0.77F, -1.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 47).addBox(-0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0474F, -5.3192F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(47, 33).addBox(-1.0F, -1.0542F, -0.6689F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5719F, -4.6268F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(44, 5).addBox(-1.0F, -0.9462F, -1.0471F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5719F, -3.6268F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(7, 47).addBox(-1.0F, -0.97F, -0.9955F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8719F, -2.7268F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(53, 50).addBox(-0.5F, -0.2133F, -0.1903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(0.73F, -0.1683F, -2.7248F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(48, 38).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.73F, 0.6317F, -1.7248F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.9719F, -1.7268F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(31, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(26, 56).addBox(0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 56).addBox(0.0F, -1.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.4F, -0.3057F, -0.0416F, 0.0131F));

		PartDefinition cube_r132 = tail.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, 1.1F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 7).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r133 = tail.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(8, 23).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F))
				.texOffs(20, 56).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 10).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 56).addBox(0.0F, -0.7F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 4.0F, -0.1986F, -0.2569F, 0.0511F));

		PartDefinition cube_r134 = tail2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(55, 23).addBox(0.0F, 4.1F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, 2.1F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -4.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(7, 30).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(27, 17).addBox(-0.5F, -2.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(6, 56).addBox(0.0F, -1.6F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 56).addBox(0.0F, -1.6F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 5.0F, 0.2706F, -0.2527F, -0.0692F));

		PartDefinition cube_r135 = tail3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(35, 30).addBox(0.0F, 6.3F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 40).addBox(0.0F, 5.4F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -9.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(30, 3).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(56, 1).addBox(0.0F, -1.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.2568F, -0.1689F, -0.0441F));

		PartDefinition cube_r136 = tail4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(21, 25).addBox(-0.5F, -0.3F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.8F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(27, 7).addBox(0.0F, 7.4F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -13.0F, 0.576F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(13, 7).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.318F, 0.1347F, -0.03F));

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