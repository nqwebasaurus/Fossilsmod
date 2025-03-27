package fossils.fossils.client.blockentity.model.stagonolepis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StagonolepisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Stagonolepis;
	private final ModelPart body3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart leftBackLeg;
	private final ModelPart leftBjoint;
	private final ModelPart leftBfoot;
	private final ModelPart rightBackLeg;
	private final ModelPart rightBjoint;
	private final ModelPart rightBfoot;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart leftFrontLeg;
	private final ModelPart LeftFjoint;
	private final ModelPart LeftFFoot;
	private final ModelPart rightFrontLeg;
	private final ModelPart RightFjoint;
	private final ModelPart RightFFoot;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;

	public StagonolepisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Stagonolepis = this.fossil.getChild("Stagonolepis");
		this.body3 = this.Stagonolepis.getChild("body3");
		this.tail = this.body3.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftBackLeg = this.body3.getChild("leftBackLeg");
		this.leftBjoint = this.leftBackLeg.getChild("leftBjoint");
		this.leftBfoot = this.leftBjoint.getChild("leftBfoot");
		this.rightBackLeg = this.body3.getChild("rightBackLeg");
		this.rightBjoint = this.rightBackLeg.getChild("rightBjoint");
		this.rightBfoot = this.rightBjoint.getChild("rightBfoot");
		this.body2 = this.body3.getChild("body2");
		this.body = this.body2.getChild("body");
		this.leftFrontLeg = this.body.getChild("leftFrontLeg");
		this.LeftFjoint = this.leftFrontLeg.getChild("LeftFjoint");
		this.LeftFFoot = this.LeftFjoint.getChild("LeftFFoot");
		this.rightFrontLeg = this.body.getChild("rightFrontLeg");
		this.RightFjoint = this.rightFrontLeg.getChild("RightFjoint");
		this.RightFFoot = this.RightFjoint.getChild("RightFFoot");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Stagonolepis = fossil.addOrReplaceChild("Stagonolepis", CubeListBuilder.create(), PartPose.offset(-0.5F, -5.325F, 5.0F));

		PartDefinition body3 = Stagonolepis.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0335F, 0.4753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 0).addBox(0.0F, -2.9F, 4.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 80).addBox(0.0F, -3.0F, 2.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 82).addBox(0.0F, -2.8F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 30).mirror().addBox(-1.5F, -0.8F, 0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 26).mirror().addBox(-2.5F, -1.6F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(52, 26).addBox(1.5F, -1.6F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F))
				.texOffs(20, 30).addBox(0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(21, 65).addBox(-0.5F, -0.8F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3524F, -0.7172F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 0).addBox(-4.5F, -0.3004F, -0.3436F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8524F, -0.7172F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 18).mirror().addBox(0.0F, -0.947F, -0.1141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.9476F, 2.0828F, -0.576F, 0.5672F, 0.0F));

		PartDefinition cube_r4 = body3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(0.0F, -0.1021F, -0.0119F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.9476F, 2.0828F, -0.2618F, 0.5672F, 0.0F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 65).mirror().addBox(0.0F, 0.0082F, -0.2763F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.3476F, -1.6172F, 0.0314F, 0.0153F, -0.4535F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 52).mirror().addBox(-2.5F, -3.1434F, -0.0207F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.6476F, -1.2172F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-2.5F, -1.4532F, -4.7009F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.5476F, 2.6828F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-2.5F, -0.5167F, -1.979F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 73).addBox(1.5F, -0.5167F, -1.979F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1476F, 2.1828F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 30).mirror().addBox(-2.5F, -1.4141F, 0.3897F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(40, 30).addBox(1.5F, -1.4141F, 0.3897F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.9524F, 0.0828F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(37, 54).mirror().addBox(-2.5F, -0.0366F, -1.9843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 54).addBox(1.5F, -0.0366F, -1.9843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2524F, 3.1828F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(28, 54).mirror().addBox(-2.5F, 0.0681F, -2.987F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(28, 54).addBox(1.5F, 0.0681F, -2.987F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -2.2524F, 1.1828F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(66, 25).mirror().addBox(-2.5F, -0.0858F, -1.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(66, 25).addBox(1.5F, -0.0858F, -1.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -1.9524F, 4.1828F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 52).addBox(1.5F, -3.1434F, -0.0207F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6476F, -1.2172F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(21, 65).addBox(-1.0F, 0.0082F, -0.2763F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 2.3476F, -1.6172F, 0.0314F, -0.0153F, 0.4535F));

		PartDefinition cube_r15 = body3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(24, 18).addBox(-1.0F, -0.947F, -0.1141F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0F, 2.9476F, 2.0828F, -0.576F, -0.5672F, 0.0F));

		PartDefinition cube_r16 = body3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.1021F, -0.0119F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 2.9476F, 2.0828F, -0.2618F, -0.5672F, 0.0F));

		PartDefinition cube_r17 = body3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 39).addBox(1.5F, -1.4532F, -4.7009F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 3.5476F, 2.6828F, -0.3665F, 0.0F, 0.0F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(54, 25).addBox(0.0F, -0.6507F, -0.0746F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(57, 80).addBox(0.5F, -2.7507F, 0.9254F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 54).addBox(0.5F, -2.8507F, 2.9254F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 25).addBox(0.5F, -2.8507F, 4.9254F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 54).addBox(0.5F, -2.7507F, 6.9254F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5524F, 5.1828F, -0.0277F, -0.0011F, -0.0114F));

		PartDefinition cube_r18 = tail.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 65).addBox(0.0F, 0.122F, -0.1864F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2493F, 6.4254F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(17, 65).addBox(0.0F, 1.9F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 48).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2493F, 1.4254F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(25, 18).addBox(-3.5F, -2.8561F, -6.893F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.4493F, 7.8254F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 14).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.9507F, -0.3746F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(16, 54).addBox(-0.5F, -0.0142F, -0.151F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(71, 82).addBox(0.0F, -2.0142F, -0.151F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 63).addBox(0.0F, -1.8142F, 1.849F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 82).addBox(0.0F, -1.7142F, 3.849F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 82).addBox(0.0F, -1.6142F, 5.849F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 82).addBox(0.0F, -1.4142F, 7.849F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5007F, 9.0254F, -0.0896F, 0.0869F, -0.0078F));

		PartDefinition cube_r22 = tail2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 26).addBox(-2.5F, -2.8896F, -8.979F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1858F, 8.049F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(20, 30).addBox(-2.5F, -0.1F, -0.1F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.1142F, -0.551F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, 4.522F, 7.8136F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 39).addBox(0.0F, 3.622F, 5.8136F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 36).addBox(0.0F, 2.322F, 3.8136F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 58).addBox(0.0F, 1.022F, 1.8136F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -2.6F, 0.5498F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(65, 59).addBox(-0.5F, -0.25F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(38, 82).addBox(0.0F, -1.55F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 82).addBox(0.0F, -1.45F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 30).addBox(0.0F, -1.25F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2858F, 8.849F, 0.0177F, 0.2618F, 0.0046F));

		PartDefinition cube_r25 = tail3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(30, 58).addBox(-1.5F, -2.0297F, -7.2422F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.05F, 6.4F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(58, 38).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.85F, -0.6F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(7, 5).addBox(0.0F, 8.222F, 13.8136F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 18).addBox(0.0F, 7.222F, 11.8136F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(0.0F, 6.322F, 9.8136F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4642F, -11.449F, 0.5498F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.3506F, -0.1391F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(30, 18).addBox(0.0F, -1.1506F, -0.1391F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 0).addBox(0.0F, -0.8506F, 1.8609F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 26).addBox(0.0F, -0.5506F, 3.8609F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 7.0F, 0.1578F, 0.3019F, 0.0473F));

		PartDefinition cube_r28 = tail4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(25, 2).addBox(-1.0F, -0.9774F, -0.0015F, 2.0F, 1.0F, 12.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.8494F, -1.1391F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tail4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(14, 43).addBox(-1.0F, -0.3945F, -0.1045F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5506F, -0.5391F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 32).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.5506F, -0.5391F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftBackLeg = body3.addOrReplaceChild("leftBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.65F, 0.4976F, 0.9828F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftBackLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(28, 76).addBox(-1.0F, -1.7F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4301F, 5.8599F, 1.5379F, 0.4841F, 0.0905F, -0.2921F));

		PartDefinition cube_r32 = leftBackLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -1.8F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6251F, 3.3191F, 1.1063F, 0.1612F, 0.0905F, -0.2921F));

		PartDefinition cube_r33 = leftBackLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(21, 73).addBox(-1.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.723F, 0.5903F, 0.2459F, 0.4666F, 0.0905F, -0.2921F));

		PartDefinition leftBjoint = leftBackLeg.addOrReplaceChild("leftBjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 6.3861F, 1.7445F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftBjoint.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(60, 75).addBox(0.8F, -4.5F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 14).addBox(-0.5F, -4.5F, -1.5F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 4.3864F, 1.9502F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftBfoot = leftBjoint.addOrReplaceChild("leftBfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 5.1775F, 1.634F, -0.6535F, -0.0118F, 0.0063F));

		PartDefinition cube_r35 = leftBfoot.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(66, 25).addBox(-1.5F, -1.5F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5398F, -1.1724F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightBackLeg = body3.addOrReplaceChild("rightBackLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.65F, 0.4976F, 0.9828F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightBackLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(65, 75).addBox(0.0F, -1.7F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4301F, 5.8599F, 1.5379F, 0.4841F, -0.0905F, 0.2921F));

		PartDefinition cube_r37 = rightBackLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(39, 68).addBox(0.0F, -1.8F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.6251F, 3.3191F, 1.1063F, 0.1612F, -0.0905F, 0.2921F));

		PartDefinition cube_r38 = rightBackLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(72, 38).addBox(0.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.723F, 0.5903F, 0.2459F, 0.4666F, -0.0905F, 0.2921F));

		PartDefinition rightBjoint = rightBackLeg.addOrReplaceChild("rightBjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 6.3861F, 1.7445F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightBjoint.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(75, 54).addBox(-1.8F, -4.5F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-0.5F, -4.5F, -1.5F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 4.3864F, 1.9502F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightBfoot = rightBjoint.addOrReplaceChild("rightBfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 5.1775F, 1.634F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightBfoot.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(51, 58).addBox(-2.5F, -1.5F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5398F, -1.1724F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8702F, -0.921F, 0.0968F, 0.1303F, 0.0126F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(82, 75).addBox(0.0F, -2.2139F, 3.9295F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 82).addBox(0.0F, -2.2139F, 1.9295F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 82).addBox(0.0F, -2.1139F, -0.0705F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 6).addBox(-0.5F, -0.4139F, -0.0705F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1146F, -4.8435F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(44, 68).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0552F, -2.339F, -0.0389F, -0.035F, -1.0291F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(80, 59).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0552F, -2.339F, -0.0512F, -0.0109F, -0.5059F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(80, 61).mirror().addBox(-3.1485F, -1.9616F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0448F, -4.339F, 0.0234F, 0.0841F, -1.404F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(73, 13).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0448F, -4.339F, 0.0649F, 0.0584F, -0.8359F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0448F, -4.339F, 0.0854F, 0.0181F, -0.3134F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(80, 59).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0552F, -2.339F, -0.0512F, 0.0109F, 0.5059F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(44, 68).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0552F, -2.339F, -0.0389F, 0.035F, 1.0291F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(81, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0448F, -4.339F, 0.0854F, -0.0181F, 0.3134F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(73, 13).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0448F, -4.339F, 0.0649F, -0.0584F, 0.8359F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(80, 61).addBox(2.1485F, -1.9616F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0448F, -4.339F, 0.0234F, -0.0841F, 1.404F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(48, 16).addBox(-4.0F, -2.8283F, 0.0652F, 8.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.4854F, -6.0435F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(47, 49).addBox(-4.0F, -0.1178F, 0.0577F, 8.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.2146F, -4.8435F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(67, 0).addBox(-2.5F, -1.9944F, -0.0098F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.0854F, -4.7435F, 0.096F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0568F, -4.8612F, 0.0175F, 0.0436F, 0.0008F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 65).addBox(-3.0F, -2.9222F, -1.8623F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(25, 45).addBox(-4.0F, -2.9222F, 2.1377F, 8.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.712F, -8.2778F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -0.1208F, -0.0801F, 8.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.288F, -9.7778F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(30, 81).addBox(0.0F, -1.5F, -1.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 81).addBox(0.0F, -1.4F, -3.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 82).addBox(0.0F, -1.3F, -5.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 68).addBox(-0.5F, -0.1F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.388F, -4.7778F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(0.0F, -1.6938F, -2.0194F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 3.359F, -10.9145F, 1.1768F, -0.3942F, -0.4634F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(71, 68).mirror().addBox(-0.5F, -0.2183F, 0.5433F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.3633F, -10.8702F, 1.6057F, 0.0F, 0.2269F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(43, 1).mirror().addBox(-0.5F, -3.542F, -2.7853F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.3633F, -10.8702F, -1.3614F, 0.0F, 0.2269F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(66, 28).mirror().addBox(-0.5F, -4.2748F, 0.3071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.3633F, -10.8702F, -0.384F, 0.0F, 0.2269F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(28, 59).mirror().addBox(-0.5F, -3.5614F, 0.3201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.3633F, -10.8702F, 0.1222F, 0.0F, 0.2269F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(75, 21).mirror().addBox(-0.5F, -1.4833F, 2.0028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.3633F, -10.8702F, 0.6109F, 0.0F, 0.2269F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(54, 36).mirror().addBox(-0.5F, -0.4357F, -0.0343F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.3633F, -10.8702F, 1.1345F, 0.0F, 0.2269F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(24, 43).mirror().addBox(-6.1485F, -1.9616F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.412F, -9.4778F, 0.1471F, 0.4861F, -1.3336F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(54, 32).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.412F, -9.4778F, 0.3907F, 0.3304F, -0.7369F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(34, 54).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.412F, -9.4778F, 0.4968F, 0.101F, -0.2536F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(24, 16).mirror().addBox(-7.1485F, -1.9616F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.212F, -7.4778F, 0.124F, 0.4194F, -1.3088F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(45, 30).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.212F, -7.4778F, 0.3336F, 0.2867F, -0.7194F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(14, 46).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.212F, -7.4778F, 0.4279F, 0.088F, -0.2252F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(40, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.112F, -5.4778F, 0.3592F, 0.0746F, -0.1959F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(61, 36).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.112F, -5.4778F, 0.2779F, 0.2422F, -0.699F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-6.1485F, -1.9616F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.112F, -5.4778F, 0.1022F, 0.3526F, -1.282F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(81, 17).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.012F, -1.4778F, 0.1708F, 0.0361F, -0.2762F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(77, 38).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.012F, -1.4778F, 0.1303F, 0.1165F, -0.7952F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(78, 43).mirror().addBox(-4.1485F, -1.9616F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.012F, -1.4778F, 0.0471F, 0.1681F, -1.3661F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-5.1485F, -1.9616F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.012F, -3.4778F, 0.0715F, 0.2521F, -1.2912F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(78, 50).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.012F, -3.4778F, 0.1966F, 0.1741F, -0.7158F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(81, 24).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.012F, -3.4778F, 0.2563F, 0.0538F, -0.2025F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(43, 1).addBox(-0.5F, -3.542F, -2.7853F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.3633F, -10.8702F, -1.3614F, 0.0F, -0.2269F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(66, 28).addBox(-0.5F, -4.2748F, 0.3071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.0F, 3.3633F, -10.8702F, -0.384F, 0.0F, -0.2269F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(71, 68).addBox(-0.5F, -0.2183F, 0.5433F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.0F, 3.3633F, -10.8702F, 1.6057F, 0.0F, -0.2269F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(28, 59).addBox(-0.5F, -3.5614F, 0.3201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.0F, 3.3633F, -10.8702F, 0.1222F, 0.0F, -0.2269F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(75, 21).addBox(-0.5F, -1.4833F, 2.0028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.0F, 3.3633F, -10.8702F, 0.6109F, 0.0F, -0.2269F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(14, 73).addBox(-1.0F, -1.6938F, -2.0194F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 3.359F, -10.9145F, 1.1768F, 0.3942F, 0.4634F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(54, 36).addBox(-0.5F, -0.4357F, -0.0343F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, 3.3633F, -10.8702F, 1.1345F, 0.0F, -0.2269F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(54, 10).addBox(-2.5F, -1.0536F, -4.0384F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.212F, -4.9778F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(81, 26).addBox(0.0F, -2.2F, -2.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 81).addBox(0.0F, -2.1F, -4.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 52).addBox(-3.5F, 5.1F, -5.1F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(63, 68).addBox(-0.5F, -0.6F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.112F, 0.1222F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(78, 43).addBox(2.1485F, -1.9616F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.012F, -1.4778F, 0.0471F, -0.1681F, 1.3661F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(77, 38).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.012F, -1.4778F, 0.1303F, -0.1165F, 0.7952F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(81, 17).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.012F, -1.4778F, 0.1708F, -0.0361F, 0.2762F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(34, 54).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.412F, -9.4778F, 0.4968F, -0.101F, 0.2536F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(54, 32).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.412F, -9.4778F, 0.3907F, -0.3304F, 0.7369F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(24, 43).addBox(2.1485F, -1.9616F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.412F, -9.4778F, 0.1471F, -0.4861F, 1.3336F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(14, 46).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.212F, -7.4778F, 0.4279F, -0.088F, 0.2252F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(45, 30).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.212F, -7.4778F, 0.3336F, -0.2867F, 0.7194F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(24, 16).addBox(2.1485F, -1.9616F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.212F, -7.4778F, 0.124F, -0.4194F, 1.3088F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 46).addBox(2.1485F, -1.9616F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.112F, -5.4778F, 0.1022F, -0.3526F, 1.282F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(61, 36).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.112F, -5.4778F, 0.2779F, -0.2422F, 0.699F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(40, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.112F, -5.4778F, 0.3592F, -0.0746F, 0.1959F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 8).addBox(2.1485F, -1.9616F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.012F, -3.4778F, 0.0715F, -0.2521F, 1.2912F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(78, 50).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.012F, -3.4778F, 0.1966F, -0.1741F, 0.7158F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(81, 24).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.012F, -3.4778F, 0.2563F, -0.0538F, 0.2025F));

		PartDefinition leftFrontLeg = body.addOrReplaceChild("leftFrontLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 5.1771F, -10.6219F, -0.6184F, 0.3044F, -0.2201F));

		PartDefinition cube_r104 = leftFrontLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(75, 61).addBox(-0.326F, 0.1969F, -1.0649F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 52).addBox(-0.326F, 2.1969F, -0.3649F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4059F, -0.7694F, -0.4768F, 1.1862F, 0.0981F, 0.1095F));

		PartDefinition LeftFjoint = leftFrontLeg.addOrReplaceChild("LeftFjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6518F, 1.0023F, 4.5709F, 0.603F, 0.1607F, 0.2841F));

		PartDefinition cube_r105 = LeftFjoint.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(50, 73).addBox(-1.0F, 2.5F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(55, 73).addBox(-1.0F, 2.0F, 0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0892F, -2.5467F, -0.1933F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftFFoot = LeftFjoint.addOrReplaceChild("LeftFFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0892F, 4.6576F, -0.2639F, 0.3766F, -0.52F, 0.0503F));

		PartDefinition cube_r106 = LeftFFoot.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 48).addBox(-0.5F, 0.7828F, -2.8345F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.3955F, -1.2658F, -0.2774F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightFrontLeg = body.addOrReplaceChild("rightFrontLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 5.1771F, -10.6219F, -1.6656F, -0.3044F, 0.2201F));

		PartDefinition cube_r107 = rightFrontLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(74, 73).addBox(-0.674F, 0.1969F, -1.0649F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 16).addBox(-0.674F, 2.1969F, -0.3649F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4059F, -0.7694F, -0.4768F, 1.1862F, -0.0981F, -0.1095F));

		PartDefinition RightFjoint = rightFrontLeg.addOrReplaceChild("RightFjoint", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6518F, 1.0023F, 4.5709F, 0.8212F, -0.1607F, -0.2841F));

		PartDefinition cube_r108 = RightFjoint.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(14, 39).addBox(0.0F, 2.5F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(45, 73).addBox(0.0F, 2.0F, 0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0892F, -2.5467F, -0.1933F, -0.2182F, 0.0F, 0.0F));

		PartDefinition RightFFoot = RightFjoint.addOrReplaceChild("RightFFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0892F, 4.6576F, -0.2639F, 1.2802F, 0.5622F, 0.0944F));

		PartDefinition cube_r109 = RightFFoot.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(44, 58).addBox(-1.5F, 0.7828F, -2.8345F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3955F, -1.2658F, -0.2774F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(72, 33).addBox(-0.5F, -0.5548F, -3.0062F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(28, 54).addBox(0.0F, -1.3548F, -3.0062F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 30).addBox(0.0F, -1.5548F, -1.0062F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -1.0548F, -5.0162F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.612F, -10.8778F, -0.0095F, 0.1743F, -0.0092F));

		PartDefinition cube_r110 = neck.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 60).addBox(-2.0F, -0.0548F, -2.0223F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(42, 10).addBox(-1.5F, -0.0548F, -4.0223F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5548F, -3.0062F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r111 = neck.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(47, 66).addBox(-3.0F, -0.4478F, -4.1034F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.5548F, 1.0938F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r112 = neck.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(47, 48).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.6F, 0.6915F, 0.5273F, -0.6465F));

		PartDefinition cube_r113 = neck.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(-4.866F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.6F, 0.3268F, 0.7914F, -1.2265F));

		PartDefinition cube_r114 = neck.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(37, 16).mirror().addBox(-6.1485F, -1.9616F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -0.6F, 0.0865F, 0.6853F, -1.4461F));

		PartDefinition cube_r115 = neck.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -0.6F, 0.4748F, 0.5211F, -0.7809F));

		PartDefinition cube_r116 = neck.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(53, 12).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -0.6F, 0.6548F, 0.2351F, -0.3059F));

		PartDefinition cube_r117 = neck.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(33, 0).addBox(0.866F, -0.5F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.6F, 0.3268F, -0.7914F, 1.2265F));

		PartDefinition cube_r118 = neck.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(47, 48).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.6F, 0.6915F, -0.5273F, 0.6465F));

		PartDefinition cube_r119 = neck.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(53, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -0.6F, 0.6548F, -0.2351F, 0.3059F));

		PartDefinition cube_r120 = neck.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(51, 10).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -0.6F, 0.4748F, -0.5211F, 0.7809F));

		PartDefinition cube_r121 = neck.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(37, 16).addBox(2.1485F, -1.9616F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -0.6F, 0.0865F, -0.6853F, 1.4461F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition cube_r122 = neck2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(44, 59).addBox(0.0F, -1.5F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 0).addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3452F, -0.0062F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r123 = neck2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(40, 37).mirror().addBox(-2.0173F, -0.0074F, -0.6505F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -1.5F, 0.4541F, 0.9473F, -0.9438F));

		PartDefinition cube_r124 = neck2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(40, 37).addBox(0.0173F, -0.0074F, -0.6505F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -1.5F, 0.4541F, -0.9473F, 0.9438F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6F, -2.9F));

		PartDefinition cube_r125 = neck3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 60).addBox(0.0F, -0.56F, -0.9843F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 76).addBox(-0.5F, -0.06F, -1.9843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4548F, 0.0938F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r126 = neck3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.1993F, -0.6131F, -1.4108F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, 1.4F, 0.4541F, 0.9473F, -0.9438F));

		PartDefinition cube_r127 = neck3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 48).addBox(-1.8007F, -0.6131F, -1.4108F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, 1.4F, 0.4541F, -0.9473F, 0.9438F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(27, 5).addBox(-1.0F, -1.579F, -2.2337F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.1452F, -1.7062F, 0.1861F, 0.2428F, 0.0985F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(77, 68).addBox(-1.0F, -0.2716F, 1.5536F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1448F, -7.3531F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(71, 68).mirror().addBox(-0.8F, -1.0059F, -0.0416F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 68).addBox(0.4F, -1.0059F, -0.0416F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.8331F, -3.8278F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-0.79F, -0.9312F, -1.0038F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.5331F, -4.9278F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(82, 10).mirror().addBox(-0.79F, -0.3F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 10).addBox(0.39F, -0.3F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1331F, -3.7278F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(67, 0).addBox(0.79F, -0.9312F, -1.0038F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.5331F, -4.9278F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(78, 46).addBox(-0.5F, -0.0632F, -0.4402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6539F, -5.2194F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(-1.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(77, 6).addBox(-1.2F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.8F, -0.1319F, -4.8241F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(-1.4F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(70, 78).addBox(-1.2F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.8F, 0.621F, -3.4337F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(40, 78).mirror().addBox(-1.9F, 0.0672F, -2.0543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.024F)).mirror(false)
				.texOffs(40, 78).addBox(-1.7F, 0.0672F, -2.0543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.022F)), PartPose.offsetAndRotation(1.3F, -1.379F, -3.1337F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(19, 60).mirror().addBox(-2.0F, 0.0676F, -0.9763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.019F)).mirror(false)
				.texOffs(19, 60).addBox(-1.6F, 0.0676F, -0.9763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(1.3F, -1.579F, -2.2337F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(7, 79).mirror().addBox(-1.1F, -1.1F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(7, 79).addBox(0.1F, -1.1F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 0.321F, -1.1837F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(14, 79).mirror().addBox(-1.95F, -0.4999F, -1.7632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 79).addBox(-1.25F, -0.4999F, -1.7632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.4194F, -4.1437F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(79, 72).mirror().addBox(-2.45F, -0.7449F, -0.8414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(79, 72).addBox(-0.75F, -0.7449F, -0.8414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, 0.1806F, -2.8437F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(-2.45F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(80, 20).addBox(-0.75F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1F, -0.0194F, -3.0437F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(52, 80).mirror().addBox(-1.25F, -1.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(47, 80).mirror().addBox(-1.47F, -1.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(34, 80).mirror().addBox(-1.64F, -1.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(34, 80).addBox(1.04F, -1.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(47, 80).addBox(0.87F, -1.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(52, 80).addBox(0.65F, -1.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(70, 16).addBox(-1.3F, -2.0F, 0.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-0.2F, 0.421F, -2.2337F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(21, 79).mirror().addBox(-1.44F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(78, 33).mirror().addBox(-1.44F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(78, 33).addBox(0.24F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(21, 79).addBox(0.24F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4F, 0.3538F, -0.654F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(79, 40).mirror().addBox(-1.5F, -0.0675F, 0.0023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(79, 40).addBox(0.5F, -0.0675F, 0.0023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.979F, 0.5663F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(24, 45).mirror().addBox(-1.5F, -0.1239F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(24, 45).addBox(0.5F, -0.1239F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(47, 45).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -1.579F, -0.2337F, -0.576F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(77, 78).addBox(0.0F, 1.3516F, -5.442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.9718F, -0.2133F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, 0.3F, 0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(30, 68).mirror().addBox(-0.6F, 0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(30, 68).addBox(-0.4F, 0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.9886F, -3.6109F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(66, 61).mirror().addBox(-1.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.011F)).mirror(false)
				.texOffs(0, 79).mirror().addBox(-1.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.011F)).mirror(false)
				.texOffs(66, 58).mirror().addBox(-1.8F, -0.2863F, -1.3254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 61).addBox(0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.011F))
				.texOffs(66, 58).addBox(0.8F, -0.2863F, -1.3254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 79).addBox(0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.011F)), PartPose.offsetAndRotation(0.5F, 0.4516F, -0.642F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(79, 13).mirror().addBox(-0.4F, -0.4F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(79, 13).addBox(1.1F, -0.4F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.35F, 0.8395F, -1.948F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(20, 26).mirror().addBox(-0.4F, -0.5F, -0.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 26).addBox(0.8F, -0.5F, -0.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.3082F, -2.9645F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(12, 60).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -0.1484F, -1.692F, 0.8552F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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