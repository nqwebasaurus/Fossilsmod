package fossils.fossils.client.blockentity.model.smilodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SmilodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm5;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart sternum;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftThumb;
	private final ModelPart leftArm4;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightThumb;
	private final ModelPart rightArm4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftCanine;
	private final ModelPart rightCanine;
	private final ModelPart leftCanine2;
	private final ModelPart rightCanine2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart leftCanine3;
	private final ModelPart rightCanine3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public SmilodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm5 = this.leftLeg3.getChild("leftArm5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm5 = this.rightLeg3.getChild("rightArm5");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.sternum = this.chest.getChild("sternum");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftThumb = this.leftArm3.getChild("leftThumb");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightThumb = this.rightArm3.getChild("rightThumb");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftCanine = this.head.getChild("leftCanine");
		this.rightCanine = this.head.getChild("rightCanine");
		this.leftCanine2 = this.head.getChild("leftCanine2");
		this.rightCanine2 = this.head.getChild("rightCanine2");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.leftCanine3 = this.jaw.getChild("leftCanine3");
		this.rightCanine3 = this.jaw.getChild("rightCanine3");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.723F, 11.9507F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 40).addBox(0.0F, -0.4889F, -0.9992F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.1F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 84).addBox(0.0F, -1.1678F, -0.9129F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -0.8F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 45).addBox(0.0F, -1.076F, -0.8558F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, -2.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 36).mirror().addBox(-0.5418F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 8).mirror().addBox(-1.0763F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.173F, -2.311F, -2.9097F, -0.4016F, -0.3726F, -0.1773F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(70, 36).addBox(-1.4582F, 0.079F, 0.9403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 8).addBox(-0.9237F, 0.1247F, -0.8852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.173F, -2.311F, -2.9097F, -0.4016F, 0.3726F, 0.1773F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8812F, 0.0604F, -1.2793F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(67, 31).addBox(-1.6964F, -1.4332F, 0.5533F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6643F, 0.1018F, 0.0812F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(77, 34).addBox(-0.5F, -0.925F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1054F, -1.5064F, 0.2012F, -0.2629F, 0.1018F, 0.0812F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(53, 53).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1054F, -1.5064F, 0.2012F, -0.9174F, 0.1018F, 0.0812F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 68).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.3F, 0.6F, -1.5719F, 0.1018F, 0.0812F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(31, 79).addBox(-0.5F, -0.375F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.3F, 0.6F, -0.6905F, 0.1018F, 0.0812F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(53, 49).addBox(-0.5F, 0.0F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0904F, -2.0254F, 1.5127F, -1.1194F, 0.1215F, 0.0467F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 37).addBox(-0.3683F, -0.3395F, -2.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1219F, 1.608F, 2.2648F, -1.3564F, 0.1663F, -0.1795F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(46, 51).addBox(-0.5F, -0.475F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.206F, 1.2694F, 2.3226F, -1.3041F, 0.1663F, -0.1795F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(53, 45).addBox(-0.3683F, -0.7197F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1219F, 1.608F, 2.2648F, -1.0859F, 0.1663F, -0.1795F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(50, 14).addBox(-0.9F, -1.6F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2033F, 1.514F, 0.9063F, -1.4719F, 0.5251F, 0.8337F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 78).addBox(-0.1571F, 0.1754F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.534F, 4.0102F, 3.2195F, -1.192F, 0.7259F, 0.7733F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 33).addBox(-0.4988F, -0.554F, -2.4831F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4273F, 3.0895F, 3.6502F, -0.7099F, 0.1311F, 0.078F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(60, 40).addBox(-0.6891F, -0.5F, -0.9151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4422F, 4.5464F, 3.9963F, -2.2314F, -0.3997F, 1.5478F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(60, 22).addBox(-0.1837F, -0.5F, -1.3527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4422F, 4.5464F, 3.9963F, -2.061F, -0.6015F, 1.1974F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(53, 41).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.9002F, 5.4946F, 3.5758F, 0.3089F, 0.7259F, 0.7733F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(60, 7).addBox(-0.1571F, -0.2456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.534F, 4.0102F, 3.2195F, -0.8692F, 0.7259F, 0.7733F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(60, 44).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4186F, 4.3224F, 4.4731F, -0.4644F, 0.4234F, 0.1876F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.8812F, 0.0604F, -1.2793F));

		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(67, 31).mirror().addBox(-0.3037F, -1.4332F, 0.5533F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6643F, -0.1018F, -0.0812F));

		PartDefinition cube_r25 = bone4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-0.5F, -0.925F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1054F, -1.5064F, 0.2012F, -0.2629F, -0.1018F, -0.0812F));

		PartDefinition cube_r26 = bone4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 53).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1054F, -1.5064F, 0.2012F, -0.9174F, -0.1018F, -0.0812F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(76, 68).mirror().addBox(-0.5F, -0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.3F, 0.6F, -1.5719F, -0.1018F, -0.0812F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(31, 79).mirror().addBox(-0.5F, -0.375F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.3F, 0.6F, -0.6905F, -0.1018F, -0.0812F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(53, 49).mirror().addBox(-0.5F, 0.0F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0904F, -2.0254F, 1.5127F, -1.1194F, -0.1215F, -0.0467F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(7, 37).mirror().addBox(-0.6317F, -0.3395F, -2.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1219F, 1.608F, 2.2648F, -1.3564F, -0.1663F, 0.1795F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(46, 51).mirror().addBox(-0.5F, -0.475F, -1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.206F, 1.2694F, 2.3226F, -1.3041F, -0.1663F, 0.1795F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(53, 45).mirror().addBox(-0.6317F, -0.7197F, -1.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1219F, 1.608F, 2.2648F, -1.0859F, -0.1663F, 0.1795F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(50, 14).mirror().addBox(-0.1F, -1.6F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2033F, 1.514F, 0.9063F, -1.4719F, -0.5251F, -0.8337F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-0.8429F, 0.1754F, -1.9606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.534F, 4.0102F, 3.2195F, -1.192F, -0.7259F, -0.7733F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(16, 33).mirror().addBox(-0.5012F, -0.554F, -2.4831F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4273F, 3.0895F, 3.6502F, -0.7099F, -0.1311F, -0.078F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(60, 40).mirror().addBox(-0.3109F, -0.5F, -0.9151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4422F, 4.5464F, 3.9963F, -2.2314F, 0.3997F, -1.5478F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(60, 22).mirror().addBox(-0.8163F, -0.5F, -1.3527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4422F, 4.5464F, 3.9963F, -2.061F, 0.6015F, -1.1974F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(53, 41).mirror().addBox(-0.5F, -1.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.9002F, 5.4946F, 3.5758F, 0.3089F, -0.7259F, -0.7733F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(60, 7).mirror().addBox(-0.8429F, -0.2456F, -1.4893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.534F, 4.0102F, 3.2195F, -0.8692F, -0.7259F, -0.7733F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(60, 44).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4186F, 4.3224F, 4.4731F, -0.4644F, -0.4234F, -0.1876F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 3.2233F, 2.0603F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r41 = leftLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(79, 40).addBox(-0.5F, -0.3966F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.1768F, 0.043F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leftLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(79, 31).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.0232F, -0.557F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leftLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(61, 28).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r44 = leftLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(61, 69).addBox(-0.5F, -0.0494F, -0.0909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.755F, -1.1575F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(49, 61).addBox(-0.5F, -2.9665F, -1.0402F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.655F, -0.1575F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r46 = leftLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(7, 54).addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.8721F, -1.8314F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r47 = leftLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(25, 41).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.9404F, -0.9985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r48 = leftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(60, 48).addBox(-1.0F, -0.8F, 0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.3641F, 0.0087F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 54).addBox(-1.0F, -0.033F, -0.2653F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.3652F, -1.2822F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r50 = leftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, 1.4697F, -0.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.5121F, -1.1715F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(59, 61).addBox(-0.5F, -0.0303F, 0.0125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.5121F, -1.1715F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(10, 70).addBox(-0.8F, 1.5691F, -0.603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 9.478F, -0.846F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(67, 3).addBox(-1.3F, -0.7F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 67).addBox(-1.3F, -0.7F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(67, 0).addBox(-1.3F, -0.0429F, -0.9784F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1255F, -0.4999F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 14).addBox(-1.3F, 0.0072F, -0.9772F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.4745F, 0.3001F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(34, 41).addBox(-0.5F, -7.8112F, -0.7657F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(62, 2).addBox(-0.5F, -0.1222F, -0.2452F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5131F, -0.3404F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(79, 43).addBox(-1.4F, 0.1303F, 0.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4719F, -0.2403F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(25, 69).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(39, 41).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftLeg3.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 4.0374F, 0.731F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftArm5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(7, 67).addBox(-1.9F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 63).addBox(-1.1F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 63).addBox(-0.3F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 49).addBox(0.5F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.7637F, -2.192F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftArm5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(25, 36).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 3.2233F, 2.0603F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(81, 67).addBox(-0.5F, -0.3966F, -0.0105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.1768F, 0.043F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(44, 81).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 0.0232F, -0.557F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(63, 37).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(66, 69).addBox(-0.5F, -0.0494F, -0.0909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.755F, -1.1575F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(54, 61).addBox(-0.5F, -2.9665F, -1.0402F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.655F, -0.1575F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(59, 57).addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.8721F, -1.8314F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightLeg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(43, 35).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.9404F, -0.9985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightLeg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(60, 51).addBox(-1.0F, -0.8F, 0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.3641F, 0.0087F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightLeg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(42, 59).addBox(-1.0F, -0.033F, -0.2653F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.3652F, -1.2822F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r71 = rightLeg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(5, 70).addBox(-0.5F, 1.4697F, -0.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.5121F, -1.1715F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightLeg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, -0.0303F, 0.0125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.5121F, -1.1715F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(40, 73).addBox(-0.2F, 1.5691F, -0.603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 9.478F, -0.846F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r73 = rightLeg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(67, 24).addBox(-0.7F, -0.7F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(67, 6).addBox(-0.7F, -0.7F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r74 = rightLeg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(67, 21).addBox(-0.7F, -0.0429F, -0.9784F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1255F, -0.4999F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightLeg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(66, 66).addBox(-0.7F, 0.0072F, -0.9772F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.4745F, 0.3001F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightLeg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -7.8112F, -0.7657F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightLeg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(64, 61).addBox(-0.5F, -0.1222F, -0.2452F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 3.5131F, -0.3404F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightLeg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(15, 82).addBox(0.4F, 0.1303F, 0.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6F, 0.4475F, -0.5467F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.4719F, -0.2403F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightLeg3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(44, 69).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4813F, -0.5748F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightLeg3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(23, 45).addBox(-1.0F, -0.5F, -0.3F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.8313F, -0.0991F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightLeg3.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 4.0374F, 0.731F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightArm5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(35, 84).addBox(1.9F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 31).addBox(1.1F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 21).addBox(0.3F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 18).addBox(-0.5F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.7637F, -2.192F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightArm5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(34, 36).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7244F, -3.6985F, -0.124F, 0.1732F, -0.0215F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(72, 83).addBox(0.0F, -1.0846F, -1.0452F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6986F, -0.7047F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(69, 83).addBox(0.0F, -1.1545F, -1.0037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0986F, -2.6047F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(68, 34).mirror().addBox(-1.7472F, -0.3232F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3619F, 0.08F, -1.3798F, -0.2066F, -0.2489F, -0.2514F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(69, 64).mirror().addBox(-0.6072F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0619F, 0.08F, -3.3798F, -0.2024F, -0.1463F, -0.273F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(68, 34).addBox(-0.2528F, -0.3232F, -0.4434F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3619F, 0.08F, -1.3798F, -0.2066F, 0.2489F, 0.2514F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(69, 64).addBox(-1.3928F, -0.2877F, -0.4857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0619F, 0.08F, -3.3798F, -0.2024F, 0.1463F, 0.273F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(28, 13).addBox(-0.5F, -0.1513F, 9.7474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1675F, -13.1658F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8028F, -3.6452F, -0.22F, 0.1278F, -0.0285F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(83, 83).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4703F, -3.4602F, -0.236F, 0.4254F, -0.8404F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(54, 38).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4703F, -3.4602F, -0.3392F, 0.3506F, -1.1116F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(73, 66).mirror().addBox(-5.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4703F, -3.4602F, -0.4446F, 0.1953F, -1.4967F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-0.8646F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2703F, -1.4602F, -0.2613F, 0.3992F, -0.8505F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(53, 12).mirror().addBox(-3.8352F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2703F, -1.4602F, -0.3555F, 0.3193F, -1.117F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(33, 29).mirror().addBox(-4.4429F, -1.7043F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2703F, -1.4602F, -0.4472F, 0.1605F, -1.4971F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(3, 84).mirror().addBox(-0.8222F, -0.2457F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -5.5602F, -0.2474F, 0.4356F, -0.7414F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-3.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -5.5602F, -0.3528F, 0.3577F, -1.0126F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-6.2581F, -1.8721F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8703F, -5.5602F, -0.4593F, 0.1971F, -1.3958F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(83, 83).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4703F, -3.4602F, -0.236F, -0.4254F, 0.8404F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(54, 38).addBox(0.8351F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4703F, -3.4602F, -0.3392F, -0.3506F, 1.1116F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(73, 66).addBox(3.4429F, -1.7043F, -0.4953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4703F, -3.4602F, -0.4446F, -0.1953F, 1.4967F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(75, 83).addBox(-0.1354F, 0.0002F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2703F, -1.4602F, -0.2613F, -0.3992F, 0.8505F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(53, 12).addBox(0.8351F, -0.2236F, -0.4953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2703F, -1.4602F, -0.3555F, -0.3193F, 1.117F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(33, 29).addBox(3.4429F, -1.7043F, -0.4953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2703F, -1.4602F, -0.4472F, -0.1605F, 1.4971F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(3, 84).addBox(-0.1778F, -0.2457F, -0.3159F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -5.5602F, -0.2474F, -0.4356F, 0.7414F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(58, 32).addBox(0.7306F, -0.4502F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -5.5602F, -0.3528F, -0.3577F, 1.0126F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(57, 0).addBox(3.2581F, -1.8721F, -0.3159F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8703F, -5.5602F, -0.4593F, -0.1971F, 1.3958F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 84).addBox(0.0F, -1.1205F, 0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1051F, -2.1528F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(86, 4).addBox(0.0F, -0.7594F, -0.0812F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1051F, -3.9528F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(84, 0).addBox(0.0F, -1.1938F, -0.0713F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0051F, -5.8528F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.5909F, -0.8958F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5949F, -5.8528F, 0.0528F, 0.1307F, 0.0069F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(26, 85).addBox(0.0F, -0.9121F, -0.1182F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -7.7F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(45, 73).addBox(0.0F, -3.2205F, -0.0062F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -4.1F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(11, 23).addBox(0.0F, -4.1687F, -0.0408F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -6.0F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(23, 77).addBox(0.0F, -2.6649F, -0.2021F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -2.0F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(71, 13).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9F, -7.4F, -0.2595F, 0.4204F, -0.6615F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(52, 36).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9F, -7.4F, -0.3598F, 0.3401F, -0.9301F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(70, 38).mirror().addBox(-6.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9F, -7.4F, -0.4588F, 0.1784F, -1.3108F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(49, 32).mirror().addBox(-7.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, -5.6F, -0.4634F, 0.1615F, -1.3116F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(50, 18).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, -5.6F, -0.3708F, 0.3261F, -0.9337F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(67, 9).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, -5.6F, -0.2745F, 0.4097F, -0.6675F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(52, 34).mirror().addBox(-7.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.4679F, 0.1446F, -1.3123F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-5.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.3817F, 0.3121F, -0.9371F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(49, 69).mirror().addBox(-2.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.2894F, 0.3988F, -0.6734F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(-7.4467F, -2.8451F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.4849F, 0.1491F, -1.3665F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-5.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3965F, 0.3224F, -0.9935F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(69, 11).mirror().addBox(-2.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3012F, 0.4124F, -0.7298F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(69, 11).addBox(0.3578F, -0.2808F, -0.7403F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3012F, -0.4124F, 0.7298F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 52).addBox(2.2048F, -0.8814F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.3965F, -0.3224F, 0.9935F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(9, 52).addBox(4.4467F, -2.8451F, -0.7403F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, -0.4849F, -0.1491F, 1.3665F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(49, 69).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.2894F, -0.3988F, 0.6734F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(52, 20).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.3817F, -0.3121F, 0.9371F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(52, 34).addBox(4.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.6F, -0.4679F, -0.1446F, 1.3123F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(67, 9).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -5.6F, -0.2745F, -0.4097F, 0.6675F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(50, 18).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -5.6F, -0.3708F, -0.3261F, 0.9337F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(49, 32).addBox(4.5116F, -2.7918F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -5.6F, -0.4634F, -0.1615F, 1.3116F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(70, 38).addBox(4.5116F, -2.7918F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -7.4F, -0.4588F, -0.1784F, 1.3108F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(52, 36).addBox(2.2438F, -0.8071F, -0.5952F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -7.4F, -0.3598F, -0.3401F, 0.9301F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(71, 13).addBox(0.3763F, -0.1988F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -7.4F, -0.2595F, -0.4204F, 0.6615F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(20, 77).addBox(-0.001F, -3.89F, -0.2153F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -7.7F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(28, 7).addBox(-0.5F, -0.0333F, -3.9642F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.4F, -4.1F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(26, 23).addBox(-0.5F, -0.3759F, -3.9807F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0911F, -7.6847F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(36, 79).addBox(0.0F, -2.3606F, -0.0758F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4094F, -1.7777F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(11, 84).addBox(0.0F, -1.985F, -0.9995F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7094F, -2.3777F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-5.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.4237F, 0.3681F, -1.2984F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(54, 26).mirror().addBox(-5.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.2448F, 0.502F, -0.88F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(-2.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3888F, -1.3421F, -0.0946F, 0.5466F, -0.5817F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(20, 29).mirror().addBox(-4.2983F, -0.6399F, -0.5399F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4559F, 6.1056F, 2.6275F, 0.2559F, 0.358F, 0.3551F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(38, 33).mirror().addBox(-3.3326F, -0.1676F, -0.1131F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4839F, 5.2332F, 0.8326F, 0.2242F, 0.2314F, 0.1731F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(83, 77).addBox(4.8019F, -2.58F, -0.3953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.4237F, -0.3681F, 1.2984F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(54, 26).addBox(2.4283F, -0.4987F, -0.3953F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.2448F, -0.502F, 0.88F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(71, 15).addBox(0.4746F, 0.1468F, -0.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3888F, -1.3421F, -0.0946F, -0.5466F, 0.5817F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(20, 29).addBox(-0.7017F, -0.6399F, -0.5399F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4559F, 6.1056F, 2.6275F, 0.2559F, -0.358F, -0.3551F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(38, 33).addBox(-0.6674F, -0.1676F, -0.1131F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4839F, 5.2332F, 0.8326F, 0.2242F, -0.2314F, -0.1731F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(29, 31).addBox(-0.5F, -1.6793F, -3.3157F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 6.7581F, 2.8051F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(28, 59).addBox(-0.5F, -0.8713F, -1.9949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.3094F, -1.3777F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(14, 54).addBox(-0.5F, -0.3756F, -1.9118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0906F, 0.0223F, 0.5323F, 0.0F, 0.0F));

		PartDefinition sternum = chest.addOrReplaceChild("sternum", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1359F, 6.1976F, 3.0731F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r158 = sternum.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(26, 21).mirror().addBox(-5.3F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3196F, -1.6477F, 9.1472F, 0.6071F, 0.5101F, 1.0944F));

		PartDefinition cube_r159 = sternum.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(43, 39).mirror().addBox(-3.7F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5344F, -1.6773F, 8.8932F, 0.4735F, 0.3252F, 0.9698F));

		PartDefinition cube_r160 = sternum.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(41, 20).mirror().addBox(-3.4F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8982F, -1.5647F, 7.1254F, 0.3821F, 0.4113F, 0.7238F));

		PartDefinition cube_r161 = sternum.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-4.7F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.457F, -0.7591F, 4.9588F, 0.2686F, 0.4623F, 0.4377F));

		PartDefinition cube_r162 = sternum.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(28, 19).mirror().addBox(-4.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6061F, -0.5953F, 3.0129F, 0.2583F, 0.45F, 0.4139F));

		PartDefinition cube_r163 = sternum.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(7, 29).mirror().addBox(-4.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4673F, -0.6882F, 1.1707F, 0.174F, 0.4666F, 0.2049F));

		PartDefinition cube_r164 = sternum.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(16, 31).addBox(-0.3F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1853F, -0.7591F, 4.9588F, 0.2686F, -0.4623F, -0.4377F));

		PartDefinition cube_r165 = sternum.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(26, 21).addBox(-0.7F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0479F, -1.6477F, 9.1472F, 0.6071F, -0.5101F, -1.0944F));

		PartDefinition cube_r166 = sternum.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(43, 39).addBox(-0.3F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2626F, -1.6773F, 8.8932F, 0.4735F, -0.3252F, -0.9698F));

		PartDefinition cube_r167 = sternum.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(41, 20).addBox(-0.6F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6265F, -1.5647F, 7.1254F, 0.3821F, -0.4113F, -0.7238F));

		PartDefinition cube_r168 = sternum.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(15, 14).addBox(-0.5F, -1.7677F, -0.0143F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.6718F, 4.8464F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r169 = sternum.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(28, 19).addBox(-0.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3343F, -0.5953F, 3.0129F, 0.2583F, -0.45F, -0.4139F));

		PartDefinition cube_r170 = sternum.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(7, 29).addBox(-0.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1956F, -0.6882F, 1.1707F, 0.174F, -0.4666F, -0.2049F));

		PartDefinition cube_r171 = sternum.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(15, 7).addBox(-0.5F, -1.4801F, -3.9781F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1359F, 0.3718F, 3.6464F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8814F, 4.3862F, 0.6181F, 1.0021F, -0.009F, -0.0068F));

		PartDefinition cube_r172 = leftarm.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(45, 66).addBox(-1.0F, -0.8F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.6835F, 1.1413F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftarm.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(27, 66).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 7.6835F, 1.1413F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(20, 66).addBox(-1.0F, 1.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.8609F, 1.9677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(37, 23).addBox(-0.5F, -0.5F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5118F, -0.2961F, -0.5244F, -0.3404F, 0.0014F, -0.001F));

		PartDefinition cube_r176 = leftarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(5, 62).addBox(-0.5F, -1.7F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 4.9321F, 0.3403F, 0.5061F, 0.0011F, -0.002F));

		PartDefinition cube_r177 = leftarm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(15, 75).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0083F, 2.3203F, -0.5939F, -0.0437F, 0.0031F, 0.0019F));

		PartDefinition cube_r178 = leftarm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(34, 67).addBox(-0.5F, -0.4F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0097F, 1.3297F, -0.9047F, 0.0872F, 0.0014F, -0.001F));

		PartDefinition cube_r179 = leftarm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(39, 68).addBox(-0.5F, -2.0538F, -1.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.5668F, 1.5408F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r180 = leftarm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(10, 74).addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.2709F, 0.8326F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftarm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(5, 74).addBox(-0.5F, -1.9926F, -0.8121F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7969F, 2.0022F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(68, 17).addBox(0.0F, -0.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.1885F, 0.4014F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftarm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(59, 83).addBox(0.0F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.0915F, 0.2726F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 8.5337F, 1.6508F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(79, 0).addBox(-0.3F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, 0.4897F, 0.4257F, 1.5708F, 0.4276F, -1.5708F));

		PartDefinition cube_r185 = leftarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(78, 13).addBox(-0.9378F, -0.8741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.107F)), PartPose.offsetAndRotation(-0.1764F, -1.1461F, 1.0201F, 1.5708F, -0.5149F, -1.5708F));

		PartDefinition cube_r186 = leftarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 78).addBox(0.559F, -1.1779F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, 0.5539F, 1.0201F, 1.5708F, -0.0611F, -1.5708F));

		PartDefinition cube_r187 = leftarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(15, 71).addBox(-0.9598F, 0.0375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.136F, -1.1702F, 1.2549F, -1.5708F, -1.3788F, 1.5708F));

		PartDefinition cube_r188 = leftarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(35, 52).addBox(-0.0335F, -3.3622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3236F, 7.0713F, 1.0272F, 1.5708F, -1.3614F, -1.5708F));

		PartDefinition cube_r189 = leftarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(69, 73).addBox(-0.1399F, -1.8491F, -0.1413F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1564F, 3.0773F, -0.488F, 1.5708F, -1.4923F, -1.6232F));

		PartDefinition cube_r190 = leftarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(64, 73).addBox(-0.7399F, -1.8491F, -0.1413F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0805F, 4.5256F, 0.5828F, 1.5708F, -1.2741F, -1.6232F));

		PartDefinition cube_r191 = leftarm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(10, 65).addBox(-0.1399F, -2.7491F, -0.1413F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0591F, 7.1887F, 0.4899F, 1.5708F, -1.3788F, -1.6232F));

		PartDefinition cube_r192 = leftarm2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(74, 44).addBox(-0.686F, -1.7557F, 0.0052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.0846F, 1.6468F, -0.0615F, 1.5865F, -1.1517F, -1.6371F));

		PartDefinition cube_r193 = leftarm2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(56, 69).addBox(-0.657F, -1.744F, 0.0052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0846F, 1.6468F, -0.0615F, 1.6316F, -1.4657F, -1.6833F));

		PartDefinition cube_r194 = leftarm2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(48, 8).addBox(0.0415F, -3.9622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 3.7584F, 0.2624F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 7.3379F, 1.3658F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftArm3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(46, 22).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftThumb = leftArm3.addOrReplaceChild("leftThumb", CubeListBuilder.create().texOffs(59, 73).addBox(-0.4F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2383F, 2.1254F, -0.2606F, -0.1466F, 0.1886F, 0.7813F));

		PartDefinition cube_r196 = leftThumb.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(84, 43).addBox(0.0F, -0.5F, -1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.5F, 0.1F, -0.6632F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0236F, 3.0605F, 0.0949F, 1.8849F, 0.0037F, -0.0024F));

		PartDefinition cube_r197 = leftArm4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(84, 73).addBox(-1.9F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 70).addBox(-1.1F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 61).addBox(-0.3F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 58).addBox(0.5F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.7637F, -2.192F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftArm4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(16, 38).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8814F, 4.3862F, 0.6181F, 0.9585F, 0.009F, 0.0068F));

		PartDefinition cube_r199 = rightarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(59, 66).addBox(-1.0F, -0.8F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.6835F, 1.1413F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(66, 57).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 7.6835F, 1.1413F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r201 = rightarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(52, 66).addBox(-1.0F, 1.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.8609F, 1.9677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r202 = rightarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(39, 5).addBox(-1.5F, -0.5F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5118F, -0.2961F, -0.5244F, -0.3404F, -0.0014F, 0.001F));

		PartDefinition cube_r203 = rightarm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(40, 63).addBox(-0.5F, -1.7F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0044F, 4.9321F, 0.3403F, 0.5061F, -0.0011F, 0.002F));

		PartDefinition cube_r204 = rightarm.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(30, 75).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0083F, 2.3203F, -0.5939F, -0.0437F, -0.0031F, -0.0019F));

		PartDefinition cube_r205 = rightarm.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(67, 52).addBox(-0.5F, -0.4F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0097F, 1.3297F, -0.9047F, 0.0872F, -0.0014F, 0.001F));

		PartDefinition cube_r206 = rightarm.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(20, 69).addBox(-0.5F, -2.0538F, -1.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.5668F, 1.5408F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r207 = rightarm.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(74, 40).addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.2709F, 0.8326F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r208 = rightarm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(74, 21).addBox(-0.5F, -1.9926F, -0.8121F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7969F, 2.0022F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r209 = rightarm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(68, 27).addBox(-1.0F, -0.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.1885F, 0.4014F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(64, 83).addBox(-1.0F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.0915F, 0.2726F, 0.0262F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 8.5337F, 1.6508F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightarm2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(79, 22).addBox(-0.7F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, 0.4897F, 0.4257F, 1.5708F, -0.4276F, 1.5708F));

		PartDefinition cube_r212 = rightarm2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(78, 25).addBox(-0.0622F, -0.8741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.107F)), PartPose.offsetAndRotation(0.1764F, -1.1461F, 1.0201F, 1.5708F, 0.5149F, 1.5708F));

		PartDefinition cube_r213 = rightarm2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(5, 78).addBox(-1.559F, -1.1779F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, 0.5539F, 1.0201F, 1.5708F, 0.0611F, 1.5708F));

		PartDefinition cube_r214 = rightarm2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(73, 27).addBox(-0.0402F, 0.0375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.136F, -1.1702F, 1.2549F, -1.5708F, 1.3788F, -1.5708F));

		PartDefinition cube_r215 = rightarm2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(40, 52).addBox(-0.9665F, -3.3622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3236F, 7.0713F, 1.0272F, 1.5708F, 1.3614F, 1.5708F));

		PartDefinition cube_r216 = rightarm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(74, 0).addBox(-0.8601F, -1.8491F, -0.1413F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1564F, 3.0773F, -0.488F, 1.5708F, 1.4923F, 1.6232F));

		PartDefinition cube_r217 = rightarm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 74).addBox(-0.2601F, -1.8491F, -0.1413F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0805F, 4.5256F, 0.5828F, 1.5708F, 1.2741F, 1.6232F));

		PartDefinition cube_r218 = rightarm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(15, 66).addBox(-0.8601F, -2.7491F, -0.1413F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0591F, 7.1887F, 0.4899F, 1.5708F, 1.3788F, 1.6232F));

		PartDefinition cube_r219 = rightarm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(74, 48).addBox(-0.314F, -1.7557F, 0.0052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.0846F, 1.6468F, -0.0615F, 1.5865F, 1.1517F, 1.6371F));

		PartDefinition cube_r220 = rightarm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(69, 60).addBox(-0.343F, -1.744F, 0.0052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0846F, 1.6468F, -0.0615F, 1.6316F, 1.4657F, 1.6833F));

		PartDefinition cube_r221 = rightarm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(30, 49).addBox(-1.0415F, -3.9622F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 3.7584F, 0.2624F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 7.3379F, 1.3658F, -0.4572F, 0.1176F, -0.0576F));

		PartDefinition cube_r222 = rightArm3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(14, 47).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightThumb = rightArm3.addOrReplaceChild("rightThumb", CubeListBuilder.create().texOffs(74, 4).addBox(-0.6F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2383F, 2.1254F, -0.2606F, -0.1466F, -0.1886F, -0.7813F));

		PartDefinition cube_r223 = rightThumb.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(84, 49).addBox(0.0F, -0.5F, -1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.5F, 0.1F, -0.6632F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0236F, 3.0605F, 0.0949F, 0.0087F, -0.0037F, 0.0024F));

		PartDefinition cube_r224 = rightArm4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(23, 85).addBox(1.9F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 85).addBox(1.1F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 85).addBox(0.3F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 85).addBox(-0.5F, 0.1F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.7637F, -2.192F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightArm4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(39, 10).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0528F, 2.9582F, 0.3414F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r226 = bone2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(74, 60).addBox(-0.5587F, -1.0993F, -0.3994F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5669F, 0.4642F, -0.3102F));

		PartDefinition cube_r227 = bone2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -2.0F, -0.9F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8897F, -4.442F, 1.2944F, -0.5052F, 0.4451F, -0.3737F));

		PartDefinition cube_r228 = bone2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3153F, -5.8821F, 1.8448F, -0.991F, 0.3562F, -0.3868F));

		PartDefinition cube_r229 = bone2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(48, 3).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3309F, -7.032F, 0.483F, -0.1445F, 0.3562F, -0.3868F));

		PartDefinition cube_r230 = bone2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4259F, -5.7554F, 4.296F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8751F, 0.4568F, -0.3428F));

		PartDefinition cube_r231 = bone2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(15, 21).addBox(-0.5F, -1.55F, -1.375F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5615F, -3.7338F, -0.6066F, 1.3899F, 0.4568F, -0.3428F));

		PartDefinition cube_r232 = bone2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(46, 41).addBox(-0.5F, -1.4F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.3884F, -3.0136F, -0.9548F, 2.208F, 0.4662F, -0.2492F));

		PartDefinition cube_r233 = bone2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3193F, -3.9253F, -0.2132F, 1.4648F, -0.0059F, -0.4459F));

		PartDefinition cube_r234 = bone2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(39, 83).addBox(-0.5587F, -1.187F, -1.0393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9809F, 0.4666F, -0.2893F));

		PartDefinition cube_r235 = bone2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(47, 27).addBox(-0.5587F, -0.9718F, 0.001F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8535F, 0.4666F, -0.2893F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0528F, 2.9582F, 0.3414F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r236 = bone3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(74, 60).mirror().addBox(-0.4413F, -1.0993F, -0.3994F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5669F, -0.4642F, 0.3102F));

		PartDefinition cube_r237 = bone3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.5F, -2.0F, -0.9F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8897F, -4.442F, 1.2944F, -0.5052F, -0.4451F, 0.3737F));

		PartDefinition cube_r238 = bone3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3153F, -5.8821F, 1.8448F, -0.991F, -0.3562F, 0.3868F));

		PartDefinition cube_r239 = bone3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(48, 3).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3309F, -7.032F, 0.483F, -0.1445F, -0.3562F, 0.3868F));

		PartDefinition cube_r240 = bone3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.5741F, -5.7554F, 4.296F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8751F, -0.4568F, 0.3428F));

		PartDefinition cube_r241 = bone3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(15, 21).mirror().addBox(-0.5F, -1.55F, -1.375F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5615F, -3.7338F, -0.6066F, 1.3899F, -0.4568F, 0.3428F));

		PartDefinition cube_r242 = bone3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(46, 41).mirror().addBox(-0.5F, -1.4F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.3884F, -3.0136F, -0.9548F, 2.208F, -0.4662F, 0.2492F));

		PartDefinition cube_r243 = bone3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, 0.0F, -3.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3193F, -3.9253F, -0.2132F, 1.4648F, 0.0059F, 0.4459F));

		PartDefinition cube_r244 = bone3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(39, 83).mirror().addBox(-0.4413F, -1.187F, -1.0393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9809F, -0.4666F, 0.2893F));

		PartDefinition cube_r245 = bone3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(47, 27).mirror().addBox(-0.4413F, -0.9718F, 0.001F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8535F, -0.4666F, 0.2893F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3974F, -3.25F, -0.0542F, 0.2614F, -0.014F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(83, 79).addBox(0.0F, -1.2076F, -0.8952F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7638F, -1.0128F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(21, 51).addBox(-0.5F, -0.2F, 3.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9638F, -5.7128F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3943F, -1.9248F, 0.244F, 0.2199F, 0.401F));

		PartDefinition cube_r248 = neck.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(86, 7).addBox(0.0F, -0.8423F, -1.0693F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4695F, -0.6993F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r249 = neck.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(7, 42).addBox(0.0F, -0.001F, -1.9564F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1762F, -3.6944F, -0.0387F, -0.0201F, 0.0F));

		PartDefinition cube_r250 = neck.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(80, 83).mirror().addBox(0.0F, -0.001F, 0.0436F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1762F, -3.6944F, -0.0387F, 0.0201F, 0.4796F));

		PartDefinition cube_r251 = neck.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(80, 83).addBox(0.0F, -0.001F, 0.0436F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1762F, -3.6944F, -0.0387F, -0.0201F, -0.4796F));

		PartDefinition cube_r252 = neck.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -1.1F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1695F, -4.6993F, -0.192F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -0.5932F, -2.956F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.6493F, -4.7036F, 0.1715F, 0.0029F, -0.0224F));

		PartDefinition cube_r253 = neck3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0932F, -0.456F, -0.733F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5247F, -2.0261F, -0.9763F, 0.1076F, -0.1984F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(14, 58).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3815F, 0.8877F, -1.2582F, 0.5877F, 0.0633F, 0.0942F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(7, 58).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3815F, 0.8877F, -1.2582F, 0.5877F, -0.0633F, -0.0942F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(35, 72).addBox(-0.5F, -0.0263F, -0.0506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5913F, -3.8049F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(10, 62).addBox(-1.0F, -0.9981F, -0.0436F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.1037F, -2.8654F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(61, 34).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.1037F, -3.3654F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(79, 71).addBox(-0.6F, -0.4745F, -0.9079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9686F, -2.4303F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(73, 17).addBox(-0.6F, -1.9984F, -1.0284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8614F, -0.2126F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(10, 81).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.6483F, -5.4832F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(24, 63).addBox(-1.5F, 0.079F, -1.0575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(62, 11).addBox(-1.5F, 0.079F, -0.8825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(78, 80).addBox(-1.0F, -0.121F, -0.8825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 63).addBox(-1.5F, 0.079F, -0.4075F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 61).addBox(-1.0F, -0.121F, -0.4075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9546F, -5.4414F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(71, 69).addBox(-1.0F, 0.0638F, -0.0967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.1546F, -4.5414F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(21, 55).addBox(-1.5F, 0.0468F, -0.0172F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 2.0546F, -5.0414F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(55, 3).addBox(-1.5F, 0.0279F, -0.7937F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 2.2546F, -5.1414F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(5, 48).addBox(-1.0F, -1.1752F, -0.1456F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 6.0477F, -4.7385F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(67, 49).addBox(-1.0F, -0.5F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(67, 46).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 3.9116F, -4.9785F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(67, 43).addBox(-1.0F, -0.7F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5543F, -4.6838F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(38, 28).addBox(-1.0F, -1.1F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 4.1768F, -4.2175F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(18, 52).addBox(-0.5F, -0.7292F, -0.1855F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3006F, -5.0841F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(61, 18).addBox(-1.0F, -0.7F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.851F, -5.0668F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(60, 54).addBox(-1.9F, -0.0975F, -0.6365F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.9F, 5.2816F, -4.8445F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(54, 83).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(67, 40).addBox(-1.0F, -0.5F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.078F, -5.1415F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(85, 64).addBox(0.006F, -0.55F, -0.325F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.59F, -1.7341F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(54, 28).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.002F, -0.7261F, -1.2942F, 2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(32, 85).addBox(0.995F, -1.3948F, -0.5545F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.9441F, -1.0171F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(72, 52).addBox(0.994F, -0.0212F, -2.0027F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8714F, -2.9748F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(29, 85).addBox(1.0F, -0.6212F, -0.7527F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.9441F, -2.0171F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(79, 49).addBox(0.498F, -0.3462F, -0.0527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.0F, -0.9441F, -2.0171F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(39, 47).addBox(-0.5F, -0.975F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.002F, 0.1445F, -2.1453F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(30, 71).addBox(0.498F, -0.0843F, -0.9381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -0.5F, -2.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(79, 46).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.9F, -0.0135F, -0.1869F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9225F, 5.7876F, -4.4926F, 0.0424F, -0.1019F, -0.0776F));

		PartDefinition cube_r283 = leftCanine.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(76, 10).addBox(-0.5F, -0.2F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1151F, -0.7313F, 0.7389F, 0.37F, 0.1853F, 0.0618F));

		PartDefinition cube_r284 = leftCanine.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(25, 73).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0682F, 0.6828F, 0.9551F, 0.5446F, 0.1853F, 0.0618F));

		PartDefinition cube_r285 = leftCanine.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(68, 77).addBox(-0.5F, -0.55F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0553F, 0.2325F, 0.7381F, 0.4573F, 0.1853F, 0.0618F));

		PartDefinition cube_r286 = leftCanine.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(15, 79).addBox(-0.5F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2874F, 2.4996F, 2.7209F, 1.2034F, 0.1853F, 0.0618F));

		PartDefinition cube_r287 = leftCanine.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(5, 81).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1206F, 1.7141F, 1.5741F, 0.7671F, 0.1853F, 0.0618F));

		PartDefinition cube_r288 = leftCanine.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(20, 73).addBox(-0.5F, -0.525F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0959F, 1.6366F, 1.4172F, 0.9853F, 0.1853F, 0.0618F));

		PartDefinition cube_r289 = leftCanine.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(77, 52).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0217F, 1.3669F, 0.9331F, 0.898F, 0.1853F, 0.0618F));

		PartDefinition cube_r290 = leftCanine.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(40, 77).addBox(-0.5F, -0.575F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0274F, 1.0021F, 0.5514F, 0.7235F, 0.1853F, 0.0618F));

		PartDefinition cube_r291 = leftCanine.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(77, 37).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(78, 16).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0543F, -0.1829F, 0.0174F, 0.4311F, 0.1853F, 0.0618F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9225F, 5.7876F, -4.4926F, 0.0424F, 0.1019F, 0.0776F));

		PartDefinition cube_r292 = rightCanine.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(35, 76).addBox(-0.5F, -0.2F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1151F, -0.7313F, 0.7389F, 0.37F, -0.1853F, -0.0618F));

		PartDefinition cube_r293 = rightCanine.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(73, 56).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0682F, 0.6828F, 0.9551F, 0.5446F, -0.1853F, -0.0618F));

		PartDefinition cube_r294 = rightCanine.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(73, 77).addBox(-0.5F, -0.55F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0553F, 0.2325F, 0.7381F, 0.4573F, -0.1853F, -0.0618F));

		PartDefinition cube_r295 = rightCanine.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(26, 79).addBox(-0.5F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2874F, 2.4996F, 2.7209F, 1.2034F, -0.1853F, -0.0618F));

		PartDefinition cube_r296 = rightCanine.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(20, 82).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1206F, 1.7141F, 1.5741F, 0.7671F, -0.1853F, -0.0618F));

		PartDefinition cube_r297 = rightCanine.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(54, 73).addBox(-0.5F, -0.525F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.0959F, 1.6366F, 1.4172F, 0.9853F, -0.1853F, -0.0618F));

		PartDefinition cube_r298 = rightCanine.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(63, 77).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.0217F, 1.3669F, 0.9331F, 0.898F, -0.1853F, -0.0618F));

		PartDefinition cube_r299 = rightCanine.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(58, 77).addBox(-0.5F, -0.575F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0274F, 1.0021F, 0.5514F, 0.7235F, -0.1853F, -0.0618F));

		PartDefinition cube_r300 = rightCanine.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(53, 77).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(78, 28).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0543F, -0.1829F, 0.0174F, 0.4311F, -0.1853F, -0.0618F));

		PartDefinition leftCanine2 = head.addOrReplaceChild("leftCanine2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5976F, 5.8418F, -5.1098F, -0.3797F, -0.1647F, -0.1461F));

		PartDefinition cube_r301 = leftCanine2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(82, 34).addBox(0.054F, -0.4237F, -0.6404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 31).addBox(0.054F, -0.6237F, -0.6404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.6449F, 0.2915F, 0.2598F, 0.6353F, 0.0414F, 0.1674F));

		PartDefinition rightCanine2 = head.addOrReplaceChild("rightCanine2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5976F, 5.8418F, -5.1098F, -0.3797F, 0.1647F, 0.1461F));

		PartDefinition cube_r302 = rightCanine2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(30, 82).addBox(-1.054F, -0.4237F, -0.6404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(48, 75).addBox(-1.054F, -0.6237F, -0.6404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.6449F, 0.2915F, 0.2598F, 0.6353F, -0.0414F, -0.1674F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.4495F, -5.0505F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(35, 62).addBox(-0.55F, -1.5F, -0.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(49, 71).addBox(-0.55F, -0.5F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.656F, -1.0747F, 0.4651F, 0.3159F, 0.0788F, -0.0943F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(7, 31).addBox(-1.0F, -0.1F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6856F, -5.8474F, 2.8334F, 0.592F, 0.2678F, -0.3443F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(84, 46).addBox(0.165F, -0.194F, -0.7598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 84).addBox(0.15F, -0.194F, -0.3598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.175F, -1.3674F, 2.0879F, 0.7014F, 0.1186F, 0.0556F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(78, 77).addBox(-0.7639F, -0.8832F, -1.0211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2221F, -0.7311F, 1.6463F, 0.7591F, 0.7261F, 0.7477F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 81).addBox(-0.637F, -0.66F, -0.8466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(79, 58).addBox(-0.637F, -0.66F, -0.3466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.175F, -1.3674F, 2.0879F, 0.7451F, 0.1186F, 0.0556F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(49, 83).addBox(-0.2F, -0.7F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.3F, -0.8952F, 0.3667F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(25, 82).addBox(-0.637F, -0.9267F, -0.2605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.175F, -1.3674F, 2.0879F, 0.3524F, 0.1186F, 0.0556F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.4495F, -5.0505F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(35, 62).mirror().addBox(-0.45F, -1.5F, -0.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(49, 71).mirror().addBox(-0.45F, -0.5F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.656F, -1.0747F, 0.4651F, 0.3159F, -0.0788F, 0.0943F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(7, 31).mirror().addBox(0.0F, -0.1F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.6856F, -5.8474F, 2.8334F, 0.592F, -0.2678F, 0.3443F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(84, 46).mirror().addBox(-0.165F, -0.194F, -0.7598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 84).mirror().addBox(-0.15F, -0.194F, -0.3598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -1.3674F, 2.0879F, 0.7014F, -0.1186F, -0.0556F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(78, 77).mirror().addBox(-0.2361F, -0.8832F, -1.0211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2221F, -0.7311F, 1.6463F, 0.7591F, -0.7261F, -0.7477F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.363F, -0.66F, -0.8466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(79, 58).mirror().addBox(-0.363F, -0.66F, -0.3466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -1.3674F, 2.0879F, 0.7451F, -0.1186F, -0.0556F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(49, 83).mirror().addBox(-0.8F, -0.7F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.3F, -0.8952F, 0.3667F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(25, 82).mirror().addBox(-0.363F, -0.9267F, -0.2605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -1.3674F, 2.0879F, 0.3524F, -0.1186F, -0.0556F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(1.4F, 1.4328F, 2.0323F));

		PartDefinition cube_r317 = leftOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(46, 46).addBox(-0.6F, -1.4F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.6109F, 0.3768F, -2.4794F, 1.1551F, -1.392F, -1.2238F));

		PartDefinition cube_r318 = leftOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(48, 78).addBox(-0.293F, -0.5439F, 0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.1584F, 0.2193F, -2.8127F, 2.0527F, -1.1395F, -1.4765F));

		PartDefinition cube_r319 = leftOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(0, 58).addBox(-0.4422F, -0.1865F, -1.4044F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.1584F, 0.2193F, -2.8127F, 0.4065F, -1.0108F, -0.2544F));

		PartDefinition cube_r320 = leftOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(52, 57).addBox(-0.4422F, -0.6148F, -1.4304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1584F, 0.2193F, -2.8127F, 0.5461F, -1.0108F, -0.2544F));

		PartDefinition cube_r321 = leftOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(39, 80).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9404F, 0.9727F, -4.832F, 1.4588F, -0.0768F, 0.4872F));

		PartDefinition cube_r322 = leftOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(53, 22).addBox(-0.675F, 0.1526F, -1.9609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1118F, 1.1429F, -5.5545F, 1.3628F, -0.0768F, 0.4872F));

		PartDefinition cube_r323 = leftOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(53, 8).addBox(-0.7484F, 0.5659F, -0.4149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1118F, 1.1429F, -5.5545F, 0.8268F, 0.0081F, 0.4174F));

		PartDefinition cube_r324 = leftOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(79, 19).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.2268F, 0.3882F, -3.4422F, 2.0224F, 0.0081F, 0.4174F));

		PartDefinition cube_r325 = leftOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(81, 6).addBox(-0.5F, -0.225F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.9819F, 0.9361F, -3.6569F, 1.6733F, 0.0081F, 0.4174F));

		PartDefinition cube_r326 = leftOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(79, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.9819F, 0.9361F, -3.6569F, 1.2806F, 0.0081F, 0.4174F));

		PartDefinition cube_r327 = leftOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(57, 14).addBox(-0.7179F, -0.1447F, 0.348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1118F, 1.1429F, -5.5545F, 0.4254F, 0.0081F, 0.4174F));

		PartDefinition cube_r328 = leftOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(45, 55).addBox(-0.5F, -0.85F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8032F, 1.2878F, -6.1494F, 2.1942F, -0.2228F, -0.0255F));

		PartDefinition cube_r329 = leftOrbit.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(28, 55).addBox(-0.1856F, -0.5895F, -1.0576F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6558F, 0.4515F, -6.2111F, 1.1178F, 0.1413F, 0.6758F));

		PartDefinition cube_r330 = leftOrbit.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(14, 43).addBox(-0.9938F, -0.4658F, -0.3699F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6558F, 0.4515F, -6.2111F, 0.9267F, -0.3203F, -0.7077F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-1.4F, 1.4328F, 2.0323F));

		PartDefinition cube_r331 = rightOrbit.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(46, 46).mirror().addBox(-0.4F, -1.4F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.6109F, 0.3768F, -2.4794F, 1.1551F, 1.392F, 1.2238F));

		PartDefinition cube_r332 = rightOrbit.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(48, 78).mirror().addBox(-0.707F, -0.5439F, 0.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.1584F, 0.2193F, -2.8127F, 2.0527F, 1.1395F, 1.4765F));

		PartDefinition cube_r333 = rightOrbit.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.5578F, -0.1865F, -1.4044F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.1584F, 0.2193F, -2.8127F, 0.4065F, 1.0108F, 0.2544F));

		PartDefinition cube_r334 = rightOrbit.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(-0.5578F, -0.6148F, -1.4304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1584F, 0.2193F, -2.8127F, 0.5461F, 1.0108F, 0.2544F));

		PartDefinition cube_r335 = rightOrbit.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(39, 80).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9404F, 0.9727F, -4.832F, 1.4588F, 0.0768F, -0.4872F));

		PartDefinition cube_r336 = rightOrbit.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(53, 22).mirror().addBox(-0.325F, 0.1526F, -1.9609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1118F, 1.1429F, -5.5545F, 1.3628F, 0.0768F, -0.4872F));

		PartDefinition cube_r337 = rightOrbit.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(53, 8).mirror().addBox(-0.2516F, 0.5659F, -0.4149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1118F, 1.1429F, -5.5545F, 0.8268F, -0.0081F, -0.4174F));

		PartDefinition cube_r338 = rightOrbit.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(79, 19).mirror().addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-1.2268F, 0.3882F, -3.4422F, 2.0224F, -0.0081F, -0.4174F));

		PartDefinition cube_r339 = rightOrbit.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(-0.5F, -0.225F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.9819F, 0.9361F, -3.6569F, 1.6733F, -0.0081F, -0.4174F));

		PartDefinition cube_r340 = rightOrbit.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(79, 74).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.9819F, 0.9361F, -3.6569F, 1.2806F, -0.0081F, -0.4174F));

		PartDefinition cube_r341 = rightOrbit.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(57, 14).mirror().addBox(-0.2821F, -0.1447F, 0.348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1118F, 1.1429F, -5.5545F, 0.4254F, -0.0081F, -0.4174F));

		PartDefinition cube_r342 = rightOrbit.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(45, 55).mirror().addBox(-0.5F, -0.85F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8032F, 1.2878F, -6.1494F, 2.1942F, 0.2228F, 0.0255F));

		PartDefinition cube_r343 = rightOrbit.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(28, 55).mirror().addBox(-0.8144F, -0.5895F, -1.0576F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6558F, 0.4515F, -6.2111F, 1.1178F, -0.1413F, -0.6758F));

		PartDefinition cube_r344 = rightOrbit.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(14, 43).mirror().addBox(-1.0062F, -0.4658F, -0.3699F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6558F, 0.4515F, -6.2111F, 0.9267F, 0.3203F, 0.7077F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.4955F, -1.3122F, 2.0595F, 0.0F, 0.0F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(49, 59).addBox(-0.5F, -0.675F, -0.525F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.3546F, -5.6224F, -2.522F, 0.0F, 0.0F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(3, 86).mirror().addBox(0.1018F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 85).mirror().addBox(0.0982F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1123F, 1.239F, -2.3582F, -1.3487F, -0.0509F, -0.2446F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(78, 55).mirror().addBox(-0.1156F, 0.9689F, -0.4535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(79, 3).mirror().addBox(-0.1156F, -0.0311F, -0.4535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1675F, 1.2944F, -1.4872F, -1.317F, -0.0915F, -0.0668F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(-0.1F, -1.5907F, -0.2523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.1807F, -0.5732F, -2.1953F, -1.0393F, 0.6587F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(83, 25).mirror().addBox(0.0205F, -0.6192F, -0.7624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8092F, 2.0821F, -3.9172F, -1.4624F, -0.408F, -0.0667F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(-0.0037F, -0.1335F, -0.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8092F, 2.0821F, -3.9172F, -1.901F, -0.4206F, 0.0208F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(83, 12).mirror().addBox(-0.6379F, -0.5149F, -1.2327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.6066F, -3.2574F, -1.3258F, -0.2956F, -0.064F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(74, 73).mirror().addBox(-0.1096F, -0.0751F, -0.1595F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1675F, 1.2944F, -1.4872F, -1.4654F, -0.0884F, -0.0737F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(73, 80).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(73, 80).addBox(1.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8F, 0.665F, -0.6984F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(68, 80).mirror().addBox(-1.0F, -0.2804F, 0.6012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(68, 80).addBox(1.4F, -0.2804F, 0.6012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-1.3F, 0.0354F, -1.2694F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(80, 64).mirror().addBox(-0.5F, -0.7F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 64).addBox(1.9F, -0.7F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 1.7168F, -1.2434F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(63, 80).mirror().addBox(-0.1F, -0.881F, -0.3731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.1807F, -0.5732F, -2.012F, -1.0393F, 0.6587F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(58, 80).mirror().addBox(-0.2F, -1.0876F, 0.0224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.1807F, -0.5732F, -0.2405F, -1.0393F, 0.6587F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(53, 80).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(53, 80).addBox(2.1F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9F, 0.0622F, -0.4646F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(3, 86).addBox(-0.1018F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 85).addBox(-0.0982F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9123F, 1.239F, -2.3582F, -1.3487F, 0.0509F, 0.2446F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(78, 55).addBox(-0.8844F, 0.9689F, -0.4535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(79, 3).addBox(-0.8844F, -0.0311F, -0.4535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9675F, 1.2944F, -1.4872F, -1.317F, 0.0915F, 0.0668F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(83, 25).addBox(-1.0205F, -0.6192F, -0.7624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6092F, 2.0821F, -3.9172F, -1.4624F, 0.408F, 0.0667F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(83, 15).addBox(-0.9963F, -0.1335F, -0.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6092F, 2.0821F, -3.9172F, -1.901F, 0.4206F, -0.0208F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(83, 12).addBox(-0.3621F, -0.5149F, -1.2327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1F, 2.6066F, -3.2574F, -1.3258F, 0.2956F, 0.064F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(74, 73).addBox(-0.8904F, -0.0751F, -0.1595F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9675F, 1.2944F, -1.4872F, -1.4654F, 0.0884F, 0.0737F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(81, 9).addBox(-0.9F, -1.5907F, -0.2523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 1.1807F, -0.5732F, -2.1953F, 1.0393F, -0.6587F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(63, 80).addBox(-0.9F, -0.881F, -0.3731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 1.1807F, -0.5732F, -2.012F, 1.0393F, -0.6587F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(58, 80).addBox(-0.8F, -1.0876F, 0.0224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.0F, 1.1807F, -0.5732F, -0.2405F, 1.0393F, -0.6587F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(82, 37).addBox(-1.0F, 0.0969F, -0.073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.8106F, -3.9257F, -2.6267F, 0.0F, 0.0F));

		PartDefinition leftCanine3 = jaw.addOrReplaceChild("leftCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2207F, 0.9014F, -5.0507F, -1.382F, 0.0554F, -2.6677F));

		PartDefinition cube_r369 = leftCanine3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(83, 28).addBox(-0.1686F, -0.3758F, -0.6791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.304F, -0.3598F, -0.0489F, 0.7397F, 0.1277F, 0.0092F));

		PartDefinition cube_r370 = leftCanine3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(82, 52).addBox(-0.3104F, 0.106F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(83, 55).addBox(-0.3104F, -0.294F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.2549F, 0.1331F, -0.3669F, 1.1838F, 0.1255F, 0.0068F));

		PartDefinition rightCanine3 = jaw.addOrReplaceChild("rightCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9793F, 0.9014F, -5.0507F, -1.382F, -0.0554F, 2.6677F));

		PartDefinition cube_r371 = rightCanine3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(83, 28).mirror().addBox(-0.8314F, -0.3758F, -0.6791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.304F, -0.3598F, -0.0489F, 0.7397F, -0.1277F, -0.0092F));

		PartDefinition cube_r372 = rightCanine3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(82, 52).mirror().addBox(-0.6896F, 0.106F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(83, 55).mirror().addBox(-0.6896F, -0.294F, -0.2669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.2549F, 0.1331F, -0.3669F, 1.1838F, -0.1255F, -0.0068F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.4103F, -0.214F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2464F, 1.6845F, -0.8159F, -0.09F, 0.0952F));

		PartDefinition cube_r373 = tail.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(25, 33).addBox(0.0F, -0.2F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4103F, 2.786F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r374 = tail.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(83, 85).addBox(0.0F, -0.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3103F, 0.786F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(41, 15).addBox(-0.5F, -0.635F, -0.1039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1897F, 3.586F, 0.1384F, -0.5877F, 0.0536F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(35, 58).addBox(-0.5F, -0.5145F, -0.0425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1285F, 2.7952F, 0.9121F, -0.278F, -0.3408F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(21, 59).addBox(-0.5F, -0.4106F, 0.051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.104F, 1.8055F, 0.2466F, -0.2967F, -0.0735F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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