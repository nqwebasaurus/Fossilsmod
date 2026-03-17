package fossils.fossils.client.blockentity.model.baryonyx;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BaryonyxFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart tail1;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail9;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public BaryonyxFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone3 = this.hips.getChild("bone3");
		this.bone4 = this.hips.getChild("bone4");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.tail1 = this.hips.getChild("tail1");
		this.tail = this.tail1.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail9 = this.tail3.getChild("tail9");
		this.tail4 = this.tail9.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.bone = this.tail1.getChild("bone");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck = this.neck3.getChild("neck");
		this.neck6 = this.neck.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.1032F, 4.8621F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 61).addBox(-0.003F, -0.1963F, -5.8779F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.5759F, 1.7568F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 49).addBox(0.0F, 0.1072F, -0.0906F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.9033F, 1.6727F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(122, 46).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2318F, -3.2726F, 0.1712F, 0.1479F, -0.6302F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(122, 46).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2318F, -3.2726F, 0.1712F, -0.1479F, 0.6302F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.9822F, 0.3974F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -4.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5568F, -6.0778F, 3.8392F, 0.0436F, 0.0F, 0.1309F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(93, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.269F, 0.2687F, -0.0564F, -0.3919F, -0.0116F, -0.4027F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(102, 0).addBox(-1.2232F, -0.337F, 1.9624F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.703F, -0.6739F, -3.9628F, -0.261F, -0.0116F, -0.4027F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(77, 63).addBox(-0.5827F, 4.0931F, -6.8175F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, -0.222F, -0.0321F, -0.4016F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(108, 7).addBox(-1.2232F, -0.1647F, -0.0157F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.703F, -0.6739F, -3.9628F, -0.1738F, -0.0116F, -0.4027F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 61).addBox(-0.6621F, -1.3479F, -7.7137F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.007F))
				.texOffs(0, 40).addBox(-0.6621F, 0.6521F, -7.7137F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6679F, 3.6424F, 4.7808F, -0.0265F, -0.0295F, -0.3607F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(16, 112).addBox(-0.6838F, -0.7683F, -1.1357F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6679F, 3.6424F, 4.7808F, 0.3531F, -0.0351F, -0.3548F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(96, 92).addBox(-0.6838F, -1.1435F, -3.0647F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6679F, 3.6424F, 4.7808F, -0.5196F, -0.0351F, -0.3548F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(124, 98).addBox(-0.5F, -1.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6456F, 9.8493F, -7.3495F, -1.2833F, 0.0639F, 0.0248F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(43, 123).addBox(-0.5F, -0.8F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7463F, 9.3448F, -2.6027F, 1.5643F, -0.0199F, 0.0571F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(12, 121).addBox(-0.478F, -4.8257F, -1.0276F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5644F, 11.3833F, -0.436F, 0.3862F, -0.0199F, 0.0571F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(131, 81).addBox(-0.5F, -0.975F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6391F, 14.544F, 3.4383F, -0.7396F, -0.0199F, -0.0476F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(129, 130).addBox(-0.1176F, 2.0359F, 0.652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1644F, 12.0833F, 2.164F, 0.0458F, -0.0199F, -0.0476F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(48, 124).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6096F, 13.7223F, 2.9569F, 0.7003F, -0.0199F, -0.0476F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(88, 49).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5771F, 13.3821F, 3.7762F, -0.6872F, -0.0199F, -0.0476F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(136, 49).addBox(-0.1176F, 2.0413F, -0.6215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1644F, 12.0833F, 2.164F, 0.7003F, -0.0199F, -0.0476F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(69, 112).addBox(-0.478F, -4.0908F, 0.0924F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5644F, 11.3833F, -0.436F, 0.9447F, -0.0199F, 0.0571F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(16, 103).addBox(-0.5F, -3.0F, -0.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5027F, 11.4609F, -8.9594F, -0.4193F, 0.0639F, 0.0248F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(135, 34).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4652F, 20.0816F, -14.5161F, 0.558F, 0.0639F, -0.1672F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.4057F, 18.72F, -11.8898F, 0.9158F, 0.0639F, -0.1672F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(66, 123).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6111F, 20.6685F, -13.7927F, 0.9506F, 0.0521F, -0.184F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(102, 15).addBox(-0.5F, -1.1F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6064F, 20.1107F, -12.4147F, 1.2125F, 0.0639F, -0.1672F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(17, 121).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7166F, 13.6342F, -9.2825F, -0.0528F, 0.0639F, -0.1672F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(25, 124).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2243F, 18.1741F, -13.2664F, -0.8339F, 0.0639F, -0.1672F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(38, 110).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1831F, 17.5358F, -12.2413F, -0.5895F, 0.0639F, -0.1672F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 121).addBox(-0.0049F, -0.0704F, -0.134F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2027F, 14.0609F, -10.5594F, -0.5066F, 0.0639F, -0.1672F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(124, 62).addBox(-0.1137F, -1.8179F, -0.508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1027F, 11.4609F, -9.1594F, -0.2009F, 0.06F, -0.103F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(121, 78).addBox(-0.1137F, -0.1179F, -0.508F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1027F, 11.4609F, -9.1594F, -0.3757F, 0.0639F, -0.1148F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(114, 84).addBox(-0.5F, -1.6F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5911F, 9.5718F, -8.3087F, -0.0703F, 0.0639F, 0.0248F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(78, 55).addBox(-0.5F, -0.6F, 0.125F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6196F, 5.8735F, -8.0168F, -0.6288F, 0.0639F, 0.0248F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(9, 112).addBox(-0.5F, -1.6F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6777F, 6.185F, -6.9875F, -0.0179F, 0.0639F, 0.0248F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(108, 43).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0198F, 6.3972F, -1.5582F, -0.3234F, 0.0639F, 0.0248F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(114, 89).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9774F, 5.575F, -2.5391F, 0.2002F, 0.0639F, 0.0248F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(49, 61).addBox(-0.3844F, -0.3139F, -1.8767F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7319F, 4.3537F, -5.0402F, -0.1925F, 0.0639F, 0.0248F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(103, 67).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3002F, 4.3182F, -8.5855F, 2.1422F, -0.2702F, -0.4046F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(90, 130).addBox(-0.5F, 0.0F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(62, 93).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5945F, 3.039F, -11.3801F, 2.0026F, -0.2702F, -0.4046F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(31, 110).addBox(-0.2054F, -1.861F, -0.3731F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.7F, 2.9199F, -9.6846F, 1.6186F, -0.2702F, -0.4046F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(128, 31).addBox(-0.2054F, -2.4251F, 0.4785F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7F, 2.9199F, -9.6846F, 1.095F, -0.2702F, -0.4046F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(128, 21).addBox(-0.2054F, -2.8338F, 0.1916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7F, 2.9199F, -9.6846F, 0.6151F, -0.2702F, -0.4046F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(20, 95).addBox(-0.2F, -0.0879F, -0.1201F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0188F, -0.1964F, -8.4095F, 0.1349F, -0.1105F, -0.3573F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(50, 107).addBox(-0.2054F, -3.0609F, 0.2843F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 2.9199F, -9.6846F, 0.3096F, -0.2702F, -0.4046F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(90, 62).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0241F, -0.5367F, -3.9119F, 0.0053F, 0.0089F, -0.4028F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5568F, -5.3286F, 3.8719F, 0.0436F, 0.0F, -0.1309F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(93, 15).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.269F, -0.4806F, -0.0891F, -0.3919F, 0.0116F, 0.4027F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(0.2232F, -0.337F, 1.9624F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.703F, -1.4232F, -3.9955F, -0.261F, 0.0116F, 0.4027F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-0.4173F, 4.0931F, -6.8175F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7493F, 0.5673F, -0.222F, 0.0321F, 0.4016F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(108, 7).mirror().addBox(0.2232F, -0.1647F, -0.0157F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.703F, -1.4232F, -3.9955F, -0.1738F, 0.0116F, 0.4027F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.3379F, -1.3479F, -7.7137F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(0, 40).mirror().addBox(-0.3379F, 0.6521F, -7.7137F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6679F, 2.8931F, 4.7481F, -0.0265F, 0.0295F, 0.3607F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(16, 112).mirror().addBox(-0.3162F, -0.7683F, -1.1357F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6679F, 2.8931F, 4.7481F, 0.3531F, 0.0351F, 0.3548F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(96, 92).mirror().addBox(-0.3162F, -1.1435F, -3.0647F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6679F, 2.8931F, 4.7481F, -0.5196F, 0.0351F, 0.3548F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(124, 98).mirror().addBox(-0.5F, -1.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6456F, 9.1F, -7.3822F, -1.2833F, -0.0639F, -0.0248F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(43, 123).mirror().addBox(-0.5F, -0.8F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7463F, 8.5955F, -2.6354F, 1.5643F, 0.0199F, -0.0571F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(12, 121).mirror().addBox(-0.522F, -4.8257F, -1.0276F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5644F, 10.6341F, -0.4688F, 0.3862F, 0.0199F, -0.0571F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(131, 81).mirror().addBox(-0.5F, -0.975F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6391F, 13.7948F, 3.4056F, -0.7396F, 0.0199F, 0.0476F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(129, 130).mirror().addBox(-0.8824F, 2.0359F, 0.652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1644F, 11.3341F, 2.1313F, 0.0458F, 0.0199F, 0.0476F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(48, 124).mirror().addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6096F, 12.973F, 2.9242F, 0.7003F, 0.0199F, 0.0476F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(88, 49).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5771F, 12.6329F, 3.7435F, -0.6872F, 0.0199F, 0.0476F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(136, 49).mirror().addBox(-0.8824F, 2.0413F, -0.6215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1644F, 11.3341F, 2.1313F, 0.7003F, 0.0199F, 0.0476F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(69, 112).mirror().addBox(-0.522F, -4.0908F, 0.0924F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5644F, 10.6341F, -0.4688F, 0.9447F, 0.0199F, -0.0571F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(16, 103).mirror().addBox(-0.5F, -3.0F, -0.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5027F, 10.7116F, -8.9921F, -0.4193F, -0.0639F, -0.0248F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(135, 34).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4652F, 19.3324F, -14.5489F, 0.558F, -0.0639F, 0.1672F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.5F, -1.1F, -0.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4057F, 17.9707F, -11.9226F, 0.9158F, -0.0639F, 0.1672F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(66, 123).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6111F, 19.9192F, -13.8254F, 0.9506F, -0.0521F, 0.184F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(102, 15).mirror().addBox(-0.5F, -1.1F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6064F, 19.3614F, -12.4475F, 1.2125F, -0.0639F, 0.1672F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(17, 121).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7166F, 12.8849F, -9.3152F, -0.0528F, -0.0639F, 0.1672F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(25, 124).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2243F, 17.4249F, -13.2991F, -0.8339F, -0.0639F, 0.1672F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(38, 110).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1831F, 16.7865F, -12.274F, -0.5895F, -0.0639F, 0.1672F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(38, 121).mirror().addBox(-0.9951F, -0.0704F, -0.134F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2027F, 13.3116F, -10.5921F, -0.5066F, -0.0639F, 0.1672F));

		PartDefinition cube_r72 = bone4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(124, 62).mirror().addBox(-0.8863F, -1.8179F, -0.508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1027F, 10.7116F, -9.1921F, -0.2009F, -0.06F, 0.103F));

		PartDefinition cube_r73 = bone4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(121, 78).mirror().addBox(-0.8863F, -0.1179F, -0.508F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1027F, 10.7116F, -9.1921F, -0.3757F, -0.0639F, 0.1148F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(114, 84).mirror().addBox(-0.5F, -1.6F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5911F, 8.8225F, -8.3414F, -0.0703F, -0.0639F, -0.0248F));

		PartDefinition cube_r75 = bone4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(78, 55).mirror().addBox(-0.5F, -0.6F, 0.125F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6196F, 5.1242F, -8.0495F, -0.6288F, -0.0639F, -0.0248F));

		PartDefinition cube_r76 = bone4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(9, 112).mirror().addBox(-0.5F, -1.6F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6777F, 5.4357F, -7.0202F, -0.0179F, -0.0639F, -0.0248F));

		PartDefinition cube_r77 = bone4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(108, 43).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0198F, 5.6479F, -1.5909F, -0.3234F, -0.0639F, -0.0248F));

		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(114, 89).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9774F, 4.8257F, -2.5718F, 0.2002F, -0.0639F, -0.0248F));

		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(49, 61).mirror().addBox(-0.6156F, -0.3139F, -1.8767F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, 3.6045F, -5.0729F, -0.1925F, -0.0639F, -0.0248F));

		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(103, 67).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3002F, 3.5689F, -8.6183F, 2.1422F, 0.2702F, 0.4046F));

		PartDefinition cube_r81 = bone4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(90, 130).mirror().addBox(-0.5F, 0.0F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(62, 93).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5945F, 2.2898F, -11.4129F, 2.0026F, 0.2702F, 0.4046F));

		PartDefinition cube_r82 = bone4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(31, 110).mirror().addBox(-0.7946F, -1.861F, -0.3731F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.1707F, -9.7173F, 1.6186F, 0.2702F, 0.4046F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(128, 31).mirror().addBox(-0.7946F, -2.4251F, 0.4785F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.1707F, -9.7173F, 1.095F, 0.2702F, 0.4046F));

		PartDefinition cube_r84 = bone4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(128, 21).mirror().addBox(-0.7946F, -2.8338F, 0.1916F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.1707F, -9.7173F, 0.6151F, 0.2702F, 0.4046F));

		PartDefinition cube_r85 = bone4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(20, 95).mirror().addBox(-0.8F, -0.0879F, -0.1201F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0188F, -0.9457F, -8.4422F, 0.1349F, 0.1105F, 0.3573F));

		PartDefinition cube_r86 = bone4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(50, 107).mirror().addBox(-0.7946F, -3.0609F, 0.2843F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.1707F, -9.7173F, 0.3096F, 0.2702F, 0.4046F));

		PartDefinition cube_r87 = bone4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(90, 62).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0241F, -1.286F, -3.9447F, 0.0053F, -0.0089F, 0.4028F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.1124F, -0.032F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightLeg1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(51, 94).addBox(-1.5F, -1.3F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 13.3966F, 1.7692F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightLeg1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(112, 74).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 12.0116F, 1.2431F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightLeg1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(104, 35).addBox(-5.1F, 0.6412F, -0.4417F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.6F, 13.3601F, -0.2101F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightLeg1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, -6.0F, -0.9F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, 12.907F, 1.1734F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightLeg1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(103, 74).addBox(-5.1F, -0.279F, -0.4469F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.6F, 13.3601F, -0.2101F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightLeg1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(62, 110).addBox(-5.1F, -2.1466F, -0.0682F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 11.3851F, -0.6351F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightLeg1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(71, 124).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 5.3359F, 1.4835F, -2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg1.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(124, 66).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 5.319F, 1.5119F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(71, 97).addBox(-1.0F, -3.5F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, 7.065F, 0.4332F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg1.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(115, 57).addBox(-5.1F, -2.9931F, 0.0248F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6F, 7.4954F, -1.1121F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg1.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(110, 98).addBox(-5.1F, 0.2069F, -0.0752F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.6F, 7.2834F, -1.0409F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(40, 94).addBox(-1.5F, -1.7F, -0.85F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.75F, -0.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 86).addBox(-1.0F, -3.5F, -1.15F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 3.2271F, 0.3004F, -0.0087F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 14.5829F, 2.2056F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(115, 7).addBox(0.9F, -2.225F, 0.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.2F, 3.5297F, -0.7222F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(104, 20).addBox(-1.0F, -0.7F, -1.375F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 1.8055F, 0.9147F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(110, 70).addBox(-0.1F, -1.6F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2F, -0.1422F, -2.2528F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(101, 103).addBox(-1.0F, -1.375F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3F, 0.5374F, -1.3651F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(29, 92).addBox(-0.1F, -0.7F, -0.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.2F, 0.3526F, 0.2482F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(105, 94).addBox(-1.0F, 0.9F, -0.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(9, 105).addBox(-1.0F, -3.5F, -0.55F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3F, 12.3329F, -0.8588F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(22, 84).addBox(-0.1F, 0.0F, -1.2F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 4.7282F, 0.8127F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(108, 57).addBox(-0.1F, -1.5F, -0.325F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 3.2079F, 0.3786F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(48, 82).addBox(-1.1F, -7.0F, -0.525F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2F, 7.6471F, -0.5117F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(105, 115).addBox(-1.1F, -0.2725F, -0.9625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(2.4F, 0.1471F, 0.4883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(121, 93).addBox(-0.5F, -9.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.8F, 10.3536F, -0.6089F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightLeg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(75, 83).addBox(-0.5F, -9.0F, -0.6F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8F, 10.3536F, -0.6089F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightLeg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(112, 115).addBox(-1.1F, -0.9225F, 0.043F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(2.4F, 2.1197F, 0.1582F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(13, 84).addBox(-1.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.4331F, -0.9091F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightLeg3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(103, 124).addBox(0.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, 0.1309F));

		PartDefinition cube_r115 = rightLeg3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(33, 120).addBox(0.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(67, 27).addBox(-1.5F, -0.0746F, -2.9368F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 6.9009F, 0.1707F, 0.3665F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(36, 55).addBox(-2.5F, -0.8F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7216F, -2.9319F, -0.1708F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.1124F, -0.032F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftLeg1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(94, 87).addBox(-1.5F, -1.3F, -1.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 13.3966F, 1.7692F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftLeg1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(114, 79).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, 12.0116F, 1.2431F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftLeg1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(121, 4).addBox(3.1F, 0.6412F, -0.4417F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.6F, 13.3601F, -0.2101F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftLeg1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(95, 0).addBox(-1.0F, -6.0F, -0.9F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, 12.907F, 1.1734F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftLeg1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 105).addBox(3.1F, -0.279F, -0.4469F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.6F, 13.3601F, -0.2101F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftLeg1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(110, 64).addBox(3.1F, -2.1466F, -0.0682F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6F, 11.3851F, -0.6351F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftLeg1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(98, 124).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 5.3359F, 1.4835F, -2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftLeg1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(93, 124).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 5.319F, 1.5119F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftLeg1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(50, 99).addBox(-1.0F, -3.5F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5F, 7.065F, 0.4332F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftLeg1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(98, 115).addBox(3.1F, -2.9931F, 0.0248F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.6F, 7.4954F, -1.1121F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftLeg1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(111, 14).addBox(3.1F, 0.2069F, -0.0752F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.6F, 7.2834F, -1.0409F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftLeg1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(94, 82).addBox(-1.5F, -1.7F, -0.85F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.75F, -0.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r128 = leftLeg1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(86, 0).addBox(-1.0F, -3.5F, -1.15F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 3.2271F, 0.3004F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.5829F, 2.2056F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r129 = leftLeg2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(115, 43).addBox(-2.9F, -2.225F, 0.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 3.5297F, -0.7222F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftLeg2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(105, 52).addBox(-1.0F, -0.7F, -1.375F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 1.8055F, 0.9147F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftLeg2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(110, 104).addBox(-1.9F, -1.6F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.2F, -0.1422F, -2.2528F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftLeg2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(35, 105).addBox(-1.0F, -1.375F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 0.5374F, -1.3651F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftLeg2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(93, 23).addBox(-1.9F, -0.7F, -0.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2F, 0.3526F, 0.2482F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftLeg2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 110).addBox(-1.0F, 0.9F, -0.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(71, 105).addBox(-1.0F, -3.5F, -0.55F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3F, 12.3329F, -0.8588F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftLeg2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(86, 19).addBox(-1.9F, 0.0F, -1.2F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 4.7282F, 0.8127F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftLeg2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(101, 108).addBox(-1.9F, -1.5F, -0.325F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2F, 3.2079F, 0.3786F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftLeg2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(55, 82).addBox(-0.9F, -7.0F, -0.525F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.2F, 7.6471F, -0.5117F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftLeg2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(115, 108).addBox(0.1F, -0.2725F, -0.9625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-2.4F, 0.1471F, 0.4883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftLeg2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(117, 121).addBox(-0.5F, -9.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.8F, 10.3536F, -0.6089F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftLeg2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(80, 83).addBox(-0.5F, -9.0F, -0.6F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.8F, 10.3536F, -0.6089F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftLeg2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(116, 0).addBox(0.1F, -0.9225F, 0.043F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-2.4F, 2.1197F, 0.1582F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(85, 83).addBox(-2.0F, 0.0554F, -0.5239F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.4331F, -0.9091F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r142 = leftLeg3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(128, 13).addBox(-1.2966F, -0.0473F, 0.0221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0958F, 5.0425F, -0.5239F, 0.4363F, 0.0F, -0.1309F));

		PartDefinition cube_r143 = leftLeg3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(7, 121).addBox(-1.2966F, -2.5522F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 3.5553F, -0.0239F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(69, 10).addBox(-4.5F, -0.0746F, -2.9368F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 6.9009F, 0.1707F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(57, 55).addBox(-3.5F, -0.8F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7216F, -2.9319F, 0.0038F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2862F, 7.5002F, -0.2708F, -0.042F, 0.0117F));

		PartDefinition cube_r144 = tail1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(22, 121).addBox(0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4381F, 8.8381F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(63, 116).addBox(0.0F, -0.264F, -0.483F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7706F, 1.1245F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(21, 40).addBox(0.5F, -0.2129F, -0.6754F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2937F, 4.2236F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(109, 120).addBox(0.5F, 0.3871F, -0.5754F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2555F, 6.7132F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(21, 103).addBox(0.5F, -5.3073F, -0.2162F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6576F, 6.0586F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(57, 99).addBox(0.5F, -5.5323F, -0.0162F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4066F, 2.8685F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(78, 97).addBox(0.5F, -5.4823F, -1.2162F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2653F, 1.074F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r151 = tail1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(25, 39).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1484F, 1.0289F, 0.1573F, 0.0517F, 0.0082F));

		PartDefinition cube_r152 = tail1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(25, 39).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1484F, 1.0289F, 0.1573F, -0.0517F, -0.0082F));

		PartDefinition cube_r153 = tail1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(25, 27).addBox(0.0F, -1.9F, -0.9F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.7562F, 1.0709F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail = tail1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.5126F, 8.8379F, 0.0527F, -0.1284F, -0.0505F));

		PartDefinition cube_r154 = tail.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(77, 77).mirror().addBox(-2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 71).mirror().addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.2382F, 1.9544F, 0.1575F, 0.069F, 0.0109F));

		PartDefinition cube_r155 = tail.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(77, 77).addBox(0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(77, 71).addBox(0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.2382F, 1.9544F, 0.1575F, -0.069F, -0.0109F));

		PartDefinition cube_r156 = tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(48, 44).addBox(0.0F, -1.9F, 8.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 2.2308F, -7.8805F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(85, 121).addBox(0.0F, 0.0F, -0.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.748F, 7.0799F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(59, 120).addBox(0.0F, 0.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0636F, 4.7429F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(9, 86).addBox(0.0F, -0.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.703F, 2.7675F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(83, 109).addBox(0.5F, -4.2205F, -0.0226F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.6867F, 5.7705F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(44, 109).addBox(0.5F, -4.2823F, -0.0162F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.4832F, 2.8025F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(26, 109).addBox(0.5F, -4.9823F, -0.1162F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.7285F, -0.136F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.6624F, 7.8232F, 0.2107F, -0.119F, -0.07F));

		PartDefinition cube_r163 = tail2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(125, 13).addBox(0.0F, -3.9295F, 0.0466F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 6.946F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r164 = tail2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(3, 125).addBox(0.0F, -3.9134F, 0.0872F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 4.946F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 125).addBox(0.0F, -3.7553F, -0.9425F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 3.946F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(124, 112).addBox(0.0F, -3.9811F, 0.0684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.374F, 0.946F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 51).addBox(-0.5F, -1.9F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.426F, 1.046F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(76, 124).addBox(0.0F, 0.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3862F, 1.7446F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(62, 124).addBox(0.0F, -0.4F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1005F, 6.0433F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(30, 124).addBox(0.0F, 0.2F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2458F, 3.5777F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(17, 63).mirror().addBox(-0.9F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.4564F, 0.0304F, 0.0175F, 0.0698F, 0.0012F));

		PartDefinition cube_r172 = tail2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(17, 63).addBox(-0.1F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4564F, 0.0304F, 0.0175F, -0.0698F, -0.0012F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7776F, 8.1476F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail8.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(46, 22).addBox(-0.5F, -1.9F, 7.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2035F, -7.1017F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail8.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(54, 132).addBox(0.0F, -0.4727F, -0.1207F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7093F, 8.2722F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail8.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(51, 132).addBox(0.0F, 0.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0618F, 6.0009F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail8.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(48, 132).addBox(0.0F, 0.7F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0245F, 3.9397F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail8.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(98, 109).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0846F, 1.901F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r178 = tail8.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(125, 31).addBox(0.0F, -0.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.1152F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r179 = tail8.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(125, 131).addBox(0.0F, -3.2039F, -0.1697F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 6.8983F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r180 = tail8.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(66, 131).addBox(0.0F, -3.288F, -0.0903F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 4.8983F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r181 = tail8.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(125, 25).addBox(0.0F, -3.572F, -0.111F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 2.8983F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r182 = tail8.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(125, 19).addBox(0.0F, -3.7561F, -0.0316F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5964F, 0.8983F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2223F, 8.9023F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r183 = tail3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(105, 57).addBox(0.0F, 0.1F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4364F, 6.8875F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r184 = tail3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(16, 99).addBox(0.0F, -0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2488F, 5.1861F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r185 = tail3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(100, 132).addBox(0.0F, -0.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1036F, 3.2148F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r186 = tail3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(58, 127).addBox(0.0F, -0.8F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5866F, 1.2549F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r187 = tail3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(71, 93).addBox(0.0F, -1.7191F, -0.0834F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9252F, 7.9853F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(90, 15).addBox(0.0F, -1.9628F, -0.0984F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9252F, 5.9853F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(72, 132).addBox(0.0F, -2.2628F, -0.1984F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8613F, 4.0447F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(69, 132).addBox(0.0F, -2.6628F, -0.1984F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6769F, 2.0283F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r191 = tail3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(57, 132).addBox(0.0F, -2.7128F, 0.0016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.1037F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r192 = tail3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(48, 33).addBox(-0.5F, 0.1F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.834F, -0.3037F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7389F, 8.8298F, -0.1056F, 0.1302F, -0.0138F));

		PartDefinition cube_r193 = tail9.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, 0.1F, 9.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0951F, -9.1335F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail9.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(95, 136).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.152F, 4.4886F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r195 = tail9.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(65, 136).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3096F, 2.4724F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail9.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(16, 128).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5646F, 0.4787F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail9.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(99, 67).addBox(0.0F, -1.125F, 2.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4878F, 2.979F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail9.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(32, 71).addBox(0.0F, -1.075F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4878F, 2.979F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail9.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(74, 112).addBox(0.0F, -1.475F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2753F, 0.9678F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail4 = tail9.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3811F, 5.9106F, -0.0683F, 0.169F, -0.0976F));

		PartDefinition cube_r200 = tail4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(66, 116).addBox(0.0F, 2.5923F, 5.4449F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 137).addBox(0.0F, 1.6923F, 3.4449F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 136).addBox(0.0F, 0.0F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5331F, -1.4219F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(5, 114).addBox(0.0F, -0.65F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0251F, 5.0092F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(68, 137).addBox(0.0F, -0.625F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 29).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.393F, 1.0311F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(47, 74).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4209F, 0.2316F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -0.5698F, -0.2226F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.3471F, 6.1912F, -0.1876F, 0.2145F, -0.0404F));

		PartDefinition cube_r204 = tail5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(41, 137).addBox(0.0F, 4.1F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 6).addBox(0.0F, 3.3983F, 7.4739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.186F, -7.6131F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r205 = tail5.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(115, 128).addBox(0.0F, -0.725F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 117).addBox(0.0F, -0.425F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4872F, 0.8777F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(50, 10).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5056F, 4.6774F, -0.1355F, 0.2595F, -0.035F));

		PartDefinition cube_r206 = tail6.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(56, 137).addBox(0.0F, -0.9F, 1.925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 137).addBox(0.0F, -0.7F, -0.075F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1417F, 4.0393F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail6.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(50, 137).addBox(0.0F, -0.9F, -0.025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3585F, 1.9891F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r208 = tail6.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(47, 137).addBox(0.0F, -0.6F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1842F, -0.0032F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail6.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(44, 137).addBox(0.0F, 4.9F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6916F, -12.2905F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.075F, -0.0013F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.132F, 0.1298F, -0.0172F));

		PartDefinition cube_r210 = tail7.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(59, 137).addBox(0.0F, -0.925F, 0.15F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5157F, -0.3105F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone = tail1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4925F, 8.6858F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1628F, -4.1022F, -0.0175F, -0.0873F, 0.0015F));

		PartDefinition cube_r211 = body.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(45, 99).addBox(-0.5F, -5.3105F, -1.1178F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.169F, -1.7704F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r212 = body.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(78, 107).addBox(-0.5F, -4.6522F, -0.0114F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4213F, -5.8697F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r213 = body.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(67, 44).addBox(-1.0F, 0.0F, 2.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.669F, -8.7704F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r214 = body.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(99, 138).addBox(-2.5F, -3.479F, 0.6012F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 13.9299F, -8.8184F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r215 = body.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(119, 106).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, -0.0295F, 0.162F, -1.5197F));

		PartDefinition cube_r216 = body.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(128, 29).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, 0.0669F, 0.1506F, -0.9189F));

		PartDefinition cube_r217 = body.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(128, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.469F, -4.8704F, 0.1244F, 0.1082F, -0.4809F));

		PartDefinition cube_r218 = body.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(108, 50).mirror().addBox(-3.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, -0.0258F, 0.0833F, -1.675F));

		PartDefinition cube_r219 = body.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(124, 11).mirror().addBox(-3.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, 0.0253F, 0.0834F, -1.0794F));

		PartDefinition cube_r220 = body.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(122, 60).mirror().addBox(-1.6005F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.269F, -1.8704F, 0.0583F, 0.0649F, -0.6423F));

		PartDefinition cube_r221 = body.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(119, 106).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, -0.0295F, -0.162F, 1.5197F));

		PartDefinition cube_r222 = body.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(128, 29).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, 0.0669F, -0.1506F, 0.9189F));

		PartDefinition cube_r223 = body.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(128, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.469F, -4.8704F, 0.1244F, -0.1082F, 0.4809F));

		PartDefinition cube_r224 = body.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(108, 50).addBox(2.74F, -2.3355F, -0.4915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, -0.0258F, -0.0833F, 1.675F));

		PartDefinition cube_r225 = body.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(124, 11).addBox(1.5775F, -0.404F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, 0.0253F, -0.0834F, 1.0794F));

		PartDefinition cube_r226 = body.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(122, 60).addBox(-0.3995F, 0.3005F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.269F, -1.8704F, 0.0583F, -0.0649F, 0.6423F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(29, 10).addBox(-0.5F, -1.1F, -9.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.394F, -5.7704F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(57, 108).addBox(0.0F, -4.2122F, -1.0627F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0807F, -1.9945F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(113, 27).addBox(0.0F, -3.4617F, 0.1386F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9992F, -9.195F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(113, 20).addBox(0.0F, -3.7867F, 0.0386F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0263F, -6.0951F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(126, 50).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.2042F, 0.1047F, -0.4074F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(126, 48).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.1414F, 0.1809F, -0.8416F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(69, 42).mirror().addBox(-7.6882F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.0147F, 0.2287F, -1.4462F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(67, 53).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.0685F, 0.3777F, -1.3502F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(33, 126).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.2723F, 0.2735F, -0.7322F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(12, 126).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -8.0F, 0.3598F, 0.1358F, -0.3088F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(122, 125).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.2776F, 0.1049F, -0.3536F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(124, 118).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.2089F, 0.2116F, -0.7823F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(69, 40).mirror().addBox(-10.6882F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -5.0F, 0.0529F, 0.2917F, -1.3902F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(126, 50).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.2042F, -0.1047F, 0.4074F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 15).addBox(-2.5F, -3.742F, -7.2086F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 15.6692F, -3.2399F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(126, 48).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.1414F, -0.1809F, 0.8416F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(69, 42).addBox(2.6881F, -2.8327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.0147F, -0.2287F, 1.4462F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(67, 53).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.0685F, -0.3777F, 1.3502F));

		PartDefinition cube_r244 = body2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(33, 126).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.2723F, -0.2735F, 0.7322F));

		PartDefinition cube_r245 = body2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(12, 126).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -8.0F, 0.3598F, -0.1358F, 0.3088F));

		PartDefinition cube_r246 = body2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(122, 125).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.2776F, -0.1049F, 0.3536F));

		PartDefinition cube_r247 = body2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(124, 118).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.2089F, -0.2116F, 0.7823F));

		PartDefinition cube_r248 = body2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(69, 40).addBox(2.6881F, -2.8327F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -5.0F, 0.0529F, -0.2917F, 1.3902F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0088F, -8.9481F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(99, 61).addBox(-0.5F, -2.2141F, -0.0945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.0391F, -2.9368F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(19, 126).addBox(0.0F, -3.4525F, -1.1399F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7172F, -0.8517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(133, 11).addBox(0.0F, -3.1967F, -0.0424F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9609F, -3.9368F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(67, 22).addBox(-3.4872F, -0.5232F, -1.3076F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 8.3298F, -10.2946F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(29, 24).mirror().addBox(-9.6882F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.0787F, 0.371F, -1.37F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(126, 76).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.2763F, 0.2626F, -0.7547F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(126, 74).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1391F, -7.3368F, 0.3589F, 0.1242F, -0.3325F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(126, 72).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -5.3368F, 0.3137F, 0.0974F, -0.3028F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(126, 70).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -5.3368F, 0.2455F, 0.2197F, -0.7273F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(69, 17).mirror().addBox(-11.6882F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1609F, -5.3368F, 0.0789F, 0.3187F, -1.3352F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(126, 54).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.2956F, 0.1008F, -0.3196F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(126, 52).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.2273F, 0.2153F, -0.7462F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(50, 20).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2609F, -3.4368F, 0.0661F, 0.305F, -1.3542F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(62, 61).mirror().addBox(-12.6882F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -1.5368F, 0.0588F, 0.2893F, -1.3024F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(93, 128).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -1.5368F, 0.2123F, 0.2065F, -0.6955F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(128, 35).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1109F, -1.5368F, 0.2785F, 0.0989F, -0.2673F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(-4.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0666F, 8.2734F, -10.2355F, -1.1027F, 1.2853F, 0.2095F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(29, 22).mirror().addBox(-6.7F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7307F, 8.4961F, -9.9579F, -0.6956F, 1.2644F, -0.0252F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(69, 15).mirror().addBox(-9.0F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.47F, 8.7722F, -9.8509F, -0.3555F, 1.2022F, -0.3238F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(29, 24).addBox(2.6881F, -2.8327F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.0787F, -0.371F, 1.37F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(126, 76).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.2763F, -0.2626F, 0.7547F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(126, 74).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1391F, -7.3368F, 0.3589F, -0.1242F, 0.3325F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(132, 115).addBox(0.0F, -2.8927F, -0.1837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -7.7368F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(126, 72).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -5.3368F, 0.3137F, -0.0974F, 0.3028F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(126, 70).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -5.3368F, 0.2455F, -0.2197F, 0.7273F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(69, 17).addBox(2.6881F, -2.8327F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1609F, -5.3368F, 0.0789F, -0.3187F, 1.3352F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(126, 54).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.2956F, -0.1008F, 0.3196F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(126, 52).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.2273F, -0.2153F, 0.7462F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(50, 20).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2609F, -3.4368F, 0.0661F, -0.305F, 1.3542F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(62, 61).addBox(2.6881F, -2.8327F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -1.5368F, 0.0588F, -0.2893F, 1.3024F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(93, 128).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -1.5368F, 0.2123F, -0.2065F, 0.6955F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(27, 0).addBox(-3.0F, -2.944F, -7.9059F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 14.1828F, -1.4135F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(128, 35).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1109F, -1.5368F, 0.2785F, -0.0989F, 0.2673F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(132, 110).addBox(0.0F, -3.0927F, -0.1837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6609F, -5.7368F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(73, 19).addBox(-0.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0666F, 8.2734F, -10.2355F, -1.1027F, -1.2853F, -0.2095F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(29, 22).addBox(-0.3F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7307F, 8.4961F, -9.9579F, -0.6956F, -1.2644F, 0.0252F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(69, 15).addBox(0.0F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.47F, 8.7722F, -9.8509F, -0.3555F, -1.2022F, 0.3238F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(15, 71).addBox(-2.4872F, -1.0174F, -3.8727F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4872F, 8.1994F, -11.7204F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(62, 63).addBox(-0.5F, -0.1119F, -5.8679F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.0609F, -3.0368F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0286F, 2.4565F, -7.6792F, -0.079F, 0.0981F, -0.1959F));

		PartDefinition cube_r288 = bone2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 121).addBox(-0.5F, -0.55F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1559F, -3.7822F, 0.846F, 0.624F, -0.0172F, -0.0029F));

		PartDefinition cube_r289 = bone2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(135, 110).addBox(-0.5F, -0.15F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1493F, -4.3077F, 1.1389F, -0.6937F, -0.0172F, -0.0029F));

		PartDefinition cube_r290 = bone2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(36, 135).addBox(-0.1914F, -3.8624F, 2.2321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0949F, -1.4557F, -2.128F, -0.1701F, -0.0172F, -0.0029F));

		PartDefinition cube_r291 = bone2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(62, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1942F, -1.8708F, -2.3698F, 0.7287F, -0.0041F, -0.017F));

		PartDefinition cube_r292 = bone2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(126, 78).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5891F, 1.7612F, -4.1827F, 0.0145F, 0.2395F, 0.2828F));

		PartDefinition cube_r293 = bone2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(88, 121).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8225F, 1.2917F, -5.6372F, 1.0181F, 0.2395F, 0.2828F));

		PartDefinition cube_r294 = bone2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(117, 66).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4766F, 0.5863F, -5.0833F, -0.0291F, 0.2395F, 0.2828F));

		PartDefinition cube_r295 = bone2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(105, 128).addBox(0.3984F, 1.5402F, -3.8812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(132, 120).addBox(0.3984F, 0.7402F, -3.1812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0949F, -1.4557F, -2.128F, 0.32F, 0.2395F, 0.2828F));

		PartDefinition cube_r296 = bone2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(110, 128).addBox(-0.5F, -0.275F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(26, 117).addBox(-0.5F, -0.275F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8007F, 0.7364F, -6.1861F, 1.3672F, 0.2395F, 0.2828F));

		PartDefinition cube_r297 = bone2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(119, 74).addBox(-0.2047F, -0.4524F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0949F, -1.4557F, -2.128F, 0.925F, -0.0017F, -0.0174F));

		PartDefinition cube_r298 = bone2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(117, 62).addBox(-0.2047F, -0.4524F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0949F, -1.4557F, -2.128F, 0.7941F, -0.0017F, -0.0174F));

		PartDefinition cube_r299 = bone2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(121, 0).addBox(-0.5F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0804F, 0.3257F, -3.8229F, 0.9745F, 0.2395F, 0.2828F));

		PartDefinition cube_r300 = bone2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(102, 120).addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0804F, 0.3257F, -3.8229F, 0.669F, 0.2395F, 0.2828F));

		PartDefinition cube_r301 = bone2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(27, 98).addBox(-1.0F, -0.275F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7819F, 3.2781F, -4.2873F, -0.8597F, 0.4723F, 0.7887F));

		PartDefinition cube_r302 = bone2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(93, 39).addBox(-1.0F, -0.675F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7819F, 3.2781F, -4.2873F, -0.3935F, 0.5549F, 0.6721F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0286F, 2.4565F, -7.6792F, -0.079F, -0.0981F, 0.1959F));

		PartDefinition cube_r303 = bone5.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(-0.5F, -0.55F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1559F, -3.7822F, 0.846F, 0.624F, 0.0172F, 0.0029F));

		PartDefinition cube_r304 = bone5.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(135, 110).mirror().addBox(-0.5F, -0.15F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1493F, -4.3077F, 1.1389F, -0.6937F, 0.0172F, 0.0029F));

		PartDefinition cube_r305 = bone5.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(36, 135).mirror().addBox(-0.8086F, -3.8624F, 2.2321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0949F, -1.4557F, -2.128F, -0.1701F, 0.0172F, 0.0029F));

		PartDefinition cube_r306 = bone5.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(62, 87).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1942F, -1.8708F, -2.3698F, 0.7287F, 0.0041F, 0.017F));

		PartDefinition cube_r307 = bone5.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(126, 78).mirror().addBox(-0.5F, -1.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5891F, 1.7612F, -4.1827F, 0.0145F, -0.2395F, -0.2828F));

		PartDefinition cube_r308 = bone5.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(88, 121).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8225F, 1.2917F, -5.6372F, 1.0181F, -0.2395F, -0.2828F));

		PartDefinition cube_r309 = bone5.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(117, 66).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4766F, 0.5863F, -5.0833F, -0.0291F, -0.2395F, -0.2828F));

		PartDefinition cube_r310 = bone5.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(105, 128).mirror().addBox(-1.3984F, 1.5402F, -3.8812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(132, 120).mirror().addBox(-1.3984F, 0.7402F, -3.1812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0949F, -1.4557F, -2.128F, 0.32F, -0.2395F, -0.2828F));

		PartDefinition cube_r311 = bone5.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(110, 128).mirror().addBox(-0.5F, -0.275F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(26, 117).mirror().addBox(-0.5F, -0.275F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 0.7364F, -6.1861F, 1.3672F, -0.2395F, -0.2828F));

		PartDefinition cube_r312 = bone5.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(119, 74).mirror().addBox(-0.7953F, -0.4524F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0949F, -1.4557F, -2.128F, 0.925F, 0.0017F, 0.0174F));

		PartDefinition cube_r313 = bone5.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(117, 62).mirror().addBox(-0.7953F, -0.4524F, -1.704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0949F, -1.4557F, -2.128F, 0.7941F, 0.0017F, 0.0174F));

		PartDefinition cube_r314 = bone5.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(121, 0).mirror().addBox(-0.5F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0804F, 0.3257F, -3.8229F, 0.9745F, -0.2395F, -0.2828F));

		PartDefinition cube_r315 = bone5.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(102, 120).mirror().addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0804F, 0.3257F, -3.8229F, 0.669F, -0.2395F, -0.2828F));

		PartDefinition cube_r316 = bone5.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(27, 98).mirror().addBox(0.0F, -0.275F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7819F, 3.2781F, -4.2873F, -0.8597F, -0.4723F, -0.7887F));

		PartDefinition cube_r317 = bone5.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(93, 39).mirror().addBox(0.0F, -0.675F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7819F, 3.2781F, -4.2873F, -0.3935F, -0.5549F, -0.6721F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5408F, 6.9546F, -11.5306F, 0.1346F, 0.1306F, -0.2915F));

		PartDefinition cube_r318 = leftArm1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(81, 117).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0477F, -0.3832F, 1.0677F, -0.7581F, -0.7676F, 0.1498F));

		PartDefinition cube_r319 = leftArm1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(133, 19).addBox(-0.5F, -0.35F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3061F, -0.5432F, 0.8277F, 0.0796F, -0.7676F, 0.1498F));

		PartDefinition cube_r320 = leftArm1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(80, 121).addBox(-0.5F, -1.7F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.2782F, -0.7676F, 0.1498F));

		PartDefinition cube_r321 = leftArm1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(131, 84).addBox(-0.5F, 0.6F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(0, 131).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2706F, 0.6418F, 0.6808F, -0.6272F, -0.7676F, 0.1498F));

		PartDefinition cube_r322 = leftArm1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(88, 126).addBox(6.0F, -1.0842F, 0.1338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.6847F, 0.0893F, -0.2895F, -0.0786F, -0.067F));

		PartDefinition cube_r323 = leftArm1.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(133, 16).addBox(-0.5F, 0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 5.7327F, 1.7215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r324 = leftArm1.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(133, 0).addBox(-0.5F, 0.6F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7327F, 1.7215F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r325 = leftArm1.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(126, 86).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.3104F, 1.0406F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r326 = leftArm1.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(126, 82).addBox(-0.5F, -1.0F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.0954F, 0.8866F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r327 = leftArm1.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(79, 126).addBox(-0.5F, -1.0F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.2587F, 1.1502F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(88, 109).addBox(-0.8F, -0.4307F, 0.1266F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 114).addBox(-0.8F, 0.5693F, -0.9734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2671F, 6.7296F, 1.0221F, -1.0849F, 0.0156F, 0.0164F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.251F, 5.6581F, 0.7274F, -0.0843F, 0.0226F, 0.4354F));

		PartDefinition cube_r328 = leftHand.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(30, 82).addBox(0.0F, -2.5F, -0.2F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r329 = leftHand.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(108, 108).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5408F, 6.9546F, -11.5306F, 0.7478F, -0.4149F, 0.165F));

		PartDefinition cube_r330 = rightArm1.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(73, 120).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0477F, -0.3832F, 1.0677F, -0.7581F, 0.7676F, -0.1498F));

		PartDefinition cube_r331 = rightArm1.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(118, 134).addBox(-0.5F, -0.35F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3061F, -0.5432F, 0.8277F, 0.0796F, 0.7676F, -0.1498F));

		PartDefinition cube_r332 = rightArm1.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(121, 83).addBox(-0.5F, -1.7F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.2782F, 0.7676F, -0.1498F));

		PartDefinition cube_r333 = rightArm1.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(115, 131).addBox(-0.5F, 0.6F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(110, 131).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2706F, 0.6418F, 0.6808F, -0.6272F, 0.7676F, -0.1498F));

		PartDefinition cube_r334 = rightArm1.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(11, 128).addBox(-7.0F, -1.0842F, 0.1338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 0.6847F, 0.0893F, -0.2895F, 0.0786F, 0.067F));

		PartDefinition cube_r335 = rightArm1.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(113, 134).addBox(-0.5F, 0.6F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 5.7327F, 1.7215F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightArm1.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(108, 134).addBox(-0.5F, 0.6F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7327F, 1.7215F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightArm1.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(128, 0).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 5.3104F, 1.0406F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r338 = rightArm1.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(124, 127).addBox(-0.5F, -1.0F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 4.0954F, 0.8866F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r339 = rightArm1.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(127, 120).addBox(-0.5F, -1.0F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.2587F, 1.1502F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(93, 109).addBox(-0.2F, -0.4307F, 0.1266F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 50).addBox(-0.2F, 0.5693F, -0.9734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2671F, 6.7296F, 1.0221F, -0.9013F, -0.153F, -0.1243F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.251F, 5.6581F, 0.7274F, -0.0756F, -0.0436F, -0.6965F));

		PartDefinition cube_r340 = rightHand.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(39, 82).addBox(-1.0F, -2.5F, -0.2F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5F, -1.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r341 = rightHand.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(109, 0).addBox(-1.0F, -0.2F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 0.2032F, -1.2796F, -0.1833F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0302F, -8.7672F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r342 = neck1.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(133, 22).addBox(0.0F, -2.7459F, -0.016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3256F, -2.8971F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r343 = neck1.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(40, 126).addBox(0.0F, -3.1459F, -0.016F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0311F, -0.8666F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r344 = neck1.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(86, 30).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.0743F, 0.7203F, -1.5282F));

		PartDefinition cube_r345 = neck1.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(126, 96).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.5058F, 0.5418F, -0.8195F));

		PartDefinition cube_r346 = neck1.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(126, 94).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8692F, -2.2696F, 0.6703F, 0.2962F, -0.4226F));

		PartDefinition cube_r347 = neck1.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(126, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.6049F, 0.2275F, -0.3455F));

		PartDefinition cube_r348 = neck1.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(126, 90).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.4697F, 0.454F, -0.7426F));

		PartDefinition cube_r349 = neck1.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(71, 8).mirror().addBox(-8.6882F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3692F, -0.2696F, 0.1143F, 0.6323F, -1.409F));

		PartDefinition cube_r350 = neck1.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(86, 30).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.0743F, -0.7203F, 1.5282F));

		PartDefinition cube_r351 = neck1.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(126, 96).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.5058F, -0.5418F, 0.8195F));

		PartDefinition cube_r352 = neck1.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(126, 94).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8692F, -2.2696F, 0.6703F, -0.2962F, 0.4226F));

		PartDefinition cube_r353 = neck1.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(126, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.6049F, -0.2275F, 0.3455F));

		PartDefinition cube_r354 = neck1.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(126, 90).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.4697F, -0.454F, 0.7426F));

		PartDefinition cube_r355 = neck1.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(71, 8).addBox(2.6881F, -2.8327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3692F, -0.2696F, 0.1143F, -0.6323F, 1.409F));

		PartDefinition cube_r356 = neck1.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(95, 32).addBox(-0.5F, -0.7F, 3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6719F, -5.6579F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9438F, -2.3258F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r357 = neck2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(134, 6).addBox(0.0F, -2.1816F, -0.0991F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1431F, -1.7163F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r358 = neck2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(115, 12).mirror().addBox(-4.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -1.5629F, -0.0877F, 0.414F, -1.5444F));

		PartDefinition cube_r359 = neck2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(126, 102).mirror().addBox(-1.9081F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0878F, -1.5629F, 0.1064F, 0.4098F, -1.0675F));

		PartDefinition cube_r360 = neck2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(115, 12).addBox(1.737F, -0.79F, -0.4755F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -1.5629F, -0.0877F, -0.414F, 1.5444F));

		PartDefinition cube_r361 = neck2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(126, 102).addBox(-0.0919F, 0.0181F, -0.4755F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0878F, -1.5629F, 0.1064F, -0.4098F, 1.0675F));

		PartDefinition cube_r362 = neck2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(83, 98).addBox(-0.5F, 1.4F, 5.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3859F, -7.7876F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3605F, -2.3471F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r363 = neck5.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(92, 98).addBox(-0.5F, 1.4F, 3.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.9754F, -5.9788F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r364 = neck5.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(127, 9).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, -0.2198F, 0.7554F, -1.6322F));

		PartDefinition cube_r365 = neck5.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(127, 7).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2903F, -2.9743F, 0.2025F, 0.7593F, -1.0274F));

		PartDefinition cube_r366 = neck5.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(112, 126).mirror().addBox(-1.7892F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1653F, -0.9743F, 0.2025F, 0.7593F, -1.0274F));

		PartDefinition cube_r367 = neck5.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(126, 104).mirror().addBox(-3.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1653F, -0.9743F, -0.2198F, 0.7554F, -1.6322F));

		PartDefinition cube_r368 = neck5.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(127, 9).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, -0.2198F, -0.7554F, 1.6322F));

		PartDefinition cube_r369 = neck5.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(127, 7).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2903F, -2.9743F, 0.2025F, -0.7593F, 1.0274F));

		PartDefinition cube_r370 = neck5.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(112, 126).addBox(-0.2108F, 0.4011F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1653F, -0.9743F, 0.2025F, -0.7593F, 1.0274F));

		PartDefinition cube_r371 = neck5.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(126, 104).addBox(1.7911F, -0.3926F, -0.2462F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1653F, -0.9743F, -0.2198F, -0.7554F, 1.6322F));

		PartDefinition cube_r372 = neck5.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(28, 133).addBox(0.0F, -2.6566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6059F, -2.9414F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r373 = neck5.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(25, 133).addBox(0.0F, -1.9566F, -0.1491F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8842F, -0.9608F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, -2.7815F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r374 = neck4.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(128, 106).mirror().addBox(-2.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, -0.1499F, 1.0891F, -1.5603F));

		PartDefinition cube_r375 = neck4.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(127, 37).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -3.7127F, 0.5977F, 0.9835F, -0.706F));

		PartDefinition cube_r376 = neck4.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(102, 7).mirror().addBox(-2.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, -0.1503F, 1.0717F, -1.5606F));

		PartDefinition cube_r377 = neck4.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(40, 92).mirror().addBox(-1.7659F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2153F, -1.9127F, 0.5741F, 0.972F, -0.7256F));

		PartDefinition cube_r378 = neck4.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(128, 106).addBox(1.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, -0.1499F, -1.0891F, 1.5603F));

		PartDefinition cube_r379 = neck4.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(127, 37).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -3.7127F, 0.5977F, -0.9835F, 0.706F));

		PartDefinition cube_r380 = neck4.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(102, 7).addBox(1.7663F, -0.3906F, -0.2552F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, -0.1503F, -1.0717F, 1.5606F));

		PartDefinition cube_r381 = neck4.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(40, 92).addBox(-0.2341F, 0.3925F, -0.2552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2153F, -1.9127F, 0.5741F, -0.972F, 0.7256F));

		PartDefinition cube_r382 = neck4.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(126, 136).addBox(0.0F, -1.4677F, -0.0582F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4916F, -3.9212F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r383 = neck4.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(23, 112).addBox(0.0F, -1.4677F, -0.0582F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2697F, -1.931F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r384 = neck4.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(85, 45).addBox(-0.5F, 1.4F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(82, 42).addBox(-0.5F, 1.4F, 0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9504F, -3.9173F, -0.1222F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5407F, -3.7756F, 0.0859F, -0.1948F, -0.2794F));

		PartDefinition cube_r385 = neck3.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(127, 41).mirror().addBox(-1.8351F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6534F, -1.6609F, 0.3306F, 0.5553F, -1.0103F));

		PartDefinition cube_r386 = neck3.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(127, 39).mirror().addBox(-1.8547F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3534F, -3.4609F, 0.416F, 0.6757F, -1.0136F));

		PartDefinition cube_r387 = neck3.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(127, 41).addBox(-0.1649F, 0.472F, -0.617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6534F, -1.6609F, 0.3306F, -0.5553F, 1.0103F));

		PartDefinition cube_r388 = neck3.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(127, 39).addBox(-0.1453F, 0.4809F, -0.6322F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3534F, -3.4609F, 0.416F, -0.6757F, 1.0136F));

		PartDefinition cube_r389 = neck3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(132, 136).addBox(0.5F, -0.8458F, -1.1223F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6168F, -1.9379F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r390 = neck3.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(129, 136).addBox(0.5F, -1.469F, -0.9772F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3795F, -0.4528F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r391 = neck3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(84, 32).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.3168F, 1.7621F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = neck3.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7216F, -3.4653F, -0.3829F, -0.1001F, -0.1942F));

		PartDefinition cube_r392 = neck.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(135, 136).addBox(0.5F, -1.4207F, -0.1013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8514F, -1.8891F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r393 = neck.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(7, 99).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0315F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r394 = neck.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(127, 43).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4212F, -1.621F, 0.8154F, 0.9709F, -0.7645F));

		PartDefinition cube_r395 = neck.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(127, 43).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4212F, -1.621F, 0.8154F, -0.9709F, 0.7645F));

		PartDefinition neck6 = neck.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.15F, -2.45F, 0.5168F, -0.033F, -0.1189F));

		PartDefinition cube_r396 = neck6.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(0, 137).addBox(0.5F, -1.4207F, -0.3013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7433F, -2.7066F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r397 = neck6.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(133, 48).addBox(0.5F, -0.9207F, 3.7987F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.074F, -4.6686F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r398 = neck6.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(99, 9).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r399 = neck6.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(127, 56).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.6767F, 0.8813F, -0.8756F));

		PartDefinition cube_r400 = neck6.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(127, 56).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.6767F, -0.8813F, 0.8756F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1684F, -2.5598F, 0.4288F, -0.0822F, -0.0292F));

		PartDefinition cube_r401 = neck7.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(3, 137).addBox(0.5F, -0.5207F, 2.7987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.074F, -4.6685F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r402 = neck7.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(49, 114).addBox(0.0F, 1.3815F, -2.2683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -2.474F, 0.0315F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r403 = neck7.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(127, 58).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5212F, -1.221F, 0.6594F, 0.8679F, -0.8888F));

		PartDefinition cube_r404 = neck7.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(127, 58).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5212F, -1.221F, 0.6594F, -0.8679F, 0.8888F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7926F, -1.9497F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r405 = neck8.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(6, 137).addBox(0.5F, -0.5207F, 2.7986F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.074F, -4.6685F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r406 = neck8.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(99, 46).addBox(0.0F, 1.3815F, -3.2683F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.474F, 0.0314F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r407 = neck8.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(127, 108).mirror().addBox(-1.6988F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5212F, -1.221F, 0.6594F, 0.8679F, -0.8888F));

		PartDefinition cube_r408 = neck8.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(127, 108).addBox(-0.3012F, 0.3663F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5212F, -1.221F, 0.6594F, -0.8679F, 0.8888F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2843F, -2.8682F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r409 = head.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(99, 52).addBox(-0.3003F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(93, 46).addBox(-0.3003F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1997F, 8.1132F, -14.9636F, 0.3316F, 0.0008F, -0.0028F));

		PartDefinition cube_r410 = head.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(65, 127).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -0.6823F, -0.9782F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r411 = head.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(133, 93).addBox(-0.5F, -0.775F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2345F, -0.9702F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r412 = head.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(133, 90).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4835F, -1.8186F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r413 = head.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(62, 80).addBox(-0.5F, -1.125F, -5.45F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.4514F, -4.8129F, 0.4225F, 0.0F, 0.0F));

		PartDefinition cube_r414 = head.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(15, 77).addBox(-1.0F, 0.125F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.7189F, -3.385F, 0.3221F, 0.0F, 0.0F));

		PartDefinition cube_r415 = head.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -0.575F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.3739F, -0.3602F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r416 = head.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(92, 104).addBox(-1.4404F, -1.0F, -3.025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9404F, 6.1121F, -11.1577F, 0.2903F, 0.0F, 0.0F));

		PartDefinition cube_r417 = head.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(85, 133).addBox(-1.4404F, -1.0F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9404F, 5.6638F, -10.2638F, 0.4649F, 0.0F, 0.0F));

		PartDefinition cube_r418 = head.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(85, 136).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.003F, 7.3221F, -15.4565F, -2.9473F, 0.0F, 0.0F));

		PartDefinition cube_r419 = head.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(136, 84).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.003F, 6.7242F, -15.4057F, -1.6557F, 0.0F, 0.0F));

		PartDefinition cube_r420 = head.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(95, 130).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.003F, 6.2809F, -15.0013F, -0.7394F, 0.0F, 0.0F));

		PartDefinition cube_r421 = head.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(136, 78).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.003F, 6.0026F, -14.4698F, 0.4823F, 0.0F, 0.0F));

		PartDefinition cube_r422 = head.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(9, 93).addBox(-0.5F, -0.075F, -1.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.4206F, -12.9727F, 0.2903F, 0.0F, 0.0F));

		PartDefinition cube_r423 = head.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(85, 92).addBox(-1.4404F, -0.2F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9404F, 3.6178F, -8.7434F, 0.5172F, 0.0F, 0.0F));

		PartDefinition cube_r424 = head.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(134, 37).addBox(-0.5F, 0.0F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.9529F, -3.1229F, 3.0218F, 0.0F, 0.0F));

		PartDefinition cube_r425 = head.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(127, 110).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0673F, -3.4216F, 2.7076F, 0.0F, 0.0F));

		PartDefinition cube_r426 = head.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(80, 133).addBox(-0.5F, -0.0346F, -0.6939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.6725F, -3.9531F, 3.0916F, 0.0F, 0.0F));

		PartDefinition cube_r427 = head.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(118, 22).addBox(-0.5F, -0.4876F, -1.0966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.6725F, -3.9531F, 1.259F, 0.0F, 0.0F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(62, 105).addBox(-0.5F, -0.75F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 4.0624F, -1.8934F, 0.6263F, 0.0F, 0.0F));

		PartDefinition cube_r429 = head.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(95, 120).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.6525F, -2.643F, -0.1416F, 0.0F, 0.0F));

		PartDefinition cube_r430 = head.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(118, 18).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.2951F, -4.5783F, 0.6874F, 0.0F, 0.0F));

		PartDefinition cube_r431 = head.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(104, 30).addBox(-1.4404F, -0.175F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9404F, 2.8614F, -7.5604F, 0.5652F, 0.0F, 0.0F));

		PartDefinition cube_r432 = head.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(118, 14).addBox(-1.4404F, -0.2F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9404F, 3.6448F, -8.7769F, 0.5521F, 0.0F, 0.0F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(92, 76).addBox(-1.4404F, -0.9F, -4.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9404F, 3.7404F, -6.8935F, 0.4954F, 0.0F, 0.0F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(117, 117).addBox(-0.9404F, 1.8F, -3.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(117, 113).addBox(-0.9404F, 1.8F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4404F, -0.6111F, -5.098F, 0.5696F, 0.0F, 0.0F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(127, 114).addBox(-0.9404F, 1.8F, -1.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(119, 127).addBox(-0.9404F, 1.8F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4404F, -1.5696F, -3.3427F, 0.4998F, 0.0F, 0.0F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(111, 40).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1439F, -0.141F, -0.5649F, 0.0F, 0.0F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(26, 120).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1416F, -1.141F, 0.0024F, 0.0F, 0.0F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(119, 102).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0344F, -2.1254F, 0.1769F, 0.0F, 0.0F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(117, 98).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3374F, -3.0784F, 0.3078F, 0.0F, 0.0F));

		PartDefinition cube_r440 = head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(26, 104).addBox(-2.0F, 0.1F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 0.9137F, -1.2601F, 0.384F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.626F, 2.2098F, -0.0129F, 0.0F, -0.0087F, -0.001F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(120, 38).addBox(-1.5213F, -5.7851F, -4.4158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -1.6174F, 0.2288F, -0.1235F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(88, 117).addBox(-1.5213F, -6.8266F, -0.924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -1.1374F, 0.2288F, -0.1235F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(85, 55).addBox(-1.4369F, -1.9101F, 0.5757F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.5651F, 0.1454F, -0.1065F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(62, 72).addBox(-1.5412F, -1.8794F, -5.3621F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.5466F, 0.0495F, -0.0843F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(36, 49).addBox(-1.4004F, -0.7799F, -8.6157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.3027F, 0.0744F, -0.0869F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(105, 89).addBox(-0.5F, -0.3194F, -1.6278F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.226F, 1.0483F, -1.7911F, -0.6652F, 0.1309F, -0.1309F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(105, 84).addBox(-0.5F, -0.9791F, -1.8796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.226F, 1.0483F, -1.7911F, -1.2761F, 0.1309F, -0.1309F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(105, 79).addBox(-0.5F, 0.0858F, -1.6748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.226F, 1.0483F, -1.7911F, -0.3162F, 0.1309F, -0.1309F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(43, 127).addBox(-1.4849F, 4.8901F, 0.3489F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 1.7317F, 0.2325F, -0.1456F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(133, 75).addBox(-1.4849F, 3.501F, 0.8962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 2.1244F, 0.2325F, -0.1456F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(38, 117).addBox(-1.4849F, 2.4761F, -5.4445F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -2.9807F, 0.2325F, -0.1456F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(134, 40).addBox(-1.335F, -5.6326F, -5.6247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -1.7764F, 0.2325F, -0.1456F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(136, 46).addBox(-0.1F, -0.2F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.9474F, -2.3981F, -1.7645F, -1.3935F, -0.1236F, 1.1269F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(136, 22).addBox(-0.9F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.1981F, -2.1192F, -1.7938F, -1.3581F, 0.0366F, 0.3564F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(128, 25).addBox(-0.125F, -1.5F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.8491F, -2.3849F, -1.2969F, -1.4537F, 0.1159F, 1.1411F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(22, 128).addBox(-0.325F, -0.7F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.6832F, -1.9185F, -0.5383F, -1.5647F, 0.1645F, 0.3843F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(75, 133).addBox(-1.4849F, -6.1092F, -3.94F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -1.4972F, 0.2325F, -0.1456F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(36, 99).addBox(-1.4849F, -3.0748F, 2.2262F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.0736F, 0.2325F, -0.1456F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(131, 87).addBox(-1.306F, -4.8812F, -3.4489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -1.5495F, 0.2325F, -0.1456F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(134, 62).addBox(-1.306F, -5.4735F, 0.0763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -0.8689F, 0.2325F, -0.1456F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(134, 65).addBox(-1.306F, -4.225F, 0.4801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(60, 134).addBox(-1.306F, -4.725F, 0.4801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -0.7816F, 0.2325F, -0.1456F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(15, 132).addBox(-1.306F, -3.921F, 1.8617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -0.3889F, 0.2325F, -0.1456F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(10, 132).addBox(-1.306F, 0.9979F, 3.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.9637F, 0.2325F, -0.1456F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(133, 72).addBox(-1.306F, 4.6875F, -1.7866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 2.4909F, 0.2325F, -0.1456F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(85, 130).addBox(-1.3256F, -0.559F, -6.5277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -2.8004F, 0.2404F, -0.1569F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(53, 124).addBox(-1.2911F, -0.7791F, -6.7209F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -2.763F, 0.2334F, -0.1474F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(5, 117).addBox(-1.2929F, 5.6108F, 0.252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 1.8626F, 0.2325F, -0.1456F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(131, 78).addBox(-1.2929F, 4.2636F, 3.3913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 1.4088F, 0.2325F, -0.1456F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(32, 132).addBox(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F))
				.texOffs(20, 132).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.1511F, -3.531F, -1.5413F, -0.2444F, -0.742F, 0.4918F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(37, 132).addBox(0.0F, 0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-1.1511F, -3.531F, -1.5413F, 0.1521F, -0.7273F, -0.1016F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(61, 131).addBox(-1.2929F, 3.9768F, 3.6017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 1.339F, 0.2325F, -0.1456F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(43, 131).addBox(-1.2929F, 4.517F, 2.2219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 1.4961F, 0.2325F, -0.1456F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(80, 130).addBox(-1.2929F, 4.6297F, 1.4993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 1.5484F, 0.2325F, -0.1456F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(134, 126).addBox(-1.0965F, -4.1888F, -1.9406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -1.1298F, 0.15F, -0.154F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(102, 38).addBox(-1.0965F, -0.432F, -4.3332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -2.3603F, 0.15F, -0.154F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(134, 96).addBox(-1.0965F, -1.64F, -0.9376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -1.0339F, 0.15F, -0.154F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(136, 11).addBox(-1.0965F, -1.0069F, -0.0661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.4759F, 0.15F, -0.154F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(135, 116).addBox(-1.0965F, -1.3177F, 0.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.9558F, 0.15F, -0.154F));

		PartDefinition cube_r479 = leftFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(53, 128).addBox(-1.0965F, 0.284F, 0.5937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 2.1339F, 0.15F, -0.154F));

		PartDefinition cube_r480 = leftFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(135, 113).addBox(-1.0965F, 0.7034F, -2.9055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -2.6308F, 0.15F, -0.154F));

		PartDefinition cube_r481 = leftFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(134, 123).addBox(-1.0965F, -3.6055F, -1.7034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -1.06F, 0.15F, -0.154F));

		PartDefinition cube_r482 = leftFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(129, 63).addBox(-0.9605F, 0.779F, 5.6146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -2.679F, 0.098F, -0.1766F));

		PartDefinition cube_r483 = leftFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(101, 98).addBox(-0.9715F, 0.5726F, 3.2796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -2.714F, 0.0967F, -0.1801F));

		PartDefinition cube_r484 = leftFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(105, 131).addBox(-1.106F, -3.1069F, 4.0102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 131).addBox(-1.231F, -3.1069F, 4.0102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.1172F, 0.2325F, -0.1456F));

		PartDefinition cube_r485 = leftFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(92, 70).addBox(-1.2848F, -1.6961F, -3.6198F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.5333F, 0.1027F, -0.1587F));

		PartDefinition cube_r486 = leftFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(88, 9).addBox(-1.2839F, -1.7273F, -0.2999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.5893F, 0.15F, -0.154F));

		PartDefinition cube_r487 = leftFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(6, 127).addBox(-1.2839F, -2.6413F, 1.3349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.0744F, 0.15F, -0.154F));

		PartDefinition cube_r488 = leftFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(62, 100).addBox(-1.3018F, -1.1877F, -6.4898F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.3841F, 0.098F, -0.1766F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(121, 88).addBox(-1.3018F, -9.0964F, -0.7291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 1.8153F, 0.098F, -0.1766F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(134, 43).addBox(-1.3051F, -6.9154F, -7.0453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 134).addBox(-1.3051F, -6.9154F, -6.9703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 1.0557F, 0.0988F, -0.1792F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(75, 130).addBox(-1.3051F, -9.3783F, -3.8327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 1.5444F, 0.0988F, -0.1792F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(129, 45).addBox(-1.3051F, -8.3784F, 3.9366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 2.3822F, 0.0988F, -0.1792F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(129, 124).addBox(-1.3018F, -8.914F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 1.8763F, 0.098F, -0.1766F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(133, 69).addBox(-1.3018F, -7.0583F, -4.0363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 1.3877F, 0.098F, -0.1766F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(75, 136).addBox(-1.3018F, 3.9136F, -5.4578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, -0.3315F, 0.098F, -0.1766F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(120, 131).addBox(-1.3018F, -0.257F, -7.2014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.2968F, 0.098F, -0.1766F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(134, 59).addBox(-0.4979F, -1.3687F, -3.4635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 53).addBox(-0.4979F, -0.7687F, -3.4635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 128).addBox(-0.4729F, -0.3437F, 1.0615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(33, 128).addBox(-0.4729F, -0.3937F, 0.2615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2079F, 5.0011F, -11.715F, 0.4753F, 0.0679F, -0.0886F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(122, 121).addBox(-0.4729F, -1.7145F, -2.6492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2079F, 5.0011F, -11.715F, 0.4666F, 0.0679F, -0.0886F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(70, 128).addBox(-0.4729F, -1.0669F, -1.8296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2079F, 5.0011F, -11.715F, -0.0309F, 0.0679F, -0.0886F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(122, 108).addBox(-0.4729F, -0.7113F, -1.0809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2079F, 5.0011F, -11.715F, 0.0826F, 0.0679F, -0.0886F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(134, 56).addBox(-1.2839F, -0.0206F, -0.4678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.4671F, 0.15F, -0.154F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(129, 98).addBox(-1.2848F, -0.0162F, -1.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(129, 60).addBox(-1.2848F, -0.0162F, -2.0564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(133, 31).addBox(-1.2848F, -0.0162F, -2.8564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.4674F, 0.1327F, -0.1558F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(112, 122).addBox(-0.4729F, -0.2341F, 2.5879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2079F, 5.0011F, -11.715F, 0.6062F, 0.0679F, -0.0886F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(128, 17).addBox(-0.4729F, -0.3396F, 1.8127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2079F, 5.0011F, -11.715F, 0.5625F, 0.0679F, -0.0886F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(100, 128).addBox(-0.4783F, -0.5175F, -0.4759F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2079F, 5.0011F, -11.715F, 0.3442F, 0.0647F, -0.1021F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(122, 7).addBox(-1.3018F, 0.4986F, -6.1787F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.1223F, 0.098F, -0.1766F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(114, 94).addBox(-1.3018F, -0.7732F, -4.0741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.4975F, 0.098F, -0.1766F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(69, 32).addBox(-1.3018F, -1.1912F, -5.767F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.6023F, 0.098F, -0.1766F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(32, 74).addBox(-1.2848F, -0.4927F, -6.0583F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.4111F, 0.1027F, -0.1587F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(96, 55).addBox(-1.2839F, -1.4797F, -0.5233F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.3799F, 0.15F, -0.154F));

		PartDefinition cube_r511 = leftFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(104, 25).addBox(-1.4849F, -0.7778F, 2.3715F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3626F, 2.0954F, -6.1232F, 0.2656F, 0.2325F, -0.1456F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.626F, 2.2098F, -0.0129F, 0.0F, 0.0087F, 0.001F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(120, 38).mirror().addBox(0.5214F, -5.7851F, -4.4158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -1.6174F, -0.2288F, 0.1235F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(88, 117).mirror().addBox(0.5214F, -6.8266F, -0.924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -1.1374F, -0.2288F, 0.1235F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(0.4369F, -1.9101F, 0.5757F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.5651F, -0.1454F, 0.1065F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(0.5412F, -1.8794F, -5.3621F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.5466F, -0.0495F, 0.0843F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(36, 49).mirror().addBox(0.4004F, -0.7799F, -8.6157F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.3027F, -0.0744F, 0.0869F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(105, 89).mirror().addBox(-0.5F, -0.3194F, -1.6278F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.226F, 1.0483F, -1.7911F, -0.6652F, -0.1309F, 0.1309F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(105, 84).mirror().addBox(-0.5F, -0.9791F, -1.8796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.226F, 1.0483F, -1.7911F, -1.2761F, -0.1309F, 0.1309F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(105, 79).mirror().addBox(-0.5F, 0.0858F, -1.6748F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.226F, 1.0483F, -1.7911F, -0.3162F, -0.1309F, 0.1309F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(43, 127).mirror().addBox(0.485F, 4.8901F, 0.3489F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 1.7317F, -0.2325F, 0.1456F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(133, 75).mirror().addBox(0.485F, 3.501F, 0.8962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 2.1244F, -0.2325F, 0.1456F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(38, 117).mirror().addBox(0.485F, 2.4761F, -5.4445F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -2.9807F, -0.2325F, 0.1456F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(134, 40).mirror().addBox(0.335F, -5.6326F, -5.6247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -1.7764F, -0.2325F, 0.1456F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(136, 46).mirror().addBox(-0.9F, -0.2F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.9474F, -2.3981F, -1.7645F, -1.3935F, 0.1236F, -1.1269F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(136, 22).mirror().addBox(-0.1F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.1981F, -2.1192F, -1.7938F, -1.3581F, -0.0366F, -0.3564F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(128, 25).mirror().addBox(-0.875F, -1.5F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.8491F, -2.3849F, -1.2969F, -1.4537F, -0.1159F, -1.1411F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(22, 128).mirror().addBox(-0.675F, -0.7F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(0.6832F, -1.9185F, -0.5383F, -1.5647F, -0.1645F, -0.3843F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(75, 133).mirror().addBox(0.485F, -6.1092F, -3.94F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -1.4972F, -0.2325F, 0.1456F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(36, 99).mirror().addBox(0.485F, -3.0748F, 2.2262F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.0736F, -0.2325F, 0.1456F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(131, 87).mirror().addBox(0.306F, -4.8812F, -3.4489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -1.5495F, -0.2325F, 0.1456F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(134, 62).mirror().addBox(0.306F, -5.4735F, 0.0763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -0.8689F, -0.2325F, 0.1456F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(134, 65).mirror().addBox(0.306F, -4.225F, 0.4801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false)
				.texOffs(60, 134).mirror().addBox(0.306F, -4.725F, 0.4801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -0.7816F, -0.2325F, 0.1456F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(15, 132).mirror().addBox(0.306F, -3.921F, 1.8617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -0.3889F, -0.2325F, 0.1456F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(10, 132).mirror().addBox(0.306F, 0.9979F, 3.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.9637F, -0.2325F, 0.1456F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(133, 72).mirror().addBox(0.306F, 4.6875F, -1.7866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 2.4909F, -0.2325F, 0.1456F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(85, 130).mirror().addBox(0.3256F, -0.559F, -6.5277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -2.8004F, -0.2404F, 0.1569F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(53, 124).mirror().addBox(0.2911F, -0.7791F, -6.7209F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -2.763F, -0.2334F, 0.1474F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(5, 117).mirror().addBox(0.2929F, 5.6108F, 0.252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 1.8626F, -0.2325F, 0.1456F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(131, 78).mirror().addBox(0.2929F, 4.2636F, 3.3913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 1.4088F, -0.2325F, 0.1456F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(32, 132).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false)
				.texOffs(20, 132).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(1.1511F, -3.531F, -1.5413F, -0.2444F, 0.742F, -0.4918F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(37, 132).mirror().addBox(-1.0F, 0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(1.1511F, -3.531F, -1.5413F, 0.1521F, 0.7273F, 0.1016F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(61, 131).mirror().addBox(0.2929F, 3.9768F, 3.6017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 1.339F, -0.2325F, 0.1456F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(43, 131).mirror().addBox(0.2929F, 4.517F, 2.2219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 1.4961F, -0.2325F, 0.1456F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(80, 130).mirror().addBox(0.2929F, 4.6297F, 1.4993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 1.5484F, -0.2325F, 0.1456F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(134, 126).mirror().addBox(0.0965F, -4.1888F, -1.9406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -1.1298F, -0.15F, 0.154F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(102, 38).mirror().addBox(0.0965F, -0.432F, -4.3332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -2.3603F, -0.15F, 0.154F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(134, 96).mirror().addBox(0.0965F, -1.64F, -0.9376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -1.0339F, -0.15F, 0.154F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(136, 11).mirror().addBox(0.0965F, -1.0069F, -0.0661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.142F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.4759F, -0.15F, 0.154F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(135, 116).mirror().addBox(0.0965F, -1.3177F, 0.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.9558F, -0.15F, 0.154F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(53, 128).mirror().addBox(0.0965F, 0.284F, 0.5937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 2.1339F, -0.15F, 0.154F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(135, 113).mirror().addBox(0.0965F, 0.7034F, -2.9055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -2.6308F, -0.15F, 0.154F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(134, 123).mirror().addBox(0.0965F, -3.6055F, -1.7034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -1.06F, -0.15F, 0.154F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(129, 63).mirror().addBox(-0.0395F, 0.779F, 5.6146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -2.679F, -0.098F, 0.1766F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(101, 98).mirror().addBox(-0.0285F, 0.5726F, 3.2796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -2.714F, -0.0967F, 0.1801F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(105, 131).mirror().addBox(0.106F, -3.1069F, 4.0102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 131).mirror().addBox(0.231F, -3.1069F, 4.0102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.1172F, -0.2325F, 0.1456F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(0.2848F, -1.6961F, -3.6198F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.5333F, -0.1027F, 0.1587F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(88, 9).mirror().addBox(0.2839F, -1.7273F, -0.2999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.5893F, -0.15F, 0.154F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(6, 127).mirror().addBox(0.2839F, -2.6413F, 1.3349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.0744F, -0.15F, 0.154F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(62, 100).mirror().addBox(0.3018F, -1.1877F, -6.4898F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.3841F, -0.098F, 0.1766F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(121, 88).mirror().addBox(0.3018F, -9.0964F, -0.7291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 1.8153F, -0.098F, 0.1766F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(134, 43).mirror().addBox(0.3051F, -6.9154F, -7.0453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 134).mirror().addBox(0.3051F, -6.9154F, -6.9703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 1.0557F, -0.0988F, 0.1792F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(75, 130).mirror().addBox(0.3051F, -9.3783F, -3.8327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 1.5444F, -0.0988F, 0.1792F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(129, 45).mirror().addBox(0.3051F, -8.3784F, 3.9366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 2.3822F, -0.0988F, 0.1792F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(129, 124).mirror().addBox(0.3018F, -8.914F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 1.8763F, -0.098F, 0.1766F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(133, 69).mirror().addBox(0.3018F, -7.0583F, -4.0363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 1.3877F, -0.098F, 0.1766F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(75, 136).mirror().addBox(0.3018F, 3.9136F, -5.4578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, -0.3315F, -0.098F, 0.1766F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(120, 131).mirror().addBox(0.3018F, -0.257F, -7.2014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.2968F, -0.098F, 0.1766F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(134, 59).mirror().addBox(-0.5021F, -1.3687F, -3.4635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 53).mirror().addBox(-0.5021F, -0.7687F, -3.4635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(48, 128).mirror().addBox(-0.5271F, -0.3437F, 1.0615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(33, 128).mirror().addBox(-0.5271F, -0.3937F, 0.2615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2079F, 5.0011F, -11.715F, 0.4753F, -0.0679F, 0.0886F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(122, 121).mirror().addBox(-0.5271F, -1.7145F, -2.6492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2079F, 5.0011F, -11.715F, 0.4666F, -0.0679F, 0.0886F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(70, 128).mirror().addBox(-0.5271F, -1.0669F, -1.8296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2079F, 5.0011F, -11.715F, -0.0309F, -0.0679F, 0.0886F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(122, 108).mirror().addBox(-0.5271F, -0.7113F, -1.0809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2079F, 5.0011F, -11.715F, 0.0826F, -0.0679F, 0.0886F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(134, 56).mirror().addBox(0.2839F, -0.0206F, -0.4678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.4671F, -0.15F, 0.154F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(129, 98).mirror().addBox(0.2848F, -0.0162F, -1.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(129, 60).mirror().addBox(0.2848F, -0.0162F, -2.0564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(133, 31).mirror().addBox(0.2848F, -0.0162F, -2.8564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.4674F, -0.1327F, 0.1558F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(112, 122).mirror().addBox(-0.5271F, -0.2341F, 2.5879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2079F, 5.0011F, -11.715F, 0.6062F, -0.0679F, 0.0886F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(128, 17).mirror().addBox(-0.5271F, -0.3396F, 1.8127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2079F, 5.0011F, -11.715F, 0.5625F, -0.0679F, 0.0886F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(100, 128).mirror().addBox(-0.5217F, -0.5175F, -0.4759F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2079F, 5.0011F, -11.715F, 0.3442F, -0.0647F, 0.1021F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(122, 7).mirror().addBox(0.3018F, 0.4986F, -6.1787F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.1223F, -0.098F, 0.1766F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(114, 94).mirror().addBox(0.3018F, -0.7732F, -4.0741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.4975F, -0.098F, 0.1766F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(0.3018F, -1.1912F, -5.767F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.6023F, -0.098F, 0.1766F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(32, 74).mirror().addBox(0.2848F, -0.4927F, -6.0583F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.4111F, -0.1027F, 0.1587F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(96, 55).mirror().addBox(0.2839F, -1.4797F, -0.5233F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.3799F, -0.15F, 0.154F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(104, 25).mirror().addBox(0.485F, -0.7778F, 2.3715F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3626F, 2.0954F, -6.1232F, 0.2656F, -0.2325F, 0.1456F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7923F, 0.2071F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(52, 120).mirror().addBox(-0.6745F, 0.6254F, 1.6245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, 0.6631F, -0.2156F, 0.1725F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(19, 117).mirror().addBox(-0.1505F, -0.5485F, 0.4973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, 0.1292F, -0.4399F, 0.0993F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(31, 135).mirror().addBox(-0.0371F, -0.2486F, -4.7462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -4.2274F, -0.0096F, -0.0799F, 0.0226F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(135, 27).mirror().addBox(-1.0933F, -1.2107F, -0.9557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 135).mirror().addBox(-1.0933F, -1.0857F, -1.7557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1891F, 0.9799F, -8.7274F, -0.0088F, -0.045F, 0.0226F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(15, 135).mirror().addBox(-1.0933F, -1.1358F, -2.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 135).mirror().addBox(-1.0933F, -1.0108F, -3.3557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -0.0088F, -0.045F, 0.0226F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(134, 107).mirror().addBox(-1.0933F, -1.9208F, -7.1913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(133, 133).mirror().addBox(-1.0933F, -1.5208F, -7.1913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -0.0001F, -0.045F, 0.0226F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(74, 116).mirror().addBox(-0.5697F, 0.0838F, -1.6632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, 0.5323F, -0.1745F, 0.0F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(103, 134).mirror().addBox(-0.5697F, -0.3325F, -4.3315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, 0.0131F, -0.1745F, 0.0F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(119, 70).mirror().addBox(-0.5697F, 0.104F, -2.6415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, 0.1178F, -0.1745F, 0.0F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(27, 130).mirror().addBox(-0.1505F, -0.8503F, -0.136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, -0.3072F, -0.4399F, 0.0993F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(66, 119).mirror().addBox(-1.0933F, -0.0661F, -3.9251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -0.0175F, -0.045F, 0.0226F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(31, 116).mirror().addBox(-1.0287F, -0.1108F, -2.0822F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1891F, 0.9799F, -8.7274F, 0.0F, -0.048F, 0.0F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(83, 104).mirror().addBox(-0.0062F, 0.8409F, -4.7204F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -4.2274F, -0.0087F, -0.0829F, 0.0F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(56, 116).mirror().addBox(-0.0062F, 1.0307F, -2.6532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -4.2274F, -0.0916F, -0.0829F, 0.0F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(122, 56).mirror().addBox(-0.0062F, 0.046F, -0.7608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -4.2274F, -0.0785F, -0.0829F, 0.0F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(122, 42).mirror().addBox(-0.5697F, 0.6989F, -4.4275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, -0.1484F, -0.1745F, 0.0F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(111, 35).mirror().addBox(-0.5724F, -0.199F, -4.0064F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, 0.096F, -0.1745F, 0.0F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(129, 127).mirror().addBox(-0.5697F, 0.5196F, -2.2537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, 0.2269F, -0.1745F, 0.0F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(135, 3).mirror().addBox(-0.5697F, -0.573F, 0.024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, -1.1257F, -0.1745F, 0.0F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(5, 134).mirror().addBox(-1.0933F, 0.4295F, -5.5088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -0.1353F, -0.045F, 0.0226F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(0, 134).mirror().addBox(-1.0933F, 0.1791F, -4.8257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -0.083F, -0.045F, 0.0226F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(90, 136).mirror().addBox(-1.0933F, -3.4007F, 4.5641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, 2.6223F, -0.045F, 0.0226F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(88, 39).mirror().addBox(-1.0933F, 3.1182F, 4.7134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -2.6137F, -0.045F, 0.0226F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(134, 129).mirror().addBox(-1.0933F, 5.0437F, 1.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -2.029F, -0.045F, 0.0226F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(136, 87).mirror().addBox(-1.0933F, 2.0303F, -4.9772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -0.528F, -0.045F, 0.0226F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(129, 66).mirror().addBox(-1.0933F, 0.3259F, -4.7034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -0.1441F, -0.045F, 0.0226F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(119, 52).mirror().addBox(-1.0933F, -0.5614F, -3.8707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, 0.0916F, -0.045F, 0.0226F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(119, 48).mirror().addBox(-1.0287F, -0.6688F, -1.9464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1891F, 0.9799F, -8.7274F, 0.1353F, -0.048F, 0.0F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(-1.0933F, -0.4364F, -6.5935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -0.2706F, -0.045F, 0.0226F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(136, 81).mirror().addBox(-1.0933F, 1.2694F, -5.36F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -0.5324F, -0.045F, 0.0226F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(80, 136).mirror().addBox(-1.0933F, 0.7614F, -4.8499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -0.3928F, -0.045F, 0.0226F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(128, 133).mirror().addBox(-1.0933F, -0.4589F, -4.1966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2891F, 0.9799F, -8.7274F, -0.131F, -0.045F, 0.0226F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(45, 119).mirror().addBox(-0.0062F, -0.2221F, -4.7366F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(118, 34).mirror().addBox(-0.0062F, -0.2271F, -2.863F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -4.2274F, 0.096F, -0.0829F, 0.0F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(133, 104).mirror().addBox(-0.6947F, -3.0043F, -3.6377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, 0.8988F, -0.1745F, 0.0F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(118, 30).mirror().addBox(-0.525F, -0.5F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.8053F, 0.9236F, -4.654F, 0.1135F, -0.0872F, -0.0005F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(102, 43).mirror().addBox(-0.1312F, 0.6493F, -0.7887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -4.2274F, -0.2531F, -0.0829F, 0.0F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(133, 101).mirror().addBox(-0.6947F, 0.0893F, -4.9138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, 0.1134F, -0.1745F, 0.0F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(95, 133).mirror().addBox(-0.0062F, -0.2678F, -0.9138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2109F, 0.0799F, -4.2274F, 0.1134F, -0.0829F, 0.0F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(118, 26).mirror().addBox(-0.5716F, 0.2032F, -3.3531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, -0.1473F, -0.1742F, -0.0077F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(12, 117).mirror().addBox(-0.5697F, -0.007F, -1.803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4109F, 0.0799F, 0.0726F, 0.0087F, -0.1745F, 0.0F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(119, 70).addBox(-0.4303F, 0.104F, -2.6415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, 0.1178F, 0.1745F, 0.0F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(52, 120).addBox(-0.3255F, 0.6254F, 1.6245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, 0.6631F, 0.2156F, -0.1725F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(19, 117).addBox(-0.8495F, -0.5485F, 0.4973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, 0.1292F, 0.4399F, -0.0993F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(27, 130).addBox(-0.8495F, -0.8503F, -0.136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.387F, -2.3495F, -0.3072F, 0.4399F, -0.0993F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(66, 119).addBox(0.0933F, -0.0661F, -3.9251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -0.0175F, 0.045F, -0.0226F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(31, 116).addBox(0.0287F, -0.1108F, -2.0822F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1891F, 0.9799F, -8.7274F, 0.0F, 0.048F, 0.0F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(83, 104).addBox(-0.9938F, 0.8409F, -4.7204F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -4.2274F, -0.0087F, 0.0829F, 0.0F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(56, 116).addBox(-0.9938F, 1.0307F, -2.6532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -4.2274F, -0.0916F, 0.0829F, 0.0F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(122, 56).addBox(-0.9938F, 0.046F, -0.7608F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -4.2274F, -0.0785F, 0.0829F, 0.0F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(122, 42).addBox(-0.4303F, 0.6989F, -4.4275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, -0.1484F, 0.1745F, 0.0F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(111, 35).addBox(-0.4276F, -0.199F, -4.0064F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, 0.096F, 0.1745F, 0.0F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(129, 127).addBox(-0.4303F, 0.5196F, -2.2537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, 0.2269F, 0.1745F, 0.0F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(135, 3).addBox(-0.4303F, -0.573F, 0.024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, -1.1257F, 0.1745F, 0.0F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(74, 116).addBox(-0.4303F, 0.0838F, -1.6632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, 0.5323F, 0.1745F, 0.0F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(5, 134).addBox(0.0933F, 0.4295F, -5.5088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -0.1353F, 0.045F, -0.0226F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(0, 134).addBox(0.0933F, 0.1791F, -4.8257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -0.083F, 0.045F, -0.0226F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(90, 136).addBox(0.0933F, -3.4007F, 4.5641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, 2.6223F, 0.045F, -0.0226F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(88, 39).addBox(0.0933F, 3.1182F, 4.7134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -2.6137F, 0.045F, -0.0226F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(134, 129).addBox(0.0933F, 5.0437F, 1.6565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -2.029F, 0.045F, -0.0226F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(136, 87).addBox(0.0933F, 2.0303F, -4.9772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -0.528F, 0.045F, -0.0226F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(129, 66).addBox(0.0933F, 0.3259F, -4.7034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -0.1441F, 0.045F, -0.0226F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(119, 52).addBox(0.0933F, -0.5614F, -3.8707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, 0.0916F, 0.045F, -0.0226F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(119, 48).addBox(0.0287F, -0.6688F, -1.9464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1891F, 0.9799F, -8.7274F, 0.1353F, 0.048F, 0.0F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(134, 107).addBox(0.0933F, -1.9208F, -7.1913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(133, 133).addBox(0.0933F, -1.5208F, -7.1913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -0.0001F, 0.045F, -0.0226F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(82, 49).addBox(0.0933F, -0.4364F, -6.5935F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -0.2706F, 0.045F, -0.0226F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(136, 81).addBox(0.0933F, 1.2694F, -5.36F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -0.5324F, 0.045F, -0.0226F));

		PartDefinition cube_r649 = jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(80, 136).addBox(0.0933F, 0.7614F, -4.8499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -0.3928F, 0.045F, -0.0226F));

		PartDefinition cube_r650 = jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(31, 135).addBox(-0.9629F, -0.2486F, -4.7462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -4.2274F, -0.0096F, 0.0799F, -0.0226F));

		PartDefinition cube_r651 = jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(135, 27).addBox(0.0933F, -1.2107F, -0.9557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 135).addBox(0.0933F, -1.0857F, -1.7557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1891F, 0.9799F, -8.7274F, -0.0088F, 0.045F, -0.0226F));

		PartDefinition cube_r652 = jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(15, 135).addBox(0.0933F, -1.1358F, -2.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 135).addBox(0.0933F, -1.0108F, -3.3557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -0.0088F, 0.045F, -0.0226F));

		PartDefinition cube_r653 = jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(128, 133).addBox(0.0933F, -0.4589F, -4.1966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2891F, 0.9799F, -8.7274F, -0.131F, 0.045F, -0.0226F));

		PartDefinition cube_r654 = jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(45, 119).addBox(-0.9938F, -0.2221F, -4.7366F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(118, 34).addBox(-0.9938F, -0.2271F, -2.863F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -4.2274F, 0.096F, 0.0829F, 0.0F));

		PartDefinition cube_r655 = jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(133, 104).addBox(-0.3053F, -3.0043F, -3.6377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, 0.8988F, 0.1745F, 0.0F));

		PartDefinition cube_r656 = jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(118, 30).addBox(-0.475F, -0.5F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.8053F, 0.9236F, -4.654F, 0.1135F, 0.0872F, 0.0005F));

		PartDefinition cube_r657 = jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(102, 43).addBox(-0.8688F, 0.6493F, -0.7887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -4.2274F, -0.2531F, 0.0829F, 0.0F));

		PartDefinition cube_r658 = jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(133, 101).addBox(-0.3053F, 0.0893F, -4.9138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, 0.1134F, 0.1745F, 0.0F));

		PartDefinition cube_r659 = jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(103, 134).addBox(-0.4303F, -0.3325F, -4.3315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, 0.0131F, 0.1745F, 0.0F));

		PartDefinition cube_r660 = jaw.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(95, 133).addBox(-0.9938F, -0.2678F, -0.9138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2109F, 0.0799F, -4.2274F, 0.1134F, 0.0829F, 0.0F));

		PartDefinition cube_r661 = jaw.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(118, 26).addBox(-0.4284F, 0.2032F, -3.3531F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, -0.1473F, 0.1742F, 0.0077F));

		PartDefinition cube_r662 = jaw.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(12, 117).addBox(-0.4303F, -0.007F, -1.803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4109F, 0.0799F, 0.0726F, 0.0087F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 148, 148);
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