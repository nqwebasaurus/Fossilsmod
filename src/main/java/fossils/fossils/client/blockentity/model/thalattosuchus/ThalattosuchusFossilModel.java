package fossils.fossils.client.blockentity.model.thalattosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ThalattosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Lowerjaw;
	private final ModelPart bone3;
	private final ModelPart bone6;
	private final ModelPart snout;
	private final ModelPart bone4;
	private final ModelPart bone16;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart Body4;
	private final ModelPart Tail;
	private final ModelPart leftUpperLegL;
	private final ModelPart leftLowerLegL;
	private final ModelPart leftFootL;
	private final ModelPart rightUpperLegL;
	private final ModelPart rightLowerLegL;
	private final ModelPart rightFootL;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart leftUpperArm;
	private final ModelPart rightUpperArm;

	public ThalattosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body = this.fossil.getChild("Body");
		this.Neck = this.Body.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.bone3 = this.Lowerjaw.getChild("bone3");
		this.bone6 = this.bone3.getChild("bone6");
		this.snout = this.Head.getChild("snout");
		this.bone4 = this.snout.getChild("bone4");
		this.bone16 = this.Neck.getChild("bone16");
		this.Body2 = this.Body.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body4 = this.Body3.getChild("Body4");
		this.Tail = this.Body4.getChild("Tail");
		this.leftUpperLegL = this.Tail.getChild("leftUpperLegL");
		this.leftLowerLegL = this.leftUpperLegL.getChild("leftLowerLegL");
		this.leftFootL = this.leftLowerLegL.getChild("leftFootL");
		this.rightUpperLegL = this.Tail.getChild("rightUpperLegL");
		this.rightLowerLegL = this.rightUpperLegL.getChild("rightLowerLegL");
		this.rightFootL = this.rightLowerLegL.getChild("rightFootL");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.leftUpperArm = this.Body.getChild("leftUpperArm");
		this.rightUpperArm = this.Body.getChild("rightUpperArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, -1.0F));

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.5F, -14.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 76).addBox(0.0F, -1.6F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 76).addBox(0.0F, -1.3F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 13).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 17).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.5F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 53).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.577F, 0.4924F, -1.1154F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 19).mirror().addBox(-5.9496F, -2.5867F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 0.0F, 0.2075F, 0.5788F, -1.439F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 5).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 0.0F, 0.4766F, 0.3979F, -0.8795F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(54, 74).mirror().addBox(0.0F, -0.6F, -0.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8108F, 0.9383F, -3.9793F, -0.3333F, -0.1533F, 0.4781F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 46).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, 0.7024F, 0.2556F, -0.7775F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(61, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 0.0F, 0.582F, 0.1975F, -0.5254F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(28, 19).addBox(2.9496F, -2.5867F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 0.0F, 0.2075F, -0.5788F, 1.439F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 53).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.577F, -0.4924F, 1.1154F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 46).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.0F, 0.7024F, -0.2556F, 0.7775F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 5).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 0.0F, 0.4766F, -0.3979F, 0.8795F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 74).addBox(0.0F, -0.6F, -0.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8108F, 0.9383F, -3.9793F, -0.3333F, 0.1533F, -0.4781F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(61, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 0.0F, 0.582F, -0.1975F, 0.5254F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(69, 69).mirror().addBox(-3.5F, 0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 69).addBox(2.5F, 0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0203F, -1.4146F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 59).mirror().addBox(0.0F, -0.0235F, -1.9563F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 3.2203F, -0.6146F, 1.6464F, 0.0436F, -0.5219F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-0.2F, -1.5F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8388F, 5.014F, 0.4222F, 1.5009F, -0.0082F, -1.3059F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-0.0088F, 0.0063F, -0.5308F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8388F, 4.914F, 1.9222F, 2.654F, 0.5158F, -1.7901F));

		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(52, 65).mirror().addBox(-0.0088F, -0.9937F, -0.5308F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8388F, 4.914F, 1.9222F, 1.9774F, 0.28F, -2.1947F));

		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(11, 65).mirror().addBox(-0.0088F, -0.9937F, -0.5308F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8388F, 4.914F, 1.9222F, 1.8176F, 0.3238F, -2.45F));

		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(5, 0).mirror().addBox(-0.0088F, -0.9937F, -0.5308F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8388F, 4.914F, 1.9222F, 2.1548F, 0.2057F, -2.1106F));

		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(11, 65).addBox(0.0088F, -0.9937F, -0.5308F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8388F, 4.914F, 1.9222F, 1.8176F, -0.3238F, 2.45F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(52, 65).addBox(0.0088F, -0.9937F, -0.5308F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8388F, 4.914F, 1.9222F, 1.9774F, -0.28F, 2.1947F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(5, 0).addBox(0.0088F, -0.9937F, -0.5308F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8388F, 4.914F, 1.9222F, 2.1548F, -0.2057F, 2.1106F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 11).addBox(0.0088F, 0.0063F, -0.5308F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8388F, 4.914F, 1.9222F, 2.654F, -0.5158F, 1.7901F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(23, 0).addBox(-0.8F, -1.5F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8388F, 5.014F, 0.4222F, 1.5009F, 0.0082F, 1.3059F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(9, 59).addBox(-1.0F, -0.0235F, -1.9563F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 3.2203F, -0.6146F, 1.6464F, -0.0436F, 0.5219F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Neck.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(34, 13).addBox(0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 74).addBox(0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 56).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Neck.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(22, 38).mirror().addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7108F, 1.1383F, -1.3793F, -0.3294F, -0.0295F, 0.4354F));

		PartDefinition cube_r29 = Neck.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(0.0F, -0.4758F, 0.1306F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -4.8F, -0.5149F, -0.3068F, 0.1692F));

		PartDefinition cube_r30 = Neck.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(14, 71).addBox(0.0F, -0.4758F, 0.1306F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -4.8F, -0.5149F, 0.3068F, -0.1692F));

		PartDefinition cube_r31 = Neck.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(22, 38).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7108F, 1.1383F, -1.3793F, -0.3294F, 0.0295F, -0.4354F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(43, 65).addBox(-2.5F, 0.1566F, -6.0097F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 26).addBox(1.5F, 0.1566F, -6.0097F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(14, 18).addBox(-1.5F, 1.1566F, -6.0097F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -5.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(22, 50).addBox(-2.5F, -0.0892F, -3.1176F, 5.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -1.4434F, -3.4097F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(28, 13).addBox(-0.5F, -0.0475F, -3.0174F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -1.9934F, -1.2097F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(39, 32).addBox(-5.5F, -1.5F, -0.7F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.8785F, -0.4496F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(26, 32).mirror().addBox(0.9F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(26, 32).addBox(3.32F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.61F, 1.3732F, -8.4455F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(68, 23).mirror().addBox(0.2F, -1.3F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 67).mirror().addBox(-0.11F, -1.3F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(0, 24).mirror().addBox(0.48F, -1.3F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 67).addBox(4.11F, -1.3F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(68, 23).addBox(4.8F, -1.3F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 24).addBox(4.52F, -1.3F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.8559F, -4.984F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(64, 13).mirror().addBox(-0.5F, -0.695F, -3.5007F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.1599F, 0.1249F, 0.2628F, -0.0843F, -0.0226F));

		PartDefinition cube_r38 = Head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(0.0F, -0.6044F, -3.7932F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.2566F, -0.6097F, 0.1325F, -0.1557F, -0.0207F));

		PartDefinition cube_r39 = Head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0F, -0.6044F, -3.7932F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.0F, 0.2566F, -0.6097F, 0.1325F, 0.1557F, 0.0207F));

		PartDefinition cube_r40 = Head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(64, 13).addBox(-0.5F, -0.695F, -3.5007F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, 1.1599F, 0.1249F, 0.2628F, 0.0843F, 0.0226F));

		PartDefinition cube_r41 = Head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(26, 26).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1566F, -4.0097F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create().texOffs(11, 38).addBox(1.5F, 0.1432F, -6.5106F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F))
				.texOffs(11, 38).mirror().addBox(-2.5F, 0.1432F, -6.5106F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6566F, 0.4903F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Lowerjaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(14, 11).mirror().addBox(0.0F, -0.957F, -0.034F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 11).mirror().addBox(0.0F, -0.957F, -0.034F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4486F, -1.8805F, 0.2346F, -0.2549F, -0.0602F));

		PartDefinition cube_r43 = Lowerjaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(26, 64).mirror().addBox(-3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(26, 64).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.7432F, -6.5106F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Lowerjaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(62, 54).mirror().addBox(-3.0F, -1.0202F, -0.0112F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.0432F, -2.5106F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Lowerjaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(20, 13).mirror().addBox(-3.0F, -0.0626F, -0.0049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(20, 13).addBox(1.0F, -0.0626F, -0.0049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, 0.1432F, -0.9106F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Lowerjaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(70, 8).mirror().addBox(-3.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(70, 8).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.1432F, -0.5106F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Lowerjaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 42).mirror().addBox(-3.0F, -0.0166F, -2.9777F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(66, 42).addBox(1.0F, -0.0166F, -2.9777F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, -0.1568F, -2.5106F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Lowerjaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(14, 11).addBox(0.0F, -0.957F, -0.034F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4486F, -1.8805F, 0.2346F, 0.2549F, 0.0602F));

		PartDefinition cube_r49 = Lowerjaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(62, 54).addBox(2.0F, -1.0202F, -0.0112F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, 2.0432F, -2.5106F, 0.2269F, 0.0F, 0.0F));

		PartDefinition bone3 = Lowerjaw.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 57).addBox(0.5F, -0.0572F, -5.9598F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 57).mirror().addBox(-1.5F, -0.0572F, -5.9598F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2432F, -6.5106F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(63, 35).mirror().addBox(-1.0F, -0.55F, 0.0017F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 35).addBox(1.0F, -0.55F, 0.0017F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0572F, -5.9598F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(45, 57).mirror().addBox(-2.0F, -1.0F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(45, 57).addBox(0.0F, -1.0F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 0.9428F, -5.9598F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -0.0087F, -6.9996F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.001F))
				.texOffs(64, 63).addBox(0.9F, -0.5589F, -4.0049F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(64, 63).mirror().addBox(-0.9F, -0.5589F, -4.0049F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0572F, -5.9598F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(13, 26).mirror().addBox(-0.4096F, -1.0868F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0589F, -6.5049F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r53 = bone6.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(16, 48).mirror().addBox(-0.4435F, -0.9309F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0589F, -5.5049F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r54 = bone6.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(16, 48).addBox(0.4435F, -0.9309F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0589F, -5.5049F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r55 = bone6.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(13, 26).addBox(0.4096F, -1.0868F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0589F, -6.5049F, 0.0F, 0.0F, 0.6109F));

		PartDefinition snout = Head.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(49, 32).addBox(-1.5F, -0.7011F, -4.9739F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7566F, -7.0097F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r56 = snout.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(61, 3).mirror().addBox(-0.7F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 3).addBox(1.7F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.65F, -5.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bone4 = snout.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, -0.7F, -7.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(34, 5).addBox(-1.0F, -0.91F, -7.21F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(41, 40).addBox(-1.0F, -0.95F, -6.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F))
				.texOffs(33, 60).addBox(-0.5F, -0.35F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(33, 40).addBox(-1.0F, 1.0F, 2.575F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.25F, 0.0F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(44, 49).mirror().addBox(-0.1232F, -0.5567F, -0.2968F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.85F, 2.4F, 0.1676F, -0.4223F, -0.0692F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(44, 49).addBox(-1.8768F, -0.5567F, -0.2968F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.5F, -0.85F, 2.4F, 0.1676F, 0.4223F, 0.0692F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(47, 0).addBox(-1.0F, 0.0156F, -5.7384F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.75F, 5.8F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, -0.2078F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(22, 43).addBox(-1.0F, -0.2F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 59).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9522F, -5.9829F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(15, 38).mirror().addBox(-0.3696F, 0.0531F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, -6.4F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(15, 38).addBox(0.3696F, 0.0531F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, -6.4F, 0.0F, 0.0F, -0.3927F));

		PartDefinition bone16 = Neck.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.9F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.15F, 1.5F));

		PartDefinition cube_r64 = Body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(76, 2).addBox(0.0F, -1.65F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 76).addBox(0.0F, -1.65F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 76).addBox(0.0F, -1.65F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 76).addBox(0.0F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 40).addBox(-0.5F, -0.25F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(32, 26).mirror().addBox(-6.9496F, -2.5867F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 0.5F, 0.1893F, 0.538F, -1.3701F));

		PartDefinition cube_r66 = Body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(69, 19).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 0.5F, 0.4391F, 0.3715F, -0.815F));

		PartDefinition cube_r67 = Body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(17, 71).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 2.5F, 0.4024F, 0.3446F, -0.7232F));

		PartDefinition cube_r68 = Body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(40, 20).mirror().addBox(-6.9496F, -2.5867F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 2.5F, 0.1719F, 0.4971F, -1.274F));

		PartDefinition cube_r69 = Body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(50, 21).mirror().addBox(-6.9496F, -2.5867F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 4.5F, 0.1719F, 0.4971F, -1.2216F));

		PartDefinition cube_r70 = Body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(45, 71).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 4.5F, 0.4024F, 0.3446F, -0.6708F));

		PartDefinition cube_r71 = Body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(32, 58).mirror().addBox(-6.9496F, -2.5867F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 6.5F, 0.1553F, 0.456F, -1.1944F));

		PartDefinition cube_r72 = Body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 6.5F, 0.3665F, 0.3172F, -0.6476F));

		PartDefinition cube_r73 = Body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(68, 28).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 0.5F, 0.5394F, 0.1848F, -0.4549F));

		PartDefinition cube_r74 = Body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(71, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 2.5F, 0.4971F, 0.1719F, -0.3577F));

		PartDefinition cube_r75 = Body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(71, 61).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 4.5F, 0.4971F, 0.1719F, -0.3053F));

		PartDefinition cube_r76 = Body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(34, 74).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, 6.5F, 0.4549F, 0.1586F, -0.2774F));

		PartDefinition cube_r77 = Body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(69, 19).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 0.5F, 0.4391F, -0.3715F, 0.815F));

		PartDefinition cube_r78 = Body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(68, 28).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 0.5F, 0.5394F, -0.1848F, 0.4549F));

		PartDefinition cube_r79 = Body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(32, 26).addBox(2.9496F, -2.5867F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 0.5F, 0.1893F, -0.538F, 1.3701F));

		PartDefinition cube_r80 = Body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(71, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 2.5F, 0.4971F, -0.1719F, 0.3577F));

		PartDefinition cube_r81 = Body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(17, 71).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 2.5F, 0.4024F, -0.3446F, 0.7232F));

		PartDefinition cube_r82 = Body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(40, 20).addBox(2.9496F, -2.5867F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 2.5F, 0.1719F, -0.4971F, 1.274F));

		PartDefinition cube_r83 = Body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(71, 61).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 4.5F, 0.4971F, -0.1719F, 0.3053F));

		PartDefinition cube_r84 = Body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(45, 71).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 4.5F, 0.4024F, -0.3446F, 0.6708F));

		PartDefinition cube_r85 = Body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(50, 21).addBox(2.9496F, -2.5867F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 4.5F, 0.1719F, -0.4971F, 1.2216F));

		PartDefinition cube_r86 = Body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(32, 58).addBox(2.9496F, -2.5867F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 6.5F, 0.1553F, -0.456F, 1.1944F));

		PartDefinition cube_r87 = Body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(74, 32).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 6.5F, 0.3665F, -0.3172F, 0.6476F));

		PartDefinition cube_r88 = Body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(34, 74).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, 6.5F, 0.4549F, -0.1586F, 0.2774F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(40, 10).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-3.5F, 4.0F, 0.0F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 76).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 75).addBox(0.0F, -1.8F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 75).addBox(0.0F, -1.8F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 75).addBox(0.0F, -1.8F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 8.0F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition cube_r89 = Body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(13, 32).mirror().addBox(-5.9496F, -2.5867F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 0.5F, 0.1553F, 0.456F, -1.1769F));

		PartDefinition cube_r90 = Body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(71, 65).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 0.5F, 0.3665F, 0.3172F, -0.6301F));

		PartDefinition cube_r91 = Body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(18, 74).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 2.5F, 0.3665F, 0.3172F, -0.6476F));

		PartDefinition cube_r92 = Body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(63, 60).mirror().addBox(-5.9496F, -2.5867F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 2.5F, 0.1553F, 0.456F, -1.1944F));

		PartDefinition cube_r93 = Body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(68, 73).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 4.5F, 0.3523F, 0.3062F, -0.6869F));

		PartDefinition cube_r94 = Body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(62, 32).mirror().addBox(-5.9496F, -2.5867F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 4.5F, 0.1488F, 0.4396F, -1.2321F));

		PartDefinition cube_r95 = Body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(73, 51).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 6.5F, 0.2964F, 0.2615F, -0.7723F));

		PartDefinition cube_r96 = Body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-5.9496F, -2.5867F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 6.5F, 0.1239F, 0.3736F, -1.3117F));

		PartDefinition cube_r97 = Body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(71, 63).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 0.5F, 0.4549F, 0.1586F, -0.2599F));

		PartDefinition cube_r98 = Body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(61, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 6.5F, 0.3712F, 0.1313F, -0.3942F));

		PartDefinition cube_r99 = Body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(74, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 4.5F, 0.4381F, 0.1532F, -0.3149F));

		PartDefinition cube_r100 = Body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 2.5F, 0.4549F, 0.1586F, -0.2774F));

		PartDefinition cube_r101 = Body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(61, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 6.5F, 0.3712F, -0.1313F, 0.3942F));

		PartDefinition cube_r102 = Body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(73, 51).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 6.5F, 0.2964F, -0.2615F, 0.7723F));

		PartDefinition cube_r103 = Body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(60, 0).addBox(2.9496F, -2.5867F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 6.5F, 0.1239F, -0.3736F, 1.3117F));

		PartDefinition cube_r104 = Body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(74, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 4.5F, 0.4381F, -0.1532F, 0.3149F));

		PartDefinition cube_r105 = Body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(68, 73).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 4.5F, 0.3523F, -0.3062F, 0.6869F));

		PartDefinition cube_r106 = Body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(62, 32).addBox(2.9496F, -2.5867F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 4.5F, 0.1488F, -0.4396F, 1.2321F));

		PartDefinition cube_r107 = Body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(74, 27).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 2.5F, 0.4549F, -0.1586F, 0.2774F));

		PartDefinition cube_r108 = Body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(18, 74).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 2.5F, 0.3665F, -0.3172F, 0.6476F));

		PartDefinition cube_r109 = Body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(63, 60).addBox(2.9496F, -2.5867F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 2.5F, 0.1553F, -0.456F, 1.1944F));

		PartDefinition cube_r110 = Body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(13, 32).addBox(2.9496F, -2.5867F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 0.5F, 0.1553F, -0.456F, 1.1769F));

		PartDefinition cube_r111 = Body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(71, 65).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 0.5F, 0.3665F, -0.3172F, 0.6301F));

		PartDefinition cube_r112 = Body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(71, 63).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 0.5F, 0.4549F, -0.1586F, 0.2599F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r113 = Body4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(16, 75).addBox(-0.5F, -1.55F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 75).addBox(-0.5F, -1.55F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 75).addBox(-0.5F, -1.55F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 75).addBox(-0.5F, -1.65F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 8).addBox(-1.0F, -0.05F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Body4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(44, 73).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 0.5F, 0.2964F, 0.2615F, -0.8421F));

		PartDefinition cube_r115 = Body4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-4.9496F, -2.5867F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 0.5F, 0.1239F, 0.3736F, -1.3815F));

		PartDefinition cube_r116 = Body4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(39, 24).mirror().addBox(-3.9496F, -2.5867F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 2.5F, 0.109F, 0.3323F, -1.4391F));

		PartDefinition cube_r117 = Body4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(73, 23).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 2.5F, 0.2622F, 0.2332F, -0.9029F));

		PartDefinition cube_r118 = Body4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, 4.5F, 0.195F, 0.1758F, -0.9863F));

		PartDefinition cube_r119 = Body4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(55, 72).mirror().addBox(-3.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, 6.5F, 0.0644F, 0.0589F, -1.0017F));

		PartDefinition cube_r120 = Body4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(72, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, 6.5F, 0.082F, 0.0298F, -0.6096F));

		PartDefinition cube_r121 = Body4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(72, 59).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, 4.5F, 0.2467F, 0.0886F, -0.5999F));

		PartDefinition cube_r122 = Body4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 2.5F, 0.3295F, 0.1172F, -0.5215F));

		PartDefinition cube_r123 = Body4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(73, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 0.5F, 0.3712F, 0.1313F, -0.464F));

		PartDefinition cube_r124 = Body4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(55, 72).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, 6.5F, 0.0644F, -0.0589F, 1.0017F));

		PartDefinition cube_r125 = Body4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(72, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, 6.5F, 0.082F, -0.0298F, 0.6096F));

		PartDefinition cube_r126 = Body4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(73, 0).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, 4.5F, 0.195F, -0.1758F, 0.9863F));

		PartDefinition cube_r127 = Body4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(72, 59).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, 4.5F, 0.2467F, -0.0886F, 0.5999F));

		PartDefinition cube_r128 = Body4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(73, 23).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 2.5F, 0.2622F, -0.2332F, 0.9029F));

		PartDefinition cube_r129 = Body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(73, 6).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 2.5F, 0.3295F, -0.1172F, 0.5215F));

		PartDefinition cube_r130 = Body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(39, 24).addBox(2.9496F, -2.5867F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 2.5F, 0.109F, -0.3323F, 1.4391F));

		PartDefinition cube_r131 = Body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(73, 47).addBox(2.9496F, -2.5867F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 0.5F, 0.1239F, -0.3736F, 1.3815F));

		PartDefinition cube_r132 = Body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(44, 73).addBox(1.8478F, -0.7654F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 0.5F, 0.2964F, -0.2615F, 0.8421F));

		PartDefinition cube_r133 = Body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(73, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 0.5F, 0.3712F, -0.1313F, 0.464F));

		PartDefinition cube_r134 = Body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(39, 24).addBox(-3.0F, -2.0462F, -0.0164F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.0F, 0.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail = Body4.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, 7.2F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r135 = Tail.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 65).addBox(0.0F, -1.5F, 8.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 65).addBox(0.0F, -1.6F, 6.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 74).addBox(0.0F, -1.7F, 4.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 75).addBox(0.0F, -1.9F, 2.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 15).addBox(0.0F, -1.8F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 28).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r136 = Tail.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(12, 48).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.315F, 10.3471F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Tail.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(51, 10).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.315F, 8.3471F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r138 = Tail.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(61, 10).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.315F, 6.3471F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r139 = Tail.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(68, 47).mirror().addBox(-0.4008F, -0.5386F, -0.3518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 2).mirror().addBox(-0.4008F, -1.2386F, 1.6482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.8021F, 0.0481F, -1.987F, -0.2606F, -0.4553F));

		PartDefinition cube_r140 = Tail.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(62, 34).mirror().addBox(-0.0106F, -1.7066F, 1.1123F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.5765F, 2.9558F, 1.4279F, -1.6114F, -0.1238F, -0.5105F));

		PartDefinition cube_r141 = Tail.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-0.0106F, -0.3388F, -0.1736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5765F, 2.9558F, 1.4279F, -1.0878F, -0.1238F, -0.5105F));

		PartDefinition cube_r142 = Tail.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.9477F, 0.8058F, -1.0878F, -0.1238F, 0.2313F));

		PartDefinition cube_r143 = Tail.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(69, 32).addBox(-0.9894F, -0.3388F, -0.1736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5765F, 2.9558F, 1.4279F, -1.0878F, 0.1238F, 0.5105F));

		PartDefinition cube_r144 = Tail.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(62, 34).addBox(-0.9894F, -1.7066F, 1.1123F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.5765F, 2.9558F, 1.4279F, -1.6114F, 0.1238F, 0.5105F));

		PartDefinition cube_r145 = Tail.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(60, 2).addBox(-0.5992F, -1.2386F, 1.6482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 47).addBox(-0.5992F, -0.5386F, -0.3518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.8021F, 0.0481F, -1.987F, 0.2606F, 0.4553F));

		PartDefinition cube_r146 = Tail.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(69, 36).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.9477F, 0.8058F, -1.0878F, 0.1238F, -0.2313F));

		PartDefinition cube_r147 = Tail.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(5, 30).mirror().addBox(-2.3335F, -0.1741F, 5.7057F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -0.2F, 3.2F, -0.0512F, -0.01F, -0.6753F));

		PartDefinition cube_r148 = Tail.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(74, 68).mirror().addBox(-2.3335F, -0.1741F, 1.7057F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.1F, 3.2F, -0.0512F, -0.01F, -0.6753F));

		PartDefinition cube_r149 = Tail.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(31, 32).mirror().addBox(-2.3335F, -0.1741F, 3.7057F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1F, 3.2F, -0.0512F, -0.01F, -0.6753F));

		PartDefinition cube_r150 = Tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-2.3335F, -0.1741F, -0.2943F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3F, 3.2F, -0.0512F, -0.01F, -0.6753F));

		PartDefinition cube_r151 = Tail.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(23, 6).mirror().addBox(-1.9434F, -0.1556F, -0.3928F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, 1.2F, -0.248F, -0.1963F, -0.6284F));

		PartDefinition cube_r152 = Tail.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(23, 6).addBox(-0.0566F, -0.1556F, -0.3928F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 1.2F, -0.248F, 0.1963F, 0.6284F));

		PartDefinition cube_r153 = Tail.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(74, 53).addBox(0.3335F, -0.1741F, -0.2943F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3F, 3.2F, -0.0512F, 0.01F, 0.6753F));

		PartDefinition cube_r154 = Tail.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(31, 32).addBox(1.3335F, -0.1741F, 3.7057F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1F, 3.2F, -0.0512F, 0.01F, 0.6753F));

		PartDefinition cube_r155 = Tail.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(5, 30).addBox(1.3335F, -0.1741F, 5.7057F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.2F, 3.2F, -0.0512F, 0.01F, 0.6753F));

		PartDefinition cube_r156 = Tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(74, 68).addBox(0.3335F, -0.1741F, 1.7057F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.1F, 3.2F, -0.0512F, 0.01F, 0.6753F));

		PartDefinition leftUpperLegL = Tail.addOrReplaceChild("leftUpperLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 2.9F, 0.45F, 0.9188F, 0.5632F, -0.6716F));

		PartDefinition cube_r157 = leftUpperLegL.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(25, 70).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1357F, -0.1105F, -0.1597F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftUpperLegL.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -3.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1357F, 6.7895F, -0.1597F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftLowerLegL = leftUpperLegL.addOrReplaceChild("leftLowerLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2857F, 7.5395F, 0.1403F, 0.5459F, -0.3289F, 0.2291F));

		PartDefinition cube_r159 = leftLowerLegL.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 71).addBox(0.0F, -1.5F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 71).addBox(0.0F, -1.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6827F, 1.3498F, 0.589F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftFootL = leftLowerLegL.addOrReplaceChild("leftFootL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1673F, 2.8998F, 0.589F, 0.2618F, 0.0F, -0.2182F));

		PartDefinition cube_r160 = leftFootL.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(15, 60).addBox(-0.75F, 0.3F, -1.75F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2588F, -0.4659F, 0.0F, 0.0F, 0.3491F));

		PartDefinition rightUpperLegL = Tail.addOrReplaceChild("rightUpperLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 2.9F, 0.45F, 0.1586F, -0.4132F, 1.1699F));

		PartDefinition cube_r161 = rightUpperLegL.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(54, 57).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1357F, -0.1105F, -0.1597F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r162 = rightUpperLegL.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(47, 0).addBox(-0.5F, -3.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1357F, 6.7895F, -0.1597F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightLowerLegL = rightUpperLegL.addOrReplaceChild("rightLowerLegL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2857F, 7.5395F, 0.1403F, 0.503F, 0.3945F, -0.3503F));

		PartDefinition cube_r163 = rightLowerLegL.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(60, 47).addBox(-1.0F, -1.5F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 70).addBox(-1.0F, -1.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6827F, 1.3498F, 0.589F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightFootL = rightLowerLegL.addOrReplaceChild("rightFootL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1673F, 2.8998F, 0.589F, 0.2597F, -0.0338F, 0.3447F));

		PartDefinition cube_r164 = rightFootL.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 11).addBox(-0.25F, 0.3F, -1.75F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2588F, -0.4659F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, 9.8F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r165 = Tail2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(53, 49).addBox(0.0F, -1.35F, 8.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 8).addBox(0.0F, -1.25F, 6.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 59).addBox(0.0F, -1.25F, 4.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 25).addBox(0.0F, -1.45F, 2.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 64).addBox(0.0F, -1.65F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 0).addBox(-0.5F, -0.05F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Tail2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(40, 70).addBox(0.0F, -0.05F, 0.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 9.7F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Tail2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(71, 12).addBox(0.0F, -0.05F, 0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 7.7F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r168 = Tail2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(11, 38).addBox(0.0F, -0.05F, -0.1F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 5.7F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Tail2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(22, 38).addBox(0.0F, -0.05F, -0.1F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.7F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r170 = Tail2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(40, 13).addBox(0.0F, -0.05F, -0.1F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 1.7F, -1.0297F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(13, 26).addBox(-0.5F, -0.45F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F))
				.texOffs(44, 49).addBox(0.0F, -1.75F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 40).addBox(0.0F, -1.65F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 12).addBox(0.0F, -1.55F, 3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 48).addBox(0.0F, -1.25F, 5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 13).addBox(0.0F, -1.35F, 7.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 11.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r171 = Tail3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(49, 73).addBox(0.0F, -0.25F, -0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 8.6F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Tail3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(73, 73).addBox(0.0F, -0.25F, -0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 6.6F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Tail3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(8, 74).addBox(0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 4.6F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Tail3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(74, 34).addBox(0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 2.6F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Tail3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(74, 38).addBox(0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.6F, -0.9948F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 9.7F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r176 = Tail4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, -0.5471F, 1.8392F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 24).addBox(0.0F, -0.2471F, -0.1608F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 25).addBox(-0.5F, -1.0471F, -0.1608F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.05F, 3.3F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Tail4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(26, 26).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0517F, 3.634F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Tail4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(7, 11).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0517F, 3.634F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Tail4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(22, 50).addBox(0.0F, 0.8499F, 2.9459F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 50).addBox(0.0F, 0.8499F, 0.9459F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 47).addBox(-0.5F, -0.1501F, -0.0541F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.85F, 2.6F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Tail4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(11, 37).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3144F, 2.3745F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Tail4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(33, 40).addBox(0.0F, -1.7108F, -0.1526F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 26).addBox(0.0F, 0.6892F, 0.7474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 0).addBox(-0.5F, -0.3108F, -0.1526F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, -0.3665F, 0.0F, 0.0F));

		PartDefinition leftUpperArm = Body.addOrReplaceChild("leftUpperArm", CubeListBuilder.create().texOffs(55, 25).addBox(-1.0F, 0.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 69).addBox(-1.0F, 0.4F, 1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 54).addBox(-1.0F, -0.4F, 1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 36).addBox(-1.0F, -0.5F, 3.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.6F, 3.35F, 0.05F, -0.0347F, 0.5691F, 0.0179F));

		PartDefinition rightUpperArm = Body.addOrReplaceChild("rightUpperArm", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, 0.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(35, 68).addBox(0.0F, 0.4F, 1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 19).addBox(0.0F, -0.4F, 1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 0).addBox(0.0F, -0.5F, 3.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.6F, 3.35F, 0.05F, -0.3044F, -0.7151F, -0.2692F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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