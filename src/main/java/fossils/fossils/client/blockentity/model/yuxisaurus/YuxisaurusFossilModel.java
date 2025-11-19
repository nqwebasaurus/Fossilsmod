package fossils.fossils.client.blockentity.model.yuxisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YuxisaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg6;
	private final ModelPart rightLeg7;
	private final ModelPart rightLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg9;
	private final ModelPart rightLeg10;
	private final ModelPart chestOsteoderms4;
	private final ModelPart chestOsteoderms15;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart tail6;
	private final ModelPart chestOsteoderms6;
	private final ModelPart chestOsteoderms17;
	private final ModelPart tail2;
	private final ModelPart chestOsteoderms7;
	private final ModelPart chestOsteoderms18;
	private final ModelPart tail3;
	private final ModelPart chestOsteoderms8;
	private final ModelPart chestOsteoderms19;
	private final ModelPart tail4;
	private final ModelPart chestOsteoderms9;
	private final ModelPart chestOsteoderms20;
	private final ModelPart tail5;
	private final ModelPart tail7;
	private final ModelPart chestOsteoderms11;
	private final ModelPart chestOsteoderms22;
	private final ModelPart chestOsteoderms10;
	private final ModelPart chestOsteoderms21;
	private final ModelPart chestOsteoderms5;
	private final ModelPart chestOsteoderms16;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chestOsteoderms2;
	private final ModelPart chestOsteoderms13;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart rightArm;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart chestOsteoderms;
	private final ModelPart chestOsteoderms12;
	private final ModelPart neck;
	private final ModelPart bipartiteOsteoderm3;
	private final ModelPart bipartiteOsteoderm6;
	private final ModelPart neck2;
	private final ModelPart bipartiteOsteoderm2;
	private final ModelPart bipartiteOsteoderm5;
	private final ModelPart neck3;
	private final ModelPart bipartiteOsteoderm;
	private final ModelPart bipartiteOsteoderm4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart chestOsteoderms3;
	private final ModelPart chestOsteoderms14;

	public YuxisaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.rightLeg6 = this.leftLeg.getChild("rightLeg6");
		this.rightLeg7 = this.rightLeg6.getChild("rightLeg7");
		this.rightLeg8 = this.rightLeg7.getChild("rightLeg8");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg5 = this.rightLeg.getChild("rightLeg5");
		this.rightLeg9 = this.rightLeg5.getChild("rightLeg9");
		this.rightLeg10 = this.rightLeg9.getChild("rightLeg10");
		this.chestOsteoderms4 = this.hips.getChild("chestOsteoderms4");
		this.chestOsteoderms15 = this.hips.getChild("chestOsteoderms15");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.tail = this.hips.getChild("tail");
		this.tail6 = this.tail.getChild("tail6");
		this.chestOsteoderms6 = this.tail6.getChild("chestOsteoderms6");
		this.chestOsteoderms17 = this.tail6.getChild("chestOsteoderms17");
		this.tail2 = this.tail6.getChild("tail2");
		this.chestOsteoderms7 = this.tail2.getChild("chestOsteoderms7");
		this.chestOsteoderms18 = this.tail2.getChild("chestOsteoderms18");
		this.tail3 = this.tail2.getChild("tail3");
		this.chestOsteoderms8 = this.tail3.getChild("chestOsteoderms8");
		this.chestOsteoderms19 = this.tail3.getChild("chestOsteoderms19");
		this.tail4 = this.tail3.getChild("tail4");
		this.chestOsteoderms9 = this.tail4.getChild("chestOsteoderms9");
		this.chestOsteoderms20 = this.tail4.getChild("chestOsteoderms20");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail7 = this.tail5.getChild("tail7");
		this.chestOsteoderms11 = this.tail7.getChild("chestOsteoderms11");
		this.chestOsteoderms22 = this.tail7.getChild("chestOsteoderms22");
		this.chestOsteoderms10 = this.tail5.getChild("chestOsteoderms10");
		this.chestOsteoderms21 = this.tail5.getChild("chestOsteoderms21");
		this.chestOsteoderms5 = this.tail.getChild("chestOsteoderms5");
		this.chestOsteoderms16 = this.tail.getChild("chestOsteoderms16");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chestOsteoderms2 = this.body2.getChild("chestOsteoderms2");
		this.chestOsteoderms13 = this.body2.getChild("chestOsteoderms13");
		this.chest = this.body2.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.rightArm5 = this.leftArm.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.rightArm = this.chest.getChild("rightArm");
		this.leftArm5 = this.rightArm.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.chestOsteoderms = this.chest.getChild("chestOsteoderms");
		this.chestOsteoderms12 = this.chest.getChild("chestOsteoderms12");
		this.neck = this.chest.getChild("neck");
		this.bipartiteOsteoderm3 = this.neck.getChild("bipartiteOsteoderm3");
		this.bipartiteOsteoderm6 = this.neck.getChild("bipartiteOsteoderm6");
		this.neck2 = this.neck.getChild("neck2");
		this.bipartiteOsteoderm2 = this.neck2.getChild("bipartiteOsteoderm2");
		this.bipartiteOsteoderm5 = this.neck2.getChild("bipartiteOsteoderm5");
		this.neck3 = this.neck2.getChild("neck3");
		this.bipartiteOsteoderm = this.neck3.getChild("bipartiteOsteoderm");
		this.bipartiteOsteoderm4 = this.neck3.getChild("bipartiteOsteoderm4");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.Jaw = this.head.getChild("Jaw");
		this.chestOsteoderms3 = this.body.getChild("chestOsteoderms3");
		this.chestOsteoderms14 = this.body.getChild("chestOsteoderms14");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.1002F, -2.9913F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 116).addBox(0.0F, -2.2782F, -0.0519F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 5.9F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(13, 116).addBox(0.0F, -2.3536F, -0.0333F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.9F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 116).addBox(0.0F, -1.0F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 98).addBox(0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 52).mirror().addBox(-2.5F, 1.9F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 52).addBox(0.5F, 1.9F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-0.5F, 1.4F, -1.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 2.9305F, 3.3993F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(73, 82).addBox(-2.0F, 2.3481F, -1.4945F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.206F, 0.2165F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 68).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.306F, -0.6835F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 4.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, 5.908F, -2.6808F, 0.5132F, -0.0429F, 0.076F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.2F, -3.9F, 1.0F, 5.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5F, 3.206F, -0.6835F, 0.2901F, 0.0633F, -0.2089F));

		PartDefinition rightLeg6 = leftLeg.addOrReplaceChild("rightLeg6", CubeListBuilder.create().texOffs(89, 84).addBox(-2.8F, 1.9683F, 0.1539F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(84, 79).addBox(-0.2F, 0.1683F, 0.2539F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 91).addBox(-2.8F, 6.9683F, -0.3461F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 67).addBox(-2.8F, -0.0317F, -0.8461F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3F, 11.074F, 2.9982F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r8 = rightLeg6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(64, 97).addBox(-3.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.9683F, -0.7461F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r9 = rightLeg6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(49, 100).addBox(-3.0F, -0.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2F, 2.0683F, 2.0539F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg7 = rightLeg6.addOrReplaceChild("rightLeg7", CubeListBuilder.create().texOffs(85, 0).addBox(-2.0F, -0.1142F, -0.7461F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 9.1348F, 0.9443F, -1.3963F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg7.addOrReplaceChild("rightLeg8", CubeListBuilder.create().texOffs(42, 12).addBox(-3.0F, -0.683F, -4.8758F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.9609F, 0.1467F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 2.9305F, 3.3993F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r10 = rightLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 83).addBox(-1.0F, 2.3481F, -1.4945F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.206F, 0.2165F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r11 = rightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 68).addBox(0.0F, -3.0F, 0.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.306F, -0.6835F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r12 = rightLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 0).addBox(0.0F, 0.0F, -0.6F, 1.0F, 4.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.5F, 5.908F, -2.6808F, 0.5132F, 0.0429F, -0.076F));

		PartDefinition cube_r13 = rightLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -4.2F, -3.9F, 1.0F, 5.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.5F, 3.206F, -0.6835F, 0.2901F, -0.0633F, 0.2089F));

		PartDefinition rightLeg5 = rightLeg.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(88, 91).addBox(0.8F, 1.9683F, 0.1539F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(20, 85).addBox(-0.8F, 0.1683F, 0.2539F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 24).addBox(0.8F, 6.9683F, -0.3461F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 73).addBox(0.8F, -0.0317F, -0.8461F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3F, 11.074F, 2.9982F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r14 = rightLeg5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(71, 97).addBox(1.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.9683F, -0.7461F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r15 = rightLeg5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(100, 97).addBox(1.0F, -0.1F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2F, 2.0683F, 2.0539F, -0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg9 = rightLeg5.addOrReplaceChild("rightLeg9", CubeListBuilder.create().texOffs(25, 85).addBox(-1.0F, -0.1142F, -0.7461F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 9.1348F, 0.9443F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg10 = rightLeg9.addOrReplaceChild("rightLeg10", CubeListBuilder.create().texOffs(42, 19).addBox(-2.0F, -0.683F, -4.8758F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.9609F, 0.1467F, 0.1309F, 0.0F, 0.0F));

		PartDefinition chestOsteoderms4 = hips.addOrReplaceChild("chestOsteoderms4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2543F, 3.218F, 1.7462F, -0.1311F, -0.0872F, 0.0038F));

		PartDefinition cube_r16 = chestOsteoderms4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 22).addBox(-0.4994F, -0.5F, -3.0621F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7082F, -2.9954F, -0.2805F, -0.0228F, 0.0244F, -0.8516F));

		PartDefinition cube_r17 = chestOsteoderms4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(96, 56).addBox(-3.1935F, -0.4141F, -3.1243F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-2.029F, -4.4222F, 0.7278F, -0.1433F, -0.6166F, -1.178F));

		PartDefinition cube_r18 = chestOsteoderms4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(63, 105).addBox(-0.1F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.6698F, -3.2642F, -2.2435F, -0.1135F, -0.1941F, -1.2515F));

		PartDefinition cube_r19 = chestOsteoderms4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(105, 54).addBox(-1.1404F, -0.4416F, -3.2813F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.029F, -4.4222F, 0.7278F, -0.1118F, 0.0834F, -1.2829F));

		PartDefinition cube_r20 = chestOsteoderms4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(105, 66).addBox(0.4839F, -0.6281F, 1.3553F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-2.029F, -4.6222F, 1.0278F, -0.1644F, -0.6566F, -1.1613F));

		PartDefinition cube_r21 = chestOsteoderms4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(105, 69).addBox(-0.9F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.8472F, -4.4288F, 3.8434F, -0.1285F, -0.2613F, -1.2409F));

		PartDefinition cube_r22 = chestOsteoderms4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(105, 51).addBox(-1.2296F, -0.5127F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-2.029F, -4.6222F, 0.7278F, -0.1505F, -0.5273F, -1.186F));

		PartDefinition cube_r23 = chestOsteoderms4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(112, 107).addBox(-1.1083F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.029F, -4.6222F, 0.7278F, -0.126F, -0.1747F, -1.2522F));

		PartDefinition chestOsteoderms15 = hips.addOrReplaceChild("chestOsteoderms15", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2543F, 3.218F, 1.7462F, -0.1311F, 0.0872F, -0.0038F));

		PartDefinition cube_r24 = chestOsteoderms15.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(21, 22).mirror().addBox(-0.5006F, -0.5F, -3.0621F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7082F, -2.9954F, -0.2805F, -0.0228F, -0.0244F, 0.8516F));

		PartDefinition cube_r25 = chestOsteoderms15.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(96, 56).mirror().addBox(0.1935F, -0.4141F, -3.1243F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(2.029F, -4.4222F, 0.7278F, -0.1433F, 0.6166F, 1.178F));

		PartDefinition cube_r26 = chestOsteoderms15.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(63, 105).mirror().addBox(-1.9F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.6698F, -3.2642F, -2.2435F, -0.1135F, 0.1941F, 1.2515F));

		PartDefinition cube_r27 = chestOsteoderms15.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(105, 54).mirror().addBox(-0.8595F, -0.4416F, -3.2813F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.029F, -4.4222F, 0.7278F, -0.1118F, -0.0834F, 1.2829F));

		PartDefinition cube_r28 = chestOsteoderms15.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(105, 66).mirror().addBox(-2.4839F, -0.6281F, 1.3553F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(2.029F, -4.6222F, 1.0278F, -0.1644F, 0.6566F, 1.1613F));

		PartDefinition cube_r29 = chestOsteoderms15.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(105, 69).mirror().addBox(-1.1F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.8472F, -4.4288F, 3.8434F, -0.1285F, 0.2613F, 1.2409F));

		PartDefinition cube_r30 = chestOsteoderms15.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(105, 51).mirror().addBox(-0.7704F, -0.5127F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(2.029F, -4.6222F, 0.7278F, -0.1505F, 0.5273F, 1.186F));

		PartDefinition cube_r31 = chestOsteoderms15.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(112, 107).mirror().addBox(-0.8917F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.029F, -4.6222F, 0.7278F, -0.126F, 0.1747F, 1.2522F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(78, 97).addBox(0.0224F, 0.4482F, -1.5593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2F, 1.2F, -0.9F, 0.2094F, -0.4712F, 0.0F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(101, 46).addBox(0.0F, -2.109F, 1.5157F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.7F, 5.0F, -1.5882F, 0.2094F, 0.0F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(103, 113).addBox(0.0F, -1.5747F, 1.1972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.7F, 5.0F, -1.2915F, 0.2094F, 0.0F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(64, 92).addBox(0.0F, 0.0384F, -0.042F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7F, 5.0F, -0.3316F, 0.2094F, 0.0F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(7, 98).addBox(-1.0F, 0.0905F, 0.0494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.5F, 0.621F, 4.9305F, -0.3659F, -0.4274F, 0.1575F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(98, 10).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8715F, 1.3009F, 5.0913F, -0.332F, -0.0495F, 0.0171F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(43, 86).addBox(0.0F, -0.0238F, -3.036F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, 2.0F, 0.192F, -0.2443F, 0.0F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(67, 75).addBox(0.5F, 0.3F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(52, 86).addBox(0.5F, 3.9F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(20, 77).addBox(0.5F, 0.3F, 2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(40, 81).addBox(-1.8181F, -0.4224F, -2.9568F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.3F, 1.0F, 2.2F, 0.2233F, 0.15F, 0.0755F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(101, 23).addBox(0.0224F, -0.1326F, -1.9346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2F, -0.9F, 0.5934F, -0.4712F, 0.0F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 98).addBox(-0.8601F, -0.0826F, -0.0722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 2.2F, -1.9F, 0.5216F, -0.0087F, 0.2922F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(98, 6).addBox(0.0F, 1.4691F, -2.7912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.5F, 2.0F, -0.2094F, -0.2443F, 0.0F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(98, 113).addBox(0.5F, -3.94F, -1.0646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 102).addBox(0.5F, -3.94F, -1.6645F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(92, 59).addBox(0.5F, -1.94F, -2.0646F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.4F, 1.6F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(119, 105).addBox(-0.5F, -0.027F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9998F, 0.1784F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(119, 116).addBox(-0.5F, -1.0946F, -0.9896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 4.8998F, -0.4216F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(101, 41).addBox(-1.5359F, 3.6977F, 0.0649F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7761F, 5.0555F, 3.5455F, 0.6163F, -0.0144F, 0.1146F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(78, 8).addBox(-1.5755F, -1.5589F, 3.8801F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 5.3F, 1.2F, -0.919F, 0.0331F, 0.208F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(54, 68).addBox(-0.7023F, -0.7279F, -0.3563F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.2F, 5.3F, 1.2F, -0.7321F, -0.0938F, 0.3747F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(59, 92).addBox(-0.6401F, -4.8704F, -0.4295F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.446F, 7.7365F, 6.1007F, 0.8109F, -0.1445F, 0.3012F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(95, 97).addBox(-0.6401F, -1.435F, -0.0383F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7761F, 5.0555F, 3.5455F, 0.5054F, -0.1445F, 0.3012F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(78, 97).mirror().addBox(-1.0224F, 0.4482F, -1.5593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.2F, -0.9F, 0.2094F, 0.4712F, 0.0F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(101, 46).mirror().addBox(-1.0F, -2.109F, 1.5157F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, 5.0F, -1.5882F, -0.2094F, 0.0F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(103, 113).mirror().addBox(-1.0F, -1.5747F, 1.1972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, 5.0F, -1.2915F, -0.2094F, 0.0F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(64, 92).mirror().addBox(-1.0F, 0.0384F, -0.042F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, 5.0F, -0.3316F, -0.2094F, 0.0F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(7, 98).mirror().addBox(0.0F, 0.0905F, 0.0494F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.621F, 4.9305F, -0.3659F, 0.4274F, -0.1575F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(98, 10).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8715F, 1.3009F, 5.0913F, -0.332F, 0.0495F, -0.0171F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(43, 86).mirror().addBox(-1.0F, -0.0238F, -3.036F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, 2.0F, 0.192F, 0.2443F, 0.0F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(67, 75).mirror().addBox(-3.5F, 0.3F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 86).mirror().addBox(-1.5F, 3.9F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(20, 77).mirror().addBox(-1.5F, 0.3F, 2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(40, 81).mirror().addBox(-0.1819F, -0.4224F, -2.9568F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 1.0F, 2.2F, 0.2233F, -0.15F, -0.0755F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(101, 23).mirror().addBox(-1.0224F, -0.1326F, -1.9346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.2F, -0.9F, 0.5934F, 0.4712F, 0.0F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.1399F, -0.0826F, -0.0722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 2.2F, -1.9F, 0.5216F, 0.0087F, -0.2922F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(98, 6).mirror().addBox(-1.0F, 1.4691F, -2.7912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, 2.0F, -0.2094F, 0.2443F, 0.0F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(98, 113).mirror().addBox(-1.5F, -3.94F, -1.0646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 102).mirror().addBox(-1.5F, -3.94F, -1.6645F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(92, 59).mirror().addBox(-1.5F, -1.94F, -2.0646F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.4F, 1.6F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(119, 105).mirror().addBox(-0.5F, -0.027F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.9998F, 0.1784F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r66 = bone4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(119, 116).mirror().addBox(-0.5F, -1.0946F, -0.9896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.8998F, -0.4216F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r67 = bone4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(101, 41).mirror().addBox(0.5359F, 3.6977F, 0.0649F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7761F, 5.0555F, 3.5455F, 0.6163F, 0.0144F, -0.1146F));

		PartDefinition cube_r68 = bone4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(78, 8).mirror().addBox(0.5755F, -1.5589F, 3.8801F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 5.3F, 1.2F, -0.919F, -0.0331F, -0.208F));

		PartDefinition cube_r69 = bone4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(54, 68).mirror().addBox(-0.2977F, -0.7279F, -0.3563F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 5.3F, 1.2F, -0.7321F, 0.0938F, -0.3747F));

		PartDefinition cube_r70 = bone4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(59, 92).mirror().addBox(-0.3599F, -4.8704F, -0.4295F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.446F, 7.7365F, 6.1007F, 0.8109F, 0.1445F, -0.3012F));

		PartDefinition cube_r71 = bone4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(95, 97).mirror().addBox(-0.3599F, -1.435F, -0.0383F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7761F, 5.0555F, 3.5455F, 0.5054F, 0.1445F, -0.3012F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -0.3083F, 0.0877F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3919F, 7.6908F, -0.1906F, -0.1453F, -0.0602F));

		PartDefinition cube_r72 = tail.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(59, 119).addBox(0.0F, -2.05F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1583F, 4.0377F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(59, 113).addBox(0.0F, 0.2684F, -0.0408F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1237F, 3.8398F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(116, 18).addBox(0.0F, -0.0316F, -0.0408F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7417F, 1.9377F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(74, 118).addBox(0.0F, -2.05F, 0.15F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2583F, 1.9377F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(59, 8).addBox(0.0F, -2.05F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2583F, 0.0377F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(42, 26).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1917F, 0.0877F, 0.0F, 0.1222F, 0.0F));

		PartDefinition cube_r78 = tail.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(42, 26).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1917F, 0.0877F, 0.0F, -0.1222F, 0.0F));

		PartDefinition tail6 = tail.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(68, 60).addBox(-0.5F, -0.25F, 0.15F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0583F, 5.9377F, -0.0792F, -0.1305F, 0.0103F));

		PartDefinition cube_r79 = tail6.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(120, 41).addBox(0.0F, -1.75F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 4.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail6.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(120, 37).addBox(0.0F, -1.85F, 0.15F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 2.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail6.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(107, 119).addBox(0.0F, -1.9F, 0.15F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(27, 121).addBox(0.0F, -0.05F, -0.35F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2932F, 4.897F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(28, 116).addBox(0.0F, 0.0684F, -0.0408F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.848F, 2.3244F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(108, 113).addBox(0.0F, -0.2316F, -0.0408F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7052F, 0.1751F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(70, 42).mirror().addBox(-1.1F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.25F, 0.15F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r86 = tail6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(70, 42).addBox(0.1F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.25F, 0.15F, 0.0F, -0.1047F, 0.0F));

		PartDefinition chestOsteoderms6 = tail6.addOrReplaceChild("chestOsteoderms6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2602F, -2.1277F, 3.8404F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r87 = chestOsteoderms6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 31).addBox(-0.3524F, -0.3F, -1.9575F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9169F, 0.8395F, -1.4428F, 0.0222F, 0.0593F, -0.8334F));

		PartDefinition cube_r88 = chestOsteoderms6.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(35, 107).addBox(0.1381F, -0.4247F, 0.2255F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3333F, 3.6617F, -3.3683F, 0.1121F, -0.3093F, 0.3243F));

		PartDefinition cube_r89 = chestOsteoderms6.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(42, 107).addBox(0.0989F, -0.4337F, -0.7349F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.3333F, 3.6617F, -3.3683F, 0.1421F, -0.7958F, 0.2678F));

		PartDefinition cube_r90 = chestOsteoderms6.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(91, 106).addBox(0.7136F, -0.3835F, 3.0835F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3333F, 3.6617F, -2.7683F, 0.1139F, -0.3027F, 0.193F));

		PartDefinition cube_r91 = chestOsteoderms6.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(106, 60).addBox(1.9489F, -0.4105F, 1.5185F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.3333F, 3.6617F, -2.7683F, 0.1441F, -0.7891F, 0.1357F));

		PartDefinition cube_r92 = chestOsteoderms6.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(106, 104).addBox(-1.4296F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.4961F, 1.6127F, -1.8345F, 0.0184F, -0.8503F, -0.2931F));

		PartDefinition cube_r93 = chestOsteoderms6.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(28, 107).addBox(-1.1083F, -0.5231F, -0.6837F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4961F, 1.6127F, -1.8345F, 0.0216F, -0.3616F, -0.2976F));

		PartDefinition cube_r94 = chestOsteoderms6.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(106, 57).addBox(-1.4296F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.4961F, 1.6127F, 1.1655F, 0.0184F, -0.8503F, -0.2931F));

		PartDefinition cube_r95 = chestOsteoderms6.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(106, 48).addBox(-1.1083F, -0.5231F, -0.6837F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4961F, 1.6127F, 1.1655F, 0.0216F, -0.3616F, -0.2976F));

		PartDefinition cube_r96 = chestOsteoderms6.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(96, 84).addBox(-3.1935F, -0.4141F, -3.1243F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.5961F, -0.8873F, 1.5655F, -0.1433F, -0.6166F, -1.178F));

		PartDefinition cube_r97 = chestOsteoderms6.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(106, 45).addBox(-0.5F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1121F, -0.2978F, -1.5548F, -0.1168F, -0.3068F, -1.2381F));

		PartDefinition cube_r98 = chestOsteoderms6.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(106, 42).addBox(-0.9404F, -0.4416F, -3.2813F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5961F, -0.8873F, 1.5655F, -0.1118F, 0.0834F, -1.2829F));

		PartDefinition cube_r99 = chestOsteoderms6.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(113, 47).addBox(-1.4296F, -0.5127F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.5961F, -1.0873F, 1.9655F, -0.1644F, -0.6566F, -1.1613F));

		PartDefinition cube_r100 = chestOsteoderms6.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(113, 44).addBox(-1.1083F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5961F, -1.0873F, 1.9655F, -0.126F, -0.1747F, -1.2522F));

		PartDefinition chestOsteoderms17 = tail6.addOrReplaceChild("chestOsteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2602F, -2.1277F, 3.8404F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r101 = chestOsteoderms17.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(70, 31).mirror().addBox(-0.6476F, -0.3F, -1.9575F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9169F, 0.8395F, -1.4428F, 0.0222F, -0.0593F, 0.8334F));

		PartDefinition cube_r102 = chestOsteoderms17.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(35, 107).mirror().addBox(-2.1381F, -0.4247F, 0.2255F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3333F, 3.6617F, -3.3683F, 0.1121F, 0.3093F, -0.3243F));

		PartDefinition cube_r103 = chestOsteoderms17.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(42, 107).mirror().addBox(-2.0989F, -0.4337F, -0.7349F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.3333F, 3.6617F, -3.3683F, 0.1421F, 0.7958F, -0.2678F));

		PartDefinition cube_r104 = chestOsteoderms17.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(91, 106).mirror().addBox(-2.7136F, -0.3835F, 3.0835F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3333F, 3.6617F, -2.7683F, 0.1139F, 0.3027F, -0.193F));

		PartDefinition cube_r105 = chestOsteoderms17.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(106, 60).mirror().addBox(-3.9489F, -0.4105F, 1.5185F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.3333F, 3.6617F, -2.7683F, 0.1441F, 0.7891F, -0.1357F));

		PartDefinition cube_r106 = chestOsteoderms17.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(106, 104).mirror().addBox(-0.5704F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.4961F, 1.6127F, -1.8345F, 0.0184F, 0.8503F, 0.2931F));

		PartDefinition cube_r107 = chestOsteoderms17.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(28, 107).mirror().addBox(-0.8917F, -0.5231F, -0.6837F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4961F, 1.6127F, -1.8345F, 0.0216F, 0.3616F, 0.2976F));

		PartDefinition cube_r108 = chestOsteoderms17.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(106, 57).mirror().addBox(-0.5704F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.4961F, 1.6127F, 1.1655F, 0.0184F, 0.8503F, 0.2931F));

		PartDefinition cube_r109 = chestOsteoderms17.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(106, 48).mirror().addBox(-0.8917F, -0.5231F, -0.6837F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4961F, 1.6127F, 1.1655F, 0.0216F, 0.3616F, 0.2976F));

		PartDefinition cube_r110 = chestOsteoderms17.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(96, 84).mirror().addBox(0.1935F, -0.4141F, -3.1243F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.5961F, -0.8873F, 1.5655F, -0.1433F, 0.6166F, 1.178F));

		PartDefinition cube_r111 = chestOsteoderms17.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(106, 45).mirror().addBox(-1.5F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1121F, -0.2978F, -1.5548F, -0.1168F, 0.3068F, 1.2381F));

		PartDefinition cube_r112 = chestOsteoderms17.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(106, 42).mirror().addBox(-1.0596F, -0.4416F, -3.2813F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5961F, -0.8873F, 1.5655F, -0.1118F, -0.0834F, 1.2829F));

		PartDefinition cube_r113 = chestOsteoderms17.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(113, 47).mirror().addBox(-0.5704F, -0.5127F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.5961F, -1.0873F, 1.9655F, -0.1644F, 0.6566F, 1.1613F));

		PartDefinition cube_r114 = chestOsteoderms17.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(113, 44).mirror().addBox(-0.8917F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5961F, -1.0873F, 1.9655F, -0.126F, 0.1747F, 1.2522F));

		PartDefinition tail2 = tail6.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.1694F, 0.0324F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1411F, 5.0543F, 0.0089F, -0.1745F, 0.0421F));

		PartDefinition cube_r115 = tail2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(77, 120).addBox(0.0F, -1.35F, 0.15F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1194F, 6.8824F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(52, 120).addBox(0.0F, -1.45F, 0.15F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1194F, 4.8824F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(49, 120).addBox(0.0F, -1.525F, 0.15F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1194F, 2.8824F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r118 = tail2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(120, 60).addBox(0.0F, 5.0684F, 13.9592F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 120).addBox(0.0F, 3.8684F, 11.9592F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 121).addBox(0.0F, 3.4684F, 9.9592F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9323F, -9.0456F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(120, 45).addBox(0.0F, -1.625F, 0.15F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1194F, 0.8824F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chestOsteoderms7 = tail2.addOrReplaceChild("chestOsteoderms7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3237F, -1.9952F, 5.4673F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r120 = chestOsteoderms7.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 108).addBox(-1.4162F, 0.0997F, -3.4532F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9961F, 2.3127F, 0.6655F, 0.1295F, -0.3148F, 0.319F));

		PartDefinition cube_r121 = chestOsteoderms7.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(105, 107).addBox(-2.9932F, 0.1243F, -3.2552F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9961F, 2.3127F, 0.6655F, 0.1663F, -0.8002F, 0.2505F));

		PartDefinition cube_r122 = chestOsteoderms7.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(107, 99).addBox(-0.9303F, 0.079F, -0.5645F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9961F, 2.3127F, 0.6655F, 0.1319F, -0.306F, 0.1877F));

		PartDefinition cube_r123 = chestOsteoderms7.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(98, 107).addBox(-1.2086F, 0.0865F, -0.9324F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9961F, 2.3127F, 0.6655F, 0.1687F, -0.7913F, 0.1182F));

		PartDefinition cube_r124 = chestOsteoderms7.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(107, 96).addBox(-2.0247F, -0.4776F, -1.8431F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(112, 110).addBox(0.2298F, -0.4411F, 0.1358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.2168F, 1.3431F, -0.8002F, 0.0685F, -0.8396F, -0.3306F));

		PartDefinition cube_r125 = chestOsteoderms7.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(77, 107).addBox(-1.2161F, -0.4933F, -1.7496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 75).addBox(-0.1548F, -0.4327F, 1.0558F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2168F, 1.3431F, -0.8002F, 0.0571F, -0.3511F, -0.31F));

		PartDefinition cube_r126 = chestOsteoderms7.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(7, 108).addBox(-2.0757F, -0.2864F, -1.8118F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(56, 107).addBox(-0.1718F, -0.7053F, 0.4707F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.009F, -0.9942F, 0.0608F, -0.2142F, -0.6386F, -1.1312F));

		PartDefinition cube_r127 = chestOsteoderms7.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(14, 108).addBox(-1.2783F, -0.3029F, -1.7466F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 107).addBox(-0.6632F, -0.7031F, 1.164F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.009F, -0.9942F, 0.0608F, -0.168F, -0.1609F, -1.2452F));

		PartDefinition chestOsteoderms18 = tail2.addOrReplaceChild("chestOsteoderms18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3237F, -1.9952F, 5.4673F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r128 = chestOsteoderms18.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-0.5838F, 0.0997F, -3.4532F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9961F, 2.3127F, 0.6655F, 0.1295F, 0.3148F, -0.319F));

		PartDefinition cube_r129 = chestOsteoderms18.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(105, 107).mirror().addBox(0.9932F, 0.1243F, -3.2552F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9961F, 2.3127F, 0.6655F, 0.1663F, 0.8002F, -0.2505F));

		PartDefinition cube_r130 = chestOsteoderms18.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(107, 99).mirror().addBox(-1.0697F, 0.079F, -0.5645F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9961F, 2.3127F, 0.6655F, 0.1319F, 0.306F, -0.1877F));

		PartDefinition cube_r131 = chestOsteoderms18.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(98, 107).mirror().addBox(-0.7914F, 0.0865F, -0.9324F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9961F, 2.3127F, 0.6655F, 0.1687F, 0.7913F, -0.1182F));

		PartDefinition cube_r132 = chestOsteoderms18.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(107, 96).mirror().addBox(0.0247F, -0.4776F, -1.8431F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(112, 110).mirror().addBox(-2.2298F, -0.4411F, 0.1358F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.2168F, 1.3431F, -0.8002F, 0.0685F, 0.8396F, 0.3306F));

		PartDefinition cube_r133 = chestOsteoderms18.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(77, 107).mirror().addBox(-0.7839F, -0.4933F, -1.7496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 75).mirror().addBox(-1.8452F, -0.4327F, 1.0558F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2168F, 1.3431F, -0.8002F, 0.0571F, 0.3511F, 0.31F));

		PartDefinition cube_r134 = chestOsteoderms18.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(7, 108).mirror().addBox(0.0757F, -0.2864F, -1.8118F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(56, 107).mirror().addBox(-1.8282F, -0.7053F, 0.4707F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.009F, -0.9942F, 0.0608F, -0.2142F, 0.6386F, 1.1312F));

		PartDefinition cube_r135 = chestOsteoderms18.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(14, 108).mirror().addBox(-0.7217F, -0.3029F, -1.7466F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 107).mirror().addBox(-1.3368F, -0.7031F, 1.164F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.009F, -0.9942F, 0.0608F, -0.168F, 0.1609F, 1.2452F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(21, 11).addBox(-0.5F, -0.32F, 0.0139F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(122, 3).addBox(0.0F, -1.32F, 5.0139F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 122).addBox(0.0F, -1.22F, 7.0139F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1683F, 7.9852F, 0.0264F, -0.1309F, -0.0034F));

		PartDefinition cube_r136 = tail3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(90, 120).addBox(0.0F, -1.15F, 0.15F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.27F, 2.8639F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(87, 120).addBox(0.0F, -1.25F, 0.15F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.27F, 0.8639F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(55, 122).addBox(0.0F, 7.0684F, 21.9592F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 0).addBox(0.0F, 7.5684F, 23.9592F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 97).addBox(0.0F, 6.5684F, 19.9592F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 94).addBox(0.0F, 5.9684F, 17.9592F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 74).addBox(0.0F, 5.4684F, 15.9592F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7783F, -16.8965F, 0.3142F, 0.0F, 0.0F));

		PartDefinition chestOsteoderms8 = tail3.addOrReplaceChild("chestOsteoderms8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9774F, -1.8376F, 4.9464F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r139 = chestOsteoderms8.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(110, 3).addBox(-1.4162F, 0.0997F, -3.4532F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9961F, 2.2127F, -0.8345F, 0.0005F, -0.2714F, 0.3563F));

		PartDefinition cube_r140 = chestOsteoderms8.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(110, 0).addBox(-2.9932F, 0.1243F, -3.2552F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9961F, 2.2127F, -0.8345F, -0.009F, -0.7599F, 0.374F));

		PartDefinition cube_r141 = chestOsteoderms8.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(56, 110).addBox(-0.9303F, 0.0789F, -0.5645F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9961F, 1.7127F, 2.1655F, 0.0889F, -0.2825F, 0.0266F));

		PartDefinition cube_r142 = chestOsteoderms8.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(77, 110).addBox(-1.2086F, 0.0865F, -0.9324F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9961F, 1.7127F, 2.1655F, 0.109F, -0.77F, -0.0133F));

		PartDefinition cube_r143 = chestOsteoderms8.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(91, 109).addBox(-0.9303F, 0.0789F, -0.5645F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9961F, 2.1127F, -0.8345F, 0.0425F, -0.2886F, 0.2139F));

		PartDefinition cube_r144 = chestOsteoderms8.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(21, 109).addBox(-1.2086F, 0.0865F, -0.9324F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9961F, 2.1127F, -0.8345F, 0.047F, -0.7772F, 0.2042F));

		PartDefinition cube_r145 = chestOsteoderms8.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(42, 110).addBox(-2.0246F, -0.4776F, -1.8431F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.2168F, 0.8431F, 3.5998F, 0.0685F, -0.8396F, -0.3306F));

		PartDefinition cube_r146 = chestOsteoderms8.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(49, 110).addBox(-1.2161F, -0.4933F, -1.7496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2168F, 0.8431F, 3.5998F, 0.0571F, -0.3511F, -0.31F));

		PartDefinition cube_r147 = chestOsteoderms8.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(109, 18).addBox(-2.0246F, -0.4776F, -1.8431F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(70, 108).addBox(0.2298F, -0.4411F, 0.1357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.2168F, 0.8431F, -1.8002F, 0.0685F, -0.8396F, -0.3306F));

		PartDefinition cube_r148 = chestOsteoderms8.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(84, 108).addBox(-1.2161F, -0.4933F, -1.7496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(108, 63).addBox(-0.1548F, -0.4327F, 1.0558F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2168F, 0.8431F, -1.8002F, 0.0571F, -0.3511F, -0.31F));

		PartDefinition cube_r149 = chestOsteoderms8.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(63, 108).addBox(-1.4296F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.5961F, -0.7873F, -2.5345F, -0.2653F, -0.8144F, -1.0933F));

		PartDefinition cube_r150 = chestOsteoderms8.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(108, 29).addBox(-1.1083F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5961F, -0.7873F, -2.5345F, -0.1837F, -0.3401F, -1.2375F));

		PartDefinition cube_r151 = chestOsteoderms8.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(28, 110).addBox(-1.4296F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.8961F, -0.5873F, 2.5655F, -0.2653F, -0.8144F, -1.0933F));

		PartDefinition cube_r152 = chestOsteoderms8.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(35, 110).addBox(-1.1083F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8961F, -0.5873F, 2.5655F, -0.1837F, -0.3401F, -1.2375F));

		PartDefinition cube_r153 = chestOsteoderms8.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(108, 26).addBox(-1.4296F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.5961F, -0.7873F, -0.0345F, -0.2653F, -0.8144F, -1.0933F));

		PartDefinition cube_r154 = chestOsteoderms8.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(108, 23).addBox(-1.1083F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5961F, -0.7873F, -0.0345F, -0.1837F, -0.3401F, -1.2375F));

		PartDefinition chestOsteoderms19 = tail3.addOrReplaceChild("chestOsteoderms19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9774F, -1.8376F, 4.9464F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r155 = chestOsteoderms19.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(110, 3).mirror().addBox(-0.5838F, 0.0997F, -3.4532F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9961F, 2.2127F, -0.8345F, 0.0005F, 0.2714F, -0.3563F));

		PartDefinition cube_r156 = chestOsteoderms19.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(110, 0).mirror().addBox(0.9932F, 0.1243F, -3.2552F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9961F, 2.2127F, -0.8345F, -0.009F, 0.7599F, -0.374F));

		PartDefinition cube_r157 = chestOsteoderms19.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(56, 110).mirror().addBox(-1.0697F, 0.0789F, -0.5645F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9961F, 1.7127F, 2.1655F, 0.0889F, 0.2825F, -0.0266F));

		PartDefinition cube_r158 = chestOsteoderms19.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(77, 110).mirror().addBox(-0.7914F, 0.0865F, -0.9324F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9961F, 1.7127F, 2.1655F, 0.109F, 0.77F, 0.0133F));

		PartDefinition cube_r159 = chestOsteoderms19.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(91, 109).mirror().addBox(-1.0697F, 0.0789F, -0.5645F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9961F, 2.1127F, -0.8345F, 0.0425F, 0.2886F, -0.2139F));

		PartDefinition cube_r160 = chestOsteoderms19.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(21, 109).mirror().addBox(-0.7914F, 0.0865F, -0.9324F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9961F, 2.1127F, -0.8345F, 0.047F, 0.7772F, -0.2042F));

		PartDefinition cube_r161 = chestOsteoderms19.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(42, 110).mirror().addBox(0.0246F, -0.4776F, -1.8431F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.2168F, 0.8431F, 3.5998F, 0.0685F, 0.8396F, 0.3306F));

		PartDefinition cube_r162 = chestOsteoderms19.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(49, 110).mirror().addBox(-0.7839F, -0.4933F, -1.7496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2168F, 0.8431F, 3.5998F, 0.0571F, 0.3511F, 0.31F));

		PartDefinition cube_r163 = chestOsteoderms19.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(109, 18).mirror().addBox(0.0246F, -0.4776F, -1.8431F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(70, 108).mirror().addBox(-2.2298F, -0.4411F, 0.1357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.2168F, 0.8431F, -1.8002F, 0.0685F, 0.8396F, 0.3306F));

		PartDefinition cube_r164 = chestOsteoderms19.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(84, 108).mirror().addBox(-0.7839F, -0.4933F, -1.7496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(108, 63).mirror().addBox(-1.8452F, -0.4327F, 1.0558F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2168F, 0.8431F, -1.8002F, 0.0571F, 0.3511F, 0.31F));

		PartDefinition cube_r165 = chestOsteoderms19.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(63, 108).mirror().addBox(-0.5704F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.5961F, -0.7873F, -2.5345F, -0.2653F, 0.8144F, 1.0933F));

		PartDefinition cube_r166 = chestOsteoderms19.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(108, 29).mirror().addBox(-0.8917F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5961F, -0.7873F, -2.5345F, -0.1837F, 0.3401F, 1.2375F));

		PartDefinition cube_r167 = chestOsteoderms19.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(28, 110).mirror().addBox(-0.5704F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.8961F, -0.5873F, 2.5655F, -0.2653F, 0.8144F, 1.0933F));

		PartDefinition cube_r168 = chestOsteoderms19.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(35, 110).mirror().addBox(-0.8917F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8961F, -0.5873F, 2.5655F, -0.1837F, 0.3401F, 1.2375F));

		PartDefinition cube_r169 = chestOsteoderms19.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(108, 26).mirror().addBox(-0.5704F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.5961F, -0.7873F, -0.0345F, -0.2653F, 0.8144F, 1.0933F));

		PartDefinition cube_r170 = chestOsteoderms19.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(108, 23).mirror().addBox(-0.8917F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5961F, -0.7873F, -0.0345F, -0.1837F, 0.3401F, 1.2375F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 33).addBox(-0.5F, -0.4893F, 0.1313F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(122, 27).addBox(0.0F, -1.2893F, 2.1313F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 122).addBox(0.0F, -1.1893F, 4.1313F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 122).addBox(0.0F, -1.1893F, 6.1313F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1498F, 8.7895F, -0.0162F, -0.2417F, 0.0325F));

		PartDefinition cube_r171 = tail4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(74, 122).addBox(0.0F, 9.0684F, 29.9592F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 66).addBox(0.0F, 8.6684F, 27.9592F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 63).addBox(0.0F, 8.0684F, 25.9592F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6286F, -25.686F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(122, 24).addBox(0.0F, -0.95F, 0.15F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4393F, -0.0187F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chestOsteoderms9 = tail4.addOrReplaceChild("chestOsteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6398F, -1.1576F, 3.699F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r173 = chestOsteoderms9.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(112, 6).addBox(-1.6264F, -0.2471F, -3.2058F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.927F, 1.7316F, -0.1163F, -0.0418F, -0.2559F, 0.3673F));

		PartDefinition cube_r174 = chestOsteoderms9.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(111, 91).addBox(-3.0671F, -0.2207F, -2.9372F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.927F, 1.7316F, -0.1163F, -0.0642F, -0.7432F, 0.4117F));

		PartDefinition cube_r175 = chestOsteoderms9.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(111, 88).addBox(-1.1067F, -0.3896F, -0.3024F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.827F, 1.7316F, -0.1163F, -0.0019F, -0.279F, 0.2263F));

		PartDefinition cube_r176 = chestOsteoderms9.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(84, 111).addBox(-1.2474F, -0.3807F, -0.6169F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.827F, 1.7316F, -0.1163F, -0.0124F, -0.7675F, 0.2457F));

		PartDefinition cube_r177 = chestOsteoderms9.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(28, 113).addBox(0.918F, -0.3728F, 1.1594F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(63, 111).addBox(-3.1017F, -0.6196F, -2.438F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(7, 111).addBox(-0.8472F, -0.5831F, -0.4591F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9051F, 0.4509F, -0.1957F, 0.0332F, -0.765F, -0.3052F));

		PartDefinition cube_r178 = chestOsteoderms9.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(70, 111).addBox(0.2212F, -0.3583F, 2.0837F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 111).addBox(-2.1552F, -0.6477F, -2.7566F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 111).addBox(-0.8065F, -0.5872F, -0.0776F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9051F, 0.4509F, -0.1957F, 0.0334F, -0.3809F, -0.3059F));

		PartDefinition cube_r179 = chestOsteoderms9.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(112, 32).addBox(0.7008F, -0.8368F, 2.3234F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(112, 15).addBox(-0.3518F, -0.4924F, 0.6581F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(112, 12).addBox(-1.5097F, -0.1135F, -1.1738F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 110).addBox(-2.5097F, 0.2126F, -3.1164F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1948F, -0.734F, 0.1058F, -0.2605F, -0.5341F, -1.1617F));

		PartDefinition cube_r180 = chestOsteoderms9.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(112, 35).addBox(1.2602F, -0.8547F, 1.5749F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(21, 112).addBox(-0.1944F, -0.4949F, 0.2503F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(112, 9).addBox(-1.7945F, -0.099F, -1.2067F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(105, 110).addBox(-3.2727F, 0.2421F, -2.8126F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.1948F, -0.734F, 0.1058F, -0.3313F, -0.7892F, -1.0459F));

		PartDefinition chestOsteoderms20 = tail4.addOrReplaceChild("chestOsteoderms20", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6398F, -1.1576F, 3.699F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r181 = chestOsteoderms20.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(112, 6).mirror().addBox(-0.3736F, -0.2471F, -3.2058F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.927F, 1.7316F, -0.1163F, -0.0418F, 0.2559F, -0.3673F));

		PartDefinition cube_r182 = chestOsteoderms20.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(111, 91).mirror().addBox(1.0671F, -0.2207F, -2.9372F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.927F, 1.7316F, -0.1163F, -0.0642F, 0.7432F, -0.4117F));

		PartDefinition cube_r183 = chestOsteoderms20.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(111, 88).mirror().addBox(-0.8933F, -0.3896F, -0.3024F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.827F, 1.7316F, -0.1163F, -0.0019F, 0.279F, -0.2263F));

		PartDefinition cube_r184 = chestOsteoderms20.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(84, 111).mirror().addBox(-0.7526F, -0.3807F, -0.6169F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.827F, 1.7316F, -0.1163F, -0.0124F, 0.7675F, -0.2457F));

		PartDefinition cube_r185 = chestOsteoderms20.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(28, 113).mirror().addBox(-2.918F, -0.3728F, 1.1594F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(63, 111).mirror().addBox(1.1017F, -0.6196F, -2.438F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(7, 111).mirror().addBox(-1.1528F, -0.5831F, -0.4591F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9051F, 0.4509F, -0.1957F, 0.0332F, 0.765F, 0.3052F));

		PartDefinition cube_r186 = chestOsteoderms20.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(70, 111).mirror().addBox(-2.2212F, -0.3583F, 2.0837F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 111).mirror().addBox(0.1552F, -0.6477F, -2.7566F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 111).mirror().addBox(-1.1935F, -0.5872F, -0.0776F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9051F, 0.4509F, -0.1957F, 0.0334F, 0.3809F, 0.3059F));

		PartDefinition cube_r187 = chestOsteoderms20.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(112, 32).mirror().addBox(-2.7008F, -0.8368F, 2.3234F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(112, 15).mirror().addBox(-1.6482F, -0.4924F, 0.6581F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(112, 12).mirror().addBox(-0.4903F, -0.1135F, -1.1738F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 110).mirror().addBox(0.5097F, 0.2126F, -3.1164F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1948F, -0.734F, 0.1058F, -0.2605F, 0.5341F, 1.1617F));

		PartDefinition cube_r188 = chestOsteoderms20.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(112, 35).mirror().addBox(-3.2601F, -0.8547F, 1.5749F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(21, 112).mirror().addBox(-1.8056F, -0.4949F, 0.2503F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(112, 9).mirror().addBox(-0.2055F, -0.099F, -1.2067F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(105, 110).mirror().addBox(1.2727F, 0.2421F, -2.8126F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.1948F, -0.734F, 0.1058F, -0.3313F, 0.7892F, 1.0459F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(67, 68).addBox(-0.5F, -0.701F, 0.0865F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(42, 122).addBox(0.0F, -1.101F, 4.0865F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2167F, 7.9255F, -0.0565F, -0.2077F, -0.1367F));

		PartDefinition cube_r189 = tail5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(39, 122).addBox(0.0F, -0.575F, 0.15F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.651F, 1.9365F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(36, 122).addBox(0.0F, -0.725F, 0.15F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.651F, -0.0635F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail7 = tail5.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(19, 52).addBox(-0.5F, -0.55F, 0.15F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.151F, 4.9365F, -0.2314F, -0.3416F, 0.0729F));

		PartDefinition chestOsteoderms11 = tail7.addOrReplaceChild("chestOsteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3893F, -0.4282F, 3.9042F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r191 = chestOsteoderms11.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(119, 50).addBox(0.7253F, -0.5245F, 0.5831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9685F, 0.3759F, -0.8054F, 0.0332F, -0.765F, -0.3052F));

		PartDefinition cube_r192 = chestOsteoderms11.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(41, 119).addBox(-1.688F, -0.5755F, -1.8156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9051F, 0.4509F, -0.1957F, 0.0332F, -0.765F, -0.3052F));

		PartDefinition cube_r193 = chestOsteoderms11.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(36, 119).addBox(0.6747F, -0.6045F, 0.5373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.2555F, -0.4638F, -0.4789F, -0.466F, -0.7357F, -0.8077F));

		PartDefinition cube_r194 = chestOsteoderms11.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(119, 34).addBox(-0.4254F, -0.2086F, -0.5197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.2555F, -0.4638F, -1.7789F, -0.466F, -0.7357F, -0.8077F));

		PartDefinition chestOsteoderms22 = tail7.addOrReplaceChild("chestOsteoderms22", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3893F, -0.4282F, 3.9042F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r195 = chestOsteoderms22.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(119, 50).mirror().addBox(-1.7253F, -0.5245F, 0.5831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9685F, 0.3759F, -0.8054F, 0.0332F, 0.765F, 0.3052F));

		PartDefinition cube_r196 = chestOsteoderms22.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(41, 119).mirror().addBox(0.688F, -0.5755F, -1.8156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9051F, 0.4509F, -0.1957F, 0.0332F, 0.765F, 0.3052F));

		PartDefinition cube_r197 = chestOsteoderms22.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(36, 119).mirror().addBox(-1.6747F, -0.6045F, 0.5373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.2555F, -0.4638F, -0.4789F, -0.466F, 0.7357F, 0.8077F));

		PartDefinition cube_r198 = chestOsteoderms22.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(119, 34).mirror().addBox(-0.5746F, -0.2086F, -0.5197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.2555F, -0.4638F, -1.7789F, -0.466F, 0.7357F, 0.8077F));

		PartDefinition chestOsteoderms10 = tail5.addOrReplaceChild("chestOsteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3893F, -1.0006F, 4.3327F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r199 = chestOsteoderms10.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(31, 119).addBox(-1.4729F, 0.4701F, -1.7852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9685F, 0.3759F, -1.6054F, -0.0189F, -0.8991F, 0.3434F));

		PartDefinition cube_r200 = chestOsteoderms10.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(119, 31).addBox(0.6846F, -0.3324F, 0.6207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9685F, 0.3759F, -2.1054F, 0.0332F, -0.765F, -0.3052F));

		PartDefinition cube_r201 = chestOsteoderms10.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(119, 18).addBox(-2.988F, -0.5755F, -3.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9051F, 0.4509F, 0.3043F, 0.0332F, -0.765F, -0.3052F));

		PartDefinition cube_r202 = chestOsteoderms10.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(119, 15).addBox(0.6747F, -0.6045F, 0.5373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.2555F, -0.4638F, -1.7788F, -0.466F, -0.7357F, -0.8077F));

		PartDefinition cube_r203 = chestOsteoderms10.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(119, 12).addBox(-1.4035F, 0.1324F, -1.6256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.2555F, -0.4638F, -1.2788F, -0.466F, -0.7357F, -0.8077F));

		PartDefinition chestOsteoderms21 = tail5.addOrReplaceChild("chestOsteoderms21", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3893F, -1.0006F, 4.3327F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r204 = chestOsteoderms21.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(31, 119).mirror().addBox(0.473F, 0.4701F, -1.7852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9685F, 0.3759F, -1.6054F, -0.0189F, 0.8991F, -0.3434F));

		PartDefinition cube_r205 = chestOsteoderms21.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(119, 31).mirror().addBox(-1.6846F, -0.3324F, 0.6207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9685F, 0.3759F, -2.1054F, 0.0332F, 0.765F, 0.3052F));

		PartDefinition cube_r206 = chestOsteoderms21.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(119, 18).mirror().addBox(1.988F, -0.5755F, -3.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9051F, 0.4509F, 0.3043F, 0.0332F, 0.765F, 0.3052F));

		PartDefinition cube_r207 = chestOsteoderms21.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(119, 15).mirror().addBox(-1.6747F, -0.6045F, 0.5373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.2555F, -0.4638F, -1.7788F, -0.466F, 0.7357F, 0.8077F));

		PartDefinition cube_r208 = chestOsteoderms21.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(119, 12).mirror().addBox(0.4035F, 0.1324F, -1.6256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.2555F, -0.4638F, -1.2788F, -0.466F, 0.7357F, 0.8077F));

		PartDefinition chestOsteoderms5 = tail.addOrReplaceChild("chestOsteoderms5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7831F, -2.147F, 3.7935F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r209 = chestOsteoderms5.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(70, 24).addBox(-0.9F, -0.1F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6004F, 2.2386F, -0.8555F, 0.0274F, 0.0501F, -0.2334F));

		PartDefinition cube_r210 = chestOsteoderms5.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(22, 70).addBox(-0.4524F, -0.3F, -1.9575F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9169F, 0.8395F, -1.4428F, 0.0208F, 0.0156F, -0.8514F));

		PartDefinition cube_r211 = chestOsteoderms5.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(106, 39).addBox(-1.0F, -0.5F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8945F, 3.964F, -0.1073F, 0.0757F, -0.381F, 0.2002F));

		PartDefinition cube_r212 = chestOsteoderms5.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(96, 73).addBox(-3.1935F, -0.4141F, -3.1243F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.9961F, 3.7127F, 2.8655F, 0.0859F, -0.7386F, 0.182F));

		PartDefinition cube_r213 = chestOsteoderms5.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(96, 70).addBox(-3.1935F, -0.4141F, -3.1243F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.4961F, 1.6127F, 1.1655F, 0.0362F, -0.8086F, -0.302F));

		PartDefinition cube_r214 = chestOsteoderms5.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(84, 105).addBox(-1.0F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7075F, 1.7157F, -1.9106F, 0.0354F, -0.4071F, -0.3009F));

		PartDefinition cube_r215 = chestOsteoderms5.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(105, 85).addBox(-1.4296F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.4961F, 1.6127F, 1.1655F, 0.0184F, -0.8503F, -0.2931F));

		PartDefinition cube_r216 = chestOsteoderms5.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(21, 106).addBox(-1.1083F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4961F, 1.6127F, 1.1655F, 0.0216F, -0.3616F, -0.2976F));

		PartDefinition cube_r217 = chestOsteoderms5.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(96, 67).addBox(-3.1935F, -0.4141F, -3.1243F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1961F, -0.7873F, 0.5655F, -0.1433F, -0.6166F, -1.178F));

		PartDefinition cube_r218 = chestOsteoderms5.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(105, 82).addBox(-0.1F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.4447F, 0.3707F, -2.4058F, -0.1139F, -0.2115F, -1.2495F));

		PartDefinition cube_r219 = chestOsteoderms5.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(105, 79).addBox(-1.1404F, -0.4416F, -3.2813F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1961F, -0.7873F, 0.5655F, -0.1118F, 0.0834F, -1.2829F));

		PartDefinition cube_r220 = chestOsteoderms5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(105, 72).addBox(-1.4296F, -0.5127F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1961F, -0.9873F, 1.1655F, -0.1644F, -0.6566F, -1.1613F));

		PartDefinition cube_r221 = chestOsteoderms5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(70, 105).addBox(-1.1083F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1961F, -0.9873F, 1.1655F, -0.126F, -0.1747F, -1.2522F));

		PartDefinition chestOsteoderms16 = tail.addOrReplaceChild("chestOsteoderms16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7831F, -2.147F, 3.7935F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r222 = chestOsteoderms16.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-0.1F, -0.1F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6004F, 2.2386F, -0.8555F, 0.0274F, -0.0501F, 0.2334F));

		PartDefinition cube_r223 = chestOsteoderms16.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(22, 70).mirror().addBox(-0.5476F, -0.3F, -1.9575F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9169F, 0.8395F, -1.4428F, 0.0208F, -0.0156F, 0.8514F));

		PartDefinition cube_r224 = chestOsteoderms16.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(106, 39).mirror().addBox(-1.0F, -0.5F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8945F, 3.964F, -0.1073F, 0.0757F, 0.381F, -0.2002F));

		PartDefinition cube_r225 = chestOsteoderms16.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(96, 73).mirror().addBox(0.1935F, -0.4141F, -3.1243F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.9961F, 3.7127F, 2.8655F, 0.0859F, 0.7386F, -0.182F));

		PartDefinition cube_r226 = chestOsteoderms16.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(96, 70).mirror().addBox(0.1935F, -0.4141F, -3.1243F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.4961F, 1.6127F, 1.1655F, 0.0362F, 0.8086F, 0.302F));

		PartDefinition cube_r227 = chestOsteoderms16.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(84, 105).mirror().addBox(-1.0F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7075F, 1.7157F, -1.9106F, 0.0354F, 0.4071F, 0.3009F));

		PartDefinition cube_r228 = chestOsteoderms16.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(105, 85).mirror().addBox(-0.5704F, -0.5128F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.4961F, 1.6127F, 1.1655F, 0.0184F, 0.8503F, 0.2931F));

		PartDefinition cube_r229 = chestOsteoderms16.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(21, 106).mirror().addBox(-0.8917F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4961F, 1.6127F, 1.1655F, 0.0216F, 0.3616F, 0.2976F));

		PartDefinition cube_r230 = chestOsteoderms16.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(96, 67).mirror().addBox(0.1935F, -0.4141F, -3.1243F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1961F, -0.7873F, 0.5655F, -0.1433F, 0.6166F, 1.178F));

		PartDefinition cube_r231 = chestOsteoderms16.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(105, 82).mirror().addBox(-1.9F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.4447F, 0.3707F, -2.4058F, -0.1139F, 0.2115F, 1.2495F));

		PartDefinition cube_r232 = chestOsteoderms16.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(105, 79).mirror().addBox(-0.8595F, -0.4416F, -3.2813F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1961F, -0.7873F, 0.5655F, -0.1118F, -0.0834F, 1.2829F));

		PartDefinition cube_r233 = chestOsteoderms16.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(105, 72).mirror().addBox(-0.5704F, -0.5127F, -0.9524F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1961F, -0.9873F, 1.1655F, -0.1644F, 0.6566F, 1.1613F));

		PartDefinition cube_r234 = chestOsteoderms16.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(70, 105).mirror().addBox(-0.8917F, -0.5231F, -0.6836F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1961F, -0.9873F, 1.1655F, -0.126F, 0.1747F, 1.2522F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8F, -1.0F, 0.0964F, 0.0869F, 0.0084F));

		PartDefinition cube_r235 = body.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(71, 118).addBox(-0.5F, -2.508F, 0.0135F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4871F, -1.1037F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r236 = body.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(68, 118).addBox(-0.5F, -2.608F, 0.0135F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5569F, -3.1025F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r237 = body.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(65, 118).addBox(-0.5F, -2.608F, 0.1135F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6302F, -5.2012F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r238 = body.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(62, 118).addBox(-0.5F, -2.408F, 0.1135F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -7.2F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r239 = body.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(115, 63).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.4255F, -0.5269F, -0.1549F, -0.0228F, -0.6488F));

		PartDefinition cube_r240 = body.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(111, 115).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.4255F, -0.5269F, -0.1334F, -0.0668F, -1.1185F));

		PartDefinition cube_r241 = body.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(115, 29).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.3255F, -2.5269F, -0.1115F, 0.0066F, -0.5444F));

		PartDefinition cube_r242 = body.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(89, 115).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.3255F, -2.5269F, -0.1081F, -0.021F, -1.0149F));

		PartDefinition cube_r243 = body.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(29, 77).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.3255F, -2.5269F, -0.082F, -0.0736F, -1.554F));

		PartDefinition cube_r244 = body.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(115, 27).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.2255F, -4.5268F, -0.0537F, 0.0458F, -0.4905F));

		PartDefinition cube_r245 = body.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(115, 25).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.2255F, -4.5268F, -0.0744F, 0.0402F, -0.9622F));

		PartDefinition cube_r246 = body.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(115, 23).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.2255F, -4.5268F, -0.0845F, -0.0038F, -1.5016F));

		PartDefinition cube_r247 = body.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(114, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1255F, -6.5268F, 0.0188F, 0.0946F, -0.4505F));

		PartDefinition cube_r248 = body.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(114, 74).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1255F, -6.5268F, -0.032F, 0.1166F, -0.9239F));

		PartDefinition cube_r249 = body.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(98, 18).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.1255F, -6.5268F, -0.0876F, 0.0834F, -1.4668F));

		PartDefinition cube_r250 = body.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(115, 63).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.4255F, -0.5269F, -0.1549F, 0.0228F, 0.6488F));

		PartDefinition cube_r251 = body.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(111, 115).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.4255F, -0.5269F, -0.1334F, 0.0668F, 1.1185F));

		PartDefinition cube_r252 = body.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(115, 29).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.3255F, -2.5269F, -0.1115F, -0.0066F, 0.5444F));

		PartDefinition cube_r253 = body.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(89, 115).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.3255F, -2.5269F, -0.1081F, 0.021F, 1.0149F));

		PartDefinition cube_r254 = body.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(29, 77).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.3255F, -2.5269F, -0.082F, 0.0736F, 1.554F));

		PartDefinition cube_r255 = body.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(115, 27).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.2255F, -4.5268F, -0.0537F, -0.0458F, 0.4905F));

		PartDefinition cube_r256 = body.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(115, 25).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.2255F, -4.5268F, -0.0744F, -0.0402F, 0.9622F));

		PartDefinition cube_r257 = body.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(115, 23).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.2255F, -4.5268F, -0.0845F, 0.0038F, 1.5016F));

		PartDefinition cube_r258 = body.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(114, 76).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.1255F, -6.5268F, 0.0188F, -0.0946F, 0.4505F));

		PartDefinition cube_r259 = body.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(114, 74).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.1255F, -6.5268F, -0.032F, -0.1166F, 0.9239F));

		PartDefinition cube_r260 = body.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(98, 18).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.1255F, -6.5268F, -0.0876F, -0.0834F, 1.4668F));

		PartDefinition cube_r261 = body.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(36, 53).addBox(-1.0F, -0.008F, 0.1135F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -0.7F, -7.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.1F, -6.9F, -0.0349F, 0.0436F, -0.0015F));

		PartDefinition cube_r262 = body2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(63, 24).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.3255F, -5.5269F, 0.3192F, 0.2819F, -0.2191F));

		PartDefinition cube_r263 = body2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(21, 115).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.3255F, -5.5269F, 0.1508F, 0.4183F, -0.7004F));

		PartDefinition cube_r264 = body2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(67, 80).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.3255F, -5.5269F, -0.101F, 0.4322F, -1.2957F));

		PartDefinition cube_r265 = body2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(114, 100).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.9255F, -3.5268F, 0.2419F, 0.2368F, -0.2739F));

		PartDefinition cube_r266 = body2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(114, 98).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.9255F, -3.5268F, 0.1019F, 0.3438F, -0.7535F));

		PartDefinition cube_r267 = body2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(81, 53).mirror().addBox(-7.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.9255F, -3.5268F, -0.0974F, 0.345F, -1.3293F));

		PartDefinition cube_r268 = body2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(114, 96).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.5255F, -1.5268F, 0.0287F, 0.2231F, -0.7915F));

		PartDefinition cube_r269 = body2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(85, 57).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.5255F, -1.5268F, -0.092F, 0.2055F, -1.3453F));

		PartDefinition cube_r270 = body2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(82, 114).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.5255F, -1.5268F, 0.1216F, 0.162F, -0.3152F));

		PartDefinition cube_r271 = body2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(63, 24).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.3255F, -5.5269F, 0.3192F, -0.2819F, 0.2191F));

		PartDefinition cube_r272 = body2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(24, 117).addBox(-0.5F, -2.1171F, 0.0253F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -6.1F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r273 = body2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(21, 115).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.3255F, -5.5269F, 0.1508F, -0.4183F, 0.7004F));

		PartDefinition cube_r274 = body2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(67, 80).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.3255F, -5.5269F, -0.101F, -0.4322F, 1.2957F));

		PartDefinition cube_r275 = body2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(114, 100).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9255F, -3.5268F, 0.2419F, -0.2368F, 0.2739F));

		PartDefinition cube_r276 = body2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(114, 98).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9255F, -3.5268F, 0.1019F, -0.3438F, 0.7535F));

		PartDefinition cube_r277 = body2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(81, 53).addBox(2.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9255F, -3.5268F, -0.0974F, -0.345F, 1.3293F));

		PartDefinition cube_r278 = body2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(114, 96).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.5255F, -1.5268F, 0.0287F, -0.2231F, 0.7915F));

		PartDefinition cube_r279 = body2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(85, 57).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.5255F, -1.5268F, -0.092F, -0.2055F, 1.3453F));

		PartDefinition cube_r280 = body2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(82, 114).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.5255F, -1.5268F, 0.1216F, -0.162F, 0.3152F));

		PartDefinition cube_r281 = body2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(116, 117).addBox(-0.5F, -2.5578F, -0.0352F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.1F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r282 = body2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(56, 117).addBox(-0.5F, -2.4848F, -0.0146F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -4.1F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r283 = body2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(59, 0).addBox(-1.0F, 2.9F, 0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -7.0F, 0.1833F, 0.0F, 0.0F));

		PartDefinition chestOsteoderms2 = body2.addOrReplaceChild("chestOsteoderms2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3392F, -1.056F, -4.0872F, -0.0874F, -0.0872F, 0.0038F));

		PartDefinition cube_r284 = chestOsteoderms2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(63, 8).addBox(-0.5F, -0.3F, -0.55F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4911F, 3.3997F, -1.3739F, 0.3343F, 0.1736F, -0.1532F));

		PartDefinition cube_r285 = chestOsteoderms2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(57, 26).addBox(-0.4013F, -3.6742F, -2.5199F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.4583F, 7.0372F, 3.0374F, 0.2433F, 0.0545F, -0.0711F));

		PartDefinition cube_r286 = chestOsteoderms2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(63, 16).addBox(-0.5578F, -0.7122F, -2.7365F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1972F, -0.2371F, 0.0129F, 0.1062F, 0.306F, -0.9846F));

		PartDefinition cube_r287 = chestOsteoderms2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(104, 93).addBox(1.9631F, -0.96F, 1.5937F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.5323F, -0.9775F, -0.7241F, 0.0014F, -0.5675F, -1.263F));

		PartDefinition cube_r288 = chestOsteoderms2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(99, 104).addBox(-0.4F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.7795F, -1.7262F, 2.9782F, 0.006F, -0.2098F, -1.276F));

		PartDefinition cube_r289 = chestOsteoderms2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(104, 90).addBox(-0.8F, -0.5F, -0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6057F, -2.2944F, 2.8949F, 0.006F, 0.1393F, -1.274F));

		PartDefinition cube_r290 = chestOsteoderms2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(42, 113).addBox(-0.8753F, -0.4816F, -0.5726F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.7482F, 1.2394F, -1.1598F, 0.2508F, -0.7223F, -0.7922F));

		PartDefinition cube_r291 = chestOsteoderms2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(0, 120).addBox(-0.626F, -0.4881F, -0.4603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7482F, 1.2394F, -1.1598F, 0.2032F, 0.3569F, -0.5658F));

		PartDefinition cube_r292 = chestOsteoderms2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(105, 9).addBox(0.1371F, -0.6874F, 0.6428F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4677F, 0.9225F, 1.7759F, 0.2503F, 0.1616F, -0.6633F));

		PartDefinition cube_r293 = chestOsteoderms2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(105, 12).addBox(0.1608F, -0.691F, -0.1642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(105, 15).addBox(-0.2392F, -0.691F, -0.6642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.4677F, 0.9225F, 1.7759F, 0.2487F, -0.2306F, -0.7496F));

		PartDefinition cube_r294 = chestOsteoderms2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(14, 105).addBox(0.629F, -0.691F, -1.5916F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4677F, 0.9225F, 1.7759F, 0.3747F, -0.8568F, -0.9805F));

		PartDefinition cube_r295 = chestOsteoderms2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(91, 112).addBox(-0.5392F, -0.691F, -1.2642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.4677F, 0.9225F, 1.7759F, 0.2882F, -0.5675F, -0.8496F));

		PartDefinition cube_r296 = chestOsteoderms2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(79, 89).addBox(-0.3941F, -0.6874F, -1.2136F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4677F, 0.9225F, 1.7759F, 0.2488F, 0.1194F, -0.6741F));

		PartDefinition cube_r297 = chestOsteoderms2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(35, 113).addBox(1.9631F, -0.96F, 1.5937F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.7316F, -0.061F, -3.6618F, 0.0014F, -0.5675F, -1.263F));

		PartDefinition cube_r298 = chestOsteoderms2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(119, 53).addBox(-0.1069F, -0.933F, 3.3072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7316F, -0.061F, -3.6618F, 0.0061F, 0.2265F, -1.2734F));

		PartDefinition cube_r299 = chestOsteoderms2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(77, 104).addBox(0.475F, -0.8575F, -0.2474F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(56, 104).addBox(0.075F, -0.8575F, -0.8474F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(3.0677F, 8.9225F, 3.0759F, 0.1157F, -0.4761F, 0.3742F));

		PartDefinition cube_r300 = chestOsteoderms2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(101, 27).addBox(0.4998F, -0.8501F, 0.598F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0677F, 8.9225F, 3.0759F, 0.1108F, -0.0759F, 0.408F));

		PartDefinition cube_r301 = chestOsteoderms2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(49, 104).addBox(-0.3066F, -0.8575F, -1.5438F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(3.0677F, 8.9225F, 3.0759F, 0.1513F, -0.8221F, 0.3161F));

		PartDefinition cube_r302 = chestOsteoderms2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(89, 36).addBox(-0.0338F, -0.8501F, -1.2742F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(3.0677F, 8.9225F, 3.0759F, 0.1113F, -0.1192F, 0.4031F));

		PartDefinition cube_r303 = chestOsteoderms2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(113, 41).addBox(0.7667F, -0.8575F, -1.9282F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.0677F, 8.9225F, 3.0759F, 0.2387F, -1.1222F, 0.2115F));

		PartDefinition cube_r304 = chestOsteoderms2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(100, 76).addBox(-0.077F, -0.5716F, 1.4531F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.3677F, 3.2225F, 2.0759F, 0.2348F, -0.0475F, -0.2879F));

		PartDefinition cube_r305 = chestOsteoderms2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(42, 104).addBox(0.388F, -0.5898F, 0.8451F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(3.3677F, 3.2225F, 2.0759F, 0.2405F, -0.3134F, -0.3398F));

		PartDefinition cube_r306 = chestOsteoderms2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(35, 104).addBox(-0.4454F, -0.4994F, -1.3124F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(3.3677F, 3.5225F, 0.8759F, 0.2507F, -0.4385F, -0.3983F));

		PartDefinition cube_r307 = chestOsteoderms2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(119, 9).addBox(-0.1599F, -0.4962F, -0.8158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.1645F, 3.5992F, 0.8224F, 0.2401F, -0.2661F, -0.367F));

		PartDefinition cube_r308 = chestOsteoderms2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(28, 104).addBox(-0.3599F, -0.4962F, -0.4158F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.3677F, 3.5225F, 0.8759F, 0.2367F, 0.2093F, -0.2526F));

		PartDefinition chestOsteoderms13 = body2.addOrReplaceChild("chestOsteoderms13", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3392F, -1.056F, -4.0872F, -0.0874F, 0.0872F, -0.0038F));

		PartDefinition cube_r309 = chestOsteoderms13.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(63, 8).mirror().addBox(-0.5F, -0.3F, -0.55F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4911F, 3.3997F, -1.3739F, 0.3343F, -0.1736F, 0.1532F));

		PartDefinition cube_r310 = chestOsteoderms13.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(57, 26).mirror().addBox(-0.5987F, -3.6742F, -2.5199F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.4583F, 7.0372F, 3.0374F, 0.2433F, -0.0545F, 0.0711F));

		PartDefinition cube_r311 = chestOsteoderms13.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(63, 16).mirror().addBox(-0.4422F, -0.7122F, -2.7365F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1972F, -0.2371F, 0.0129F, 0.1062F, -0.306F, 0.9846F));

		PartDefinition cube_r312 = chestOsteoderms13.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(104, 93).mirror().addBox(-3.9631F, -0.96F, 1.5937F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(1.5323F, -0.9775F, -0.7241F, 0.0014F, 0.5675F, 1.263F));

		PartDefinition cube_r313 = chestOsteoderms13.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(99, 104).mirror().addBox(-1.6F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.7795F, -1.7262F, 2.9782F, 0.006F, 0.2098F, 1.276F));

		PartDefinition cube_r314 = chestOsteoderms13.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(104, 90).mirror().addBox(-1.2F, -0.5F, -0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6057F, -2.2944F, 2.8949F, 0.006F, -0.1393F, 1.274F));

		PartDefinition cube_r315 = chestOsteoderms13.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(42, 113).mirror().addBox(-1.1247F, -0.4816F, -0.5726F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.7482F, 1.2394F, -1.1598F, 0.2508F, 0.7223F, 0.7922F));

		PartDefinition cube_r316 = chestOsteoderms13.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-0.374F, -0.4881F, -0.4603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7482F, 1.2394F, -1.1598F, 0.2032F, -0.3569F, 0.5658F));

		PartDefinition cube_r317 = chestOsteoderms13.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(105, 9).mirror().addBox(-2.1371F, -0.6874F, 0.6428F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4677F, 0.9225F, 1.7759F, 0.2503F, -0.1616F, 0.6633F));

		PartDefinition cube_r318 = chestOsteoderms13.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(105, 12).mirror().addBox(-2.1608F, -0.691F, -0.1642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(105, 15).mirror().addBox(-1.7608F, -0.691F, -0.6642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.4677F, 0.9225F, 1.7759F, 0.2487F, 0.2306F, 0.7496F));

		PartDefinition cube_r319 = chestOsteoderms13.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(14, 105).mirror().addBox(-2.629F, -0.691F, -1.5916F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.4677F, 0.9225F, 1.7759F, 0.3747F, 0.8568F, 0.9805F));

		PartDefinition cube_r320 = chestOsteoderms13.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(91, 112).mirror().addBox(-1.4608F, -0.691F, -1.2642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.4677F, 0.9225F, 1.7759F, 0.2882F, 0.5675F, 0.8496F));

		PartDefinition cube_r321 = chestOsteoderms13.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(79, 89).mirror().addBox(-0.6059F, -0.6874F, -1.2136F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4677F, 0.9225F, 1.7759F, 0.2488F, -0.1194F, 0.6741F));

		PartDefinition cube_r322 = chestOsteoderms13.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(35, 113).mirror().addBox(-3.9631F, -0.96F, 1.5937F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(1.7316F, -0.061F, -3.6618F, 0.0014F, 0.5675F, 1.263F));

		PartDefinition cube_r323 = chestOsteoderms13.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(119, 53).mirror().addBox(-0.8931F, -0.933F, 3.3072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.7316F, -0.061F, -3.6618F, 0.0061F, -0.2265F, 1.2734F));

		PartDefinition cube_r324 = chestOsteoderms13.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(77, 104).mirror().addBox(-2.475F, -0.8575F, -0.2474F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(56, 104).mirror().addBox(-2.075F, -0.8575F, -0.8474F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-3.0677F, 8.9225F, 3.0759F, 0.1157F, 0.4761F, -0.3742F));

		PartDefinition cube_r325 = chestOsteoderms13.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(101, 27).mirror().addBox(-2.4998F, -0.8501F, 0.598F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0677F, 8.9225F, 3.0759F, 0.1108F, 0.0759F, -0.408F));

		PartDefinition cube_r326 = chestOsteoderms13.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(49, 104).mirror().addBox(-1.6934F, -0.8575F, -1.5438F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-3.0677F, 8.9225F, 3.0759F, 0.1513F, 0.8221F, -0.3161F));

		PartDefinition cube_r327 = chestOsteoderms13.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(89, 36).mirror().addBox(-0.9662F, -0.8501F, -1.2742F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-3.0677F, 8.9225F, 3.0759F, 0.1113F, 0.1192F, -0.4031F));

		PartDefinition cube_r328 = chestOsteoderms13.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(113, 41).mirror().addBox(-2.7667F, -0.8575F, -1.9282F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.0677F, 8.9225F, 3.0759F, 0.2387F, 1.1222F, -0.2115F));

		PartDefinition cube_r329 = chestOsteoderms13.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(100, 76).mirror().addBox(-1.923F, -0.5716F, 1.4531F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.3677F, 3.2225F, 2.0759F, 0.2348F, 0.0475F, 0.2879F));

		PartDefinition cube_r330 = chestOsteoderms13.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(42, 104).mirror().addBox(-2.388F, -0.5898F, 0.8451F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-3.3677F, 3.2225F, 2.0759F, 0.2405F, 0.3134F, 0.3398F));

		PartDefinition cube_r331 = chestOsteoderms13.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(35, 104).mirror().addBox(-1.5546F, -0.4994F, -1.3124F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-3.3677F, 3.5225F, 0.8759F, 0.2507F, 0.4385F, 0.3983F));

		PartDefinition cube_r332 = chestOsteoderms13.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(119, 9).mirror().addBox(-0.8401F, -0.4962F, -0.8158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.1645F, 3.5992F, 0.8224F, 0.2401F, 0.2661F, 0.367F));

		PartDefinition cube_r333 = chestOsteoderms13.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(28, 104).mirror().addBox(-1.6401F, -0.4962F, -0.4158F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.3677F, 3.5225F, 0.8759F, 0.2367F, -0.2093F, 0.2526F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9F, -6.0F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition cube_r334 = chest.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(62, 82).addBox(-2.4441F, -0.0563F, -4.1339F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4441F, 9.1243F, -1.7661F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r335 = chest.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(17, 43).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9345F, 9.0948F, -3.0787F, 0.0067F, -0.5653F, 0.1467F));

		PartDefinition cube_r336 = chest.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(53, 52).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9129F, 9.1012F, -3.0674F, -0.0371F, -0.702F, 0.2011F));

		PartDefinition cube_r337 = chest.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(54, 75).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.384F, 9.0224F, -3.2555F, 0.0926F, -0.7773F, 0.1774F));

		PartDefinition cube_r338 = chest.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(81, 48).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8175F, 9.1315F, -3.7532F, 0.2514F, -1.0595F, 0.0935F));

		PartDefinition cube_r339 = chest.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2255F, -7.2269F, 0.7283F, 0.1896F, -0.2628F));

		PartDefinition cube_r340 = chest.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(7, 114).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2255F, -7.2269F, 0.5975F, 0.5026F, -0.6397F));

		PartDefinition cube_r341 = chest.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2255F, -7.2269F, 0.2363F, 0.7299F, -1.2479F));

		PartDefinition cube_r342 = chest.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.1255F, -5.2269F, 0.3377F, 0.5752F, -0.6633F));

		PartDefinition cube_r343 = chest.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(111, 113).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.1255F, -5.2269F, 0.5479F, 0.3468F, -0.2004F));

		PartDefinition cube_r344 = chest.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(78, 20).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.1255F, -5.2269F, -0.0529F, 0.6554F, -1.323F));

		PartDefinition cube_r345 = chest.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(113, 61).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5255F, -3.2269F, 0.4235F, 0.3138F, -0.2059F));

		PartDefinition cube_r346 = chest.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(112, 86).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5255F, -3.2269F, 0.2331F, 0.4925F, -0.6816F));

		PartDefinition cube_r347 = chest.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(57, 40).mirror().addBox(-9.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5255F, -3.2269F, -0.0804F, 0.5353F, -1.3036F));

		PartDefinition cube_r348 = chest.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(111, 94).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9255F, -1.3269F, 0.1776F, 0.4433F, -0.7241F));

		PartDefinition cube_r349 = chest.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(57, 38).mirror().addBox(-9.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9255F, -1.3269F, -0.0944F, 0.4666F, -1.3278F));

		PartDefinition cube_r350 = chest.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(109, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9255F, -1.3269F, 0.3537F, 0.2929F, -0.2442F));

		PartDefinition cube_r351 = chest.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(17, 43).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9345F, 9.0948F, -3.0787F, 0.0067F, 0.5653F, -0.1467F));

		PartDefinition cube_r352 = chest.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(53, 52).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9129F, 9.1012F, -3.0674F, -0.0371F, 0.702F, -0.2011F));

		PartDefinition cube_r353 = chest.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(54, 75).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.384F, 9.0224F, -3.2555F, 0.0926F, 0.7773F, -0.1774F));

		PartDefinition cube_r354 = chest.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(81, 48).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8175F, 9.1315F, -3.7532F, 0.2514F, 1.0595F, -0.0935F));

		PartDefinition cube_r355 = chest.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(102, 120).addBox(0.0F, -1.3571F, -0.0217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -7.7F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r356 = chest.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(99, 120).addBox(0.0F, -1.4637F, -0.0805F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -5.7F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r357 = chest.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(96, 120).addBox(0.0F, -1.6205F, -0.0066F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.9F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r358 = chest.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(40, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2255F, -7.2269F, 0.7283F, -0.1896F, 0.2628F));

		PartDefinition cube_r359 = chest.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(7, 114).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2255F, -7.2269F, 0.5975F, -0.5026F, 0.6397F));

		PartDefinition cube_r360 = chest.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(78, 22).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2255F, -7.2269F, 0.2363F, -0.7299F, 1.2479F));

		PartDefinition cube_r361 = chest.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 114).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.1255F, -5.2269F, 0.3377F, -0.5752F, 0.6633F));

		PartDefinition cube_r362 = chest.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(111, 113).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.1255F, -5.2269F, 0.5479F, -0.3468F, 0.2004F));

		PartDefinition cube_r363 = chest.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(78, 20).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.1255F, -5.2269F, -0.0529F, -0.6554F, 1.323F));

		PartDefinition cube_r364 = chest.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(113, 61).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5255F, -3.2269F, 0.4235F, -0.3138F, 0.2059F));

		PartDefinition cube_r365 = chest.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(112, 86).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5255F, -3.2269F, 0.2331F, -0.4925F, 0.6816F));

		PartDefinition cube_r366 = chest.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(57, 40).addBox(2.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5255F, -3.2269F, -0.0804F, -0.5353F, 1.3036F));

		PartDefinition cube_r367 = chest.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(111, 94).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9255F, -1.3269F, 0.1776F, -0.4433F, 0.7241F));

		PartDefinition cube_r368 = chest.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(57, 38).addBox(2.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9255F, -1.3269F, -0.0944F, -0.4666F, 1.3278F));

		PartDefinition cube_r369 = chest.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(109, 21).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9255F, -1.3269F, 0.3537F, -0.2929F, 0.2442F));

		PartDefinition cube_r370 = chest.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(93, 120).addBox(0.0F, -2.0935F, 0.0595F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -2.0F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r371 = chest.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(38, 33).addBox(-0.5F, -1.0011F, -0.0163F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.9F, -7.4F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1937F, 6.9312F, -4.7113F, 0.3142F, 0.0F, -0.2618F));

		PartDefinition cube_r372 = leftArm.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(112, 66).addBox(-1.0F, -0.7754F, -0.9172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8646F, 0.5497F, -0.4163F, -0.3915F, -0.4886F, 0.1076F));

		PartDefinition cube_r373 = leftArm.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(113, 57).addBox(-1.0F, 0.7213F, -2.3062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8646F, 0.5497F, -0.4163F, 0.5161F, -0.4886F, 0.1076F));

		PartDefinition cube_r374 = leftArm.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(29, 51).addBox(-0.1F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2646F, 3.2076F, -1.8339F, 0.0588F, 0.4339F, 0.0643F));

		PartDefinition cube_r375 = leftArm.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(34, 91).addBox(0.0F, -6.9F, -1.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2354F, 6.5497F, -0.1163F, 0.0349F, 0.0F, 0.0F));

		PartDefinition rightArm5 = leftArm.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6751F, 6.9378F, -0.4968F, -1.6498F, 0.6004F, -1.4279F));

		PartDefinition cube_r376 = rightArm5.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(44, 91).addBox(0.0F, -2.7F, -1.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(39, 91).addBox(0.0F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3266F, 2.8927F, 0.1657F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create().texOffs(70, 48).addBox(-1.0F, -1.6164F, -4.0763F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1406F, 6.0503F, -0.4855F, 1.6318F, -0.0271F, -1.062F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1937F, 6.9312F, -4.7113F, 1.0501F, -0.045F, 0.258F));

		PartDefinition cube_r377 = rightArm.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(112, 78).mirror().addBox(0.0F, -0.7754F, -0.9172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8646F, 0.5497F, -0.4163F, -0.3915F, 0.4886F, -0.1076F));

		PartDefinition cube_r378 = rightArm.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(77, 113).mirror().addBox(0.0F, 0.7213F, -2.3062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8646F, 0.5497F, -0.4163F, 0.5161F, 0.4886F, -0.1076F));

		PartDefinition cube_r379 = rightArm.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(38, 53).mirror().addBox(-0.9F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2646F, 3.2076F, -1.8339F, 0.0588F, -0.4339F, -0.0643F));

		PartDefinition cube_r380 = rightArm.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(49, 91).mirror().addBox(-1.0F, -6.9F, -1.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.2354F, 6.5497F, -0.1163F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm5 = rightArm.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6751F, 6.9378F, -0.4968F, -1.6389F, -0.4251F, 1.4F));

		PartDefinition cube_r381 = leftArm5.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(91, 67).mirror().addBox(-1.0F, -2.7F, -1.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 91).mirror().addBox(-1.0F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3266F, 2.8927F, 0.1657F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(0.0F, -1.6164F, -4.0763F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1406F, 6.0503F, -0.4855F, 1.5334F, 0.0553F, -0.4233F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.9F, 6.1F, -5.8F));

		PartDefinition cube_r382 = bone2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(0, 81).addBox(-1.25F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0292F, 1.6092F, 0.7218F, 0.0635F, 0.3281F, 0.9751F));

		PartDefinition cube_r383 = bone2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(83, 24).addBox(-0.7F, -0.6403F, -1.7791F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.3F, 0.2777F, 0.3143F, 0.4228F));

		PartDefinition cube_r384 = bone2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(78, 14).addBox(-0.5F, -1.0257F, -0.4332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.0F, 3.0F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r385 = bone2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(36, 43).addBox(-0.5F, -0.9803F, 0.2142F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7679F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.9F, 6.1F, -5.8F));

		PartDefinition cube_r386 = bone3.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(0.25F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.0292F, 1.6092F, 0.7218F, 0.0635F, -0.3281F, -0.9751F));

		PartDefinition cube_r387 = bone3.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(83, 24).mirror().addBox(-0.3F, -0.6403F, -1.7791F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, 0.3F, 0.2777F, -0.3143F, -0.4228F));

		PartDefinition cube_r388 = bone3.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(78, 14).mirror().addBox(-0.5F, -1.0257F, -0.4332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, 3.0F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r389 = bone3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(36, 43).mirror().addBox(-0.5F, -0.9803F, 0.2142F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7679F, 0.0F, 0.0F));

		PartDefinition chestOsteoderms = chest.addOrReplaceChild("chestOsteoderms", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6399F, -0.2395F, -3.9249F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r390 = chestOsteoderms.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(54, 113).addBox(-1.2151F, -1.155F, 1.7939F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, 0.0906F, 0.2321F, -0.8997F));

		PartDefinition cube_r391 = chestOsteoderms.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(102, 20).addBox(0.9826F, -0.8114F, 1.2652F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, 0.2383F, -0.5495F, -1.145F));

		PartDefinition cube_r392 = chestOsteoderms.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(63, 102).addBox(1.05F, -0.6448F, 1.1403F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, -0.1858F, -0.6036F, -0.8381F));

		PartDefinition cube_r393 = chestOsteoderms.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(7, 102).addBox(-0.447F, -0.1974F, -0.8509F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, -0.0109F, -0.4304F, -0.4376F));

		PartDefinition cube_r394 = chestOsteoderms.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(14, 102).addBox(-0.397F, -0.9891F, -0.8749F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, 0.0768F, -0.4321F, -1.1241F));

		PartDefinition cube_r395 = chestOsteoderms.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(49, 113).addBox(-0.6939F, -0.9804F, -0.7652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, 0.0532F, 0.4839F, -0.6383F));

		PartDefinition cube_r396 = chestOsteoderms.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(0, 116).addBox(-0.5F, -1.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9263F, 2.0662F, -2.4718F, -0.0489F, 0.8737F, -0.6903F));

		PartDefinition cube_r397 = chestOsteoderms.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(112, 51).addBox(-0.3319F, 0.0879F, -2.4711F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, 0.0415F, 0.6226F, -0.3746F));

		PartDefinition cube_r398 = chestOsteoderms.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(118, 102).addBox(-1.0947F, 0.0879F, -3.1477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, 0.0342F, 0.1779F, -0.3928F));

		PartDefinition cube_r399 = chestOsteoderms.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(0, 102).addBox(-1.1187F, 0.0879F, -2.9973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, 0.0337F, -0.0402F, -0.4002F));

		PartDefinition cube_r400 = chestOsteoderms.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(14, 95).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.5556F, -0.6629F, -2.0843F, 0.0395F, -0.5522F, -1.2749F));

		PartDefinition cube_r401 = chestOsteoderms.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(92, 29).addBox(-0.5F, -0.6F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3502F, 6.143F, 3.6109F, -0.0617F, 0.089F, -0.0656F));

		PartDefinition cube_r402 = chestOsteoderms.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(92, 41).addBox(-0.5F, -0.25F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2207F, 4.2618F, 3.5467F, 0.4182F, 0.089F, -0.0656F));

		PartDefinition cube_r403 = chestOsteoderms.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(119, 119).addBox(-0.4569F, -0.4646F, -0.6177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.1028F, 5.8629F, 1.2129F, 0.6451F, 0.3887F, 0.1524F));

		PartDefinition cube_r404 = chestOsteoderms.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(15, 61).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8183F, 2.6928F, 1.9059F, 0.2616F, 0.1995F, -0.194F));

		PartDefinition cube_r405 = chestOsteoderms.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(53, 60).addBox(-0.735F, -0.644F, -1.7694F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.209F, 0.0238F, -1.0893F, 0.1035F, 0.2995F, -0.9933F));

		PartDefinition cube_r406 = chestOsteoderms.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(42, 100).addBox(-0.5052F, -0.5456F, -3.2779F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5323F, -0.8775F, 0.2759F, 0.038F, 0.3725F, -1.2536F));

		PartDefinition cube_r407 = chestOsteoderms.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(5, 119).addBox(0.2064F, -0.5456F, -2.4233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5323F, -0.8775F, 0.2759F, 0.0394F, 0.4597F, -1.2499F));

		PartDefinition cube_r408 = chestOsteoderms.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(112, 83).addBox(1.9631F, -0.96F, 1.5937F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.5323F, -0.9775F, 0.1759F, 0.0014F, -0.5675F, -1.263F));

		PartDefinition cube_r409 = chestOsteoderms.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(119, 6).addBox(-0.1069F, -0.933F, 3.3072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5323F, -0.9775F, 0.1759F, 0.0061F, 0.2265F, -1.2734F));

		PartDefinition cube_r410 = chestOsteoderms.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(101, 30).addBox(0.1608F, -0.691F, -0.0642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(103, 3).addBox(-0.2392F, -0.691F, -0.6642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(3.5677F, 7.7225F, 3.4759F, -0.1836F, -0.2489F, 0.4894F));

		PartDefinition cube_r411 = chestOsteoderms.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(21, 103).addBox(0.1371F, -0.6874F, 0.6428F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5677F, 7.7225F, 3.4759F, -0.1745F, 0.1439F, 0.4059F));

		PartDefinition cube_r412 = chestOsteoderms.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(92, 103).addBox(-0.5392F, -0.691F, -1.2642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(3.5677F, 7.7225F, 3.4759F, -0.2147F, -0.5913F, 0.5647F));

		PartDefinition cube_r413 = chestOsteoderms.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(34, 86).addBox(-0.3941F, -0.6874F, -1.2137F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(3.5677F, 7.7225F, 3.4759F, -0.1736F, 0.101F, 0.4135F));

		PartDefinition cube_r414 = chestOsteoderms.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(113, 38).addBox(0.629F, -0.691F, -1.5916F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.5677F, 7.7225F, 3.4759F, -0.2841F, -0.8876F, 0.6663F));

		PartDefinition cube_r415 = chestOsteoderms.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(70, 102).addBox(-0.5892F, -0.691F, -0.7892F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(3.0677F, 5.1225F, -0.8241F, 0.2901F, -0.204F, -0.0479F));

		PartDefinition cube_r416 = chestOsteoderms.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(91, 76).addBox(-0.5892F, -0.691F, -1.2642F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(3.0677F, 5.1225F, -0.8241F, 0.293F, -0.2458F, -0.0607F));

		PartDefinition cube_r417 = chestOsteoderms.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(96, 87).addBox(-0.5629F, -0.6874F, -0.3572F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0677F, 5.1225F, -0.8241F, 0.2855F, 0.1011F, 0.0282F));

		PartDefinition cube_r418 = chestOsteoderms.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(85, 102).addBox(-0.4142F, -0.691F, -1.2642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(3.3677F, 4.1225F, 2.6759F, 0.3399F, -0.5324F, -0.1823F));

		PartDefinition cube_r419 = chestOsteoderms.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(119, 71).addBox(-0.875F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0099F, 3.9695F, 2.5839F, 0.3446F, -0.5199F, -0.1934F));

		PartDefinition cube_r420 = chestOsteoderms.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(103, 0).addBox(-0.3629F, -0.6874F, -0.3572F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.3677F, 4.1225F, 2.6759F, 0.2992F, 0.1034F, 0.0148F));

		PartDefinition cube_r421 = chestOsteoderms.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(118, 113).addBox(0.1371F, -0.6874F, -0.3572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5323F, -1.0775F, 1.2759F, 0.0235F, 0.3562F, -1.2616F));

		PartDefinition cube_r422 = chestOsteoderms.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(78, 94).addBox(-1.4F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.4943F, -1.7878F, 0.863F, 0.0232F, -0.6124F, -1.2702F));

		PartDefinition cube_r423 = chestOsteoderms.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(35, 100).addBox(-0.3941F, -0.6874F, -1.2137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5323F, -1.0775F, 1.2759F, 0.0229F, 0.2689F, -1.2638F));

		PartDefinition cube_r424 = chestOsteoderms.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(112, 71).addBox(-1.1921F, -1.2156F, -2.9271F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, -0.132F, -0.0945F, -1.0208F));

		PartDefinition cube_r425 = chestOsteoderms.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(100, 101).addBox(-0.433F, -1.2156F, -2.4609F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, -0.1555F, 0.5624F, -1.1167F));

		PartDefinition cube_r426 = chestOsteoderms.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(119, 108).addBox(-1.1816F, -1.2156F, -3.095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9209F, 1.0143F, -0.3664F, -0.1324F, 0.1218F, -1.0495F));

		PartDefinition chestOsteoderms12 = chest.addOrReplaceChild("chestOsteoderms12", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6399F, -0.2395F, -3.9249F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r427 = chestOsteoderms12.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(54, 113).mirror().addBox(0.2151F, -1.155F, 1.7939F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, 0.0906F, -0.2321F, 0.8997F));

		PartDefinition cube_r428 = chestOsteoderms12.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(102, 20).mirror().addBox(-2.9826F, -0.8114F, 1.2652F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, 0.2383F, 0.5495F, 1.145F));

		PartDefinition cube_r429 = chestOsteoderms12.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(63, 102).mirror().addBox(-3.05F, -0.6448F, 1.1403F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, -0.1858F, 0.6036F, 0.8381F));

		PartDefinition cube_r430 = chestOsteoderms12.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(7, 102).mirror().addBox(-1.553F, -0.1974F, -0.8509F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, -0.0109F, 0.4304F, 0.4376F));

		PartDefinition cube_r431 = chestOsteoderms12.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(14, 102).mirror().addBox(-1.603F, -0.9891F, -0.8749F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, 0.0768F, 0.4321F, 1.1241F));

		PartDefinition cube_r432 = chestOsteoderms12.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(49, 113).mirror().addBox(-0.3061F, -0.9804F, -0.7652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, 0.0532F, -0.4839F, 0.6383F));

		PartDefinition cube_r433 = chestOsteoderms12.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(0, 116).mirror().addBox(-0.5F, -1.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9263F, 2.0662F, -2.4718F, -0.0489F, -0.8737F, 0.6903F));

		PartDefinition cube_r434 = chestOsteoderms12.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(112, 51).mirror().addBox(-1.6681F, 0.0879F, -2.4711F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, 0.0415F, -0.6226F, 0.3746F));

		PartDefinition cube_r435 = chestOsteoderms12.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(118, 102).mirror().addBox(0.0947F, 0.0879F, -3.1477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, 0.0342F, -0.1779F, 0.3928F));

		PartDefinition cube_r436 = chestOsteoderms12.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.8813F, 0.0879F, -2.9973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, 0.0337F, 0.0402F, 0.4002F));

		PartDefinition cube_r437 = chestOsteoderms12.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(14, 95).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.5556F, -0.6629F, -2.0843F, 0.0395F, 0.5522F, 1.2749F));

		PartDefinition cube_r438 = chestOsteoderms12.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(92, 29).mirror().addBox(-0.5F, -0.6F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3502F, 6.143F, 3.6109F, -0.0617F, -0.089F, 0.0656F));

		PartDefinition cube_r439 = chestOsteoderms12.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(92, 41).mirror().addBox(-0.5F, -0.25F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2207F, 4.2618F, 3.5467F, 0.4182F, -0.089F, 0.0656F));

		PartDefinition cube_r440 = chestOsteoderms12.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(119, 119).mirror().addBox(-0.5431F, -0.4646F, -0.6177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.1028F, 5.8629F, 1.2129F, 0.6451F, -0.3887F, -0.1524F));

		PartDefinition cube_r441 = chestOsteoderms12.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(15, 61).mirror().addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8183F, 2.6928F, 1.9059F, 0.2616F, -0.1995F, 0.194F));

		PartDefinition cube_r442 = chestOsteoderms12.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(53, 60).mirror().addBox(-0.265F, -0.644F, -1.7694F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.209F, 0.0238F, -1.0893F, 0.1035F, -0.2995F, 0.9933F));

		PartDefinition cube_r443 = chestOsteoderms12.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(42, 100).mirror().addBox(-0.4948F, -0.5456F, -3.2779F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5323F, -0.8775F, 0.2759F, 0.038F, -0.3725F, 1.2536F));

		PartDefinition cube_r444 = chestOsteoderms12.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(5, 119).mirror().addBox(-1.2063F, -0.5456F, -2.4233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5323F, -0.8775F, 0.2759F, 0.0394F, -0.4597F, 1.2499F));

		PartDefinition cube_r445 = chestOsteoderms12.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(112, 83).mirror().addBox(-3.9631F, -0.96F, 1.5937F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(1.5323F, -0.9775F, 0.1759F, 0.0014F, 0.5675F, 1.263F));

		PartDefinition cube_r446 = chestOsteoderms12.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(119, 6).mirror().addBox(-0.8931F, -0.933F, 3.3072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5323F, -0.9775F, 0.1759F, 0.0061F, -0.2265F, 1.2734F));

		PartDefinition cube_r447 = chestOsteoderms12.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(101, 30).mirror().addBox(-2.1608F, -0.691F, -0.0642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(103, 3).mirror().addBox(-1.7608F, -0.691F, -0.6642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-3.5677F, 7.7225F, 3.4759F, -0.1836F, 0.2489F, -0.4894F));

		PartDefinition cube_r448 = chestOsteoderms12.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(21, 103).mirror().addBox(-2.1371F, -0.6874F, 0.6428F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5677F, 7.7225F, 3.4759F, -0.1745F, -0.1439F, -0.4059F));

		PartDefinition cube_r449 = chestOsteoderms12.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(92, 103).mirror().addBox(-1.4608F, -0.691F, -1.2642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-3.5677F, 7.7225F, 3.4759F, -0.2147F, 0.5913F, -0.5647F));

		PartDefinition cube_r450 = chestOsteoderms12.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(34, 86).mirror().addBox(-0.6059F, -0.6874F, -1.2137F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-3.5677F, 7.7225F, 3.4759F, -0.1736F, -0.101F, -0.4135F));

		PartDefinition cube_r451 = chestOsteoderms12.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(113, 38).mirror().addBox(-2.629F, -0.691F, -1.5916F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.5677F, 7.7225F, 3.4759F, -0.2841F, 0.8876F, -0.6663F));

		PartDefinition cube_r452 = chestOsteoderms12.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(70, 102).mirror().addBox(-1.4108F, -0.691F, -0.7892F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-3.0677F, 5.1225F, -0.8241F, 0.2901F, 0.204F, 0.0479F));

		PartDefinition cube_r453 = chestOsteoderms12.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(91, 76).mirror().addBox(-2.4108F, -0.691F, -1.2642F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-3.0677F, 5.1225F, -0.8241F, 0.293F, 0.2458F, 0.0607F));

		PartDefinition cube_r454 = chestOsteoderms12.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(96, 87).mirror().addBox(-2.4371F, -0.6874F, -0.3572F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0677F, 5.1225F, -0.8241F, 0.2855F, -0.1011F, -0.0282F));

		PartDefinition cube_r455 = chestOsteoderms12.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(85, 102).mirror().addBox(-1.5858F, -0.691F, -1.2642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-3.3677F, 4.1225F, 2.6759F, 0.3399F, 0.5324F, 0.1823F));

		PartDefinition cube_r456 = chestOsteoderms12.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(119, 71).mirror().addBox(-0.125F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.0099F, 3.9695F, 2.5839F, 0.3446F, 0.5199F, 0.1934F));

		PartDefinition cube_r457 = chestOsteoderms12.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-1.6371F, -0.6874F, -0.3572F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.3677F, 4.1225F, 2.6759F, 0.2992F, -0.1034F, -0.0148F));

		PartDefinition cube_r458 = chestOsteoderms12.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(118, 113).mirror().addBox(-1.1371F, -0.6874F, -0.3572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5323F, -1.0775F, 1.2759F, 0.0235F, -0.3562F, 1.2616F));

		PartDefinition cube_r459 = chestOsteoderms12.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(78, 94).mirror().addBox(-1.6F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.4943F, -1.7878F, 0.863F, 0.0232F, 0.6124F, 1.2702F));

		PartDefinition cube_r460 = chestOsteoderms12.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(35, 100).mirror().addBox(-0.6059F, -0.6874F, -1.2137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5323F, -1.0775F, 1.2759F, 0.0229F, -0.2689F, 1.2638F));

		PartDefinition cube_r461 = chestOsteoderms12.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(112, 71).mirror().addBox(-0.8079F, -1.2156F, -2.9271F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, -0.132F, 0.0945F, 1.0208F));

		PartDefinition cube_r462 = chestOsteoderms12.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(100, 101).mirror().addBox(-1.567F, -1.2156F, -2.4609F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, -0.1555F, -0.5624F, 1.1167F));

		PartDefinition cube_r463 = chestOsteoderms12.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(119, 108).mirror().addBox(0.1816F, -1.2156F, -3.095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9209F, 1.0143F, -0.3664F, -0.1324F, -0.1218F, 1.0495F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4992F, -7.5174F, -0.0869F, 0.1741F, -0.0169F));

		PartDefinition cube_r464 = neck.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(110, 120).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5594F, -1.8708F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r465 = neck.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(83, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2631F, -1.4662F, 0.7385F, 0.2322F, -0.4863F));

		PartDefinition cube_r466 = neck.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(14, 114).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2631F, -1.4662F, 0.5899F, 0.5458F, -0.8691F));

		PartDefinition cube_r467 = neck.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2631F, -1.4662F, 0.1949F, 0.7613F, -1.5017F));

		PartDefinition cube_r468 = neck.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(83, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2631F, -1.4662F, 0.7385F, -0.2322F, 0.4863F));

		PartDefinition cube_r469 = neck.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(14, 114).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2631F, -1.4662F, 0.5899F, -0.5458F, 0.8691F));

		PartDefinition cube_r470 = neck.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(85, 55).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2631F, -1.4662F, 0.1949F, -0.7613F, 1.5017F));

		PartDefinition cube_r471 = neck.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(61, 87).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1504F, -2.9367F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm3 = neck.addOrReplaceChild("bipartiteOsteoderm3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3689F, -1.9711F, -2.2794F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r472 = bipartiteOsteoderm3.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(78, 101).addBox(-0.6215F, -0.5107F, -0.5177F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5398F, -0.6202F, 0.0924F, -0.3534F, -1.2723F, -1.2496F));

		PartDefinition cube_r473 = bipartiteOsteoderm3.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(94, 3).addBox(-1.2075F, -0.5F, -0.3455F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5764F, -0.5005F, 0.3247F, -0.4187F, -1.0963F, -0.3232F));

		PartDefinition cube_r474 = bipartiteOsteoderm3.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(99, 59).addBox(-0.5F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6625F, 1.582F, 0.1985F, -0.5217F, -0.0653F, -0.9059F));

		PartDefinition cube_r475 = bipartiteOsteoderm3.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(45, 62).addBox(-1.0094F, 0.0068F, -0.3955F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0413F, -0.8721F, -0.173F, -0.0855F, -0.0533F, -0.7578F));

		PartDefinition cube_r476 = bipartiteOsteoderm3.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(92, 46).addBox(-1.6669F, -0.9447F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1587F, 0.1279F, -0.173F, -0.1037F, -0.0145F, -0.1389F));

		PartDefinition cube_r477 = bipartiteOsteoderm3.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(81, 64).addBox(1.7455F, 0.931F, -2.2649F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0413F, -0.8721F, -0.173F, -0.1433F, -0.7411F, 0.5435F));

		PartDefinition bipartiteOsteoderm6 = neck.addOrReplaceChild("bipartiteOsteoderm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3689F, -1.9711F, -2.2794F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r478 = bipartiteOsteoderm6.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(78, 101).mirror().addBox(-1.3785F, -0.5107F, -0.5177F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5398F, -0.6202F, 0.0924F, -0.3534F, 1.2723F, 1.2496F));

		PartDefinition cube_r479 = bipartiteOsteoderm6.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(94, 3).mirror().addBox(-1.7925F, -0.5F, -0.3455F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5764F, -0.5005F, 0.3247F, -0.4187F, 1.0963F, 0.3232F));

		PartDefinition cube_r480 = bipartiteOsteoderm6.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-0.5F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6625F, 1.582F, 0.1985F, -0.5217F, 0.0653F, 0.9059F));

		PartDefinition cube_r481 = bipartiteOsteoderm6.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(45, 62).mirror().addBox(0.0094F, 0.0068F, -0.3955F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0413F, -0.8721F, -0.173F, -0.0855F, 0.0533F, 0.7578F));

		PartDefinition cube_r482 = bipartiteOsteoderm6.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(92, 46).mirror().addBox(-0.3331F, -0.9447F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.1587F, 0.1279F, -0.173F, -0.1037F, 0.0145F, 0.1389F));

		PartDefinition cube_r483 = bipartiteOsteoderm6.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(81, 64).mirror().addBox(-5.7455F, 0.931F, -2.2649F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0413F, -0.8721F, -0.173F, -0.1433F, 0.7411F, -0.5435F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3504F, -2.7541F, -0.3486F, 0.1322F, 0.0339F));

		PartDefinition cube_r484 = neck2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(10, 121).addBox(0.0F, -2.3123F, -0.0426F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 87).addBox(-0.5F, -1.0123F, -0.0426F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2063F, -2.6773F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r485 = neck2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(113, 120).addBox(0.0F, -1.7533F, 0.066F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2063F, -0.9773F, 0.3142F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm2 = neck2.addOrReplaceChild("bipartiteOsteoderm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3689F, -0.6444F, -3.0332F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r486 = bipartiteOsteoderm2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(112, 54).addBox(-0.6215F, -0.5107F, -0.4427F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5398F, -0.6202F, 0.0924F, -0.3975F, -1.3048F, -1.2036F));

		PartDefinition cube_r487 = bipartiteOsteoderm2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(93, 20).addBox(-0.6387F, 0.0611F, -0.1532F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0413F, -0.8721F, -0.248F, -0.0258F, -1.049F, -0.8154F));

		PartDefinition cube_r488 = bipartiteOsteoderm2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(28, 100).addBox(-0.8038F, -0.676F, 0.0045F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.056F, 0.4966F, -0.7271F, -0.4345F, -0.0653F, -0.8536F));

		PartDefinition cube_r489 = bipartiteOsteoderm2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(7, 93).addBox(-1.0094F, 0.0069F, -0.3955F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0413F, -0.8721F, -0.173F, -0.0836F, -0.0562F, -0.7403F));

		PartDefinition cube_r490 = bipartiteOsteoderm2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(89, 16).addBox(-1.6669F, -0.9447F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1587F, 0.1279F, -0.173F, -0.1037F, -0.0145F, -0.1389F));

		PartDefinition cube_r491 = bipartiteOsteoderm2.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(94, 0).addBox(-0.1733F, -0.4122F, -0.606F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1411F, 0.7872F, 0.0072F, -0.1156F, -0.6655F, 0.5256F));

		PartDefinition bipartiteOsteoderm5 = neck2.addOrReplaceChild("bipartiteOsteoderm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3689F, -0.6444F, -3.0332F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r492 = bipartiteOsteoderm5.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(112, 54).mirror().addBox(-1.3785F, -0.5107F, -0.4427F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5398F, -0.6202F, 0.0924F, -0.3975F, 1.3048F, 1.2036F));

		PartDefinition cube_r493 = bipartiteOsteoderm5.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(93, 20).mirror().addBox(-2.3613F, 0.0611F, -0.1532F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.0413F, -0.8721F, -0.248F, -0.0258F, 1.049F, 0.8154F));

		PartDefinition cube_r494 = bipartiteOsteoderm5.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(28, 100).mirror().addBox(-0.1962F, -0.676F, 0.0045F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.056F, 0.4966F, -0.7271F, -0.4345F, 0.0653F, 0.8536F));

		PartDefinition cube_r495 = bipartiteOsteoderm5.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(7, 93).mirror().addBox(0.0094F, 0.0069F, -0.3955F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0413F, -0.8721F, -0.173F, -0.0836F, 0.0562F, 0.7403F));

		PartDefinition cube_r496 = bipartiteOsteoderm5.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(89, 16).mirror().addBox(-0.3331F, -0.9447F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.1587F, 0.1279F, -0.173F, -0.1037F, 0.0145F, 0.1389F));

		PartDefinition cube_r497 = bipartiteOsteoderm5.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-2.8267F, -0.4122F, -0.606F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1411F, 0.7872F, 0.0072F, -0.1156F, 0.6655F, -0.5256F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6866F, -2.6915F, 0.4854F, 0.2327F, 0.1211F));

		PartDefinition cube_r498 = neck3.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(13, 121).addBox(0.0F, -1.4845F, 1.5188F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 79).addBox(-0.5F, -0.1845F, -0.4812F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.2788F, -3.2544F, -0.2967F, 0.0F, 0.0F));

		PartDefinition bipartiteOsteoderm = neck3.addOrReplaceChild("bipartiteOsteoderm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5144F, -1.6796F, -1.8258F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r499 = bipartiteOsteoderm.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(118, 91).addBox(-0.2215F, -0.5107F, -0.5677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7853F, -0.6695F, 0.2135F, -0.4884F, -1.3521F, -1.1101F));

		PartDefinition cube_r500 = bipartiteOsteoderm.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(19, 120).addBox(-0.7447F, -0.5107F, -0.5815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7853F, -0.6695F, 0.2135F, -0.2502F, -1.1471F, -1.3597F));

		PartDefinition cube_r501 = bipartiteOsteoderm.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(118, 88).addBox(-0.2215F, -0.5107F, -0.5677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0853F, -0.3194F, 0.2885F, -0.0703F, -1.1937F, -0.4581F));

		PartDefinition cube_r502 = bipartiteOsteoderm.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(72, 114).addBox(-1.0119F, 0.0228F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2068F, -0.9263F, 0.0536F, -0.0957F, -0.0425F, -0.4168F));

		PartDefinition cube_r503 = bipartiteOsteoderm.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(98, 38).addBox(-1.6669F, -0.9447F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4042F, 0.0786F, -0.052F, -0.1037F, -0.0145F, -0.1389F));

		PartDefinition cube_r504 = bipartiteOsteoderm.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(118, 57).addBox(-0.7447F, -0.5107F, -0.5816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0853F, -0.3194F, 0.2885F, -0.0461F, -0.9759F, -0.4852F));

		PartDefinition cube_r505 = bipartiteOsteoderm.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(101, 63).addBox(-0.7034F, 0.6518F, -0.4566F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0856F, -0.0373F, 0.0546F, -0.0942F, -0.441F, 0.6877F));

		PartDefinition bipartiteOsteoderm4 = neck3.addOrReplaceChild("bipartiteOsteoderm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5144F, -1.6796F, -1.8258F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r506 = bipartiteOsteoderm4.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(118, 91).mirror().addBox(-0.7785F, -0.5107F, -0.5677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.7853F, -0.6695F, 0.2135F, -0.4884F, 1.3521F, 1.1101F));

		PartDefinition cube_r507 = bipartiteOsteoderm4.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(19, 120).mirror().addBox(-0.2553F, -0.5107F, -0.5815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7853F, -0.6695F, 0.2135F, -0.2502F, 1.1471F, 1.3597F));

		PartDefinition cube_r508 = bipartiteOsteoderm4.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(118, 88).mirror().addBox(-0.7785F, -0.5107F, -0.5677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0853F, -0.3194F, 0.2885F, -0.0703F, 1.1937F, 0.4581F));

		PartDefinition cube_r509 = bipartiteOsteoderm4.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(72, 114).mirror().addBox(0.0119F, 0.0228F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2068F, -0.9263F, 0.0536F, -0.0957F, 0.0425F, 0.4168F));

		PartDefinition cube_r510 = bipartiteOsteoderm4.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(98, 38).mirror().addBox(-0.3331F, -0.9447F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.4042F, 0.0786F, -0.052F, -0.1037F, 0.0145F, 0.1389F));

		PartDefinition cube_r511 = bipartiteOsteoderm4.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(118, 57).mirror().addBox(-0.2553F, -0.5107F, -0.5816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0853F, -0.3194F, 0.2885F, -0.0461F, 0.9759F, 0.4852F));

		PartDefinition cube_r512 = bipartiteOsteoderm4.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(101, 63).mirror().addBox(-1.2966F, 0.6518F, -0.4566F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0856F, -0.0373F, 0.0546F, -0.0942F, 0.441F, -0.6877F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9795F, -3.1718F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r513 = head.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(92, 117).addBox(-0.51F, -0.0422F, -0.4128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(117, 0).addBox(-0.49F, -0.0422F, -0.4128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(82, 116).addBox(-0.5F, -0.0922F, -0.9128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4252F, -7.3772F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r514 = head.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(9, 88).addBox(-1.5F, -2.1426F, -0.8952F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.4532F, -0.0529F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r515 = head.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(51, 81).addBox(-1.5F, -1.0008F, -2.0625F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.5468F, 0.2471F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r516 = head.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(92, 64).addBox(-1.5F, 0.0435F, -0.0443F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.1468F, 1.0471F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r517 = head.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(92, 50).addBox(-1.5F, 0.0272F, -1.0068F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.2155F, 1.0291F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r518 = head.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(81, 59).addBox(-1.5F, 0.05F, 0.025F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.1217F, -1.7114F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r519 = head.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(83, 30).addBox(-0.5F, -0.0332F, -0.3133F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2101F, -4.085F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r520 = head.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(41, 116).addBox(-0.5F, 0.0043F, -0.8034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 0.0252F, -7.0772F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r521 = head.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(98, 34).addBox(-0.5F, -0.0364F, 0.9214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0913F, -6.9209F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r522 = head.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(0, 88).addBox(-0.5F, -0.0184F, -0.0515F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0913F, -6.9209F, 0.4451F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5201F, -4.3492F));

		PartDefinition cube_r523 = leftFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(87, 117).addBox(0.51F, -1.0025F, -0.0554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.4733F, 2.7963F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r524 = leftFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(117, 78).addBox(0.51F, -0.004F, -0.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.025F, -0.3267F, 3.3963F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r525 = leftFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(62, 114).addBox(0.51F, -0.004F, -0.0008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.025F, -0.3267F, 3.3963F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r526 = leftFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(19, 117).addBox(-0.5144F, -0.5314F, -0.064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7753F, 0.7826F, 1.3997F, 0.2369F, 0.1746F, -0.0347F));

		PartDefinition cube_r527 = leftFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(77, 117).addBox(-0.5042F, -0.6836F, -0.1672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7753F, 0.7826F, 1.3997F, 0.0623F, 0.1746F, -0.0347F));

		PartDefinition cube_r528 = leftFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(117, 3).addBox(-0.5026F, -0.6796F, -0.8566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7753F, 0.7826F, 1.3997F, 0.4114F, 0.1746F, -0.0347F));

		PartDefinition cube_r529 = leftFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(117, 68).addBox(-0.5017F, -0.7243F, -0.744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7753F, 0.7826F, 1.3997F, 1.4422F, 0.1742F, -0.0236F));

		PartDefinition cube_r530 = leftFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(117, 65).addBox(-0.2253F, -0.4459F, -0.5445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(51, 117).addBox(-0.3853F, -0.4459F, -0.5445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7753F, 0.7826F, 1.3997F, 0.2903F, 0.1742F, -0.0236F));

		PartDefinition cube_r531 = leftFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(46, 117).addBox(-0.4887F, -0.2459F, -0.2445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7753F, 0.7826F, 1.3997F, 0.5521F, 0.1742F, -0.0236F));

		PartDefinition cube_r532 = leftFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(83, 41).addBox(0.0502F, -0.0475F, -0.2103F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.31F, 0.2642F, 0.2882F, 0.1571F, 0.0028F));

		PartDefinition cube_r533 = leftFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(71, 92).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1113F, 2.4337F, 0.4494F, 0.2064F, 0.1781F, -0.0173F));

		PartDefinition cube_r534 = leftFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(122, 21).addBox(0.15F, -0.3549F, -0.7084F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, 2.4035F, -2.5287F, 0.3665F, 0.1745F, 0.0F));

		PartDefinition cube_r535 = leftFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(9, 76).addBox(0.4F, -1.0011F, -2.9526F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.5622F, 0.9013F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r536 = leftFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(31, 116).addBox(-0.5F, -0.4486F, -0.4831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.525F, 1.8983F, 0.0035F, 0.0175F, 0.1745F, 0.0F));

		PartDefinition cube_r537 = leftFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(14, 98).addBox(-0.5F, -0.4996F, -2.4243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.525F, 1.8983F, 0.0035F, 0.1134F, 0.1745F, 0.0F));

		PartDefinition cube_r538 = leftFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(36, 116).addBox(-0.65F, -0.5F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1045F))
				.texOffs(98, 14).addBox(-0.65F, -0.5F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.35F, 2.4035F, -2.5287F, 0.4102F, 0.1745F, 0.0F));

		PartDefinition cube_r539 = leftFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(89, 79).addBox(-0.4252F, 0.184F, 0.2042F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.6114F, -2.5717F, 0.4694F, 0.1732F, -0.0215F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5201F, -4.3492F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(87, 117).mirror().addBox(-1.51F, -1.0025F, -0.0554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 0.4733F, 2.7963F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(117, 78).mirror().addBox(-1.51F, -0.004F, -0.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.025F, -0.3267F, 3.3963F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(62, 114).mirror().addBox(-1.51F, -0.004F, -0.0008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.025F, -0.3267F, 3.3963F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(19, 117).mirror().addBox(-0.4856F, -0.5314F, -0.064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, 0.7826F, 1.3997F, 0.2369F, -0.1746F, 0.0347F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(77, 117).mirror().addBox(-0.4958F, -0.6836F, -0.1672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, 0.7826F, 1.3997F, 0.0623F, -0.1746F, 0.0347F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(117, 3).mirror().addBox(-0.4974F, -0.6796F, -0.8566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, 0.7826F, 1.3997F, 0.4114F, -0.1746F, 0.0347F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(117, 68).mirror().addBox(-0.4983F, -0.7243F, -0.744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, 0.7826F, 1.3997F, 1.4422F, -0.1742F, 0.0236F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(117, 65).mirror().addBox(-0.7747F, -0.4459F, -0.5445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(51, 117).mirror().addBox(-0.6146F, -0.4459F, -0.5445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, 0.7826F, 1.3997F, 0.2903F, -0.1742F, 0.0236F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(46, 117).mirror().addBox(-0.5113F, -0.2459F, -0.2445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7753F, 0.7826F, 1.3997F, 0.5521F, -0.1742F, 0.0236F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(83, 41).mirror().addBox(-1.0502F, -0.0475F, -0.2103F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.31F, 0.2642F, 0.2882F, -0.1571F, -0.0028F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(71, 92).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1113F, 2.4337F, 0.4494F, 0.2064F, -0.1781F, 0.0173F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(122, 21).mirror().addBox(-0.15F, -0.3549F, -0.7084F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 2.4035F, -2.5287F, 0.3665F, -0.1745F, 0.0F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(9, 76).mirror().addBox(-0.4F, -1.0011F, -2.9526F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5622F, 0.9013F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(31, 116).mirror().addBox(-0.5F, -0.4486F, -0.4831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.525F, 1.8983F, 0.0035F, 0.0175F, -0.1745F, 0.0F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(14, 98).mirror().addBox(-0.5F, -0.4996F, -2.4243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.525F, 1.8983F, 0.0035F, 0.1134F, -0.1745F, 0.0F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(36, 116).mirror().addBox(-0.35F, -0.5F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1045F)).mirror(false)
				.texOffs(98, 14).mirror().addBox(-0.35F, -0.5F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 2.4035F, -2.5287F, 0.4102F, -0.1745F, 0.0F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(89, 79).mirror().addBox(-0.5748F, 0.184F, 0.2042F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6114F, -2.5717F, 0.4694F, -0.1732F, 0.0215F));

		PartDefinition Jaw = head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.449F, -0.0373F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r557 = Jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(119, 81).addBox(-0.5F, -0.0945F, -0.1412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.6495F, -6.6537F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r558 = Jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(82, 119).addBox(-0.5F, -0.8186F, -1.0695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(119, 84).addBox(-0.5F, -0.8186F, -0.8695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.8495F, -6.8537F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r559 = Jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(56, 100).addBox(-0.5F, -0.9179F, -0.0975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -0.87F, -6.9228F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r560 = Jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(21, 99).mirror().addBox(-0.5F, -0.7763F, -1.5023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(21, 99).addBox(1.7F, -0.7763F, -1.5023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.1F, 0.5109F, 0.2244F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r561 = Jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(85, 98).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 98).addBox(1.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, -0.0892F, -0.3756F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r562 = Jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(67, 114).mirror().addBox(0.0191F, 0.0157F, -0.9897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3118F, -1.478F, -2.046F, 0.9774F, -0.0873F, 0.0F));

		PartDefinition cube_r563 = Jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(111, 117).mirror().addBox(0.0191F, -1.7268F, -1.2152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0026F, -1.0383F, 0.4538F, -0.0873F, 0.0F));

		PartDefinition cube_r564 = Jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(102, 117).mirror().addBox(0.0191F, -0.3419F, -0.9131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0026F, -1.0383F, 0.0524F, -0.0873F, 0.0F));

		PartDefinition cube_r565 = Jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(98, 79).mirror().addBox(0.0191F, -0.0723F, -1.9498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3414F, -0.1956F, -1.7086F, -0.2797F, -0.104F, 0.0048F));

		PartDefinition cube_r566 = Jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(97, 117).mirror().addBox(0.0191F, -0.7777F, -2.2575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.0026F, -1.0383F, -0.1396F, -0.0873F, 0.0F));

		PartDefinition cube_r567 = Jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(89, 11).mirror().addBox(0.0607F, -0.5285F, -2.841F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.2026F, -3.3383F, -0.2793F, -0.2269F, 0.0F));

		PartDefinition cube_r568 = Jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(0.3607F, -1.207F, -2.5934F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.2026F, -3.3383F, -0.2269F, -0.2269F, 0.0F));

		PartDefinition cube_r569 = Jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(24, 122).mirror().addBox(-0.3F, 0.0216F, -0.739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 122).addBox(0.3F, 0.0216F, -0.739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9026F, -5.9383F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r570 = Jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(89, 6).mirror().addBox(0.0607F, 0.0056F, -2.9792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.249F, -1.0759F, -3.1262F, -0.192F, -0.2269F, 0.0F));

		PartDefinition cube_r571 = Jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(67, 114).addBox(-1.0191F, 0.0157F, -0.9897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3118F, -1.478F, -2.046F, 0.9774F, 0.0873F, 0.0F));

		PartDefinition cube_r572 = Jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(111, 117).addBox(-1.0191F, -1.7268F, -1.2152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4F, -0.0026F, -1.0383F, 0.4538F, 0.0873F, 0.0F));

		PartDefinition cube_r573 = Jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(102, 117).addBox(-1.0191F, -0.3419F, -0.9131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4F, -0.0026F, -1.0383F, 0.0524F, 0.0873F, 0.0F));

		PartDefinition cube_r574 = Jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(98, 79).addBox(-1.0191F, -0.0723F, -1.9498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3414F, -0.1956F, -1.7086F, -0.2797F, 0.104F, -0.0048F));

		PartDefinition cube_r575 = Jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(97, 117).addBox(-1.0191F, -0.7777F, -2.2575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.0026F, -1.0383F, -0.1396F, 0.0873F, 0.0F));

		PartDefinition cube_r576 = Jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(89, 11).addBox(-1.0607F, -0.5285F, -2.841F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2F, -0.2026F, -3.3383F, -0.2793F, 0.2269F, 0.0F));

		PartDefinition cube_r577 = Jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(0, 93).addBox(-0.3607F, -1.207F, -2.5934F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.2026F, -3.3383F, -0.2269F, 0.2269F, 0.0F));

		PartDefinition cube_r578 = Jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(89, 6).addBox(-1.0607F, 0.0056F, -2.9792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.249F, -1.0759F, -3.1262F, -0.192F, 0.2269F, 0.0F));

		PartDefinition chestOsteoderms3 = body.addOrReplaceChild("chestOsteoderms3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.779F, 1.1316F, -3.2448F, -0.1311F, -0.0872F, 0.0038F));

		PartDefinition cube_r579 = chestOsteoderms3.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(35, 70).addBox(-0.1011F, -3.772F, 0.1669F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4998F, 5.0197F, -1.7346F, 0.3048F, 0.089F, -0.0656F));

		PartDefinition cube_r580 = chestOsteoderms3.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(9, 69).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8762F, 6.2212F, -0.9614F, 0.2092F, -0.0504F, -0.0655F));

		PartDefinition cube_r581 = chestOsteoderms3.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(30, 62).addBox(-0.6569F, -1.1646F, -2.8177F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2837F, 0.1537F, -1.1009F, 0.2586F, 0.1321F, -0.2122F));

		PartDefinition cube_r582 = chestOsteoderms3.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(53, 43).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6514F, -2.7583F, -4.0164F, 0.0251F, 0.1401F, -0.8897F));

		PartDefinition cube_r583 = chestOsteoderms3.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(96, 53).addBox(-1.3481F, -0.4978F, -0.7891F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-2.7372F, -4.5683F, -1.9492F, -0.0318F, -0.6504F, -1.2441F));

		PartDefinition cube_r584 = chestOsteoderms3.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(105, 33).addBox(-0.1525F, -0.5076F, -0.8066F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-3.0594F, -3.5125F, -1.9877F, -0.0201F, -0.2409F, -1.2705F));

		PartDefinition cube_r585 = chestOsteoderms3.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(105, 36).addBox(-1.2525F, -0.5076F, -0.3066F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7372F, -4.5683F, -1.9492F, -0.0196F, 0.0558F, -1.2764F));

		PartDefinition cube_r586 = chestOsteoderms3.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(95, 91).addBox(-1.3481F, -0.4978F, -0.7891F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-2.7372F, -4.6683F, 0.9508F, -0.05F, -0.6917F, -1.2327F));

		PartDefinition cube_r587 = chestOsteoderms3.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(7, 105).addBox(-0.1525F, -0.5076F, -0.8066F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-3.0594F, -3.6152F, 0.8662F, -0.0336F, -0.2825F, -1.2671F));

		PartDefinition cube_r588 = chestOsteoderms3.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(105, 6).addBox(-1.2525F, -0.5076F, -0.3066F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7372F, -4.6683F, 0.9508F, -0.0322F, 0.014F, -1.2769F));

		PartDefinition cube_r589 = chestOsteoderms3.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(0, 105).addBox(-1.1817F, -0.4779F, -0.5682F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3748F, -2.9498F, 1.4331F, 0.3042F, -0.8864F, -0.6835F));

		PartDefinition cube_r590 = chestOsteoderms3.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(5, 116).addBox(-0.6813F, -0.4897F, -0.5864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3748F, -2.9498F, 1.4331F, 0.1992F, 0.1888F, -0.4196F));

		PartDefinition cube_r591 = chestOsteoderms3.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(95, 94).addBox(-0.3392F, -0.691F, -0.6142F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.1722F, -1.465F, -2.2665F, 0.2548F, -0.3151F, -0.7722F));

		PartDefinition cube_r592 = chestOsteoderms3.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(23, 96).addBox(-0.5392F, -0.691F, -1.2642F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1722F, -1.465F, -2.2665F, 0.2882F, -0.5675F, -0.8496F));

		PartDefinition chestOsteoderms14 = body.addOrReplaceChild("chestOsteoderms14", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.779F, 1.1316F, -3.2448F, -0.1311F, 0.0872F, -0.0038F));

		PartDefinition cube_r593 = chestOsteoderms14.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(-0.8989F, -3.772F, 0.1669F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4998F, 5.0197F, -1.7346F, 0.3048F, -0.089F, 0.0656F));

		PartDefinition cube_r594 = chestOsteoderms14.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(9, 69).mirror().addBox(-0.5F, 0.1F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8762F, 6.2212F, -0.9614F, 0.2092F, 0.0504F, 0.0655F));

		PartDefinition cube_r595 = chestOsteoderms14.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(30, 62).mirror().addBox(-0.3431F, -1.1646F, -2.8177F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2837F, 0.1537F, -1.1009F, 0.2586F, -0.1321F, 0.2122F));

		PartDefinition cube_r596 = chestOsteoderms14.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(53, 43).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6514F, -2.7583F, -4.0164F, 0.0251F, -0.1401F, 0.8897F));

		PartDefinition cube_r597 = chestOsteoderms14.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(96, 53).mirror().addBox(-1.6519F, -0.4978F, -0.7891F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(2.7372F, -4.5683F, -1.9492F, -0.0318F, 0.6504F, 1.2441F));

		PartDefinition cube_r598 = chestOsteoderms14.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(105, 33).mirror().addBox(-1.8475F, -0.5076F, -0.8066F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(3.0594F, -3.5125F, -1.9877F, -0.0201F, 0.2409F, 1.2705F));

		PartDefinition cube_r599 = chestOsteoderms14.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(105, 36).mirror().addBox(-0.7475F, -0.5076F, -0.3066F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.7372F, -4.5683F, -1.9492F, -0.0196F, -0.0558F, 1.2764F));

		PartDefinition cube_r600 = chestOsteoderms14.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(95, 91).mirror().addBox(-1.6519F, -0.4978F, -0.7891F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(2.7372F, -4.6683F, 0.9508F, -0.05F, 0.6917F, 1.2327F));

		PartDefinition cube_r601 = chestOsteoderms14.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(7, 105).mirror().addBox(-1.8475F, -0.5076F, -0.8066F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(3.0594F, -3.6152F, 0.8662F, -0.0336F, 0.2825F, 1.2671F));

		PartDefinition cube_r602 = chestOsteoderms14.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(105, 6).mirror().addBox(-0.7475F, -0.5076F, -0.3066F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.7372F, -4.6683F, 0.9508F, -0.0322F, -0.014F, 1.2769F));

		PartDefinition cube_r603 = chestOsteoderms14.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.8183F, -0.4779F, -0.5682F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3748F, -2.9498F, 1.4331F, 0.3042F, 0.8864F, 0.6835F));

		PartDefinition cube_r604 = chestOsteoderms14.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(5, 116).mirror().addBox(-0.3187F, -0.4897F, -0.5864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3748F, -2.9498F, 1.4331F, 0.1992F, -0.1888F, 0.4196F));

		PartDefinition cube_r605 = chestOsteoderms14.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(95, 94).mirror().addBox(-2.6608F, -0.691F, -0.6142F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(0.1722F, -1.465F, -2.2665F, 0.2548F, 0.3151F, 0.7722F));

		PartDefinition cube_r606 = chestOsteoderms14.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(23, 96).mirror().addBox(-2.4608F, -0.691F, -1.2642F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.1722F, -1.465F, -2.2665F, 0.2882F, 0.5675F, 0.8496F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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